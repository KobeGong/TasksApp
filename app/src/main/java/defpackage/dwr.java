package defpackage;

/* renamed from: dwr  reason: default package */
/* compiled from: PG */
final class dwr implements Runnable {
    private final /* synthetic */ doq a;
    private final /* synthetic */ dnq b;
    private final /* synthetic */ dwo c;

    dwr(dwo dwo, doq doq, dnq dnq) {
        this.c = dwo;
        this.a = doq;
        this.b = dnq;
    }

    public final void run() {
        if (this.c == this.c.c.t) {
            this.c.c.a(this.a);
            if (this.b != dnq.SHUTDOWN) {
                this.c.c.p.a(this.b);
            }
        }
    }
}
