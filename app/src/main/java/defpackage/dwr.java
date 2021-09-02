package defpackage;

/* renamed from: dwr reason: default package */
/* compiled from: PG */
final class dwr implements java.lang.Runnable {
    private final /* synthetic */ defpackage.doq a;
    private final /* synthetic */ defpackage.dnq b;
    private final /* synthetic */ defpackage.dwo c;

    dwr(defpackage.dwo dwo, defpackage.doq doq, defpackage.dnq dnq) {
        this.c = dwo;
        this.a = doq;
        this.b = dnq;
    }

    public final void run() {
        if (this.c == this.c.c.t) {
            this.c.c.a(this.a);
            if (this.b != defpackage.dnq.SHUTDOWN) {
                this.c.c.p.a(this.b);
            }
        }
    }
}
