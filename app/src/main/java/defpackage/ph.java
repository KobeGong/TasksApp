package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: ph  reason: default package */
/* compiled from: PG */
public class ph extends Drawable implements Drawable.Callback, pf, AbstractC0001pg {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public pi b;
    public Drawable c;
    private int d;
    private PorterDuff.Mode e;
    private boolean f;
    private boolean g;

    ph(pi piVar, Resources resources) {
        this.b = piVar;
        if (this.b != null && this.b.b != null) {
            a(this.b.b.newDrawable(resources));
        }
    }

    public ph(Drawable drawable) {
        this.b = b();
        a(drawable);
    }

    public void jumpToCurrentState() {
        this.c.jumpToCurrentState();
    }

    public void draw(Canvas canvas) {
        this.c.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
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

    public void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }

    public boolean isStateful() {
        ColorStateList colorStateList = (!c() || this.b == null) ? null : this.b.c;
        return (colorStateList != null && colorStateList.isStateful()) || this.c.isStateful();
    }

    public boolean setState(int[] iArr) {
        return a(iArr) || this.c.setState(iArr);
    }

    public int[] getState() {
        return this.c.getState();
    }

    public Drawable getCurrent() {
        return this.c.getCurrent();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.c.setVisible(z, z2);
    }

    public int getOpacity() {
        return this.c.getOpacity();
    }

    public Region getTransparentRegion() {
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

    public boolean getPadding(Rect rect) {
        return this.c.getPadding(rect);
    }

    public Drawable.ConstantState getConstantState() {
        if (this.b != null) {
            if (this.b.b != null) {
                this.b.a = getChangingConfigurations();
                return this.b;
            }
        }
        return null;
    }

    public Drawable mutate() {
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

    /* access modifiers changed from: package-private */
    public pi b() {
        return new pj(this.b);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.c.setLevel(i);
    }

    @Override // defpackage.pf
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // defpackage.pf
    public void setTintList(ColorStateList colorStateList) {
        this.b.c = colorStateList;
        a(getState());
    }

    @Override // defpackage.pf
    public void setTintMode(PorterDuff.Mode mode) {
        this.b.d = mode;
        a(getState());
    }

    private final boolean a(int[] iArr) {
        if (!c()) {
            return false;
        }
        ColorStateList colorStateList = this.b.c;
        PorterDuff.Mode mode = this.b.d;
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

    @Override // defpackage.AbstractC0001pg
    public final Drawable a() {
        return this.c;
    }

    @Override // defpackage.AbstractC0001pg
    public final void a(Drawable drawable) {
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
