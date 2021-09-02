package android.support.design.snackbar;

/* compiled from: PG */
public final class Snackbar extends android.support.design.snackbar.BaseTransientBottomBar {

    /* compiled from: PG */
    public final class SnackbarLayout extends defpackage.go {
        public SnackbarLayout(android.content.Context context) {
            super(context);
        }

        public SnackbarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: protected */
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                android.view.View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }
    }
}
