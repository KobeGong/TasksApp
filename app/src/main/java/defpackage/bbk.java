package defpackage;

/* renamed from: bbk  reason: default package */
/* compiled from: PG */
final class bbk implements Runnable {
    private /* synthetic */ bkk a;
    private /* synthetic */ bbi b;

    bbk(bbi bbi, bkk bkk) {
        this.b = bbi;
        this.a = bkk;
    }

    public final void run() {
        bbi.a(this.b, this.a);
    }
}
