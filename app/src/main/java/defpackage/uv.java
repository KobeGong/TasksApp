package defpackage;

/* renamed from: uv reason: default package */
/* compiled from: PG */
final class uv extends defpackage.uu {
    uv() {
    }

    public final android.content.res.ColorStateList a(android.widget.ImageView imageView) {
        return imageView.getImageTintList();
    }

    public final void a(android.widget.ImageView imageView, android.content.res.ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
        if (android.os.Build.VERSION.SDK_INT == 21) {
            android.graphics.drawable.Drawable drawable = imageView.getDrawable();
            boolean z = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
            if (drawable != null && z) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        }
    }

    public final void a(android.widget.ImageView imageView, android.graphics.PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
        if (android.os.Build.VERSION.SDK_INT == 21) {
            android.graphics.drawable.Drawable drawable = imageView.getDrawable();
            boolean z = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
            if (drawable != null && z) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        }
    }

    public final android.graphics.PorterDuff.Mode b(android.widget.ImageView imageView) {
        return imageView.getImageTintMode();
    }
}
