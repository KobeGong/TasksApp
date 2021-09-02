package defpackage;

/* renamed from: ey reason: default package */
/* compiled from: PG */
public class ey extends defpackage.adu {
    private android.graphics.drawable.Drawable a;
    private final android.graphics.Rect b;
    private final android.graphics.Rect c;
    private int d;
    private boolean e;
    private boolean f;

    public ey(android.content.Context context) {
        this(context, null);
    }

    public ey(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ey(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new android.graphics.Rect();
        this.c = new android.graphics.Rect();
        this.d = 119;
        this.e = true;
        this.f = false;
        android.content.res.TypedArray a2 = defpackage.fp.a(context, attributeSet, defpackage.fm.a, i, 0);
        this.d = a2.getInt(defpackage.fm.c, this.d);
        android.graphics.drawable.Drawable drawable = a2.getDrawable(defpackage.fm.b);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.e = a2.getBoolean(defpackage.fm.d, true);
        a2.recycle();
    }

    public int getForegroundGravity() {
        return this.d;
    }

    public void setForegroundGravity(int i) {
        int i2;
        if (this.d != i) {
            if ((8388615 & i) == 0) {
                i2 = 8388611 | i;
            } else {
                i2 = i;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.d = i2;
            if (this.d == 119 && this.a != null) {
                this.a.getPadding(new android.graphics.Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.a != null) {
            this.a.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.a != null && this.a.isStateful()) {
            this.a.setState(getDrawableState());
        }
    }

    public void setForeground(android.graphics.drawable.Drawable drawable) {
        if (this.a != drawable) {
            if (this.a != null) {
                this.a.setCallback(null);
                unscheduleDrawable(this.a);
            }
            this.a = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.d == 119) {
                    drawable.getPadding(new android.graphics.Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public android.graphics.drawable.Drawable getForeground() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f |= z;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f = true;
    }

    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        if (this.a != null) {
            android.graphics.drawable.Drawable drawable = this.a;
            if (this.f) {
                this.f = false;
                android.graphics.Rect rect = this.b;
                android.graphics.Rect rect2 = this.c;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.e) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                android.view.Gravity.apply(this.d, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @android.annotation.TargetApi(21)
    public void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        if (this.a != null) {
            this.a.setHotspot(f2, f3);
        }
    }
}
