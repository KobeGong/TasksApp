package com.google.android.apps.tasks.ui.components.snackbar;

/* compiled from: PG */
public final class Snackbar extends defpackage.ard {

    /* compiled from: PG */
    public final class SnackbarLayout extends defpackage.arp {
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

    private Snackbar(android.view.ViewGroup viewGroup, android.view.View view) {
        super(viewGroup, view);
    }

    public static com.google.android.apps.tasks.ui.components.snackbar.Snackbar a(android.view.View view, java.lang.CharSequence charSequence, int i) {
        android.view.ViewGroup viewGroup = null;
        android.view.View view2 = view;
        while (true) {
            if (!(view2 instanceof android.support.design.widget.CoordinatorLayout)) {
                if (view2 instanceof android.widget.FrameLayout) {
                    if (view2.getId() == 16908290) {
                        viewGroup = (android.view.ViewGroup) view2;
                        break;
                    }
                    viewGroup = (android.view.ViewGroup) view2;
                }
                if (view2 != null) {
                    android.view.ViewParent parent = view2.getParent();
                    if (parent instanceof android.view.View) {
                        view2 = (android.view.View) parent;
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
                viewGroup = (android.view.ViewGroup) view2;
                break;
            }
        }
        if (viewGroup == null) {
            throw new java.lang.IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        com.google.android.apps.tasks.ui.components.snackbar.Snackbar snackbar = new com.google.android.apps.tasks.ui.components.snackbar.Snackbar(viewGroup, (com.google.android.apps.tasks.ui.components.snackbar.SnackbarContentLayout) android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131034154, viewGroup, false));
        ((com.google.android.apps.tasks.ui.components.snackbar.SnackbarContentLayout) snackbar.d.getChildAt(0)).a.setText(charSequence);
        snackbar.e = i;
        return snackbar;
    }

    public static com.google.android.apps.tasks.ui.components.snackbar.Snackbar a(android.view.View view, int i, int i2) {
        return a(view, view.getResources().getText(i), i2);
    }

    public final com.google.android.apps.tasks.ui.components.snackbar.Snackbar a(int i, android.view.View.OnClickListener onClickListener) {
        return a(this.c.getText(i), onClickListener);
    }

    public final com.google.android.apps.tasks.ui.components.snackbar.Snackbar a(java.lang.CharSequence charSequence, android.view.View.OnClickListener onClickListener) {
        android.widget.Button button = ((com.google.android.apps.tasks.ui.components.snackbar.SnackbarContentLayout) this.d.getChildAt(0)).b;
        if (android.text.TextUtils.isEmpty(charSequence) || onClickListener == null) {
            button.setVisibility(8);
            button.setOnClickListener(null);
        } else {
            button.setVisibility(0);
            button.setText(charSequence);
            button.setOnClickListener(new defpackage.arq(this, onClickListener));
        }
        return this;
    }
}
