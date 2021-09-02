package defpackage;

/* renamed from: ajf reason: default package */
final /* synthetic */ class ajf implements java.lang.Runnable {
    private final int a;
    private final java.lang.Runnable b;

    ajf(int i, java.lang.Runnable runnable) {
        this.a = i;
        this.b = runnable;
    }

    public final void run() {
        defpackage.ajd.a(this.a, this.b);
    }
}
