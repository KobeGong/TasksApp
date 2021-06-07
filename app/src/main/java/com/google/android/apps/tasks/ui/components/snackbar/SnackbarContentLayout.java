package com.google.android.apps.tasks.ui.components.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.tasks.R;

/* compiled from: PG */
public class SnackbarContentLayout extends LinearLayout {
    public TextView a;
    public Button b;
    private int c;
    private int d;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hf.a);
        this.c = obtainStyledAttributes.getDimensionPixelSize(hf.b, -1);
        this.d = obtainStyledAttributes.getDimensionPixelSize(hf.c, -1);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.snackbar_text);
        this.b = (Button) findViewById(R.id.snackbar_action);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        super.onMeasure(i, i2);
        if (this.c > 0 && getMeasuredWidth() > this.c) {
            i = View.MeasureSpec.makeMeasureSpec(this.c, 1073741824);
            super.onMeasure(i, i2);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
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
        TextView textView = this.a;
        if (sn.a.n(textView)) {
            sn.a(textView, sn.a.k(textView), i2, sn.a.l(textView), i3);
        } else {
            textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        }
        return true;
    }
}
