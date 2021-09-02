package defpackage;

/* renamed from: cel reason: default package */
/* compiled from: PG */
final class cel {
    public final java.lang.Object a;
    public final int b;
    public boolean c;
    private final java.lang.ref.WeakReference d;
    private final long e;
    private final /* synthetic */ defpackage.cei f;

    cel(defpackage.cei cei, android.widget.ImageView imageView, java.lang.Object obj, int i, long j) {
        this.f = cei;
        this.d = new java.lang.ref.WeakReference((android.widget.ImageView) defpackage.cky.a((java.lang.Object) imageView));
        this.a = obj;
        this.b = i;
        this.e = j;
    }

    /* access modifiers changed from: 0000 */
    public final void a(android.graphics.Bitmap bitmap) {
        android.widget.ImageView imageView = (android.widget.ImageView) this.d.get();
        defpackage.cen cen = new defpackage.cen(this, imageView, bitmap);
        imageView.addOnAttachStateChangeListener(cen);
        if (defpackage.sn.a.s(imageView)) {
            imageView.removeOnAttachStateChangeListener(cen);
            imageView.post(new defpackage.cem(this, bitmap));
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(android.graphics.Bitmap bitmap) {
        defpackage.cei.a("setImageAndResetRequest");
        if (!a()) {
            android.widget.ImageView imageView = (android.widget.ImageView) this.d.get();
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
                defpackage.cei.a(imageView, null);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        return this.c || this.e <= this.f.d;
    }
}
