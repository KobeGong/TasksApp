package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: ajf  reason: default package */
public final /* synthetic */ class ajf implements Runnable {
    private final int a;
    private final Runnable b;

    ajf(int i, Runnable runnable) {
        this.a = i;
        this.b = runnable;
    }

    public final void run() {
        ajd.a(this.a, this.b);
    }
}
