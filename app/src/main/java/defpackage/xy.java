package defpackage;

/* renamed from: xy reason: default package */
/* compiled from: PG */
public class xy extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {
    public android.graphics.drawable.Drawable a;

    public xy(android.graphics.drawable.Drawable drawable) {
        if (this.a != null) {
            this.a.setCallback(null);
        }
        this.a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(android.graphics.Canvas canvas) {
        this.a.draw(canvas);
    }

    public void onBoundsChange(android.graphics.Rect rect) {
        this.a.setBounds(rect);
    }

    public void setChangingConfigurations(int i) {
        this.a.setChangingConfigurations(i);
    }

    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    public void setDither(boolean z) {
        this.a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.a.setFilterBitmap(z);
    }

    public void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public boolean isStateful() {
        return this.a.isStateful();
    }

    public boolean setState(int[] iArr) {
        return this.a.setState(iArr);
    }

    public int[] getState() {
        return this.a.getState();
    }

    public void jumpToCurrentState() {
        this.a.jumpToCurrentState();
    }

    public android.graphics.drawable.Drawable getCurrent() {
        return this.a.getCurrent();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.a.setVisible(z, z2);
    }

    public int getOpacity() {
        return this.a.getOpacity();
    }

    public android.graphics.Region getTransparentRegion() {
        return this.a.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.a.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.a.getMinimumHeight();
    }

    public boolean getPadding(android.graphics.Rect rect) {
        return this.a.getPadding(rect);
    }

    public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        invalidateSelf();
    }

    public void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.a.setLevel(i);
    }

    public void setAutoMirrored(boolean z) {
        defpackage.jd.a(this.a, z);
    }

    public boolean isAutoMirrored() {
        return defpackage.jd.a(this.a);
    }

    public void setTint(int i) {
        defpackage.jd.a(this.a, i);
    }

    public void setTintList(android.content.res.ColorStateList colorStateList) {
        defpackage.jd.a(this.a, colorStateList);
    }

    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        defpackage.jd.a(this.a, mode);
    }

    public void setHotspot(float f, float f2) {
        defpackage.jd.a(this.a, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        defpackage.jd.a(this.a, i, i2, i3, i4);
    }
}
