package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: drl  reason: default package */
/* compiled from: PG */
final class drl extends dok {
    private final dom a;
    private dok b;
    private dol c = dpp.a;

    drl(dom dom) {
        this.a = dom;
        this.b = this.c.a(dom);
    }

    @Override // defpackage.dok
    public final void a(List list, dmv dmv) {
        dol a2;
        if (!(!Collections.unmodifiableSet(dmv.a.keySet()).contains(dvb.a) || (a2 = a(list, (Map) dmv.a(dvb.a))) == null || a2 == this.c)) {
            this.a.a(dnq.CONNECTING, new drm());
            this.b.a();
            this.c = a2;
            this.b = this.c.a(this.a);
        }
        this.b.a(list, dmv);
    }

    @Override // defpackage.dok
    public final void a(dpw dpw) {
        this.b.a(dpw);
    }

    @Override // defpackage.dok
    public final void a(dop dop, dnr dnr) {
        this.b.a(dop, dnr);
    }

    @Override // defpackage.dok
    public final void a() {
        this.b.a();
        this.b = null;
    }

    private static dol a(List list, Map map) {
        boolean z;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((doe) it.next()).b.a(dvb.b) != null) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            try {
                return (dol) Class.forName("io.grpc.grpclb.GrpclbLoadBalancerFactory").getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new RuntimeException("Can't get GRPCLB, but balancer addresses were present", e2);
            }
        } else {
            String a2 = dzh.a(map);
            if (a2 == null) {
                return dpp.a;
            }
            if (a2.toUpperCase(Locale.ROOT).equals("ROUND_ROBIN")) {
                try {
                    return (dol) Class.forName("io.grpc.util.RoundRobinLoadBalancerFactory").getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                } catch (RuntimeException e3) {
                    throw e3;
                } catch (Exception e4) {
                    throw new RuntimeException("Can't get Round Robin LB", e4);
                }
            } else {
                String valueOf = String.valueOf(a2);
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown service config policy: ".concat(valueOf) : new String("Unknown service config policy: "));
            }
        }
    }
}
