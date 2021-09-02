package defpackage;

/* renamed from: pm reason: default package */
/* compiled from: PG */
public final class pm extends defpackage.pk {
    private static java.lang.reflect.Method d;

    public pm(android.graphics.drawable.Drawable drawable) {
        super(drawable);
        d();
    }

    pm(defpackage.pi piVar, android.content.res.Resources resources) {
        super(piVar, resources);
        d();
    }

    public final void setHotspot(float f, float f2) {
        this.c.setHotspot(f, f2);
    }

    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.c.setHotspotBounds(i, i2, i3, i4);
    }

    public final void getOutline(android.graphics.Outline outline) {
        this.c.getOutline(outline);
    }

    public final android.graphics.Rect getDirtyBounds() {
        return this.c.getDirtyBounds();
    }

    public final void setTintList(android.content.res.ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.c.setTintList(colorStateList);
        }
    }

    public final void setTint(int i) {
        if (c()) {
            super.setTint(i);
        } else {
            this.c.setTint(i);
        }
    }

    public final void setTintMode(android.graphics.PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.c.setTintMode(mode);
        }
    }

    public final boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean c() {
        if (android.os.Build.VERSION.SDK_INT != 21) {
            return false;
        }
        android.graphics.drawable.Drawable drawable = this.c;
        if ((drawable instanceof android.graphics.drawable.GradientDrawable) || (drawable instanceof android.graphics.drawable.DrawableContainer) || (drawable instanceof android.graphics.drawable.InsetDrawable) || (drawable instanceof android.graphics.drawable.RippleDrawable)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.pi b() {
        return new defpackage.pn(this.b);
    }

    private static void d() {
        if (d == null) {
            try {
                d = android.graphics.drawable.Drawable.class.getDeclaredMethod("isProjected", new java.lang.Class[0]);
            } catch (java.lang.Exception e) {
                android.util.Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }
}
