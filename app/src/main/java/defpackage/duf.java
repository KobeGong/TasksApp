package defpackage;

/* renamed from: duf reason: default package */
/* compiled from: PG */
final class duf implements java.lang.Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ defpackage.dtt b;

    duf(defpackage.dtt dtt, int i) {
        this.b = dtt;
        this.a = i;
    }

    public final void run() {
        this.b.c.c(this.a);
    }
}
