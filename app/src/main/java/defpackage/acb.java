package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.apps.tasks.R;

/* renamed from: acb  reason: default package */
/* compiled from: PG */
public final class acb extends Spinner implements sm {
    private static final int[] d = {16843505};
    public ace a;
    public int b;
    public final Rect c;
    private final abg e;
    private final Context f;
    private ado g;
    private SpinnerAdapter h;
    private final boolean i;

    public acb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private acb(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (int) R.attr.spinnerStyle);
    }

    private acb(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, R.attr.spinnerStyle, -1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private acb(android.content.Context r10, android.util.AttributeSet r11, int r12, int r13) {
        /*
        // Method dump skipped, instructions count: 213
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acb.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public final Context getPopupContext() {
        if (this.a != null) {
            return this.f;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    public final void setPopupBackgroundDrawable(Drawable drawable) {
        if (this.a != null) {
            this.a.a(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public final void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(xw.b(getPopupContext(), i2));
    }

    public final Drawable getPopupBackground() {
        if (this.a != null) {
            return this.a.r.getBackground();
        }
        return super.getPopupBackground();
    }

    public final void setDropDownVerticalOffset(int i2) {
        if (this.a != null) {
            this.a.a(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    public final int getDropDownVerticalOffset() {
        if (this.a != null) {
            return this.a.c();
        }
        return super.getDropDownVerticalOffset();
    }

    public final void setDropDownHorizontalOffset(int i2) {
        if (this.a != null) {
            this.a.g = i2;
        } else {
            super.setDropDownHorizontalOffset(i2);
        }
    }

    public final int getDropDownHorizontalOffset() {
        if (this.a != null) {
            return this.a.g;
        }
        return super.getDropDownHorizontalOffset();
    }

    public final void setDropDownWidth(int i2) {
        if (this.a != null) {
            this.b = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    public final int getDropDownWidth() {
        if (this.a != null) {
            return this.b;
        }
        return super.getDropDownWidth();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.i) {
            this.h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.a != null) {
            this.a.a(new acd(spinnerAdapter, (this.f == null ? getContext() : this.f).getTheme()));
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a != null && this.a.r.isShowing()) {
            this.a.e();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.g == null || !this.g.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.a != null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    public final boolean performClick() {
        if (this.a == null) {
            return super.performClick();
        }
        if (!this.a.r.isShowing()) {
            this.a.d();
        }
        return true;
    }

    public final void setPrompt(CharSequence charSequence) {
        if (this.a != null) {
            this.a.a = charSequence;
        } else {
            super.setPrompt(charSequence);
        }
    }

    public final CharSequence getPrompt() {
        if (this.a != null) {
            return this.a.a;
        }
        return super.getPrompt();
    }

    public final void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        if (this.e != null) {
            this.e.a(i2);
        }
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.e != null) {
            this.e.a();
        }
    }

    @Override // defpackage.sm
    public final void a(ColorStateList colorStateList) {
        if (this.e != null) {
            this.e.a(colorStateList);
        }
    }

    @Override // defpackage.sm
    public final ColorStateList d_() {
        if (this.e != null) {
            return this.e.b();
        }
        return null;
    }

    @Override // defpackage.sm
    public final void a(PorterDuff.Mode mode) {
        if (this.e != null) {
            this.e.a(mode);
        }
    }

    @Override // defpackage.sm
    public final PorterDuff.Mode b() {
        if (this.e != null) {
            return this.e.c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.e != null) {
            this.e.d();
        }
    }

    /* access modifiers changed from: package-private */
    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        View view;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int max2 = Math.max(0, max - (15 - (min - max)));
        View view2 = null;
        int i2 = 0;
        int i3 = 0;
        while (max2 < min) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i3) {
                view = null;
            } else {
                itemViewType = i3;
                view = view2;
            }
            view2 = spinnerAdapter.getView(max2, view, this);
            if (view2.getLayoutParams() == null) {
                view2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view2.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view2.getMeasuredWidth());
            max2++;
            i3 = itemViewType;
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.c);
        return this.c.left + this.c.right + i2;
    }
}
