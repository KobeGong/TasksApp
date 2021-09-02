package android.support.design.chip;

/* compiled from: PG */
public class Chip extends defpackage.abi implements defpackage.eq {
    public static final android.graphics.Rect a = new android.graphics.Rect();
    private static final int[] d = {16842913};
    public defpackage.ep b;
    public android.view.View.OnClickListener c;
    private boolean e;
    private int f;
    private boolean g;
    private boolean h;
    private boolean i;
    private final defpackage.eo j;
    private final android.graphics.Rect k;
    private final android.graphics.RectF l;

    public Chip(android.content.Context context) {
        this(context, null);
    }

    public Chip(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130771975);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x027e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            r9 = 1
            r1 = 0
            r8 = 0
            r7 = 0
            r10.<init>(r11, r12, r13)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r10.f = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.k = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r10.l = r0
            ep r3 = new ep
            r3.<init>(r11)
            android.content.Context r0 = r3.y
            int[] r2 = defpackage.er.a
            r4 = 2132017761(0x7f140261, float:1.967381E38)
            android.content.res.TypedArray r4 = defpackage.fp.a(r0, r12, r2, r13, r4)
            android.content.Context r0 = r3.y
            int r2 = defpackage.er.e
            android.content.res.ColorStateList r0 = defpackage.gm.a(r0, r4, r2)
            android.content.res.ColorStateList r2 = r3.a
            if (r2 == r0) goto L_0x003e
            r3.a = r0
            int[] r0 = r3.getState()
            r3.onStateChange(r0)
        L_0x003e:
            int r0 = defpackage.er.k
            float r0 = r4.getDimension(r0, r7)
            float r2 = r3.b
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0052
            r3.b = r0
            r3.invalidateSelf()
            r3.a()
        L_0x0052:
            int r0 = defpackage.er.f
            float r0 = r4.getDimension(r0, r7)
            float r2 = r3.c
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0063
            r3.c = r0
            r3.invalidateSelf()
        L_0x0063:
            android.content.Context r0 = r3.y
            int r2 = defpackage.er.m
            android.content.res.ColorStateList r0 = defpackage.gm.a(r0, r4, r2)
            android.content.res.ColorStateList r2 = r3.d
            if (r2 == r0) goto L_0x0078
            r3.d = r0
            int[] r0 = r3.getState()
            r3.onStateChange(r0)
        L_0x0078:
            int r0 = defpackage.er.n
            float r0 = r4.getDimension(r0, r7)
            float r2 = r3.e
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x008e
            r3.e = r0
            android.graphics.Paint r2 = r3.z
            r2.setStrokeWidth(r0)
            r3.invalidateSelf()
        L_0x008e:
            android.content.Context r0 = r3.y
            int r2 = defpackage.er.y
            android.content.res.ColorStateList r0 = defpackage.gm.a(r0, r4, r2)
            android.content.res.ColorStateList r2 = r3.f
            if (r2 == r0) goto L_0x00a6
            r3.f = r0
            r3.g()
            int[] r0 = r3.getState()
            r3.onStateChange(r0)
        L_0x00a6:
            int r0 = defpackage.er.o
            java.lang.CharSequence r0 = r4.getText(r0)
            r3.a(r0)
            android.content.Context r2 = r3.y
            boolean r0 = r4.hasValue(r8)
            if (r0 == 0) goto L_0x0335
            int r5 = r4.getResourceId(r8, r8)
            if (r5 == 0) goto L_0x0335
            fy r0 = new fy
            r0.<init>(r2, r5)
        L_0x00c2:
            r3.a(r0)
            int r0 = defpackage.er.i
            boolean r0 = r4.getBoolean(r0, r8)
            boolean r2 = r3.h
            if (r2 == r0) goto L_0x00e8
            boolean r2 = r3.b()
            r3.h = r0
            boolean r0 = r3.b()
            if (r2 == r0) goto L_0x00e8
            if (r0 == 0) goto L_0x0338
            android.graphics.drawable.Drawable r0 = r3.i
            r3.c(r0)
        L_0x00e2:
            r3.invalidateSelf()
            r3.a()
        L_0x00e8:
            android.content.Context r0 = r3.y
            int r2 = defpackage.er.h
            android.graphics.drawable.Drawable r0 = defpackage.gm.b(r0, r4, r2)
            r3.d(r0)
            int r0 = defpackage.er.j
            float r0 = r4.getDimension(r0, r7)
            float r2 = r3.j
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0113
            float r2 = r3.e()
            r3.j = r0
            float r0 = r3.e()
            r3.invalidateSelf()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0113
            r3.a()
        L_0x0113:
            int r0 = defpackage.er.q
            boolean r0 = r4.getBoolean(r0, r8)
            r3.b(r0)
            android.content.Context r0 = r3.y
            int r2 = defpackage.er.p
            android.graphics.drawable.Drawable r5 = defpackage.gm.b(r0, r4, r2)
            android.graphics.drawable.Drawable r0 = r3.k
            if (r0 == 0) goto L_0x0342
            android.graphics.drawable.Drawable r0 = r3.k
            boolean r2 = r0 instanceof defpackage.C0001pg
            if (r2 == 0) goto L_0x033f
            pg r0 = (defpackage.C0001pg) r0
            android.graphics.drawable.Drawable r0 = r0.a()
            r2 = r0
        L_0x0135:
            if (r2 == r5) goto L_0x0163
            float r6 = r3.f()
            if (r5 == 0) goto L_0x0345
            android.graphics.drawable.Drawable r0 = defpackage.jd.d(r5)
            android.graphics.drawable.Drawable r0 = r0.mutate()
        L_0x0145:
            r3.k = r0
            float r0 = r3.f()
            defpackage.ep.b(r2)
            boolean r2 = r3.d()
            if (r2 == 0) goto L_0x0159
            android.graphics.drawable.Drawable r2 = r3.k
            r3.c(r2)
        L_0x0159:
            r3.invalidateSelf()
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0163
            r3.a()
        L_0x0163:
            android.content.Context r0 = r3.y
            int r2 = defpackage.er.u
            android.content.res.ColorStateList r0 = defpackage.gm.a(r0, r4, r2)
            android.content.res.ColorStateList r2 = r3.l
            if (r2 == r0) goto L_0x0183
            r3.l = r0
            boolean r2 = r3.d()
            if (r2 == 0) goto L_0x017c
            android.graphics.drawable.Drawable r2 = r3.k
            defpackage.jd.a(r2, r0)
        L_0x017c:
            int[] r0 = r3.getState()
            r3.onStateChange(r0)
        L_0x0183:
            int r0 = defpackage.er.s
            float r0 = r4.getDimension(r0, r7)
            float r2 = r3.m
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x019d
            r3.m = r0
            r3.invalidateSelf()
            boolean r0 = r3.d()
            if (r0 == 0) goto L_0x019d
            r3.a()
        L_0x019d:
            int r0 = defpackage.er.b
            boolean r0 = r4.getBoolean(r0, r8)
            boolean r2 = r3.n
            if (r2 == r0) goto L_0x01c3
            r3.n = r0
            float r2 = r3.e()
            if (r0 != 0) goto L_0x01b5
            boolean r0 = r3.A
            if (r0 == 0) goto L_0x01b5
            r3.A = r8
        L_0x01b5:
            float r0 = r3.e()
            r3.invalidateSelf()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01c3
            r3.a()
        L_0x01c3:
            int r0 = defpackage.er.d
            boolean r0 = r4.getBoolean(r0, r8)
            boolean r2 = r3.o
            if (r2 == r0) goto L_0x01e6
            boolean r2 = r3.c()
            r3.o = r0
            boolean r0 = r3.c()
            if (r2 == r0) goto L_0x01e6
            if (r0 == 0) goto L_0x0348
            android.graphics.drawable.Drawable r0 = r3.p
            r3.c(r0)
        L_0x01e0:
            r3.invalidateSelf()
            r3.a()
        L_0x01e6:
            android.content.Context r0 = r3.y
            int r2 = defpackage.er.c
            android.graphics.drawable.Drawable r0 = defpackage.gm.b(r0, r4, r2)
            android.graphics.drawable.Drawable r2 = r3.p
            if (r2 == r0) goto L_0x0210
            float r2 = r3.e()
            r3.p = r0
            float r0 = r3.e()
            android.graphics.drawable.Drawable r5 = r3.p
            defpackage.ep.b(r5)
            android.graphics.drawable.Drawable r5 = r3.p
            r3.c(r5)
            r3.invalidateSelf()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0210
            r3.a()
        L_0x0210:
            android.content.Context r0 = r3.y
            int r2 = defpackage.er.z
            defpackage.ct.a(r0, r4, r2)
            android.content.Context r0 = r3.y
            int r2 = defpackage.er.v
            defpackage.ct.a(r0, r4, r2)
            int r0 = defpackage.er.l
            float r0 = r4.getDimension(r0, r7)
            float r2 = r3.q
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0232
            r3.q = r0
            r3.invalidateSelf()
            r3.a()
        L_0x0232:
            int r0 = defpackage.er.x
            float r0 = r4.getDimension(r0, r7)
            float r2 = r3.r
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0252
            float r2 = r3.e()
            r3.r = r0
            float r0 = r3.e()
            r3.invalidateSelf()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0252
            r3.a()
        L_0x0252:
            int r0 = defpackage.er.w
            float r0 = r4.getDimension(r0, r7)
            float r2 = r3.s
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0272
            float r2 = r3.e()
            r3.s = r0
            float r0 = r3.e()
            r3.invalidateSelf()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0272
            r3.a()
        L_0x0272:
            int r0 = defpackage.er.B
            float r0 = r4.getDimension(r0, r7)
            float r2 = r3.t
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0286
            r3.t = r0
            r3.invalidateSelf()
            r3.a()
        L_0x0286:
            int r0 = defpackage.er.A
            float r0 = r4.getDimension(r0, r7)
            float r2 = r3.u
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x029a
            r3.u = r0
            r3.invalidateSelf()
            r3.a()
        L_0x029a:
            int r0 = defpackage.er.t
            float r0 = r4.getDimension(r0, r7)
            float r2 = r3.v
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x02b4
            r3.v = r0
            r3.invalidateSelf()
            boolean r0 = r3.d()
            if (r0 == 0) goto L_0x02b4
            r3.a()
        L_0x02b4:
            int r0 = defpackage.er.r
            float r0 = r4.getDimension(r0, r7)
            float r2 = r3.w
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x02ce
            r3.w = r0
            r3.invalidateSelf()
            boolean r0 = r3.d()
            if (r0 == 0) goto L_0x02ce
            r3.a()
        L_0x02ce:
            int r0 = defpackage.er.g
            float r0 = r4.getDimension(r0, r7)
            float r2 = r3.x
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x02e2
            r3.x = r0
            r3.invalidateSelf()
            r3.a()
        L_0x02e2:
            r4.recycle()
            ep r0 = r10.b
            if (r0 == r3) goto L_0x0312
            ep r0 = r10.b
            if (r0 == 0) goto L_0x02f0
            r0.a(r1)
        L_0x02f0:
            r10.b = r3
            ep r0 = r10.b
            r0.a(r10)
            boolean r0 = defpackage.fz.a
            if (r0 == 0) goto L_0x034f
            android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
            ep r2 = r10.b
            android.content.res.ColorStateList r2 = r2.f
            android.content.res.ColorStateList r2 = defpackage.fz.a(r2)
            ep r3 = r10.b
            r0.<init>(r2, r3, r1)
            ep r1 = r10.b
            r1.a(r8)
            defpackage.sn.a(r10, r0)
        L_0x0312:
            eo r0 = new eo
            r0.<init>(r10, r10)
            r10.j = r0
            eo r0 = r10.j
            defpackage.sn.a(r10, r0)
            defpackage.sn.a(r10, r9)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x032f
            en r0 = new en
            r0.<init>(r10)
            r10.setOutlineProvider(r0)
        L_0x032f:
            boolean r0 = r10.e
            r10.setChecked(r0)
            return
        L_0x0335:
            r0 = r1
            goto L_0x00c2
        L_0x0338:
            android.graphics.drawable.Drawable r0 = r3.i
            defpackage.ep.b(r0)
            goto L_0x00e2
        L_0x033f:
            r2 = r0
            goto L_0x0135
        L_0x0342:
            r2 = r1
            goto L_0x0135
        L_0x0345:
            r0 = r1
            goto L_0x0145
        L_0x0348:
            android.graphics.drawable.Drawable r0 = r3.p
            defpackage.ep.b(r0)
            goto L_0x01e0
        L_0x034f:
            ep r0 = r10.b
            r0.a(r9)
            ep r0 = r10.b
            defpackage.sn.a(r10, r0)
            goto L_0x0312
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, d);
        }
        return onCreateDrawableState;
    }

    public final void a() {
        requestLayout();
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setChecked(boolean z) {
        if (this.b == null) {
            this.e = z;
        } else if (this.b.n) {
            isChecked();
            super.setChecked(z);
        }
    }

    public final boolean b() {
        boolean z;
        playSoundEffect(0);
        if (this.c != null) {
            this.c.onClick(this);
            z = true;
        } else {
            z = false;
        }
        this.j.b(0, 1);
        return z;
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r2 = 0
            r1 = 1
            int r0 = r7.getActionMasked()
            android.graphics.RectF r3 = r6.d()
            float r4 = r7.getX()
            float r5 = r7.getY()
            boolean r3 = r3.contains(r4, r5)
            switch(r0) {
                case 0: goto L_0x0024;
                case 1: goto L_0x0036;
                case 2: goto L_0x002b;
                case 3: goto L_0x0042;
                default: goto L_0x0019;
            }
        L_0x0019:
            r0 = r2
        L_0x001a:
            if (r0 != 0) goto L_0x0022
            boolean r0 = super.onTouchEvent(r7)
            if (r0 == 0) goto L_0x0023
        L_0x0022:
            r2 = r1
        L_0x0023:
            return r2
        L_0x0024:
            if (r3 == 0) goto L_0x0019
            r6.b(r1)
            r0 = r1
            goto L_0x001a
        L_0x002b:
            boolean r0 = r6.g
            if (r0 == 0) goto L_0x0019
            if (r3 != 0) goto L_0x0034
            r6.b(r2)
        L_0x0034:
            r0 = r1
            goto L_0x001a
        L_0x0036:
            boolean r0 = r6.g
            if (r0 == 0) goto L_0x0042
            r6.b()
            r0 = r1
        L_0x003e:
            r6.b(r2)
            goto L_0x001a
        L_0x0042:
            r0 = r2
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case 7:
                c(d().contains(motionEvent.getX(), motionEvent.getY()));
                break;
            case 10:
                c(false);
                break;
        }
        return super.onHoverEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(android.view.MotionEvent motionEvent) {
        boolean z;
        defpackage.eo eoVar = this.j;
        if (eoVar.b.isEnabled() && eoVar.b.isTouchExplorationEnabled()) {
            switch (motionEvent.getAction()) {
                case 7:
                case 9:
                    int a2 = eoVar.a(motionEvent.getX(), motionEvent.getY());
                    eoVar.a(a2);
                    if (a2 == Integer.MIN_VALUE) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 10:
                    if (eoVar.d == Integer.MIN_VALUE) {
                        z = false;
                        break;
                    } else {
                        eoVar.a(Integer.MIN_VALUE);
                        z = true;
                        break;
                    }
                default:
                    z = false;
                    break;
            }
        } else {
            z = false;
        }
        if (z || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i2, android.graphics.Rect rect) {
        if (z) {
            c(-1);
        } else {
            c(Integer.MIN_VALUE);
        }
        invalidate();
        super.onFocusChanged(z, i2, rect);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r7, android.view.KeyEvent r8) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            int r2 = r8.getKeyCode()
            switch(r2) {
                case 21: goto L_0x000f;
                case 22: goto L_0x001e;
                case 23: goto L_0x0030;
                case 61: goto L_0x003e;
                case 66: goto L_0x0030;
                default: goto L_0x0009;
            }
        L_0x0009:
            if (r0 == 0) goto L_0x0069
            r6.invalidate()
        L_0x000e:
            return r1
        L_0x000f:
            boolean r2 = r8.hasNoModifiers()
            if (r2 == 0) goto L_0x0009
            boolean r0 = defpackage.gm.a(r6)
            boolean r0 = r6.a(r0)
            goto L_0x0009
        L_0x001e:
            boolean r2 = r8.hasNoModifiers()
            if (r2 == 0) goto L_0x0009
            boolean r2 = defpackage.gm.a(r6)
            if (r2 != 0) goto L_0x002b
            r0 = r1
        L_0x002b:
            boolean r0 = r6.a(r0)
            goto L_0x0009
        L_0x0030:
            int r2 = r6.f
            switch(r2) {
                case -1: goto L_0x0036;
                case 0: goto L_0x003a;
                default: goto L_0x0035;
            }
        L_0x0035:
            goto L_0x0009
        L_0x0036:
            r6.performClick()
            goto L_0x000e
        L_0x003a:
            r6.b()
            goto L_0x000e
        L_0x003e:
            boolean r2 = r8.hasNoModifiers()
            if (r2 == 0) goto L_0x0061
            r2 = 2
            r3 = r2
        L_0x0046:
            if (r3 == 0) goto L_0x0009
            android.view.ViewParent r4 = r6.getParent()
            r2 = r6
        L_0x004d:
            android.view.View r2 = r2.focusSearch(r3)
            if (r2 == 0) goto L_0x005b
            if (r2 == r6) goto L_0x005b
            android.view.ViewParent r5 = r2.getParent()
            if (r5 == r4) goto L_0x004d
        L_0x005b:
            if (r2 == 0) goto L_0x0009
            r2.requestFocus()
            goto L_0x000e
        L_0x0061:
            boolean r2 = r8.hasModifiers(r1)
            if (r2 == 0) goto L_0x006e
            r3 = r1
            goto L_0x0046
        L_0x0069:
            boolean r1 = super.onKeyDown(r7, r8)
            goto L_0x000e
        L_0x006e:
            r3 = r0
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.chip.Chip.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    private final boolean a(boolean z) {
        if (this.f == Integer.MIN_VALUE) {
            c(-1);
        }
        if (z) {
            if (this.f == -1) {
                c(0);
                return true;
            }
        } else if (this.f == 0) {
            c(-1);
            return true;
        }
        return false;
    }

    public void getFocusedRect(android.graphics.Rect rect) {
        if (this.f == 0) {
            rect.set(e());
        } else {
            super.getFocusedRect(rect);
        }
    }

    private final void c(int i2) {
        if (this.f != i2) {
            if (this.f == 0) {
                d(false);
            }
            this.f = i2;
            if (i2 == 0) {
                d(true);
            }
        }
    }

    private final void b(boolean z) {
        if (this.g != z) {
            this.g = z;
            refreshDrawableState();
        }
    }

    private final void c(boolean z) {
        if (this.h != z) {
            this.h = z;
            refreshDrawableState();
        }
    }

    private final void d(boolean z) {
        if (this.i != z) {
            this.i = z;
            refreshDrawableState();
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        int i2;
        int i3 = 1;
        boolean z = false;
        super.drawableStateChanged();
        if (this.b != null && defpackage.ep.a(this.b.k)) {
            defpackage.ep epVar = this.b;
            if (isEnabled()) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (this.i) {
                i2++;
            }
            if (this.h) {
                i2++;
            }
            if (this.g) {
                i2++;
            }
            if (isChecked()) {
                i2++;
            }
            int[] iArr = new int[i2];
            if (isEnabled()) {
                iArr[0] = 16842910;
            } else {
                i3 = 0;
            }
            if (this.i) {
                iArr[i3] = 16842908;
                i3++;
            }
            if (this.h) {
                iArr[i3] = 16843623;
                i3++;
            }
            if (this.g) {
                iArr[i3] = 16842919;
                i3++;
            }
            if (isChecked()) {
                iArr[i3] = 16842913;
            }
            z = epVar.a(iArr);
        }
        if (z) {
            invalidate();
        }
    }

    public final boolean c() {
        return (this.b == null || this.b.k == null) ? false : true;
    }

    public final android.graphics.RectF d() {
        this.l.setEmpty();
        if (c()) {
            defpackage.ep epVar = this.b;
            android.graphics.RectF rectF = this.l;
            android.graphics.Rect bounds = epVar.getBounds();
            rectF.setEmpty();
            if (epVar.d()) {
                float f2 = epVar.x + epVar.w + epVar.m + epVar.v + epVar.u;
                if (defpackage.jd.e(epVar) == 0) {
                    rectF.right = (float) bounds.right;
                    rectF.left = rectF.right - f2;
                } else {
                    rectF.left = (float) bounds.left;
                    rectF.right = ((float) bounds.left) + f2;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
        }
        return this.l;
    }

    public final android.graphics.Rect e() {
        android.graphics.RectF d2 = d();
        this.k.set((int) d2.left, (int) d2.top, (int) d2.right, (int) d2.bottom);
        return this.k;
    }

    @android.annotation.TargetApi(24)
    public android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent motionEvent, int i2) {
        if (!d().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return android.view.PointerIcon.getSystemIcon(getContext(), 1002);
    }

    public final void a(java.lang.CharSequence charSequence) {
        if (this.b != null) {
            this.b.a(charSequence);
        }
    }

    public final void a(int i2) {
        if (this.b != null) {
            defpackage.ep epVar = this.b;
            epVar.a(new defpackage.fy(epVar.y, i2));
        }
    }

    public final void b(int i2) {
        if (this.b != null) {
            defpackage.ep epVar = this.b;
            epVar.d(defpackage.xw.b(epVar.y, i2));
        }
    }
}
