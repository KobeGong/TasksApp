package defpackage;

/* renamed from: uu reason: default package */
/* compiled from: PG */
public class uu {
    public android.content.res.ColorStateList a(android.widget.ImageView imageView) {
        if (imageView instanceof defpackage.vu) {
            return ((defpackage.vu) imageView).c();
        }
        return null;
    }

    public void a(android.widget.ImageView imageView, android.content.res.ColorStateList colorStateList) {
        if (imageView instanceof defpackage.vu) {
            ((defpackage.vu) imageView).b(colorStateList);
        }
    }

    public android.graphics.PorterDuff.Mode b(android.widget.ImageView imageView) {
        if (imageView instanceof defpackage.vu) {
            return ((defpackage.vu) imageView).d();
        }
        return null;
    }

    public void a(android.widget.ImageView imageView, android.graphics.PorterDuff.Mode mode) {
        if (imageView instanceof defpackage.vu) {
            ((defpackage.vu) imageView).b(mode);
        }
    }

    uu() {
    }
}
