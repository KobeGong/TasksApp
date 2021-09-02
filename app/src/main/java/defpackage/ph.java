package defpackage;

/* renamed from: ph reason: default package */
/* compiled from: PG */
public class ph extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback, defpackage.pf, defpackage.C0001pg {
    public static final android.graphics.PorterDuff.Mode a = android.graphics.PorterDuff.Mode.SRC_IN;
    public defpackage.pi b;
    public android.graphics.drawable.Drawable c;
    private int d;
    private android.graphics.PorterDuff.Mode e;
    private boolean f;
    private boolean g;

    ph(defpackage.pi piVar, android.content.res.Resources resources) {
        this.b = piVar;
        if (this.b != null && this.b.b != null) {
            a(this.b.b.newDrawable(resources));
        }
    }

    public ph(android.graphics.drawable.Drawable drawable) {
        this.b = b();
        a(drawable);
    }

    public void jumpToCurrentState() {
        this.c.jumpToCurrentState();
    }

    public void draw(android.graphics.Canvas canvas) {
        this.c.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(android.graphics.Rect rect) {
        if (this.c != null) {
            this.c.setBounds(rect);
        }
    }

    public void setChangingConfigurations(int i) {
        this.c.setChangingConfigurations(i);
    }

    public int getChangingConfigurations() {
        return (this.b != null ? this.b.getChangingConfigurations() : 0) | super.getChangingConfigurations() | this.c.getChangingConfigurations();
    }

    public void setDither(boolean z) {
        this.c.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.c.setFilterBitmap(z);
    }

    public void setAlpha(int i) {
        this.c.setAlpha(i);
    }

    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }

    public boolean isStateful() {
        android.content.res.ColorStateList colorStateList = (!c() || this.b == null) ? null : this.b.c;
        return (colorStateList != null && colorStateList.isStateful()) || this.c.isStateful();
    }

    public boolean setState(int[] iArr) {
        return a(iArr) || this.c.setState(iArr);
    }

    public int[] getState() {
        return this.c.getState();
    }

    public android.graphics.drawable.Drawable getCurrent() {
        return this.c.getCurrent();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.c.setVisible(z, z2);
    }

    public int getOpacity() {
        return this.c.getOpacity();
    }

    public android.graphics.Region getTransparentRegion() {
        return this.c.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.c.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.c.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.c.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.c.getMinimumHeight();
    }

    public boolean getPadding(android.graphics.Rect rect) {
        return this.c.getPadding(rect);
    }

    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
        if (this.b != null) {
            if (this.b.b != null) {
                this.b.a = getChangingConfigurations();
                return this.b;
            }
        }
        return null;
    }

    public android.graphics.drawable.Drawable mutate() {
        if (!this.g && super.mutate() == this) {
            this.b = b();
            if (this.c != null) {
                this.c.mutate();
            }
            if (this.b != null) {
                this.b.b = this.c != null ? this.c.getConstantState() : null;
            }
            this.g = true;
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    public defpackage.pi b() {
        return new defpackage.pj(this.b);
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
        return this.c.setLevel(i);
    }

    public void setTint(int i) {
        setTintList(android.content.res.ColorStateList.valueOf(i));
    }

    public void setTintList(android.content.res.ColorStateList colorStateList) {
        this.b.c = colorStateList;
        a(getState());
    }

    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        this.b.d = mode;
        a(getState());
    }

    private final boolean a(int[] iArr) {
        if (!c()) {
            return false;
        }
        android.content.res.ColorStateList colorStateList = this.b.c;
        android.graphics.PorterDuff.Mode mode = this.b.d;
        if (colorStateList == null || mode == null) {
            this.f = false;
            clearColorFilter();
            return false;
        }
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f && colorForState == this.d && mode == this.e) {
            return false;
        }
        setColorFilter(colorForState, mode);
        this.d = colorForState;
        this.e = mode;
        this.f = true;
        return true;
    }

    public final android.graphics.drawable.Drawable a() {
        return this.c;
    }

    public final void a(android.graphics.drawable.Drawable drawable) {
        if (this.c != null) {
            this.c.setCallback(null);
        }
        this.c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            if (this.b != null) {
                this.b.b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        return true;
    }
}
