package defpackage;

/* renamed from: cen reason: default package */
/* compiled from: PG */
final class cen implements android.view.View.OnAttachStateChangeListener {
    private final /* synthetic */ android.widget.ImageView a;
    private final /* synthetic */ android.graphics.Bitmap b;
    private final /* synthetic */ defpackage.cel c;

    cen(defpackage.cel cel, android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        this.c = cel;
        this.a = imageView;
        this.b = bitmap;
    }

    public final void onViewAttachedToWindow(android.view.View view) {
        this.a.removeOnAttachStateChangeListener(this);
        this.c.b(this.b);
    }

    public final void onViewDetachedFromWindow(android.view.View view) {
    }
}
