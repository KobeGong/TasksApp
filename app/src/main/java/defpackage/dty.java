package defpackage;

/* renamed from: dty reason: default package */
/* compiled from: PG */
final class dty implements java.lang.Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ defpackage.dtt b;

    dty(defpackage.dtt dtt, int i) {
        this.b = dtt;
        this.a = i;
    }

    public final void run() {
        this.b.c.a(this.a);
    }
}
