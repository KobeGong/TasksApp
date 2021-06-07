package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.tasks.R;

/* compiled from: PG */
public class AlertDialogLayout extends adu {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.adu
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
        View view;
        View view2;
        View view3 = null;
        View view4 = null;
        View view5 = null;
        int childCount = getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 < childCount) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8) {
                    int id = childAt.getId();
                    if (id == R.id.topPanel) {
                        view = view4;
                        view2 = childAt;
                        childAt = view5;
                    } else if (id == R.id.buttonPanel) {
                        view2 = view3;
                        childAt = view5;
                        view = childAt;
                    } else if (id != R.id.contentPanel && id != R.id.customPanel) {
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
                    childAt = view5;
                    view = view4;
                    view2 = view3;
                }
                i10++;
                view3 = view2;
                view4 = view;
                view5 = childAt;
            } else {
                int mode = View.MeasureSpec.getMode(i2);
                int size = View.MeasureSpec.getSize(i2);
                int mode2 = View.MeasureSpec.getMode(i);
                int i11 = 0;
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                if (view3 != null) {
                    view3.measure(i, 0);
                    paddingBottom += view3.getMeasuredHeight();
                    i11 = View.combineMeasuredStates(0, view3.getMeasuredState());
                }
                int i12 = 0;
                if (view4 != null) {
                    view4.measure(i, 0);
                    View view6 = view4;
                    while (true) {
                        int f = sn.a.f(view6);
                        if (f > 0) {
                            i9 = f;
                            break;
                        }
                        if (!(view6 instanceof ViewGroup)) {
                            break;
                        }
                        ViewGroup viewGroup = (ViewGroup) view6;
                        if (viewGroup.getChildCount() != 1) {
                            break;
                        }
                        view6 = viewGroup.getChildAt(0);
                    }
                    i9 = 0;
                    paddingBottom += i9;
                    i11 = View.combineMeasuredStates(i11, view4.getMeasuredState());
                    i3 = view4.getMeasuredHeight() - i9;
                    i12 = i9;
                } else {
                    i3 = 0;
                }
                if (view5 != null) {
                    if (mode == 0) {
                        makeMeasureSpec = 0;
                    } else {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode);
                    }
                    view5.measure(i, makeMeasureSpec);
                    int measuredHeight = view5.getMeasuredHeight();
                    paddingBottom += measuredHeight;
                    i11 = View.combineMeasuredStates(i11, view5.getMeasuredState());
                    i4 = measuredHeight;
                } else {
                    i4 = 0;
                }
                int i13 = size - paddingBottom;
                if (view4 != null) {
                    int i14 = paddingBottom - i12;
                    int min = Math.min(i13, i3);
                    if (min > 0) {
                        i13 -= min;
                        i12 += min;
                    }
                    view4.measure(i, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                    i6 = View.combineMeasuredStates(i11, view4.getMeasuredState());
                    i7 = view4.getMeasuredHeight() + i14;
                    i5 = i13;
                } else {
                    i5 = i13;
                    i6 = i11;
                    i7 = paddingBottom;
                }
                if (view5 == null || i5 <= 0) {
                    i8 = i6;
                } else {
                    view5.measure(i, View.MeasureSpec.makeMeasureSpec(i5 + i4, mode));
                    i7 = (i7 - i4) + view5.getMeasuredHeight();
                    i8 = View.combineMeasuredStates(i6, view5.getMeasuredState());
                }
                int i15 = 0;
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt2 = getChildAt(i16);
                    if (childAt2.getVisibility() != 8) {
                        i15 = Math.max(i15, childAt2.getMeasuredWidth());
                    }
                }
                setMeasuredDimension(View.resolveSizeAndState(i15 + getPaddingLeft() + getPaddingRight(), i, i8), View.resolveSizeAndState(i7, i2, 0));
                if (mode2 != 1073741824) {
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                    for (int i17 = 0; i17 < childCount; i17++) {
                        View childAt3 = getChildAt(i17);
                        if (childAt3.getVisibility() != 8) {
                            adv adv = (adv) childAt3.getLayoutParams();
                            if (adv.width == -1) {
                                int i18 = adv.height;
                                adv.height = childAt3.getMeasuredHeight();
                                measureChildWithMargins(childAt3, makeMeasureSpec2, 0, i2, 0);
                                adv.height = i18;
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
    @Override // defpackage.adu
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
        Drawable drawable = this.j;
        if (drawable == null) {
            intrinsicHeight = 0;
        } else {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        int i9 = paddingTop;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                adv adv = (adv) childAt.getLayoutParams();
                int i11 = adv.h;
                if (i11 < 0) {
                    i11 = i8;
                }
                switch (jd.a(i11, sn.a.j(this)) & 7) {
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
