package defpackage;

/* renamed from: chh reason: default package */
final /* synthetic */ class chh implements java.util.concurrent.Callable {
    private final defpackage.che a;
    private final int b;
    private final java.lang.String c = null;
    private final boolean d = true;

    chh(defpackage.che che, int i, java.lang.String str, boolean z) {
        this.a = che;
        this.b = i;
    }

    public final java.lang.Object call() {
        return this.a.a(this.b, this.c, this.d);
    }
}
