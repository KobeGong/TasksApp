package defpackage;

/* renamed from: dwq reason: default package */
/* compiled from: PG */
final class dwq implements java.lang.Runnable {
    private final /* synthetic */ defpackage.dvq a;
    private final /* synthetic */ defpackage.dwo b;

    dwq(defpackage.dwo dwo, defpackage.dvq dvq) {
        this.b = dwo;
        this.a = dvq;
    }

    public final void run() {
        if (this.b.c.B) {
            this.a.a(defpackage.dwf.b);
        }
        if (!this.b.c.C) {
            this.b.c.w.add(this.a);
        }
    }
}
