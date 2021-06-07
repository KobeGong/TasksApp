package com.google.android.apps.tasks.ui.components.snackbar;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.apps.tasks.R;

/* compiled from: PG */
public final class Snackbar extends ard {
    private Snackbar(ViewGroup viewGroup, View view) {
        super(viewGroup, view);
    }

    /* compiled from: PG */
    public final class SnackbarLayout extends arp {
        public SnackbarLayout(Context context) {
            super(context);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: protected */
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }
    }

    public static Snackbar a(View view, CharSequence charSequence, int i) {
        ViewGroup viewGroup = null;
        View view2 = view;
        while (true) {
            if (!(view2 instanceof CoordinatorLayout)) {
                if (view2 instanceof FrameLayout) {
                    if (view2.getId() == 16908290) {
                        viewGroup = (ViewGroup) view2;
                        break;
                    }
                    viewGroup = (ViewGroup) view2;
                }
                if (view2 != null) {
                    ViewParent parent = view2.getParent();
                    if (parent instanceof View) {
                        view2 = (View) parent;
                        continue;
                    } else {
                        view2 = null;
                        continue;
                    }
                }
                if (view2 == null) {
                    break;
                }
            } else {
                viewGroup = (ViewGroup) view2;
                break;
            }
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        Snackbar snackbar = new Snackbar(viewGroup, (SnackbarContentLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_design_layout_snackbar_include, viewGroup, false));
        ((SnackbarContentLayout) snackbar.d.getChildAt(0)).a.setText(charSequence);
        snackbar.e = i;
        return snackbar;
    }

    public static Snackbar a(View view, int i, int i2) {
        return a(view, view.getResources().getText(i), i2);
    }

    public final Snackbar a(int i, View.OnClickListener onClickListener) {
        return a(this.c.getText(i), onClickListener);
    }

    public final Snackbar a(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button button = ((SnackbarContentLayout) this.d.getChildAt(0)).b;
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            button.setVisibility(8);
            button.setOnClickListener(null);
        } else {
            button.setVisibility(0);
            button.setText(charSequence);
            button.setOnClickListener(new arq(this, onClickListener));
        }
        return this;
    }
}
