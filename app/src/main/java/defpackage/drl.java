package defpackage;

/* renamed from: drl reason: default package */
/* compiled from: PG */
final class drl extends defpackage.dok {
    private final defpackage.dom a;
    private defpackage.dok b;
    private defpackage.dol c = defpackage.dpp.a;

    drl(defpackage.dom dom) {
        this.a = dom;
        this.b = this.c.a(dom);
    }

    public final void a(java.util.List list, defpackage.dmv dmv) {
        if (java.util.Collections.unmodifiableSet(dmv.a.keySet()).contains(defpackage.dvb.a)) {
            defpackage.dol a2 = a(list, (java.util.Map) dmv.a(defpackage.dvb.a));
            if (!(a2 == null || a2 == this.c)) {
                this.a.a(defpackage.dnq.CONNECTING, (defpackage.doq) new defpackage.drm());
                this.b.a();
                this.c = a2;
                this.b = this.c.a(this.a);
            }
        }
        this.b.a(list, dmv);
    }

    public final void a(defpackage.dpw dpw) {
        this.b.a(dpw);
    }

    public final void a(defpackage.dop dop, defpackage.dnr dnr) {
        this.b.a(dop, dnr);
    }

    public final void a() {
        this.b.a();
        this.b = null;
    }

    private static defpackage.dol a(java.util.List list, java.util.Map map) {
        boolean z;
        java.util.Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((defpackage.doe) it.next()).b.a(defpackage.dvb.b) != null) {
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
                return (defpackage.dol) java.lang.Class.forName("io.grpc.grpclb.GrpclbLoadBalancerFactory").getMethod("getInstance", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            } catch (java.lang.RuntimeException e) {
                throw e;
            } catch (java.lang.Exception e2) {
                throw new java.lang.RuntimeException("Can't get GRPCLB, but balancer addresses were present", e2);
            }
        } else {
            java.lang.String a2 = defpackage.dzh.a(map);
            if (a2 == null) {
                return defpackage.dpp.a;
            }
            if (a2.toUpperCase(java.util.Locale.ROOT).equals("ROUND_ROBIN")) {
                try {
                    return (defpackage.dol) java.lang.Class.forName("io.grpc.util.RoundRobinLoadBalancerFactory").getMethod("getInstance", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                } catch (java.lang.RuntimeException e3) {
                    throw e3;
                } catch (java.lang.Exception e4) {
                    throw new java.lang.RuntimeException("Can't get Round Robin LB", e4);
                }
            } else {
                java.lang.String str = "Unknown service config policy: ";
                java.lang.String valueOf = java.lang.String.valueOf(a2);
                throw new java.lang.IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new java.lang.String(str));
            }
        }
    }
}
