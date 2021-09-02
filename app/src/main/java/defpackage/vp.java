package defpackage;

/* renamed from: vp reason: default package */
/* compiled from: PG */
class vp extends defpackage.vs {
    vp() {
        super(0);
    }

    public void a(android.widget.TextView textView, android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2;
        boolean z = textView.getLayoutDirection() == 1;
        if (z) {
            drawable2 = null;
        } else {
            drawable2 = drawable;
        }
        if (!z) {
            drawable = null;
        }
        textView.setCompoundDrawables(drawable2, null, drawable, null);
    }

    public void b(android.widget.TextView textView, android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2;
        boolean z = textView.getLayoutDirection() == 1;
        if (z) {
            drawable2 = null;
        } else {
            drawable2 = drawable;
        }
        if (!z) {
            drawable = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable2, null, drawable, null);
    }

    public void a(android.widget.TextView textView, int i) {
        boolean z;
        int i2;
        if (textView.getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = i;
        } else {
            i2 = 0;
        }
        if (z) {
            i = 0;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(i2, 0, i, 0);
    }
}
