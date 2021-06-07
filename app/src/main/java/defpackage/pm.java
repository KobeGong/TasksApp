package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: pm  reason: default package */
/* compiled from: PG */
public final class pm extends pk {
    private static Method d;

    public pm(Drawable drawable) {
        super(drawable);
        d();
    }

    pm(pi piVar, Resources resources) {
        super(piVar, resources);
        d();
    }

    public final void setHotspot(float f, float f2) {
        this.c.setHotspot(f, f2);
    }

    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.c.setHotspotBounds(i, i2, i3, i4);
    }

    public final void getOutline(Outline outline) {
        this.c.getOutline(outline);
    }

    public final Rect getDirtyBounds() {
        return this.c.getDirtyBounds();
    }

    @Override // defpackage.pf, defpackage.ph
    public final void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.c.setTintList(colorStateList);
        }
    }

    @Override // defpackage.pf, defpackage.ph
    public final void setTint(int i) {
        if (c()) {
            super.setTint(i);
        } else {
            this.c.setTint(i);
        }
    }

    @Override // defpackage.pf, defpackage.ph
    public final void setTintMode(PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.c.setTintMode(mode);
        }
    }

    @Override // defpackage.ph
    public final boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ph
    public final boolean c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.c;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.ph, defpackage.pk
    public final pi b() {
        return new pn(this.b);
    }

    private static void d() {
        if (d == null) {
            try {
                d = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }
}
