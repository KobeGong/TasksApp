package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
public class ActionMenuView extends adu implements zg, zv {
    public ze a;
    public boolean b;
    public aap c;
    public zu d;
    public zf e;
    public abc f;
    private Context g;
    private int l;
    private boolean m;
    private int n;
    private int o;
    private int p;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = false;
        float f2 = context.getResources().getDisplayMetrics().density;
        this.o = (int) (56.0f * f2);
        this.p = (int) (f2 * 4.0f);
        this.g = context;
        this.l = 0;
    }

    public final void a(int i) {
        if (this.l != i) {
            this.l = i;
            if (i == 0) {
                this.g = getContext();
            } else {
                this.g = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public final void a(aap aap) {
        this.c = aap;
        this.c.a(this);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.c != null) {
            this.c.a(false);
            if (this.c.i()) {
                this.c.f();
                this.c.e();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0347  */
    @Override // defpackage.adu
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r35, int r36) {
        /*
        // Method dump skipped, instructions count: 1005
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionMenuView.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.adu
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        int width;
        int i9;
        if (!this.m) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i10 = (i4 - i2) / 2;
        int i11 = this.k;
        int i12 = 0;
        int paddingRight = ((i3 - i) - getPaddingRight()) - getPaddingLeft();
        boolean z3 = false;
        boolean a2 = ahr.a(this);
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                aba aba = (aba) childAt.getLayoutParams();
                if (aba.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (d(i13)) {
                        measuredWidth += i11;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a2) {
                        i9 = aba.leftMargin + getPaddingLeft();
                        width = i9 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - aba.rightMargin;
                        i9 = width - measuredWidth;
                    }
                    int i14 = i10 - (measuredHeight / 2);
                    childAt.layout(i9, i14, width, measuredHeight + i14);
                    i8 = paddingRight - measuredWidth;
                    z2 = true;
                    i7 = i12;
                } else {
                    int i15 = aba.rightMargin;
                    d(i13);
                    i7 = i12 + 1;
                    i8 = paddingRight - (i15 + (childAt.getMeasuredWidth() + aba.leftMargin));
                    z2 = z3;
                }
            } else {
                z2 = z3;
                i7 = i12;
                i8 = paddingRight;
            }
            i13++;
            i12 = i7;
            paddingRight = i8;
            z3 = z2;
        }
        if (childCount != 1 || z3) {
            int i16 = i12 - (z3 ? 0 : 1);
            int max = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
            if (a2) {
                int width2 = getWidth() - getPaddingRight();
                int i17 = 0;
                while (i17 < childCount) {
                    View childAt2 = getChildAt(i17);
                    aba aba2 = (aba) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() == 8 || aba2.a) {
                        i6 = width2;
                    } else {
                        int i18 = width2 - aba2.rightMargin;
                        int measuredWidth2 = childAt2.getMeasuredWidth();
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        int i19 = i10 - (measuredHeight2 / 2);
                        childAt2.layout(i18 - measuredWidth2, i19, i18, measuredHeight2 + i19);
                        i6 = i18 - ((aba2.leftMargin + measuredWidth2) + max);
                    }
                    i17++;
                    width2 = i6;
                }
                return;
            }
            int paddingLeft = getPaddingLeft();
            int i20 = 0;
            while (i20 < childCount) {
                View childAt3 = getChildAt(i20);
                aba aba3 = (aba) childAt3.getLayoutParams();
                if (childAt3.getVisibility() == 8 || aba3.a) {
                    i5 = paddingLeft;
                } else {
                    int i21 = paddingLeft + aba3.leftMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i22 = i10 - (measuredHeight3 / 2);
                    childAt3.layout(i21, i22, i21 + measuredWidth3, measuredHeight3 + i22);
                    i5 = aba3.rightMargin + measuredWidth3 + max + i21;
                }
                i20++;
                paddingLeft = i5;
            }
            return;
        }
        View childAt4 = getChildAt(0);
        int measuredWidth4 = childAt4.getMeasuredWidth();
        int measuredHeight4 = childAt4.getMeasuredHeight();
        int i23 = ((i3 - i) / 2) - (measuredWidth4 / 2);
        int i24 = i10 - (measuredHeight4 / 2);
        childAt4.layout(i23, i24, measuredWidth4 + i23, measuredHeight4 + i24);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    public static aba a() {
        aba aba = new aba();
        aba.h = 16;
        return aba;
    }

    public static aba a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return a();
        }
        aba aba = layoutParams instanceof aba ? new aba((aba) layoutParams) : new aba(layoutParams);
        if (aba.h > 0) {
            return aba;
        }
        aba.h = 16;
        return aba;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.adu
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof aba);
    }

    @Override // defpackage.zg
    public final boolean a(zi ziVar) {
        return this.a.a(ziVar, (zt) null, 0);
    }

    @Override // defpackage.zv
    public final void a(ze zeVar) {
        this.a = zeVar;
    }

    public final Menu b() {
        if (this.a == null) {
            Context context = getContext();
            this.a = new ze(context);
            this.a.a(new abb(this));
            this.c = new aap(context);
            this.c.d();
            this.c.d = new aaz();
            this.a.a(this.c, this.g);
            this.c.a(this);
        }
        return this.a;
    }

    public final void c() {
        if (this.c != null) {
            this.c.g();
        }
    }

    private final boolean d(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof aay)) {
            z = ((aay) childAt).e() | false;
        }
        if (i <= 0 || !(childAt2 instanceof aay)) {
            return z;
        }
        return ((aay) childAt2).e_() | z;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.adu
    public final /* synthetic */ adv b(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.adu
    public final /* synthetic */ adv d() {
        return a();
    }

    @Override // defpackage.adu
    public final /* synthetic */ adv a(AttributeSet attributeSet) {
        return (aba) generateLayoutParams(attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.adu
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.adu, android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    @Override // defpackage.adu, android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new aba(getContext(), attributeSet);
    }
}
