package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: adu  reason: default package */
/* compiled from: PG */
public class adu extends ViewGroup {
    private int a;
    private int b;
    private int c;
    private int d;
    private float e;
    private boolean f;
    private int[] g;
    public boolean h;
    public int i;
    public Drawable j;
    public int k;
    private int[] l;
    private int m;
    private int n;
    private int o;

    public adu(Context context) {
        this(context, null);
    }

    public adu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public adu(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        boolean z;
        this.h = true;
        this.a = -1;
        this.b = 0;
        this.i = 8388659;
        agw a2 = agw.a(context, attributeSet, xu.aI, i2, 0);
        int a3 = a2.a(xu.aP, -1);
        if (a3 >= 0) {
            c(a3);
        }
        int a4 = a2.a(xu.aO, -1);
        if (a4 >= 0 && this.i != a4) {
            a4 = (8388615 & a4) == 0 ? a4 | 8388611 : a4;
            this.i = (a4 & 112) == 0 ? a4 | 48 : a4;
            requestLayout();
        }
        boolean a5 = a2.a(xu.aM, true);
        if (!a5) {
            this.h = a5;
        }
        this.e = a2.a(xu.aQ, -1.0f);
        this.a = a2.a(xu.aN, -1);
        this.f = a2.a(xu.aT, false);
        Drawable a6 = a2.a(xu.aR);
        if (a6 != this.j) {
            this.j = a6;
            if (a6 != null) {
                this.k = a6.getIntrinsicWidth();
                this.m = a6.getIntrinsicHeight();
            } else {
                this.k = 0;
                this.m = 0;
            }
            if (a6 == null) {
                z = true;
            } else {
                z = false;
            }
            setWillNotDraw(z);
            requestLayout();
        }
        this.n = a2.a(xu.aU, 0);
        this.o = a2.e(xu.aS, 0);
        a2.b.recycle();
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int right;
        int left;
        int bottom;
        if (this.j != null) {
            if (this.c == 1) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !b(i2))) {
                        a(canvas, (childAt.getTop() - ((adv) childAt.getLayoutParams()).topMargin) - this.m);
                    }
                }
                if (b(childCount)) {
                    View childAt2 = getChildAt(childCount - 1);
                    if (childAt2 == null) {
                        bottom = (getHeight() - getPaddingBottom()) - this.m;
                    } else {
                        bottom = ((adv) childAt2.getLayoutParams()).bottomMargin + childAt2.getBottom();
                    }
                    a(canvas, bottom);
                    return;
                }
                return;
            }
            int childCount2 = getChildCount();
            boolean a2 = ahr.a(this);
            for (int i3 = 0; i3 < childCount2; i3++) {
                View childAt3 = getChildAt(i3);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !b(i3))) {
                    adv adv = (adv) childAt3.getLayoutParams();
                    if (a2) {
                        left = adv.rightMargin + childAt3.getRight();
                    } else {
                        left = (childAt3.getLeft() - adv.leftMargin) - this.k;
                    }
                    b(canvas, left);
                }
            }
            if (b(childCount2)) {
                View childAt4 = getChildAt(childCount2 - 1);
                if (childAt4 != null) {
                    adv adv2 = (adv) childAt4.getLayoutParams();
                    if (a2) {
                        right = (childAt4.getLeft() - adv2.leftMargin) - this.k;
                    } else {
                        right = adv2.rightMargin + childAt4.getRight();
                    }
                } else if (a2) {
                    right = getPaddingLeft();
                } else {
                    right = (getWidth() - getPaddingRight()) - this.k;
                }
                b(canvas, right);
            }
        }
    }

    private final void a(Canvas canvas, int i2) {
        this.j.setBounds(getPaddingLeft() + this.o, i2, (getWidth() - getPaddingRight()) - this.o, this.m + i2);
        this.j.draw(canvas);
    }

    private final void b(Canvas canvas, int i2) {
        this.j.setBounds(i2, getPaddingTop() + this.o, this.k + i2, (getHeight() - getPaddingBottom()) - this.o);
        this.j.draw(canvas);
    }

    public int getBaseline() {
        int i2;
        int i3;
        if (this.a < 0) {
            return super.getBaseline();
        }
        if (getChildCount() <= this.a) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(this.a);
        int baseline = childAt.getBaseline();
        if (baseline != -1) {
            int i4 = this.b;
            if (this.c == 1 && (i3 = this.i & 112) != 48) {
                switch (i3) {
                    case 16:
                        i2 = i4 + (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.d) / 2);
                        break;
                    case 80:
                        i2 = ((getBottom() - getTop()) - getPaddingBottom()) - this.d;
                        break;
                }
                return ((adv) childAt.getLayoutParams()).topMargin + i2 + baseline;
            }
            i2 = i4;
            return ((adv) childAt.getLayoutParams()).topMargin + i2 + baseline;
        } else if (this.a == 0) {
            return -1;
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        float f2;
        int i6;
        int i7;
        boolean z;
        int i8;
        int i9;
        int i10;
        int i11;
        float f3;
        int i12;
        int baseline;
        View view;
        int i13;
        boolean z2;
        boolean z3;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z4;
        boolean z5;
        int i19;
        int baseline2;
        int i20;
        int i21;
        float f4;
        boolean z6;
        int i22;
        int i23;
        int i24;
        int i25;
        View view2;
        int i26;
        boolean z7;
        boolean z8;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        boolean z9;
        boolean z10;
        int i32;
        if (this.c == 1) {
            this.d = 0;
            int i33 = 0;
            int i34 = 0;
            int i35 = 0;
            int i36 = 0;
            boolean z11 = true;
            float f5 = 0.0f;
            int childCount = getChildCount();
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            boolean z12 = false;
            boolean z13 = false;
            int i37 = this.a;
            boolean z14 = this.f;
            int i38 = 0;
            int i39 = 0;
            while (i39 < childCount) {
                View childAt = getChildAt(i39);
                if (childAt == null) {
                    this.d = this.d;
                    i26 = i38;
                    z7 = z13;
                    z8 = z11;
                    i27 = i36;
                    i28 = i35;
                    i29 = i34;
                    i30 = i33;
                } else if (childAt.getVisibility() != 8) {
                    if (b(i39)) {
                        this.d += this.m;
                    }
                    adv adv = (adv) childAt.getLayoutParams();
                    float f6 = f5 + adv.g;
                    if (mode2 == 1073741824 && adv.height == 0 && adv.g > 0.0f) {
                        int i40 = this.d;
                        this.d = Math.max(i40, adv.topMargin + i40 + adv.bottomMargin);
                        i31 = i38;
                        z9 = true;
                    } else {
                        int i41 = Integer.MIN_VALUE;
                        if (adv.height == 0 && adv.g > 0.0f) {
                            i41 = 0;
                            adv.height = -2;
                        }
                        a(childAt, i2, 0, i3, f6 == 0.0f ? this.d : 0);
                        if (i41 != Integer.MIN_VALUE) {
                            adv.height = i41;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i42 = this.d;
                        this.d = Math.max(i42, i42 + measuredHeight + adv.topMargin + adv.bottomMargin);
                        if (z14) {
                            i31 = Math.max(measuredHeight, i38);
                            z9 = z13;
                        } else {
                            i31 = i38;
                            z9 = z13;
                        }
                    }
                    if (i37 >= 0 && i37 == i39 + 1) {
                        this.b = this.d;
                    }
                    if (i39 >= i37 || adv.g <= 0.0f) {
                        boolean z15 = false;
                        if (mode == 1073741824 || adv.width != -1) {
                            z10 = z12;
                        } else {
                            z10 = true;
                            z15 = true;
                        }
                        int i43 = adv.leftMargin + adv.rightMargin;
                        int measuredWidth = childAt.getMeasuredWidth() + i43;
                        int max = Math.max(i33, measuredWidth);
                        int combineMeasuredStates = View.combineMeasuredStates(i34, childAt.getMeasuredState());
                        boolean z16 = z11 && adv.width == -1;
                        if (adv.g > 0.0f) {
                            if (z15) {
                                i32 = i43;
                            } else {
                                i32 = measuredWidth;
                            }
                            z8 = z16;
                            i27 = Math.max(i36, i32);
                            i29 = combineMeasuredStates;
                            i26 = i31;
                            z7 = z9;
                            z12 = z10;
                            i28 = i35;
                            f5 = f6;
                            i30 = max;
                        } else {
                            if (!z15) {
                                i43 = measuredWidth;
                            }
                            int max2 = Math.max(i35, i43);
                            z8 = z16;
                            i27 = i36;
                            i29 = combineMeasuredStates;
                            z7 = z9;
                            z12 = z10;
                            f5 = f6;
                            i30 = max;
                            i28 = max2;
                            i26 = i31;
                        }
                    } else {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                } else {
                    i26 = i38;
                    z7 = z13;
                    z8 = z11;
                    i27 = i36;
                    i28 = i35;
                    i29 = i34;
                    i30 = i33;
                }
                i39++;
                z11 = z8;
                i36 = i27;
                i35 = i28;
                i34 = i29;
                i33 = i30;
                z13 = z7;
                i38 = i26;
            }
            if (this.d > 0 && b(childCount)) {
                this.d += this.m;
            }
            if (z14 && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
                this.d = 0;
                for (int i44 = 0; i44 < childCount; i44++) {
                    View childAt2 = getChildAt(i44);
                    if (childAt2 == null) {
                        this.d = this.d;
                    } else if (childAt2.getVisibility() != 8) {
                        adv adv2 = (adv) childAt2.getLayoutParams();
                        int i45 = this.d;
                        this.d = Math.max(i45, adv2.bottomMargin + i45 + i38 + adv2.topMargin);
                    }
                }
            }
            this.d += getPaddingTop() + getPaddingBottom();
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(this.d, getSuggestedMinimumHeight()), i3, 0);
            int i46 = (16777215 & resolveSizeAndState) - this.d;
            if (z13 || (i46 != 0 && f5 > 0.0f)) {
                if (this.e > 0.0f) {
                    f5 = this.e;
                }
                this.d = 0;
                int i47 = 0;
                boolean z17 = z11;
                int i48 = i35;
                int i49 = i34;
                int i50 = i33;
                while (i47 < childCount) {
                    View childAt3 = getChildAt(i47);
                    if (childAt3.getVisibility() != 8) {
                        adv adv3 = (adv) childAt3.getLayoutParams();
                        float f7 = adv3.g;
                        if (f7 > 0.0f) {
                            int i51 = (int) ((((float) i46) * f7) / f5);
                            float f8 = f5 - f7;
                            int i52 = i46 - i51;
                            int childMeasureSpec = getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + adv3.leftMargin + adv3.rightMargin, adv3.width);
                            if (adv3.height != 0 || mode2 != 1073741824) {
                                i51 += childAt3.getMeasuredHeight();
                                if (i51 < 0) {
                                    i51 = 0;
                                }
                                view2 = childAt3;
                            } else if (i51 > 0) {
                                view2 = childAt3;
                            } else {
                                i51 = 0;
                                view2 = childAt3;
                            }
                            view2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i51, 1073741824));
                            i24 = i52;
                            i25 = View.combineMeasuredStates(i49, childAt3.getMeasuredState() & -256);
                            f4 = f8;
                        } else {
                            f4 = f5;
                            i24 = i46;
                            i25 = i49;
                        }
                        int i53 = adv3.leftMargin + adv3.rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i53;
                        int max3 = Math.max(i50, measuredWidth2);
                        if (!(mode != 1073741824 && adv3.width == -1)) {
                            i53 = measuredWidth2;
                        }
                        int max4 = Math.max(i48, i53);
                        z6 = z17 && adv3.width == -1;
                        int i54 = this.d;
                        this.d = Math.max(i54, adv3.bottomMargin + childAt3.getMeasuredHeight() + i54 + adv3.topMargin);
                        i22 = max4;
                        i23 = max3;
                    } else {
                        f4 = f5;
                        z6 = z17;
                        i22 = i48;
                        i23 = i50;
                        i24 = i46;
                        i25 = i49;
                    }
                    i47++;
                    z17 = z6;
                    i48 = i22;
                    i49 = i25;
                    i50 = i23;
                    i46 = i24;
                    f5 = f4;
                }
                this.d += getPaddingTop() + getPaddingBottom();
                i21 = i48;
                i34 = i49;
                i20 = i50;
                z11 = z17;
            } else {
                int max5 = Math.max(i35, i36);
                if (z14 && mode2 != 1073741824) {
                    for (int i55 = 0; i55 < childCount; i55++) {
                        View childAt4 = getChildAt(i55);
                        if (!(childAt4 == null || childAt4.getVisibility() == 8 || ((adv) childAt4.getLayoutParams()).g <= 0.0f)) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i38, 1073741824));
                        }
                    }
                }
                i21 = max5;
                i20 = i33;
            }
            if (z11 || mode == 1073741824) {
                i21 = i20;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(i21 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, i34), resolveSizeAndState);
            if (z12) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i56 = 0; i56 < childCount; i56++) {
                    View childAt5 = getChildAt(i56);
                    if (childAt5.getVisibility() != 8) {
                        adv adv4 = (adv) childAt5.getLayoutParams();
                        if (adv4.width == -1) {
                            int i57 = adv4.height;
                            adv4.height = childAt5.getMeasuredHeight();
                            measureChildWithMargins(childAt5, makeMeasureSpec, 0, i3, 0);
                            adv4.height = i57;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.d = 0;
        int i58 = 0;
        int i59 = 0;
        int i60 = 0;
        int i61 = 0;
        boolean z18 = true;
        float f9 = 0.0f;
        int childCount2 = getChildCount();
        int mode3 = View.MeasureSpec.getMode(i2);
        int mode4 = View.MeasureSpec.getMode(i3);
        boolean z19 = false;
        boolean z20 = false;
        if (this.g == null || this.l == null) {
            this.g = new int[4];
            this.l = new int[4];
        }
        int[] iArr = this.g;
        int[] iArr2 = this.l;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z21 = this.h;
        boolean z22 = this.f;
        boolean z23 = mode3 == 1073741824;
        int i62 = 0;
        int i63 = 0;
        while (i63 < childCount2) {
            View childAt6 = getChildAt(i63);
            if (childAt6 == null) {
                this.d = this.d;
                i13 = i62;
                z2 = z20;
                z3 = z18;
                i14 = i61;
                i15 = i60;
                i16 = i59;
                i17 = i58;
            } else if (childAt6.getVisibility() != 8) {
                if (b(i63)) {
                    this.d += this.k;
                }
                adv adv5 = (adv) childAt6.getLayoutParams();
                float f10 = f9 + adv5.g;
                if (mode3 == 1073741824 && adv5.width == 0 && adv5.g > 0.0f) {
                    if (z23) {
                        this.d += adv5.leftMargin + adv5.rightMargin;
                    } else {
                        int i64 = this.d;
                        this.d = Math.max(i64, adv5.leftMargin + i64 + adv5.rightMargin);
                    }
                    if (z21) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                        childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                        i18 = i62;
                        z4 = z20;
                    } else {
                        i18 = i62;
                        z4 = true;
                    }
                } else {
                    int i65 = Integer.MIN_VALUE;
                    if (adv5.width == 0 && adv5.g > 0.0f) {
                        i65 = 0;
                        adv5.width = -2;
                    }
                    a(childAt6, i2, f10 == 0.0f ? this.d : 0, i3, 0);
                    if (i65 != Integer.MIN_VALUE) {
                        adv5.width = i65;
                    }
                    int measuredWidth3 = childAt6.getMeasuredWidth();
                    if (z23) {
                        this.d += adv5.leftMargin + measuredWidth3 + adv5.rightMargin;
                    } else {
                        int i66 = this.d;
                        this.d = Math.max(i66, i66 + measuredWidth3 + adv5.leftMargin + adv5.rightMargin);
                    }
                    if (z22) {
                        i18 = Math.max(measuredWidth3, i62);
                        z4 = z20;
                    } else {
                        i18 = i62;
                        z4 = z20;
                    }
                }
                boolean z24 = false;
                if (mode4 == 1073741824 || adv5.height != -1) {
                    z5 = z19;
                } else {
                    z5 = true;
                    z24 = true;
                }
                int i67 = adv5.topMargin + adv5.bottomMargin;
                int measuredHeight2 = childAt6.getMeasuredHeight() + i67;
                int combineMeasuredStates2 = View.combineMeasuredStates(i59, childAt6.getMeasuredState());
                if (z21 && (baseline2 = childAt6.getBaseline()) != -1) {
                    int i68 = ((((adv5.h < 0 ? this.i : adv5.h) & 112) >> 4) & -2) >> 1;
                    iArr[i68] = Math.max(iArr[i68], baseline2);
                    iArr2[i68] = Math.max(iArr2[i68], measuredHeight2 - baseline2);
                }
                int max6 = Math.max(i58, measuredHeight2);
                boolean z25 = z18 && adv5.height == -1;
                if (adv5.g > 0.0f) {
                    if (z24) {
                        i19 = i67;
                    } else {
                        i19 = measuredHeight2;
                    }
                    z3 = z25;
                    i14 = Math.max(i61, i19);
                    i16 = combineMeasuredStates2;
                    i13 = i18;
                    z2 = z4;
                    z19 = z5;
                    i15 = i60;
                    f9 = f10;
                    i17 = max6;
                } else {
                    if (!z24) {
                        i67 = measuredHeight2;
                    }
                    int max7 = Math.max(i60, i67);
                    z3 = z25;
                    i14 = i61;
                    i16 = combineMeasuredStates2;
                    z2 = z4;
                    z19 = z5;
                    f9 = f10;
                    i17 = max6;
                    i15 = max7;
                    i13 = i18;
                }
            } else {
                i13 = i62;
                z2 = z20;
                z3 = z18;
                i14 = i61;
                i15 = i60;
                i16 = i59;
                i17 = i58;
            }
            i63++;
            z18 = z3;
            i61 = i14;
            i60 = i15;
            i59 = i16;
            i58 = i17;
            z20 = z2;
            i62 = i13;
        }
        if (this.d > 0 && b(childCount2)) {
            this.d += this.k;
        }
        if (iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) {
            i4 = i58;
        } else {
            i4 = Math.max(i58, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
        }
        if (z22 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            this.d = 0;
            for (int i69 = 0; i69 < childCount2; i69++) {
                View childAt7 = getChildAt(i69);
                if (childAt7 == null) {
                    this.d = this.d;
                } else if (childAt7.getVisibility() != 8) {
                    adv adv6 = (adv) childAt7.getLayoutParams();
                    if (z23) {
                        this.d = adv6.rightMargin + adv6.leftMargin + i62 + this.d;
                    } else {
                        int i70 = this.d;
                        this.d = Math.max(i70, adv6.rightMargin + i70 + i62 + adv6.leftMargin);
                    }
                }
            }
        }
        this.d += getPaddingLeft() + getPaddingRight();
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(this.d, getSuggestedMinimumWidth()), i2, 0);
        int i71 = (16777215 & resolveSizeAndState2) - this.d;
        if (z20 || (i71 != 0 && f9 > 0.0f)) {
            if (this.e > 0.0f) {
                f9 = this.e;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.d = 0;
            int i72 = 0;
            boolean z26 = z18;
            int i73 = i60;
            int i74 = -1;
            int i75 = i59;
            while (i72 < childCount2) {
                View childAt8 = getChildAt(i72);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    f2 = f9;
                    i6 = i71;
                    i7 = i73;
                    z = z26;
                    i8 = i75;
                    i9 = i74;
                } else {
                    adv adv7 = (adv) childAt8.getLayoutParams();
                    float f11 = adv7.g;
                    if (f11 > 0.0f) {
                        int i76 = (int) ((((float) i71) * f11) / f9);
                        float f12 = f9 - f11;
                        int i77 = i71 - i76;
                        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + adv7.topMargin + adv7.bottomMargin, adv7.height);
                        if (adv7.width != 0 || mode3 != 1073741824) {
                            i76 += childAt8.getMeasuredWidth();
                            if (i76 < 0) {
                                i76 = 0;
                            }
                            view = childAt8;
                        } else if (i76 > 0) {
                            view = childAt8;
                        } else {
                            i76 = 0;
                            view = childAt8;
                        }
                        view.measure(View.MeasureSpec.makeMeasureSpec(i76, 1073741824), childMeasureSpec2);
                        i11 = View.combineMeasuredStates(i75, childAt8.getMeasuredState() & -16777216);
                        f3 = f12;
                        i10 = i77;
                    } else {
                        i10 = i71;
                        i11 = i75;
                        f3 = f9;
                    }
                    if (z23) {
                        this.d += childAt8.getMeasuredWidth() + adv7.leftMargin + adv7.rightMargin;
                    } else {
                        int i78 = this.d;
                        this.d = Math.max(i78, childAt8.getMeasuredWidth() + i78 + adv7.leftMargin + adv7.rightMargin);
                    }
                    boolean z27 = mode4 != 1073741824 && adv7.height == -1;
                    int i79 = adv7.topMargin + adv7.bottomMargin;
                    int measuredHeight3 = childAt8.getMeasuredHeight() + i79;
                    int max8 = Math.max(i74, measuredHeight3);
                    if (z27) {
                        i12 = i79;
                    } else {
                        i12 = measuredHeight3;
                    }
                    int max9 = Math.max(i73, i12);
                    boolean z28 = z26 && adv7.height == -1;
                    if (z21 && (baseline = childAt8.getBaseline()) != -1) {
                        int i80 = ((((adv7.h < 0 ? this.i : adv7.h) & 112) >> 4) & -2) >> 1;
                        iArr[i80] = Math.max(iArr[i80], baseline);
                        iArr2[i80] = Math.max(iArr2[i80], measuredHeight3 - baseline);
                    }
                    f2 = f3;
                    i7 = max9;
                    i8 = i11;
                    z = z28;
                    i9 = max8;
                    i6 = i10;
                }
                i72++;
                z26 = z;
                i73 = i7;
                i74 = i9;
                i75 = i8;
                f9 = f2;
                i71 = i6;
            }
            this.d += getPaddingLeft() + getPaddingRight();
            if (!(iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1)) {
                i74 = Math.max(i74, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            }
            i5 = i73;
            i59 = i75;
            i4 = i74;
            z18 = z26;
        } else {
            int max10 = Math.max(i60, i61);
            if (z22 && mode3 != 1073741824) {
                for (int i81 = 0; i81 < childCount2; i81++) {
                    View childAt9 = getChildAt(i81);
                    if (!(childAt9 == null || childAt9.getVisibility() == 8 || ((adv) childAt9.getLayoutParams()).g <= 0.0f)) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(i62, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i5 = max10;
        }
        if (z18 || mode4 == 1073741824) {
            i5 = i4;
        }
        setMeasuredDimension((-16777216 & i59) | resolveSizeAndState2, View.resolveSizeAndState(Math.max(i5 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, i59 << 16));
        if (z19) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            for (int i82 = 0; i82 < childCount2; i82++) {
                View childAt10 = getChildAt(i82);
                if (childAt10.getVisibility() != 8) {
                    adv adv8 = (adv) childAt10.getLayoutParams();
                    if (adv8.height == -1) {
                        int i83 = adv8.width;
                        adv8.width = childAt10.getMeasuredWidth();
                        measureChildWithMargins(childAt10, i2, 0, makeMeasureSpec3, 0);
                        adv8.width = i83;
                    }
                }
            }
        }
    }

    public final boolean b(int i2) {
        if (i2 == 0) {
            return (this.n & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.n & 4) != 0;
        }
        if ((this.n & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    private final void a(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int paddingLeft;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int paddingTop;
        int i11;
        if (this.c == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i12 = i4 - i2;
            int paddingRight = i12 - getPaddingRight();
            int paddingRight2 = (i12 - paddingLeft2) - getPaddingRight();
            int childCount = getChildCount();
            int i13 = this.i & 112;
            int i14 = 8388615 & this.i;
            switch (i13) {
                case 16:
                    paddingTop = getPaddingTop() + (((i5 - i3) - this.d) / 2);
                    break;
                case 80:
                    paddingTop = ((getPaddingTop() + i5) - i3) - this.d;
                    break;
                default:
                    paddingTop = getPaddingTop();
                    break;
            }
            int i15 = paddingTop;
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                if (!(childAt == null || childAt.getVisibility() == 8)) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    adv adv = (adv) childAt.getLayoutParams();
                    int i17 = adv.h;
                    if (i17 < 0) {
                        i17 = i14;
                    }
                    switch (jd.a(i17, sn.a.j(this)) & 7) {
                        case 1:
                            i11 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft2) + adv.leftMargin) - adv.rightMargin;
                            break;
                        case 5:
                            i11 = (paddingRight - measuredWidth) - adv.rightMargin;
                            break;
                        default:
                            i11 = adv.leftMargin + paddingLeft2;
                            break;
                    }
                    if (b(i16)) {
                        i15 += this.m;
                    }
                    int i18 = i15 + adv.topMargin;
                    b(childAt, i11, i18, measuredWidth, measuredHeight);
                    i15 = i18 + adv.bottomMargin + measuredHeight;
                }
            }
            return;
        }
        boolean a2 = ahr.a(this);
        int paddingTop2 = getPaddingTop();
        int i19 = i5 - i3;
        int paddingBottom = i19 - getPaddingBottom();
        int paddingBottom2 = (i19 - paddingTop2) - getPaddingBottom();
        int childCount2 = getChildCount();
        int i20 = this.i & 112;
        boolean z2 = this.h;
        int[] iArr = this.g;
        int[] iArr2 = this.l;
        switch (jd.a(this.i & 8388615, sn.a.j(this))) {
            case 1:
                paddingLeft = getPaddingLeft() + (((i4 - i2) - this.d) / 2);
                break;
            case 5:
                paddingLeft = ((getPaddingLeft() + i4) - i2) - this.d;
                break;
            default:
                paddingLeft = getPaddingLeft();
                break;
        }
        if (a2) {
            i6 = childCount2 - 1;
            i7 = -1;
        } else {
            i6 = 0;
            i7 = 1;
        }
        for (int i21 = 0; i21 < childCount2; i21++) {
            int i22 = i6 + (i7 * i21);
            View childAt2 = getChildAt(i22);
            if (!(childAt2 == null || childAt2.getVisibility() == 8)) {
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                int i23 = -1;
                adv adv2 = (adv) childAt2.getLayoutParams();
                if (z2 && adv2.height != -1) {
                    i23 = childAt2.getBaseline();
                }
                int i24 = adv2.h;
                if (i24 < 0) {
                    i24 = i20;
                }
                switch (i24 & 112) {
                    case 16:
                        i9 = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop2) + adv2.topMargin) - adv2.bottomMargin;
                        break;
                    case 48:
                        i8 = adv2.topMargin + paddingTop2;
                        if (i23 != -1) {
                            i9 = (iArr[1] - i23) + i8;
                            break;
                        }
                        i9 = i8;
                        break;
                    case 80:
                        i8 = (paddingBottom - measuredHeight2) - adv2.bottomMargin;
                        if (i23 != -1) {
                            i9 = i8 - (iArr2[2] - (childAt2.getMeasuredHeight() - i23));
                            break;
                        }
                        i9 = i8;
                        break;
                    default:
                        i9 = paddingTop2;
                        break;
                }
                if (b(i22)) {
                    i10 = this.k + paddingLeft;
                } else {
                    i10 = paddingLeft;
                }
                int i25 = i10 + adv2.leftMargin;
                b(childAt2, i25, i9, measuredWidth2, measuredHeight2);
                paddingLeft = i25 + adv2.rightMargin + measuredWidth2;
            }
        }
    }

    private static void b(View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i2 + i4, i3 + i5);
    }

    public final void c(int i2) {
        if (this.c != i2) {
            this.c = i2;
            requestLayout();
        }
    }

    /* renamed from: a */
    public adv generateLayoutParams(AttributeSet attributeSet) {
        return new adv(getContext(), attributeSet);
    }

    /* renamed from: d */
    public adv generateDefaultLayoutParams() {
        if (this.c == 0) {
            return new adv(-2);
        }
        if (this.c == 1) {
            return new adv(-1);
        }
        return null;
    }

    /* renamed from: b */
    public adv generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new adv(layoutParams);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof adv;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(adu.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(adu.class.getName());
    }
}
