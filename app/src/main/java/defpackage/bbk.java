package defpackage;

/* renamed from: bbk reason: default package */
/* compiled from: PG */
final class bbk implements java.lang.Runnable {
    private /* synthetic */ defpackage.bkk a;
    private /* synthetic */ defpackage.bbi b;

    bbk(defpackage.bbi bbi, defpackage.bkk bkk) {
        this.b = bbi;
        this.a = bkk;
    }

    public final void run() {
        defpackage.bbi.a(this.b, this.a);
    }
}
