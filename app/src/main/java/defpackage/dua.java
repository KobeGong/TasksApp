package defpackage;

/* renamed from: dua reason: default package */
/* compiled from: PG */
final class dua implements java.lang.Runnable {
    private final /* synthetic */ defpackage.dzq a;
    private final /* synthetic */ defpackage.dtt b;

    dua(defpackage.dtt dtt, defpackage.dzq dzq) {
        this.b = dtt;
        this.a = dzq;
    }

    public final void run() {
        this.b.c.a(this.a);
    }
}
