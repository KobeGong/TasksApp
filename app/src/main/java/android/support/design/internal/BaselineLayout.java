package android.support.design.internal;

/* compiled from: PG */
public class BaselineLayout extends android.view.ViewGroup {
    private int a = -1;

    public BaselineLayout(android.content.Context context) {
        super(context, null, 0);
    }

    public BaselineLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public BaselineLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        int i6 = 0;
        int i7 = 0;
        int i8 = -1;
        while (i3 < childCount) {
            android.view.View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i5 = java.lang.Math.max(i5, baseline);
                    i8 = java.lang.Math.max(i8, childAt.getMeasuredHeight() - baseline);
                }
                i7 = java.lang.Math.max(i7, childAt.getMeasuredWidth());
                i6 = java.lang.Math.max(i6, childAt.getMeasuredHeight());
                i4 = android.view.View.combineMeasuredStates(i4, childAt.getMeasuredState());
            }
            int i9 = i4;
            int i10 = i5;
            i3++;
            i8 = i8;
            i5 = i10;
            i4 = i9;
        }
        if (i5 != -1) {
            i6 = java.lang.Math.max(i6, java.lang.Math.max(i8, getPaddingBottom()) + i5);
            this.a = i5;
        }
        setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(i7, getSuggestedMinimumWidth()), i, i4), android.view.View.resolveSizeAndState(java.lang.Math.max(i6, getSuggestedMinimumHeight()), i2, i4 << 16));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i3 - i) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = paddingLeft + ((paddingRight - measuredWidth) / 2);
                if (this.a == -1 || childAt.getBaseline() == -1) {
                    i5 = paddingTop;
                } else {
                    i5 = (this.a + paddingTop) - childAt.getBaseline();
                }
                childAt.layout(i7, i5, measuredWidth + i7, measuredHeight + i5);
            }
        }
    }

    public int getBaseline() {
        return this.a;
    }
}
