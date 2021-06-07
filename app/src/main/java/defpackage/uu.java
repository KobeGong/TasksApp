package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* renamed from: uu  reason: default package */
/* compiled from: PG */
public class uu {
    public ColorStateList a(ImageView imageView) {
        if (imageView instanceof vu) {
            return ((vu) imageView).c();
        }
        return null;
    }

    public void a(ImageView imageView, ColorStateList colorStateList) {
        if (imageView instanceof vu) {
            ((vu) imageView).b(colorStateList);
        }
    }

    public PorterDuff.Mode b(ImageView imageView) {
        if (imageView instanceof vu) {
            return ((vu) imageView).d();
        }
        return null;
    }

    public void a(ImageView imageView, PorterDuff.Mode mode) {
        if (imageView instanceof vu) {
            ((vu) imageView).b(mode);
        }
    }

    uu() {
    }
}
