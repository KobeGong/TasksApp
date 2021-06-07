package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: dpq  reason: default package */
/* compiled from: PG */
final class dpq extends dok {
    private final dom a;
    private dop b;

    dpq(dom dom) {
        this.a = (dom) cld.a(dom, "helper");
    }

    @Override // defpackage.dok
    public final void a(List list, dmv dmv) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((doe) it.next()).a);
        }
        doe doe = new doe(arrayList);
        if (this.b == null) {
            this.b = this.a.a(doe, dmv.b);
            this.a.a(dnq.CONNECTING, new dpr(don.a(this.b)));
            this.b.b();
            return;
        }
        this.a.a(this.b, doe);
    }

    @Override // defpackage.dok
    public final void a(dpw dpw) {
        if (this.b != null) {
            this.b.a();
            this.b = null;
        }
        this.a.a(dnq.TRANSIENT_FAILURE, new dpr(don.a(dpw)));
    }

    @Override // defpackage.dok
    public final void a(dop dop, dnr dnr) {
        don a2;
        dnq dnq = dnr.a;
        if (dop == this.b && dnq != dnq.SHUTDOWN) {
            switch (dnq.ordinal()) {
                case 0:
                    a2 = don.a;
                    break;
                case 1:
                case 3:
                    a2 = don.a(dop);
                    break;
                case 2:
                    a2 = don.a(dnr.b);
                    break;
                default:
                    String valueOf = String.valueOf(dnq);
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 18).append("Unsupported state:").append(valueOf).toString());
            }
            this.a.a(dnq, new dpr(a2));
        }
    }

    @Override // defpackage.dok
    public final void a() {
        if (this.b != null) {
            this.b.a();
        }
    }
}
