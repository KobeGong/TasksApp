package defpackage;

/* renamed from: arf reason: default package */
final /* synthetic */ class arf implements java.lang.Runnable {
    private final defpackage.ard a;
    private final int b;

    arf(defpackage.ard ard, int i) {
        this.a = ard;
        this.b = i;
    }

    public final void run() {
        this.a.b(this.b);
    }
}
