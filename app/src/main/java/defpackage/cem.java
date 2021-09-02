package defpackage;

/* renamed from: cem reason: default package */
final /* synthetic */ class cem implements java.lang.Runnable {
    private final defpackage.cel a;
    private final android.graphics.Bitmap b;

    cem(defpackage.cel cel, android.graphics.Bitmap bitmap) {
        this.a = cel;
        this.b = bitmap;
    }

    public final void run() {
        this.a.b(this.b);
    }
}
