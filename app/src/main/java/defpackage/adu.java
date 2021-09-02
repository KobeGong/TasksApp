package defpackage;

/* renamed from: adu reason: default package */
/* compiled from: PG */
public class adu extends android.view.ViewGroup {
    private int a;
    private int b;
    private int c;
    private int d;
    private float e;
    private boolean f;
    private int[] g;
    public boolean h;
    public int i;
    public android.graphics.drawable.Drawable j;
    public int k;
    private int[] l;
    private int m;
    private int n;
    private int o;

    public adu(android.content.Context context) {
        this(context, null);
    }

    public adu(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public adu(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        boolean z;
        super(context, attributeSet, i2);
        this.h = true;
        this.a = -1;
        this.b = 0;
        this.i = 8388659;
        defpackage.agw a2 = defpackage.agw.a(context, attributeSet, defpackage.xu.aI, i2, 0);
        int a3 = a2.a(defpackage.xu.aP, -1);
        if (a3 >= 0) {
            c(a3);
        }
        int a4 = a2.a(defpackage.xu.aO, -1);
        if (a4 >= 0 && this.i != a4) {
            if ((8388615 & a4) == 0) {
                a4 |= 8388611;
            }
            if ((a4 & 112) == 0) {
                a4 |= 48;
            }
            this.i = a4;
            requestLayout();
        }
        boolean a5 = a2.a(defpackage.xu.aM, true);
        if (!a5) {
            this.h = a5;
        }
        this.e = a2.a(defpackage.xu.aQ, -1.0f);
        this.a = a2.a(defpackage.xu.aN, -1);
        this.f = a2.a(defpackage.xu.aT, false);
        android.graphics.drawable.Drawable a6 = a2.a(defpackage.xu.aR);
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
        this.n = a2.a(defpackage.xu.aU, 0);
        this.o = a2.e(defpackage.xu.aS, 0);
        a2.b.recycle();
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDraw(android.graphics.Canvas canvas) {
        int right;
        int left;
        int bottom;
        if (this.j != null) {
            if (this.c == 1) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    android.view.View childAt = getChildAt(i2);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !b(i2))) {
                        a(canvas, (childAt.getTop() - ((defpackage.adv) childAt.getLayoutParams()).topMargin) - this.m);
                    }
                }
                if (b(childCount)) {
                    android.view.View childAt2 = getChildAt(childCount - 1);
                    if (childAt2 == null) {
                        bottom = (getHeight() - getPaddingBottom()) - this.m;
                    } else {
                        defpackage.adv adv = (defpackage.adv) childAt2.getLayoutParams();
                        bottom = adv.bottomMargin + childAt2.getBottom();
                    }
                    a(canvas, bottom);
                    return;
                }
                return;
            }
            int childCount2 = getChildCount();
            boolean a2 = defpackage.ahr.a(this);
            for (int i3 = 0; i3 < childCount2; i3++) {
                android.view.View childAt3 = getChildAt(i3);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !b(i3))) {
                    defpackage.adv adv2 = (defpackage.adv) childAt3.getLayoutParams();
                    if (a2) {
                        left = adv2.rightMargin + childAt3.getRight();
                    } else {
                        left = (childAt3.getLeft() - adv2.leftMargin) - this.k;
                    }
                    b(canvas, left);
                }
            }
            if (b(childCount2)) {
                android.view.View childAt4 = getChildAt(childCount2 - 1);
                if (childAt4 != null) {
                    defpackage.adv adv3 = (defpackage.adv) childAt4.getLayoutParams();
                    if (a2) {
                        right = (childAt4.getLeft() - adv3.leftMargin) - this.k;
                    } else {
                        right = adv3.rightMargin + childAt4.getRight();
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

    private final void a(android.graphics.Canvas canvas, int i2) {
        this.j.setBounds(getPaddingLeft() + this.o, i2, (getWidth() - getPaddingRight()) - this.o, this.m + i2);
        this.j.draw(canvas);
    }

    private final void b(android.graphics.Canvas canvas, int i2) {
        this.j.setBounds(i2, getPaddingTop() + this.o, this.k + i2, (getHeight() - getPaddingBottom()) - this.o);
        this.j.draw(canvas);
    }

    public int getBaseline() {
        int i2;
        if (this.a < 0) {
            return super.getBaseline();
        }
        if (getChildCount() <= this.a) {
            throw new java.lang.RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        android.view.View childAt = getChildAt(this.a);
        int baseline = childAt.getBaseline();
        if (baseline != -1) {
            int i3 = this.b;
            if (this.c == 1) {
                int i4 = this.i & 112;
                if (i4 != 48) {
                    switch (i4) {
                        case 16:
                            i2 = i3 + (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.d) / 2);
                            break;
                        case 80:
                            i2 = ((getBottom() - getTop()) - getPaddingBottom()) - this.d;
                            break;
                    }
                }
            }
            i2 = i3;
            return ((defpackage.adv) childAt.getLayoutParams()).topMargin + i2 + baseline;
        } else if (this.a == 0) {
            return -1;
        } else {
            throw new java.lang.RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
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
        android.view.View view;
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
        int i20;
        int i21;
        float f4;
        boolean z6;
        int i22;
        int i23;
        int i24;
        int i25;
        android.view.View view2;
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
            int mode = android.view.View.MeasureSpec.getMode(i2);
            int mode2 = android.view.View.MeasureSpec.getMode(i3);
            boolean z12 = false;
            boolean z13 = false;
            int i37 = this.a;
            boolean z14 = this.f;
            int i38 = 0;
            int i39 = 0;
            while (i39 < childCount) {
                android.view.View childAt = getChildAt(i39);
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
                    defpackage.adv adv = (defpackage.adv) childAt.getLayoutParams();
                    float f6 = f5 + adv.g;
                    if (mode2 == 1073741824 && adv.height == 0 && adv.g > 0.0f) {
                        int i40 = this.d;
                        this.d = java.lang.Math.max(i40, adv.topMargin + i40 + adv.bottomMargin);
                        i31 = i38;
                        z9 = true;
                    } else {
                        int i41 = Integer.MIN_VALUE;
                        if (adv.height == 0 && adv.g > 0.0f) {
                            i41 = 0;
                            adv.height = -2;
                        }
                        int i42 = i41;
                        a(childAt, i2, 0, i3, f6 == 0.0f ? this.d : 0);
                        if (i42 != Integer.MIN_VALUE) {
                            adv.height = i42;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i43 = this.d;
                        this.d = java.lang.Math.max(i43, i43 + measuredHeight + adv.topMargin + adv.bottomMargin);
                        if (z14) {
                            i31 = java.lang.Math.max(measuredHeight, i38);
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
                        int i44 = adv.leftMargin + adv.rightMargin;
                        int measuredWidth = childAt.getMeasuredWidth() + i44;
                        int max = java.lang.Math.max(i33, measuredWidth);
                        int combineMeasuredStates = android.view.View.combineMeasuredStates(i34, childAt.getMeasuredState());
                        boolean z16 = z11 && adv.width == -1;
                        if (adv.g > 0.0f) {
                            if (z15) {
                                i32 = i44;
                            } else {
                                i32 = measuredWidth;
                            }
                            z8 = z16;
                            i27 = java.lang.Math.max(i36, i32);
                            i29 = combineMeasuredStates;
                            i26 = i31;
                            z7 = z9;
                            z12 = z10;
                            i28 = i35;
                            f5 = f6;
                            i30 = max;
                        } else {
                            if (!z15) {
                                i44 = measuredWidth;
                            }
                            int max2 = java.lang.Math.max(i35, i44);
                            z8 = z16;
                            i27 = i36;
                            i29 = combineMeasuredStates;
                            z7 = z9;
                            z12 = z10;
                            f5 = f6;
                            i30 = max;
                            int i45 = i31;
                            i28 = max2;
                            i26 = i45;
                        }
                    } else {
                        throw new java.lang.RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
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
                int i46 = 0;
                while (true) {
                    int i47 = i46;
                    if (i47 >= childCount) {
                        break;
                    }
                    android.view.View childAt2 = getChildAt(i47);
                    if (childAt2 == null) {
                        this.d = this.d;
                    } else if (childAt2.getVisibility() != 8) {
                        defpackage.adv adv2 = (defpackage.adv) childAt2.getLayoutParams();
                        int i48 = this.d;
                        this.d = java.lang.Math.max(i48, adv2.bottomMargin + i48 + i38 + adv2.topMargin);
                    }
                    i46 = i47 + 1;
                }
            }
            this.d += getPaddingTop() + getPaddingBottom();
            int resolveSizeAndState = android.view.View.resolveSizeAndState(java.lang.Math.max(this.d, getSuggestedMinimumHeight()), i3, 0);
            int i49 = (16777215 & resolveSizeAndState) - this.d;
            if (z13 || (i49 != 0 && f5 > 0.0f)) {
                if (this.e > 0.0f) {
                    f5 = this.e;
                }
                this.d = 0;
                int i50 = 0;
                boolean z17 = z11;
                int i51 = i35;
                int i52 = i34;
                int i53 = i33;
                while (i50 < childCount) {
                    android.view.View childAt3 = getChildAt(i50);
                    if (childAt3.getVisibility() != 8) {
                        defpackage.adv adv3 = (defpackage.adv) childAt3.getLayoutParams();
                        float f7 = adv3.g;
                        if (f7 > 0.0f) {
                            int i54 = (int) ((((float) i49) * f7) / f5);
                            float f8 = f5 - f7;
                            int i55 = i49 - i54;
                            int childMeasureSpec = getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + adv3.leftMargin + adv3.rightMargin, adv3.width);
                            if (adv3.height != 0 || mode2 != 1073741824) {
                                i54 += childAt3.getMeasuredHeight();
                                if (i54 < 0) {
                                    i54 = 0;
                                }
                                view2 = childAt3;
                            } else if (i54 > 0) {
                                view2 = childAt3;
                            } else {
                                i54 = 0;
                                view2 = childAt3;
                            }
                            view2.measure(childMeasureSpec, android.view.View.MeasureSpec.makeMeasureSpec(i54, 1073741824));
                            i24 = i55;
                            i25 = android.view.View.combineMeasuredStates(i52, childAt3.getMeasuredState() & -256);
                            f4 = f8;
                        } else {
                            f4 = f5;
                            i24 = i49;
                            i25 = i52;
                        }
                        int i56 = adv3.leftMargin + adv3.rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i56;
                        int max3 = java.lang.Math.max(i53, measuredWidth2);
                        if (!(mode != 1073741824 && adv3.width == -1)) {
                            i56 = measuredWidth2;
                        }
                        int max4 = java.lang.Math.max(i51, i56);
                        z6 = z17 && adv3.width == -1;
                        int i57 = this.d;
                        this.d = java.lang.Math.max(i57, adv3.bottomMargin + childAt3.getMeasuredHeight() + i57 + adv3.topMargin);
                        i22 = max4;
                        i23 = max3;
                    } else {
                        f4 = f5;
                        z6 = z17;
                        i22 = i51;
                        i23 = i53;
                        i24 = i49;
                        i25 = i52;
                    }
                    i50++;
                    z17 = z6;
                    i51 = i22;
                    i52 = i25;
                    i53 = i23;
                    i49 = i24;
                    f5 = f4;
                }
                this.d += getPaddingTop() + getPaddingBottom();
                i21 = i51;
                i34 = i52;
                i20 = i53;
                z11 = z17;
            } else {
                int max5 = java.lang.Math.max(i35, i36);
                if (z14 && mode2 != 1073741824) {
                    int i58 = 0;
                    while (true) {
                        int i59 = i58;
                        if (i59 >= childCount) {
                            break;
                        }
                        android.view.View childAt4 = getChildAt(i59);
                        if (!(childAt4 == null || childAt4.getVisibility() == 8 || ((defpackage.adv) childAt4.getLayoutParams()).g <= 0.0f)) {
                            childAt4.measure(android.view.View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(i38, 1073741824));
                        }
                        i58 = i59 + 1;
                    }
                }
                i21 = max5;
                i20 = i33;
            }
            if (z11 || mode == 1073741824) {
                i21 = i20;
            }
            setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(i21 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, i34), resolveSizeAndState);
            if (z12) {
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                int i60 = 0;
                while (true) {
                    int i61 = i60;
                    if (i61 < childCount) {
                        android.view.View childAt5 = getChildAt(i61);
                        if (childAt5.getVisibility() != 8) {
                            defpackage.adv adv4 = (defpackage.adv) childAt5.getLayoutParams();
                            if (adv4.width == -1) {
                                int i62 = adv4.height;
                                adv4.height = childAt5.getMeasuredHeight();
                                measureChildWithMargins(childAt5, makeMeasureSpec, 0, i3, 0);
                                adv4.height = i62;
                            }
                        }
                        i60 = i61 + 1;
                    } else {
                        return;
                    }
                }
            }
        } else {
            this.d = 0;
            int i63 = 0;
            int i64 = 0;
            int i65 = 0;
            int i66 = 0;
            boolean z18 = true;
            float f9 = 0.0f;
            int childCount2 = getChildCount();
            int mode3 = android.view.View.MeasureSpec.getMode(i2);
            int mode4 = android.view.View.MeasureSpec.getMode(i3);
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
            int i67 = 0;
            int i68 = 0;
            while (i68 < childCount2) {
                android.view.View childAt6 = getChildAt(i68);
                if (childAt6 == null) {
                    this.d = this.d;
                    i13 = i67;
                    z2 = z20;
                    z3 = z18;
                    i14 = i66;
                    i15 = i65;
                    i16 = i64;
                    i17 = i63;
                } else if (childAt6.getVisibility() != 8) {
                    if (b(i68)) {
                        this.d += this.k;
                    }
                    defpackage.adv adv5 = (defpackage.adv) childAt6.getLayoutParams();
                    float f10 = f9 + adv5.g;
                    if (mode3 == 1073741824 && adv5.width == 0 && adv5.g > 0.0f) {
                        if (z23) {
                            this.d += adv5.leftMargin + adv5.rightMargin;
                        } else {
                            int i69 = this.d;
                            this.d = java.lang.Math.max(i69, adv5.leftMargin + i69 + adv5.rightMargin);
                        }
                        if (z21) {
                            int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            i18 = i67;
                            z4 = z20;
                        } else {
                            i18 = i67;
                            z4 = true;
                        }
                    } else {
                        int i70 = Integer.MIN_VALUE;
                        if (adv5.width == 0 && adv5.g > 0.0f) {
                            i70 = 0;
                            adv5.width = -2;
                        }
                        int i71 = i70;
                        a(childAt6, i2, f10 == 0.0f ? this.d : 0, i3, 0);
                        if (i71 != Integer.MIN_VALUE) {
                            adv5.width = i71;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z23) {
                            this.d += adv5.leftMargin + measuredWidth3 + adv5.rightMargin;
                        } else {
                            int i72 = this.d;
                            this.d = java.lang.Math.max(i72, i72 + measuredWidth3 + adv5.leftMargin + adv5.rightMargin);
                        }
                        if (z22) {
                            i18 = java.lang.Math.max(measuredWidth3, i67);
                            z4 = z20;
                        } else {
                            i18 = i67;
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
                    int i73 = adv5.topMargin + adv5.bottomMargin;
                    int measuredHeight2 = childAt6.getMeasuredHeight() + i73;
                    int combineMeasuredStates2 = android.view.View.combineMeasuredStates(i64, childAt6.getMeasuredState());
                    if (z21) {
                        int baseline = childAt6.getBaseline();
                        if (baseline != -1) {
                            int i74 = ((((adv5.h < 0 ? this.i : adv5.h) & 112) >> 4) & -2) >> 1;
                            iArr[i74] = java.lang.Math.max(iArr[i74], baseline);
                            iArr2[i74] = java.lang.Math.max(iArr2[i74], measuredHeight2 - baseline);
                        }
                    }
                    int max6 = java.lang.Math.max(i63, measuredHeight2);
                    boolean z25 = z18 && adv5.height == -1;
                    if (adv5.g > 0.0f) {
                        if (z24) {
                            i19 = i73;
                        } else {
                            i19 = measuredHeight2;
                        }
                        z3 = z25;
                        i14 = java.lang.Math.max(i66, i19);
                        i16 = combineMeasuredStates2;
                        i13 = i18;
                        z2 = z4;
                        z19 = z5;
                        i15 = i65;
                        f9 = f10;
                        i17 = max6;
                    } else {
                        if (!z24) {
                            i73 = measuredHeight2;
                        }
                        int max7 = java.lang.Math.max(i65, i73);
                        z3 = z25;
                        i14 = i66;
                        i16 = combineMeasuredStates2;
                        z2 = z4;
                        z19 = z5;
                        f9 = f10;
                        i17 = max6;
                        int i75 = i18;
                        i15 = max7;
                        i13 = i75;
                    }
                } else {
                    i13 = i67;
                    z2 = z20;
                    z3 = z18;
                    i14 = i66;
                    i15 = i65;
                    i16 = i64;
                    i17 = i63;
                }
                i68++;
                z18 = z3;
                i66 = i14;
                i65 = i15;
                i64 = i16;
                i63 = i17;
                z20 = z2;
                i67 = i13;
            }
            if (this.d > 0 && b(childCount2)) {
                this.d += this.k;
            }
            if (iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) {
                i4 = i63;
            } else {
                i4 = java.lang.Math.max(i63, java.lang.Math.max(iArr[3], java.lang.Math.max(iArr[0], java.lang.Math.max(iArr[1], iArr[2]))) + java.lang.Math.max(iArr2[3], java.lang.Math.max(iArr2[0], java.lang.Math.max(iArr2[1], iArr2[2]))));
            }
            if (z22 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                this.d = 0;
                int i76 = 0;
                while (true) {
                    int i77 = i76;
                    if (i77 >= childCount2) {
                        break;
                    }
                    android.view.View childAt7 = getChildAt(i77);
                    if (childAt7 == null) {
                        this.d = this.d;
                    } else if (childAt7.getVisibility() != 8) {
                        defpackage.adv adv6 = (defpackage.adv) childAt7.getLayoutParams();
                        if (z23) {
                            this.d = adv6.rightMargin + adv6.leftMargin + i67 + this.d;
                        } else {
                            int i78 = this.d;
                            this.d = java.lang.Math.max(i78, adv6.rightMargin + i78 + i67 + adv6.leftMargin);
                        }
                    }
                    i76 = i77 + 1;
                }
            }
            this.d += getPaddingLeft() + getPaddingRight();
            int resolveSizeAndState2 = android.view.View.resolveSizeAndState(java.lang.Math.max(this.d, getSuggestedMinimumWidth()), i2, 0);
            int i79 = (16777215 & resolveSizeAndState2) - this.d;
            if (z20 || (i79 != 0 && f9 > 0.0f)) {
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
                int i80 = 0;
                boolean z26 = z18;
                int i81 = i65;
                int i82 = -1;
                int i83 = i64;
                while (i80 < childCount2) {
                    android.view.View childAt8 = getChildAt(i80);
                    if (childAt8 == null || childAt8.getVisibility() == 8) {
                        f2 = f9;
                        i6 = i79;
                        i7 = i81;
                        z = z26;
                        i8 = i83;
                        i9 = i82;
                    } else {
                        defpackage.adv adv7 = (defpackage.adv) childAt8.getLayoutParams();
                        float f11 = adv7.g;
                        if (f11 > 0.0f) {
                            int i84 = (int) ((((float) i79) * f11) / f9);
                            float f12 = f9 - f11;
                            int i85 = i79 - i84;
                            int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + adv7.topMargin + adv7.bottomMargin, adv7.height);
                            if (adv7.width != 0 || mode3 != 1073741824) {
                                i84 += childAt8.getMeasuredWidth();
                                if (i84 < 0) {
                                    i84 = 0;
                                }
                                view = childAt8;
                            } else if (i84 > 0) {
                                view = childAt8;
                            } else {
                                i84 = 0;
                                view = childAt8;
                            }
                            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i84, 1073741824), childMeasureSpec2);
                            i11 = android.view.View.combineMeasuredStates(i83, childAt8.getMeasuredState() & -16777216);
                            f3 = f12;
                            i10 = i85;
                        } else {
                            i10 = i79;
                            i11 = i83;
                            f3 = f9;
                        }
                        if (z23) {
                            this.d += childAt8.getMeasuredWidth() + adv7.leftMargin + adv7.rightMargin;
                        } else {
                            int i86 = this.d;
                            this.d = java.lang.Math.max(i86, childAt8.getMeasuredWidth() + i86 + adv7.leftMargin + adv7.rightMargin);
                        }
                        boolean z27 = mode4 != 1073741824 && adv7.height == -1;
                        int i87 = adv7.topMargin + adv7.bottomMargin;
                        int measuredHeight3 = childAt8.getMeasuredHeight() + i87;
                        int max8 = java.lang.Math.max(i82, measuredHeight3);
                        if (z27) {
                            i12 = i87;
                        } else {
                            i12 = measuredHeight3;
                        }
                        int max9 = java.lang.Math.max(i81, i12);
                        boolean z28 = z26 && adv7.height == -1;
                        if (z21) {
                            int baseline2 = childAt8.getBaseline();
                            if (baseline2 != -1) {
                                int i88 = ((((adv7.h < 0 ? this.i : adv7.h) & 112) >> 4) & -2) >> 1;
                                iArr[i88] = java.lang.Math.max(iArr[i88], baseline2);
                                iArr2[i88] = java.lang.Math.max(iArr2[i88], measuredHeight3 - baseline2);
                            }
                        }
                        f2 = f3;
                        i7 = max9;
                        i8 = i11;
                        z = z28;
                        i9 = max8;
                        i6 = i10;
                    }
                    i80++;
                    z26 = z;
                    i81 = i7;
                    i82 = i9;
                    i83 = i8;
                    f9 = f2;
                    i79 = i6;
                }
                this.d += getPaddingLeft() + getPaddingRight();
                if (!(iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1)) {
                    i82 = java.lang.Math.max(i82, java.lang.Math.max(iArr[3], java.lang.Math.max(iArr[0], java.lang.Math.max(iArr[1], iArr[2]))) + java.lang.Math.max(iArr2[3], java.lang.Math.max(iArr2[0], java.lang.Math.max(iArr2[1], iArr2[2]))));
                }
                i5 = i81;
                i64 = i83;
                i4 = i82;
                z18 = z26;
            } else {
                int max10 = java.lang.Math.max(i65, i66);
                if (z22 && mode3 != 1073741824) {
                    int i89 = 0;
                    while (true) {
                        int i90 = i89;
                        if (i90 >= childCount2) {
                            break;
                        }
                        android.view.View childAt9 = getChildAt(i90);
                        if (!(childAt9 == null || childAt9.getVisibility() == 8 || ((defpackage.adv) childAt9.getLayoutParams()).g <= 0.0f)) {
                            childAt9.measure(android.view.View.MeasureSpec.makeMeasureSpec(i67, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                        }
                        i89 = i90 + 1;
                    }
                }
                i5 = max10;
            }
            if (z18 || mode4 == 1073741824) {
                i5 = i4;
            }
            setMeasuredDimension((-16777216 & i64) | resolveSizeAndState2, android.view.View.resolveSizeAndState(java.lang.Math.max(i5 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, i64 << 16));
            if (z19) {
                int makeMeasureSpec3 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                int i91 = 0;
                while (true) {
                    int i92 = i91;
                    if (i92 < childCount2) {
                        android.view.View childAt10 = getChildAt(i92);
                        if (childAt10.getVisibility() != 8) {
                            defpackage.adv adv8 = (defpackage.adv) childAt10.getLayoutParams();
                            if (adv8.height == -1) {
                                int i93 = adv8.width;
                                adv8.width = childAt10.getMeasuredWidth();
                                measureChildWithMargins(childAt10, i2, 0, makeMeasureSpec3, 0);
                                adv8.width = i93;
                            }
                        }
                        i91 = i92 + 1;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final boolean b(int i2) {
        if (i2 == 0) {
            if ((this.n & 1) != 0) {
                return true;
            }
            return false;
        } else if (i2 == getChildCount()) {
            if ((this.n & 4) == 0) {
                return false;
            }
            return true;
        } else if ((this.n & 2) == 0) {
            return false;
        } else {
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    private final void a(android.view.View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01d2, code lost:
        r6 = r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            r23 = this;
            r0 = r23
            int r3 = r0.c
            r4 = 1
            if (r3 != r4) goto L_0x00b9
            int r8 = r23.getPaddingLeft()
            int r3 = r27 - r25
            int r4 = r23.getPaddingRight()
            int r9 = r3 - r4
            int r3 = r3 - r8
            int r4 = r23.getPaddingRight()
            int r10 = r3 - r4
            int r11 = r23.getChildCount()
            r0 = r23
            int r3 = r0.i
            r3 = r3 & 112(0x70, float:1.57E-43)
            r0 = r23
            int r4 = r0.i
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r5 = r5 & r4
            switch(r3) {
                case 16: goto L_0x0098;
                case 80: goto L_0x008a;
                default: goto L_0x002f;
            }
        L_0x002f:
            int r3 = r23.getPaddingTop()
        L_0x0033:
            r4 = 0
            r7 = r4
            r6 = r3
        L_0x0036:
            if (r7 >= r11) goto L_0x01cf
            r0 = r23
            android.view.View r12 = r0.getChildAt(r7)
            if (r12 == 0) goto L_0x0086
            int r3 = r12.getVisibility()
            r4 = 8
            if (r3 == r4) goto L_0x0086
            int r13 = r12.getMeasuredWidth()
            int r14 = r12.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r3 = r12.getLayoutParams()
            adv r3 = (defpackage.adv) r3
            int r4 = r3.h
            if (r4 >= 0) goto L_0x005b
            r4 = r5
        L_0x005b:
            sw r15 = defpackage.sn.a
            r0 = r23
            int r15 = r15.j(r0)
            int r4 = defpackage.jd.a(r4, r15)
            r4 = r4 & 7
            switch(r4) {
                case 1: goto L_0x00a7;
                case 5: goto L_0x00b3;
                default: goto L_0x006c;
            }
        L_0x006c:
            int r4 = r3.leftMargin
            int r4 = r4 + r8
        L_0x006f:
            r0 = r23
            boolean r15 = r0.b(r7)
            if (r15 == 0) goto L_0x007c
            r0 = r23
            int r15 = r0.m
            int r6 = r6 + r15
        L_0x007c:
            int r15 = r3.topMargin
            int r6 = r6 + r15
            b(r12, r4, r6, r13, r14)
            int r3 = r3.bottomMargin
            int r3 = r3 + r14
            int r6 = r6 + r3
        L_0x0086:
            int r3 = r7 + 1
            r7 = r3
            goto L_0x0036
        L_0x008a:
            int r3 = r23.getPaddingTop()
            int r3 = r3 + r28
            int r3 = r3 - r26
            r0 = r23
            int r4 = r0.d
            int r3 = r3 - r4
            goto L_0x0033
        L_0x0098:
            int r3 = r23.getPaddingTop()
            int r4 = r28 - r26
            r0 = r23
            int r6 = r0.d
            int r4 = r4 - r6
            int r4 = r4 / 2
            int r3 = r3 + r4
            goto L_0x0033
        L_0x00a7:
            int r4 = r10 - r13
            int r4 = r4 / 2
            int r4 = r4 + r8
            int r15 = r3.leftMargin
            int r4 = r4 + r15
            int r15 = r3.rightMargin
            int r4 = r4 - r15
            goto L_0x006f
        L_0x00b3:
            int r4 = r9 - r13
            int r15 = r3.rightMargin
            int r4 = r4 - r15
            goto L_0x006f
        L_0x00b9:
            boolean r5 = defpackage.ahr.a(r23)
            int r8 = r23.getPaddingTop()
            int r3 = r28 - r26
            int r4 = r23.getPaddingBottom()
            int r12 = r3 - r4
            int r3 = r3 - r8
            int r4 = r23.getPaddingBottom()
            int r13 = r3 - r4
            int r14 = r23.getChildCount()
            r0 = r23
            int r3 = r0.i
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r4
            r0 = r23
            int r4 = r0.i
            r10 = r4 & 112(0x70, float:1.57E-43)
            r0 = r23
            boolean r15 = r0.h
            r0 = r23
            int[] r0 = r0.g
            r16 = r0
            r0 = r23
            int[] r0 = r0.l
            r17 = r0
            sw r4 = defpackage.sn.a
            r0 = r23
            int r4 = r4.j(r0)
            int r3 = defpackage.jd.a(r3, r4)
            switch(r3) {
                case 1: goto L_0x0184;
                case 5: goto L_0x0175;
                default: goto L_0x0101;
            }
        L_0x0101:
            int r9 = r23.getPaddingLeft()
        L_0x0105:
            r4 = 0
            r3 = 1
            if (r5 == 0) goto L_0x01d5
            int r4 = r14 + -1
            r3 = -1
            r5 = r4
            r4 = r3
        L_0x010e:
            r3 = 0
            r11 = r3
        L_0x0110:
            if (r11 >= r14) goto L_0x01cf
            int r3 = r4 * r11
            int r18 = r5 + r3
            r0 = r23
            r1 = r18
            android.view.View r19 = r0.getChildAt(r1)
            if (r19 == 0) goto L_0x0171
            int r3 = r19.getVisibility()
            r6 = 8
            if (r3 == r6) goto L_0x0171
            int r20 = r19.getMeasuredWidth()
            int r21 = r19.getMeasuredHeight()
            r6 = -1
            android.view.ViewGroup$LayoutParams r3 = r19.getLayoutParams()
            adv r3 = (defpackage.adv) r3
            if (r15 == 0) goto L_0x0145
            int r7 = r3.height
            r22 = -1
            r0 = r22
            if (r7 == r0) goto L_0x0145
            int r6 = r19.getBaseline()
        L_0x0145:
            int r7 = r3.h
            if (r7 >= 0) goto L_0x014a
            r7 = r10
        L_0x014a:
            r7 = r7 & 112(0x70, float:1.57E-43)
            switch(r7) {
                case 16: goto L_0x01a6;
                case 48: goto L_0x0195;
                case 80: goto L_0x01b2;
                default: goto L_0x014f;
            }
        L_0x014f:
            r6 = r8
        L_0x0150:
            r0 = r23
            r1 = r18
            boolean r7 = r0.b(r1)
            if (r7 == 0) goto L_0x01d0
            r0 = r23
            int r7 = r0.k
            int r7 = r7 + r9
        L_0x015f:
            int r9 = r3.leftMargin
            int r7 = r7 + r9
            r0 = r19
            r1 = r20
            r2 = r21
            b(r0, r7, r6, r1, r2)
            int r3 = r3.rightMargin
            int r3 = r3 + r20
            int r9 = r7 + r3
        L_0x0171:
            int r3 = r11 + 1
            r11 = r3
            goto L_0x0110
        L_0x0175:
            int r3 = r23.getPaddingLeft()
            int r3 = r3 + r27
            int r3 = r3 - r25
            r0 = r23
            int r4 = r0.d
            int r9 = r3 - r4
            goto L_0x0105
        L_0x0184:
            int r3 = r23.getPaddingLeft()
            int r4 = r27 - r25
            r0 = r23
            int r6 = r0.d
            int r4 = r4 - r6
            int r4 = r4 / 2
            int r9 = r3 + r4
            goto L_0x0105
        L_0x0195:
            int r7 = r3.topMargin
            int r7 = r7 + r8
            r22 = -1
            r0 = r22
            if (r6 == r0) goto L_0x01d2
            r22 = 1
            r22 = r16[r22]
            int r6 = r22 - r6
            int r6 = r6 + r7
            goto L_0x0150
        L_0x01a6:
            int r6 = r13 - r21
            int r6 = r6 / 2
            int r6 = r6 + r8
            int r7 = r3.topMargin
            int r6 = r6 + r7
            int r7 = r3.bottomMargin
            int r6 = r6 - r7
            goto L_0x0150
        L_0x01b2:
            int r7 = r12 - r21
            int r0 = r3.bottomMargin
            r22 = r0
            int r7 = r7 - r22
            r22 = -1
            r0 = r22
            if (r6 == r0) goto L_0x01d2
            int r22 = r19.getMeasuredHeight()
            int r6 = r22 - r6
            r22 = 2
            r22 = r17[r22]
            int r6 = r22 - r6
            int r6 = r7 - r6
            goto L_0x0150
        L_0x01cf:
            return
        L_0x01d0:
            r7 = r9
            goto L_0x015f
        L_0x01d2:
            r6 = r7
            goto L_0x0150
        L_0x01d5:
            r5 = r4
            r4 = r3
            goto L_0x010e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adu.onLayout(boolean, int, int, int, int):void");
    }

    private static void b(android.view.View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i2 + i4, i3 + i5);
    }

    public final void c(int i2) {
        if (this.c != i2) {
            this.c = i2;
            requestLayout();
        }
    }

    /* renamed from: a */
    public defpackage.adv generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new defpackage.adv(getContext(), attributeSet);
    }

    /* renamed from: d */
    public defpackage.adv generateDefaultLayoutParams() {
        if (this.c == 0) {
            return new defpackage.adv(-2);
        }
        if (this.c == 1) {
            return new defpackage.adv(-1);
        }
        return null;
    }

    /* renamed from: b */
    public defpackage.adv generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new defpackage.adv(layoutParams);
    }

    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof defpackage.adv;
    }

    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(defpackage.adu.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(defpackage.adu.class.getName());
    }
}
