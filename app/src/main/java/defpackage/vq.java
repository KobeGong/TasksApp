package defpackage;

/* renamed from: vq reason: default package */
/* compiled from: PG */
class vq extends defpackage.vp {
    vq() {
    }

    public final void a(android.widget.TextView textView, android.graphics.drawable.Drawable drawable) {
        textView.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public final void b(android.widget.TextView textView, android.graphics.drawable.Drawable drawable) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, null, null, null);
    }

    public final void a(android.widget.TextView textView, int i) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, i, 0);
    }
}
