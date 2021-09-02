package com.google.android.apps.tasks.ui.components.snackbar;

/* compiled from: PG */
public class SnackbarContentLayout extends android.widget.LinearLayout {
    public android.widget.TextView a;
    public android.widget.Button b;
    private int c;
    private int d;

    public SnackbarContentLayout(android.content.Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.hf.a);
        this.c = obtainStyledAttributes.getDimensionPixelSize(defpackage.hf.b, -1);
        this.d = obtainStyledAttributes.getDimensionPixelSize(defpackage.hf.c, -1);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (android.widget.TextView) findViewById(2131755031);
        this.b = (android.widget.Button) findViewById(2131755030);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        super.onMeasure(i, i2);
        if (this.c > 0 && getMeasuredWidth() > this.c) {
            i = android.view.View.MeasureSpec.makeMeasureSpec(this.c, 1073741824);
            super.onMeasure(i, i2);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131689653);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131689652);
        boolean z2 = this.a.getLayout().getLineCount() > 1;
        if (!z2 || this.d <= 0 || this.b.getMeasuredWidth() <= this.d) {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (a(0, dimensionPixelSize, dimensionPixelSize)) {
                z = true;
            }
            z = false;
        } else {
            if (a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                z = true;
            }
            z = false;
        }
        if (z) {
            super.onMeasure(i, i2);
        }
    }

    private final boolean a(int i, int i2, int i3) {
        boolean z = false;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        }
        if (this.a.getPaddingTop() == i2 && this.a.getPaddingBottom() == i3) {
            return z;
        }
        android.widget.TextView textView = this.a;
        if (defpackage.sn.a.n(textView)) {
            defpackage.sn.a(textView, defpackage.sn.a.k(textView), i2, defpackage.sn.a.l(textView), i3);
        } else {
            textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        }
        return true;
    }
}
