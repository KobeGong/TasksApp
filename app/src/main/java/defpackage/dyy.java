package defpackage;

/* renamed from: dyy reason: default package */
/* compiled from: PG */
final class dyy implements java.lang.Runnable {
    public final /* synthetic */ defpackage.dyw a;

    dyy(defpackage.dyw dyw) {
        this.a = dyw;
    }

    public final void run() {
        this.a.b.o = null;
        this.a.b.d.execute(new defpackage.dyz(this));
    }
}
