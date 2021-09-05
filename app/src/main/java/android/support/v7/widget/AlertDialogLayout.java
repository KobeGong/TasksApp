package android.support.v7.widget;

import defpackage.ViewCompat;

/* compiled from: PG */
public class AlertDialogLayout extends defpackage.adu {
    public AlertDialogLayout(android.content.Context context) {
        super(context);
    }

    public AlertDialogLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        int makeMeasureSpec;
        int i9;
        android.view.View view;
        android.view.View view2;
        android.view.View view3 = null;
        android.view.View view4 = null;
        android.view.View view5 = null;
        int childCount = getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 < childCount) {
                android.view.View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8) {
                    int id = childAt.getId();
                    if (id != 2131755191) {
                        if (id != 2131755180) {
                            if (id != 2131755183 && id != 2131755189) {
                                z = false;
                                break;
                            } else if (view5 != null) {
                                z = false;
                                break;
                            } else {
                                view = view4;
                                view2 = view3;
                            }
                        } else {
                            view2 = view3;
                            android.view.View view6 = childAt;
                            childAt = view5;
                            view = view6;
                        }
                    } else {
                        android.view.View view7 = view5;
                        view = view4;
                        view2 = childAt;
                        childAt = view7;
                    }
                } else {
                    childAt = view5;
                    view = view4;
                    view2 = view3;
                }
                i10++;
                view3 = view2;
                view4 = view;
                view5 = childAt;
            } else {
                int mode = android.view.View.MeasureSpec.getMode(i2);
                int size = android.view.View.MeasureSpec.getSize(i2);
                int mode2 = android.view.View.MeasureSpec.getMode(i);
                int i11 = 0;
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                if (view3 != null) {
                    view3.measure(i, 0);
                    paddingBottom += view3.getMeasuredHeight();
                    i11 = android.view.View.combineMeasuredStates(0, view3.getMeasuredState());
                }
                int i12 = 0;
                if (view4 != null) {
                    view4.measure(i, 0);
                    android.view.View view8 = view4;
                    while (true) {
                        int f = ViewCompat.a.f(view8);
                        if (f <= 0) {
                            if (!(view8 instanceof android.view.ViewGroup)) {
                                break;
                            }
                            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view8;
                            if (viewGroup.getChildCount() != 1) {
                                break;
                            }
                            view8 = viewGroup.getChildAt(0);
                        } else {
                            i9 = f;
                            break;
                        }
                    }
                    i9 = 0;
                    int measuredHeight = view4.getMeasuredHeight() - i9;
                    paddingBottom += i9;
                    i11 = android.view.View.combineMeasuredStates(i11, view4.getMeasuredState());
                    i3 = measuredHeight;
                    i12 = i9;
                } else {
                    i3 = 0;
                }
                if (view5 != null) {
                    if (mode == 0) {
                        makeMeasureSpec = 0;
                    } else {
                        makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, size - paddingBottom), mode);
                    }
                    view5.measure(i, makeMeasureSpec);
                    int measuredHeight2 = view5.getMeasuredHeight();
                    paddingBottom += measuredHeight2;
                    i11 = android.view.View.combineMeasuredStates(i11, view5.getMeasuredState());
                    i4 = measuredHeight2;
                } else {
                    i4 = 0;
                }
                int i13 = size - paddingBottom;
                if (view4 != null) {
                    int i14 = paddingBottom - i12;
                    int min = java.lang.Math.min(i13, i3);
                    if (min > 0) {
                        i13 -= min;
                        i12 += min;
                    }
                    view4.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                    int measuredHeight3 = view4.getMeasuredHeight() + i14;
                    i6 = android.view.View.combineMeasuredStates(i11, view4.getMeasuredState());
                    int i15 = i13;
                    i7 = measuredHeight3;
                    i5 = i15;
                } else {
                    i5 = i13;
                    i6 = i11;
                    i7 = paddingBottom;
                }
                if (view5 == null || i5 <= 0) {
                    i8 = i6;
                } else {
                    int i16 = i7 - i4;
                    view5.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(i5 + i4, mode));
                    i7 = i16 + view5.getMeasuredHeight();
                    i8 = android.view.View.combineMeasuredStates(i6, view5.getMeasuredState());
                }
                int i17 = 0;
                for (int i18 = 0; i18 < childCount; i18++) {
                    android.view.View childAt2 = getChildAt(i18);
                    if (childAt2.getVisibility() != 8) {
                        i17 = java.lang.Math.max(i17, childAt2.getMeasuredWidth());
                    }
                }
                setMeasuredDimension(android.view.View.resolveSizeAndState(i17 + getPaddingLeft() + getPaddingRight(), i, i8), android.view.View.resolveSizeAndState(i7, i2, 0));
                if (mode2 != 1073741824) {
                    int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                    for (int i19 = 0; i19 < childCount; i19++) {
                        android.view.View childAt3 = getChildAt(i19);
                        if (childAt3.getVisibility() != 8) {
                            defpackage.adv adv = (defpackage.adv) childAt3.getLayoutParams();
                            if (adv.width == -1) {
                                int i20 = adv.height;
                                adv.height = childAt3.getMeasuredHeight();
                                measureChildWithMargins(childAt3, makeMeasureSpec2, 0, i2, 0);
                                adv.height = i20;
                            }
                        }
                    }
                }
                z = true;
            }
        }
        if (!z) {
            super.onMeasure(i, i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop;
        int intrinsicHeight;
        int i5;
        int paddingLeft = getPaddingLeft();
        int i6 = i3 - i;
        int paddingRight = i6 - getPaddingRight();
        int paddingRight2 = (i6 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int i7 = this.i;
        int i8 = 8388615 & i7;
        switch (i7 & 112) {
            case 16:
                paddingTop = (((i4 - i2) - measuredHeight) / 2) + getPaddingTop();
                break;
            case 80:
                paddingTop = ((getPaddingTop() + i4) - i2) - measuredHeight;
                break;
            default:
                paddingTop = getPaddingTop();
                break;
        }
        android.graphics.drawable.Drawable drawable = this.j;
        if (drawable == null) {
            intrinsicHeight = 0;
        } else {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        int i9 = paddingTop;
        for (int i10 = 0; i10 < childCount; i10++) {
            android.view.View childAt = getChildAt(i10);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                defpackage.adv adv = (defpackage.adv) childAt.getLayoutParams();
                int i11 = adv.h;
                if (i11 < 0) {
                    i11 = i8;
                }
                switch (defpackage.jd.a(i11, ViewCompat.a.j(this)) & 7) {
                    case 1:
                        i5 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + adv.leftMargin) - adv.rightMargin;
                        break;
                    case 5:
                        i5 = (paddingRight - measuredWidth) - adv.rightMargin;
                        break;
                    default:
                        i5 = adv.leftMargin + paddingLeft;
                        break;
                }
                if (b(i10)) {
                    i9 += intrinsicHeight;
                }
                int i12 = i9 + adv.topMargin;
                childAt.layout(i5, i12, measuredWidth + i5, i12 + measuredHeight2);
                i9 = i12 + adv.bottomMargin + measuredHeight2;
            }
        }
    }
}
