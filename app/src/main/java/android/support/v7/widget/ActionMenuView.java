package android.support.v7.widget;

import defpackage.MenuBuilder;
import defpackage.MenuItemImpl;
import defpackage.MenuPresenter;
import defpackage.MenuPresenter_Callback;

/* compiled from: PG */
public class ActionMenuView extends defpackage.adu implements defpackage.zg, defpackage.zv {
    public MenuBuilder peekMenu;
    public boolean b;
    public defpackage.aap presenter;
    public MenuPresenter_Callback mActionMenuPresenterCallback;
    public defpackage.zf mMenuBuilderCallback;
    public defpackage.abc f;
    private android.content.Context g;
    private int l;
    private boolean m;
    private int n;
    private int o;
    private int p;

    public ActionMenuView(android.content.Context context) {
        this(context, null);
    }

    public ActionMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = false;
        float f2 = context.getResources().getDisplayMetrics().density;
        this.o = (int) (56.0f * f2);
        this.p = (int) (f2 * 4.0f);
        this.g = context;
        this.l = 0;
    }

    public final void setPopupTheme(int i) {
        if (this.l != i) {
            this.l = i;
            if (i == 0) {
                this.g = getContext();
            } else {
                this.g = new android.view.ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public final void a(defpackage.aap aap) {
        this.presenter = aap;
        this.presenter.a(this);
    }

    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.presenter != null) {
            this.presenter.a(false);
            if (this.presenter.i()) {
                this.presenter.f();
                this.presenter.e();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0347  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r35, int r36) {
        /*
            r34 = this;
            r0 = r34
            boolean r7 = r0.m
            int r6 = android.view.View.MeasureSpec.getMode(r35)
            r8 = 1073741824(0x40000000, float:2.0)
            if (r6 != r8) goto L_0x008b
            r6 = 1
        L_0x000d:
            r0 = r34
            r0.m = r6
            r0 = r34
            boolean r6 = r0.m
            if (r7 == r6) goto L_0x001c
            r6 = 0
            r0 = r34
            r0.n = r6
        L_0x001c:
            int r6 = android.view.View.MeasureSpec.getSize(r35)
            r0 = r34
            boolean r7 = r0.m
            if (r7 == 0) goto L_0x003e
            r0 = r34
            ze r7 = r0.a
            if (r7 == 0) goto L_0x003e
            r0 = r34
            int r7 = r0.n
            if (r6 == r7) goto L_0x003e
            r0 = r34
            r0.n = r6
            r0 = r34
            ze r6 = r0.a
            r7 = 1
            r6.a(r7)
        L_0x003e:
            int r8 = r34.getChildCount()
            r0 = r34
            boolean r6 = r0.m
            if (r6 == 0) goto L_0x03aa
            if (r8 <= 0) goto L_0x03aa
            int r23 = android.view.View.MeasureSpec.getMode(r36)
            int r6 = android.view.View.MeasureSpec.getSize(r35)
            int r19 = android.view.View.MeasureSpec.getSize(r36)
            int r7 = r34.getPaddingLeft()
            int r8 = r34.getPaddingRight()
            int r7 = r7 + r8
            int r8 = r34.getPaddingTop()
            int r9 = r34.getPaddingBottom()
            int r22 = r8 + r9
            r8 = -2
            r0 = r36
            r1 = r22
            int r24 = getChildMeasureSpec(r0, r1, r8)
            int r25 = r6 - r7
            r0 = r34
            int r6 = r0.o
            int r11 = r25 / r6
            r0 = r34
            int r6 = r0.o
            int r6 = r25 % r6
            if (r11 != 0) goto L_0x008d
            r6 = 0
            r0 = r34
            r1 = r25
            r0.setMeasuredDimension(r1, r6)
        L_0x008a:
            return
        L_0x008b:
            r6 = 0
            goto L_0x000d
        L_0x008d:
            r0 = r34
            int r7 = r0.o
            int r6 = r6 / r11
            int r26 = r7 + r6
            r18 = 0
            r17 = 0
            r12 = 0
            r7 = 0
            r13 = 0
            r14 = 0
            int r27 = r34.getChildCount()
            r6 = 0
            r21 = r6
        L_0x00a4:
            r0 = r21
            r1 = r27
            if (r0 >= r1) goto L_0x01b2
            r0 = r34
            r1 = r21
            android.view.View r8 = r0.getChildAt(r1)
            int r6 = r8.getVisibility()
            r9 = 8
            if (r6 == r9) goto L_0x03e5
            boolean r9 = r8 instanceof android.support.v7.view.menu.ActionMenuItemView
            int r16 = r7 + 1
            if (r9 == 0) goto L_0x00d0
            r0 = r34
            int r6 = r0.p
            r7 = 0
            r0 = r34
            int r10 = r0.p
            r20 = 0
            r0 = r20
            r8.setPadding(r6, r7, r10, r0)
        L_0x00d0:
            android.view.ViewGroup$LayoutParams r6 = r8.getLayoutParams()
            aba r6 = (defpackage.aba) r6
            r7 = 0
            r6.f = r7
            r7 = 0
            r6.c = r7
            r7 = 0
            r6.b = r7
            r7 = 0
            r6.d = r7
            r7 = 0
            r6.leftMargin = r7
            r7 = 0
            r6.rightMargin = r7
            if (r9 == 0) goto L_0x01a2
            r7 = r8
            android.support.v7.view.menu.ActionMenuItemView r7 = (android.support.v7.view.menu.ActionMenuItemView) r7
            boolean r7 = r7.c()
            if (r7 == 0) goto L_0x01a2
            r7 = 1
        L_0x00f4:
            r6.e = r7
            boolean r7 = r6.a
            if (r7 == 0) goto L_0x01a5
            r7 = 1
            r10 = r7
        L_0x00fc:
            android.view.ViewGroup$LayoutParams r7 = r8.getLayoutParams()
            aba r7 = (defpackage.aba) r7
            int r9 = android.view.View.MeasureSpec.getSize(r24)
            int r9 = r9 - r22
            int r20 = android.view.View.MeasureSpec.getMode(r24)
            r0 = r20
            int r28 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r0)
            boolean r9 = r8 instanceof android.support.v7.view.menu.ActionMenuItemView
            if (r9 == 0) goto L_0x01a8
            r9 = r8
            android.support.v7.view.menu.ActionMenuItemView r9 = (android.support.v7.view.menu.ActionMenuItemView) r9
        L_0x0119:
            if (r9 == 0) goto L_0x01ab
            boolean r9 = r9.c()
            if (r9 == 0) goto L_0x01ab
            r9 = 1
            r20 = r9
        L_0x0124:
            r9 = 0
            if (r10 <= 0) goto L_0x014e
            if (r20 == 0) goto L_0x012f
            r29 = 2
            r0 = r29
            if (r10 < r0) goto L_0x014e
        L_0x012f:
            int r9 = r26 * r10
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            r0 = r28
            r8.measure(r9, r0)
            int r10 = r8.getMeasuredWidth()
            int r9 = r10 / r26
            int r10 = r10 % r26
            if (r10 == 0) goto L_0x0148
            int r9 = r9 + 1
        L_0x0148:
            if (r20 == 0) goto L_0x014e
            r10 = 2
            if (r9 >= r10) goto L_0x014e
            r9 = 2
        L_0x014e:
            boolean r10 = r7.a
            if (r10 != 0) goto L_0x01b0
            if (r20 == 0) goto L_0x01b0
            r10 = 1
        L_0x0155:
            r7.d = r10
            r7.b = r9
            int r7 = r9 * r26
            r10 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r10)
            r0 = r28
            r8.measure(r7, r0)
            r0 = r17
            int r10 = java.lang.Math.max(r0, r9)
            boolean r7 = r6.d
            if (r7 == 0) goto L_0x03e2
            int r7 = r12 + 1
        L_0x0172:
            boolean r6 = r6.a
            if (r6 == 0) goto L_0x03df
            r6 = 1
        L_0x0177:
            int r12 = r11 - r9
            int r8 = r8.getMeasuredHeight()
            r0 = r18
            int r11 = java.lang.Math.max(r0, r8)
            r8 = 1
            if (r9 != r8) goto L_0x03d5
            r8 = 1
            int r8 = r8 << r21
            long r8 = (long) r8
            long r8 = r8 | r14
            r13 = r6
            r32 = r8
            r8 = r16
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r7
            r6 = r32
        L_0x0196:
            int r14 = r21 + 1
            r21 = r14
            r17 = r9
            r18 = r10
            r14 = r6
            r7 = r8
            goto L_0x00a4
        L_0x01a2:
            r7 = 0
            goto L_0x00f4
        L_0x01a5:
            r10 = r11
            goto L_0x00fc
        L_0x01a8:
            r9 = 0
            goto L_0x0119
        L_0x01ab:
            r9 = 0
            r20 = r9
            goto L_0x0124
        L_0x01b0:
            r10 = 0
            goto L_0x0155
        L_0x01b2:
            if (r13 == 0) goto L_0x01fc
            r6 = 2
            if (r7 != r6) goto L_0x01fc
            r6 = 1
            r8 = r6
        L_0x01b9:
            r6 = 0
            r20 = r14
            r16 = r11
            r15 = r6
        L_0x01bf:
            if (r12 <= 0) goto L_0x029e
            if (r16 <= 0) goto L_0x029e
            r14 = 2147483647(0x7fffffff, float:NaN)
            r10 = 0
            r9 = 0
            r6 = 0
            r22 = r6
        L_0x01cc:
            r0 = r22
            r1 = r27
            if (r0 >= r1) goto L_0x020d
            r0 = r34
            r1 = r22
            android.view.View r6 = r0.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            aba r6 = (defpackage.aba) r6
            boolean r0 = r6.d
            r28 = r0
            if (r28 == 0) goto L_0x03d1
            int r0 = r6.b
            r28 = r0
            r0 = r28
            if (r0 >= r14) goto L_0x01ff
            int r9 = r6.b
            r10 = 1
            long r10 = r10 << r22
            r6 = 1
        L_0x01f5:
            int r14 = r22 + 1
            r22 = r14
            r14 = r9
            r9 = r6
            goto L_0x01cc
        L_0x01fc:
            r6 = 0
            r8 = r6
            goto L_0x01b9
        L_0x01ff:
            int r6 = r6.b
            if (r6 != r14) goto L_0x03d1
            r28 = 1
            long r28 = r28 << r22
            long r10 = r10 | r28
            int r6 = r9 + 1
            r9 = r14
            goto L_0x01f5
        L_0x020d:
            long r20 = r20 | r10
            r0 = r16
            if (r9 > r0) goto L_0x029e
            int r22 = r14 + 1
            r6 = 0
            r14 = r20
            r9 = r16
            r16 = r6
        L_0x021c:
            r0 = r16
            r1 = r27
            if (r0 >= r1) goto L_0x0296
            r0 = r34
            r1 = r16
            android.view.View r20 = r0.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r6 = r20.getLayoutParams()
            aba r6 = (defpackage.aba) r6
            r21 = 1
            int r21 = r21 << r16
            r0 = r21
            long r0 = (long) r0
            r28 = r0
            long r28 = r28 & r10
            r30 = 0
            int r21 = (r28 > r30 ? 1 : (r28 == r30 ? 0 : -1))
            if (r21 != 0) goto L_0x0256
            int r6 = r6.b
            r0 = r22
            if (r6 != r0) goto L_0x03ce
            r6 = 1
            int r6 = r6 << r16
            long r0 = (long) r6
            r20 = r0
            long r14 = r14 | r20
            r6 = r9
        L_0x0250:
            int r9 = r16 + 1
            r16 = r9
            r9 = r6
            goto L_0x021c
        L_0x0256:
            if (r8 == 0) goto L_0x0283
            boolean r0 = r6.e
            r21 = r0
            if (r21 == 0) goto L_0x0283
            r21 = 1
            r0 = r21
            if (r9 != r0) goto L_0x0283
            r0 = r34
            int r0 = r0.p
            r21 = r0
            int r21 = r21 + r26
            r28 = 0
            r0 = r34
            int r0 = r0.p
            r29 = r0
            r30 = 0
            r0 = r20
            r1 = r21
            r2 = r28
            r3 = r29
            r4 = r30
            r0.setPadding(r1, r2, r3, r4)
        L_0x0283:
            int r0 = r6.b
            r20 = r0
            int r20 = r20 + 1
            r0 = r20
            r6.b = r0
            r20 = 1
            r0 = r20
            r6.f = r0
            int r6 = r9 + -1
            goto L_0x0250
        L_0x0296:
            r6 = 1
            r20 = r14
            r16 = r9
            r15 = r6
            goto L_0x01bf
        L_0x029e:
            r10 = r20
            if (r13 != 0) goto L_0x0344
            r6 = 1
            if (r7 != r6) goto L_0x0344
            r6 = 1
        L_0x02a6:
            if (r16 <= 0) goto L_0x036a
            r8 = 0
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x036a
            int r7 = r7 + -1
            r0 = r16
            if (r0 < r7) goto L_0x02bb
            if (r6 != 0) goto L_0x02bb
            r7 = 1
            r0 = r17
            if (r0 <= r7) goto L_0x036a
        L_0x02bb:
            int r7 = java.lang.Long.bitCount(r10)
            float r7 = (float) r7
            if (r6 != 0) goto L_0x03cb
            r8 = 1
            long r8 = r8 & r10
            r12 = 0
            int r6 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x02df
            r6 = 0
            r0 = r34
            android.view.View r6 = r0.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            aba r6 = (defpackage.aba) r6
            boolean r6 = r6.e
            if (r6 != 0) goto L_0x02df
            r6 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 - r6
        L_0x02df:
            r6 = 1
            int r8 = r27 + -1
            int r6 = r6 << r8
            long r8 = (long) r6
            long r8 = r8 & r10
            r12 = 0
            int r6 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x03cb
            int r6 = r27 + -1
            r0 = r34
            android.view.View r6 = r0.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            aba r6 = (defpackage.aba) r6
            boolean r6 = r6.e
            if (r6 != 0) goto L_0x03cb
            r6 = 1056964608(0x3f000000, float:0.5)
            float r6 = r7 - r6
        L_0x0301:
            r7 = 0
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x0347
            int r7 = r16 * r26
            float r7 = (float) r7
            float r6 = r7 / r6
            int r6 = (int) r6
            r7 = r6
        L_0x030d:
            r6 = 0
            r9 = r6
            r8 = r15
        L_0x0310:
            r0 = r27
            if (r9 >= r0) goto L_0x036b
            r6 = 1
            int r6 = r6 << r9
            long r12 = (long) r6
            long r12 = r12 & r10
            r14 = 0
            int r6 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0368
            r0 = r34
            android.view.View r12 = r0.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r6 = r12.getLayoutParams()
            aba r6 = (defpackage.aba) r6
            boolean r12 = r12 instanceof android.support.v7.view.menu.ActionMenuItemView
            if (r12 == 0) goto L_0x034a
            r6.c = r7
            r8 = 1
            r6.f = r8
            if (r9 != 0) goto L_0x033e
            boolean r8 = r6.e
            if (r8 != 0) goto L_0x033e
            int r8 = -r7
            int r8 = r8 / 2
            r6.leftMargin = r8
        L_0x033e:
            r6 = 1
        L_0x033f:
            int r8 = r9 + 1
            r9 = r8
            r8 = r6
            goto L_0x0310
        L_0x0344:
            r6 = 0
            goto L_0x02a6
        L_0x0347:
            r6 = 0
            r7 = r6
            goto L_0x030d
        L_0x034a:
            boolean r12 = r6.a
            if (r12 == 0) goto L_0x035a
            r6.c = r7
            r8 = 1
            r6.f = r8
            int r8 = -r7
            int r8 = r8 / 2
            r6.rightMargin = r8
            r6 = 1
            goto L_0x033f
        L_0x035a:
            if (r9 == 0) goto L_0x0360
            int r12 = r7 / 2
            r6.leftMargin = r12
        L_0x0360:
            int r12 = r27 + -1
            if (r9 == r12) goto L_0x0368
            int r12 = r7 / 2
            r6.rightMargin = r12
        L_0x0368:
            r6 = r8
            goto L_0x033f
        L_0x036a:
            r8 = r15
        L_0x036b:
            if (r8 == 0) goto L_0x0399
            r6 = 0
            r7 = r6
        L_0x036f:
            r0 = r27
            if (r7 >= r0) goto L_0x0399
            r0 = r34
            android.view.View r8 = r0.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r6 = r8.getLayoutParams()
            aba r6 = (defpackage.aba) r6
            boolean r9 = r6.f
            if (r9 == 0) goto L_0x0395
            int r9 = r6.b
            int r9 = r9 * r26
            int r6 = r6.c
            int r6 = r6 + r9
            r9 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
            r0 = r24
            r8.measure(r6, r0)
        L_0x0395:
            int r6 = r7 + 1
            r7 = r6
            goto L_0x036f
        L_0x0399:
            r6 = 1073741824(0x40000000, float:2.0)
            r0 = r23
            if (r0 == r6) goto L_0x03c8
        L_0x039f:
            r0 = r34
            r1 = r25
            r2 = r18
            r0.setMeasuredDimension(r1, r2)
            goto L_0x008a
        L_0x03aa:
            r6 = 0
            r7 = r6
        L_0x03ac:
            if (r7 >= r8) goto L_0x03c3
            r0 = r34
            android.view.View r6 = r0.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            aba r6 = (defpackage.aba) r6
            r9 = 0
            r6.rightMargin = r9
            r6.leftMargin = r9
            int r6 = r7 + 1
            r7 = r6
            goto L_0x03ac
        L_0x03c3:
            super.onMeasure(r35, r36)
            goto L_0x008a
        L_0x03c8:
            r18 = r19
            goto L_0x039f
        L_0x03cb:
            r6 = r7
            goto L_0x0301
        L_0x03ce:
            r6 = r9
            goto L_0x0250
        L_0x03d1:
            r6 = r9
            r9 = r14
            goto L_0x01f5
        L_0x03d5:
            r13 = r6
            r8 = r16
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r7
            r6 = r14
            goto L_0x0196
        L_0x03df:
            r6 = r13
            goto L_0x0177
        L_0x03e2:
            r7 = r12
            goto L_0x0172
        L_0x03e5:
            r8 = r7
            r9 = r17
            r10 = r18
            r6 = r14
            goto L_0x0196
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionMenuView.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
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
        boolean a2 = defpackage.ahr.a(this);
        int i13 = 0;
        while (i13 < childCount) {
            android.view.View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                defpackage.aba aba = (defpackage.aba) childAt.getLayoutParams();
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
                    int measuredWidth2 = paddingRight - (aba.rightMargin + (childAt.getMeasuredWidth() + aba.leftMargin));
                    d(i13);
                    i7 = i12 + 1;
                    boolean z4 = z3;
                    i8 = measuredWidth2;
                    z2 = z4;
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
            int i15 = i12 - (z3 ? 0 : 1);
            int max = java.lang.Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
            if (a2) {
                int width2 = getWidth() - getPaddingRight();
                int i16 = 0;
                while (i16 < childCount) {
                    android.view.View childAt2 = getChildAt(i16);
                    defpackage.aba aba2 = (defpackage.aba) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() == 8 || aba2.a) {
                        i6 = width2;
                    } else {
                        int i17 = width2 - aba2.rightMargin;
                        int measuredWidth3 = childAt2.getMeasuredWidth();
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        int i18 = i10 - (measuredHeight2 / 2);
                        childAt2.layout(i17 - measuredWidth3, i18, i17, measuredHeight2 + i18);
                        i6 = i17 - ((aba2.leftMargin + measuredWidth3) + max);
                    }
                    i16++;
                    width2 = i6;
                }
                return;
            }
            int paddingLeft = getPaddingLeft();
            int i19 = 0;
            while (i19 < childCount) {
                android.view.View childAt3 = getChildAt(i19);
                defpackage.aba aba3 = (defpackage.aba) childAt3.getLayoutParams();
                if (childAt3.getVisibility() == 8 || aba3.a) {
                    i5 = paddingLeft;
                } else {
                    int i20 = paddingLeft + aba3.leftMargin;
                    int measuredWidth4 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i21 = i10 - (measuredHeight3 / 2);
                    childAt3.layout(i20, i21, i20 + measuredWidth4, measuredHeight3 + i21);
                    i5 = aba3.rightMargin + measuredWidth4 + max + i20;
                }
                i19++;
                paddingLeft = i5;
            }
            return;
        }
        android.view.View childAt4 = getChildAt(0);
        int measuredWidth5 = childAt4.getMeasuredWidth();
        int measuredHeight4 = childAt4.getMeasuredHeight();
        int i22 = ((i3 - i) / 2) - (measuredWidth5 / 2);
        int i23 = i10 - (measuredHeight4 / 2);
        childAt4.layout(i22, i23, measuredWidth5 + i22, measuredHeight4 + i23);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    public static defpackage.aba a() {
        defpackage.aba aba = new defpackage.aba();
        aba.h = 16;
        return aba;
    }

    public static defpackage.aba a(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return a();
        }
        defpackage.aba aba = layoutParams instanceof defpackage.aba ? new defpackage.aba((defpackage.aba) layoutParams) : new defpackage.aba(layoutParams);
        if (aba.h > 0) {
            return aba;
        }
        aba.h = 16;
        return aba;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof defpackage.aba);
    }

    public final boolean a(MenuItemImpl ziVar) {
        return this.peekMenu.a((android.view.MenuItem) ziVar, (MenuPresenter) null, 0);
    }

    public final void a(MenuBuilder zeVar) {
        this.peekMenu = zeVar;
    }

    public final android.view.Menu getMenu() {
        if (this.peekMenu == null) {
            android.content.Context context = getContext();
            this.peekMenu = new MenuBuilder(context);
            this.peekMenu.a((defpackage.zf) new defpackage.abb(this));
            this.presenter = new defpackage.aap(context);
            this.presenter.d();
            this.presenter.d = new defpackage.aaz();
            this.peekMenu.addMenuPresenter((MenuPresenter) this.presenter, this.g);
            this.presenter.a(this);
        }
        return this.peekMenu;
    }

    public final void c() {
        if (this.presenter != null) {
            this.presenter.g();
        }
    }

    private final boolean d(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        android.view.View childAt = getChildAt(i - 1);
        android.view.View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof defpackage.aay)) {
            z = ((defpackage.aay) childAt).e() | false;
        }
        return (i <= 0 || !(childAt2 instanceof defpackage.aay)) ? z : ((defpackage.aay) childAt2).e_() | z;
    }

    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ defpackage.adv b(android.view.ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ defpackage.adv d() {
        return a();
    }

    public final /* synthetic */ defpackage.adv a(android.util.AttributeSet attributeSet) {
        return (defpackage.aba) generateLayoutParams(attributeSet);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new defpackage.aba(getContext(), attributeSet);
    }
}
