package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: uv  reason: default package */
/* compiled from: PG */
final class uv extends uu {
    uv() {
    }

    @Override // defpackage.uu
    public final ColorStateList a(ImageView imageView) {
        return imageView.getImageTintList();
    }

    @Override // defpackage.uu
    public final void a(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable drawable = imageView.getDrawable();
            boolean z = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
            if (drawable != null && z) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        }
    }

    @Override // defpackage.uu
    public final void a(ImageView imageView, PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable drawable = imageView.getDrawable();
            boolean z = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
            if (drawable != null && z) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        }
    }

    @Override // defpackage.uu
    public final PorterDuff.Mode b(ImageView imageView) {
        return imageView.getImageTintMode();
    }
}
