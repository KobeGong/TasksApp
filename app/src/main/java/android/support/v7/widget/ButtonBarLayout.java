package android.support.v7.widget;

/* compiled from: PG */
public class ButtonBarLayout extends android.widget.LinearLayout {
    private boolean a;
    private int b = -1;

    public ButtonBarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.xu.ay);
        this.a = obtainStyledAttributes.getBoolean(defpackage.xu.az, true);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int size = android.view.View.MeasureSpec.getSize(i);
        if (this.a) {
            if (size > this.b && a()) {
                a(false);
            }
            this.b = size;
        }
        if (a() || android.view.View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = android.view.View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.a && !a() && (getMeasuredWidthAndState() & -16777216) == 16777216) {
            a(true);
            z = true;
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int a2 = a(0);
        if (a2 >= 0) {
            android.view.View childAt = getChildAt(a2);
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) childAt.getLayoutParams();
            i4 = layoutParams.bottomMargin + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + 0;
            if (a()) {
                int a3 = a(a2 + 1);
                if (a3 >= 0) {
                    i4 += getChildAt(a3).getPaddingTop() + ((int) (16.0f * getResources().getDisplayMetrics().density));
                }
            } else {
                i4 += getPaddingBottom();
            }
        } else {
            i4 = 0;
        }
        if (defpackage.sn.a.f(this) != i4) {
            setMinimumHeight(i4);
        }
    }

    private final int a(int i) {
        int childCount = getChildCount();
        for (int i2 = i; i2 < childCount; i2++) {
            if (getChildAt(i2).getVisibility() == 0) {
                return i2;
            }
        }
        return -1;
    }

    public int getMinimumHeight() {
        return java.lang.Math.max(0, super.getMinimumHeight());
    }

    private final void a(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        android.view.View findViewById = findViewById(2131755181);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    private final boolean a() {
        return getOrientation() == 1;
    }
}
