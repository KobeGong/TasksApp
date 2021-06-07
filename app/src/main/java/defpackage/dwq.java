package defpackage;

/* renamed from: dwq  reason: default package */
/* compiled from: PG */
final class dwq implements Runnable {
    private final /* synthetic */ dvq a;
    private final /* synthetic */ dwo b;

    dwq(dwo dwo, dvq dvq) {
        this.b = dwo;
        this.a = dvq;
    }

    public final void run() {
        if (this.b.c.B) {
            this.a.a(dwf.b);
        }
        if (!this.b.c.C) {
            this.b.c.w.add(this.a);
        }
    }
}
