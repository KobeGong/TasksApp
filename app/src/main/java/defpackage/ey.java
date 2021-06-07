package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

/* renamed from: ey  reason: default package */
/* compiled from: PG */
public class ey extends adu {
    private Drawable a;
    private final Rect b;
    private final Rect c;
    private int d;
    private boolean e;
    private boolean f;

    public ey(Context context) {
        this(context, null);
    }

    public ey(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ey(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new Rect();
        this.c = new Rect();
        this.d = 119;
        this.e = true;
        this.f = false;
        TypedArray a2 = fp.a(context, attributeSet, fm.a, i, 0);
        this.d = a2.getInt(fm.c, this.d);
        Drawable drawable = a2.getDrawable(fm.b);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.e = a2.getBoolean(fm.d, true);
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
                this.a.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
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

    public void setForeground(Drawable drawable) {
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
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public Drawable getForeground() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.adu
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f |= z;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f = true;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.a != null) {
            Drawable drawable = this.a;
            if (this.f) {
                this.f = false;
                Rect rect = this.b;
                Rect rect2 = this.c;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.e) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.d, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        if (this.a != null) {
            this.a.setHotspot(f2, f3);
        }
    }
}
