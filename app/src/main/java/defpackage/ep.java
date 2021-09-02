package defpackage;

/* renamed from: ep reason: default package */
/* compiled from: PG */
public final class ep extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback, defpackage.pf {
    private static final int[] B = {16842910};
    public boolean A;
    private defpackage.fy C;
    private boolean D;
    private final android.text.TextPaint E = new android.text.TextPaint(1);
    private final android.graphics.Paint.FontMetrics F = new android.graphics.Paint.FontMetrics();
    private final android.graphics.RectF G = new android.graphics.RectF();
    private final android.graphics.PointF H = new android.graphics.PointF();
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N = 255;
    private android.graphics.ColorFilter O;
    private android.graphics.PorterDuffColorFilter P;
    private android.content.res.ColorStateList Q;
    private android.graphics.PorterDuff.Mode R = android.graphics.PorterDuff.Mode.SRC_IN;
    private int[] S;
    private boolean T;
    private android.content.res.ColorStateList U;
    private java.lang.ref.WeakReference V = new java.lang.ref.WeakReference(null);
    private boolean W = true;
    private float X;
    public android.content.res.ColorStateList a;
    public float b;
    public float c;
    public android.content.res.ColorStateList d;
    public float e;
    public android.content.res.ColorStateList f;
    public java.lang.CharSequence g;
    public boolean h;
    public android.graphics.drawable.Drawable i;
    public float j;
    public android.graphics.drawable.Drawable k;
    public android.content.res.ColorStateList l;
    public float m;
    public boolean n;
    public boolean o;
    public android.graphics.drawable.Drawable p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public final android.content.Context y;
    public final android.graphics.Paint z = new android.graphics.Paint(1);

    public ep(android.content.Context context) {
        this.y = context;
        this.E.density = context.getResources().getDisplayMetrics().density;
        setState(B);
        a(B);
    }

    public final void a(boolean z2) {
        if (this.T != z2) {
            this.T = z2;
            g();
            onStateChange(getState());
        }
    }

    public final void a(defpackage.eq eqVar) {
        this.V = new java.lang.ref.WeakReference(eqVar);
    }

    public final void a() {
        defpackage.eq eqVar = (defpackage.eq) this.V.get();
        if (eqVar != null) {
            eqVar.a();
        }
    }

    public final int getIntrinsicWidth() {
        return (int) (this.q + e() + this.t + h() + this.u + f() + this.x);
    }

    public final int getIntrinsicHeight() {
        return (int) this.b;
    }

    public final boolean b() {
        return this.h && this.i != null;
    }

    public final boolean c() {
        return this.o && this.p != null && this.A;
    }

    public final boolean d() {
        return this.D && this.k != null;
    }

    public final float e() {
        if (b() || c()) {
            return this.r + this.j + this.s;
        }
        return 0.0f;
    }

    private final float h() {
        float measureText;
        if (!this.W) {
            return this.X;
        }
        java.lang.CharSequence charSequence = this.g;
        if (charSequence == null) {
            measureText = 0.0f;
        } else {
            measureText = this.E.measureText(charSequence, 0, charSequence.length());
        }
        this.X = measureText;
        this.W = false;
        return this.X;
    }

    public final float f() {
        if (d()) {
            return this.v + this.m + this.w;
        }
        return 0.0f;
    }

    public final void draw(android.graphics.Canvas canvas) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int saveLayerAlpha;
        android.graphics.Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            if (this.N < 255) {
                float f2 = (float) bounds.left;
                float f3 = (float) bounds.top;
                float f4 = (float) bounds.right;
                float f5 = (float) bounds.bottom;
                int i6 = this.N;
                if (android.os.Build.VERSION.SDK_INT > 21) {
                    saveLayerAlpha = canvas.saveLayerAlpha(f2, f3, f4, f5, i6);
                } else {
                    saveLayerAlpha = canvas.saveLayerAlpha(f2, f3, f4, f5, i6, 31);
                }
                i2 = saveLayerAlpha;
            } else {
                i2 = 0;
            }
            this.z.setColor(this.I);
            this.z.setStyle(android.graphics.Paint.Style.FILL);
            this.z.setColorFilter(i());
            this.G.set(bounds);
            canvas.drawRoundRect(this.G, this.c, this.c, this.z);
            if (this.e > 0.0f) {
                this.z.setColor(this.J);
                this.z.setStyle(android.graphics.Paint.Style.STROKE);
                this.z.setColorFilter(i());
                this.G.set(((float) bounds.left) + (this.e / 2.0f), ((float) bounds.top) + (this.e / 2.0f), ((float) bounds.right) - (this.e / 2.0f), ((float) bounds.bottom) - (this.e / 2.0f));
                float f6 = this.c - (this.e / 2.0f);
                canvas.drawRoundRect(this.G, f6, f6, this.z);
            }
            this.z.setColor(this.K);
            this.z.setStyle(android.graphics.Paint.Style.FILL);
            this.G.set(bounds);
            canvas.drawRoundRect(this.G, this.c, this.c, this.z);
            if (b()) {
                a(bounds, this.G);
                float f7 = this.G.left;
                float f8 = this.G.top;
                canvas.translate(f7, f8);
                this.i.setBounds(0, 0, (int) this.G.width(), (int) this.G.height());
                this.i.draw(canvas);
                canvas.translate(-f7, -f8);
            }
            if (c()) {
                a(bounds, this.G);
                float f9 = this.G.left;
                float f10 = this.G.top;
                canvas.translate(f9, f10);
                this.p.setBounds(0, 0, (int) this.G.width(), (int) this.G.height());
                this.p.draw(canvas);
                canvas.translate(-f9, -f10);
            }
            if (this.g != null) {
                android.graphics.PointF pointF = this.H;
                pointF.set(0.0f, 0.0f);
                android.graphics.Paint.Align align = android.graphics.Paint.Align.LEFT;
                if (this.g != null) {
                    float e2 = this.q + e() + this.t;
                    if (defpackage.jd.e(this) == 0) {
                        pointF.x = e2 + ((float) bounds.left);
                        align = android.graphics.Paint.Align.LEFT;
                    } else {
                        pointF.x = ((float) bounds.right) - e2;
                        align = android.graphics.Paint.Align.RIGHT;
                    }
                    float centerY = (float) bounds.centerY();
                    this.E.getFontMetrics(this.F);
                    pointF.y = centerY - ((this.F.descent + this.F.ascent) / 2.0f);
                }
                android.graphics.RectF rectF = this.G;
                rectF.setEmpty();
                if (this.g != null) {
                    float e3 = this.q + e() + this.t;
                    float f11 = this.x + f() + this.u;
                    if (defpackage.jd.e(this) == 0) {
                        rectF.left = e3 + ((float) bounds.left);
                        rectF.right = ((float) bounds.right) - f11;
                    } else {
                        rectF.left = f11 + ((float) bounds.left);
                        rectF.right = ((float) bounds.right) - e3;
                    }
                    rectF.top = (float) bounds.top;
                    rectF.bottom = (float) bounds.bottom;
                }
                if (this.C != null) {
                    this.E.drawableState = getState();
                    defpackage.fy fyVar = this.C;
                    android.content.Context context = this.y;
                    android.text.TextPaint textPaint = this.E;
                    fyVar.a(context, textPaint);
                    if (fyVar.a != null) {
                        i4 = fyVar.a.getColorForState(textPaint.drawableState, fyVar.a.getDefaultColor());
                    } else {
                        i4 = -16777216;
                    }
                    textPaint.setColor(i4);
                    float f12 = fyVar.e;
                    float f13 = fyVar.c;
                    float f14 = fyVar.d;
                    if (fyVar.b != null) {
                        i5 = fyVar.b.getColorForState(textPaint.drawableState, fyVar.b.getDefaultColor());
                    } else {
                        i5 = 0;
                    }
                    textPaint.setShadowLayer(f12, f13, f14, i5);
                }
                this.E.setTextAlign(align);
                if (h() > this.G.width()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    int save = canvas.save();
                    canvas.clipRect(this.G);
                    i3 = save;
                } else {
                    i3 = 0;
                }
                canvas.drawText(this.g, 0, this.g.length(), this.H.x, this.H.y, this.E);
                if (z2) {
                    canvas.restoreToCount(i3);
                }
            }
            if (d()) {
                android.graphics.RectF rectF2 = this.G;
                rectF2.setEmpty();
                if (d()) {
                    float f15 = this.x + this.w;
                    if (defpackage.jd.e(this) == 0) {
                        rectF2.right = ((float) bounds.right) - f15;
                        rectF2.left = rectF2.right - this.m;
                    } else {
                        rectF2.left = f15 + ((float) bounds.left);
                        rectF2.right = rectF2.left + this.m;
                    }
                    rectF2.top = bounds.exactCenterY() - (this.m / 2.0f);
                    rectF2.bottom = rectF2.top + this.m;
                }
                float f16 = this.G.left;
                float f17 = this.G.top;
                canvas.translate(f16, f17);
                this.k.setBounds(0, 0, (int) this.G.width(), (int) this.G.height());
                this.k.draw(canvas);
                canvas.translate(-f16, -f17);
            }
            if (this.N < 255) {
                canvas.restoreToCount(i2);
            }
        }
    }

    private final void a(android.graphics.Rect rect, android.graphics.RectF rectF) {
        rectF.setEmpty();
        if (b() || c()) {
            float f2 = this.q + this.r;
            if (defpackage.jd.e(this) == 0) {
                rectF.left = f2 + ((float) rect.left);
                rectF.right = rectF.left + this.j;
            } else {
                rectF.right = ((float) rect.right) - f2;
                rectF.left = rectF.right - this.j;
            }
            rectF.top = rect.exactCenterY() - (this.j / 2.0f);
            rectF.bottom = rectF.top + this.j;
        }
    }

    public final boolean isStateful() {
        boolean z2;
        if (!a(this.a) && !a(this.d) && (!this.T || !a(this.U))) {
            defpackage.fy fyVar = this.C;
            if (!((fyVar == null || fyVar.a == null || !fyVar.a.isStateful()) ? false : true)) {
                if (!this.o || this.p == null || !this.n) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2 && !a(this.i) && !a(this.p) && !a(this.Q)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean a(int[] iArr) {
        if (!java.util.Arrays.equals(this.S, iArr)) {
            this.S = iArr;
            if (d()) {
                return a(getState(), iArr);
            }
        }
        return false;
    }

    public final boolean onStateChange(int[] iArr) {
        return a(iArr, this.S);
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(int[] r9, int[] r10) {
        /*
            r8 = this;
            r2 = 1
            r1 = 0
            boolean r3 = super.onStateChange(r9)
            android.content.res.ColorStateList r0 = r8.a
            if (r0 == 0) goto L_0x00e3
            android.content.res.ColorStateList r0 = r8.a
            int r4 = r8.I
            int r0 = r0.getColorForState(r9, r4)
        L_0x0012:
            int r4 = r8.I
            if (r4 == r0) goto L_0x0100
            r8.I = r0
            r0 = r2
        L_0x0019:
            android.content.res.ColorStateList r3 = r8.d
            if (r3 == 0) goto L_0x00e6
            android.content.res.ColorStateList r3 = r8.d
            int r4 = r8.J
            int r3 = r3.getColorForState(r9, r4)
        L_0x0025:
            int r4 = r8.J
            if (r4 == r3) goto L_0x002c
            r8.J = r3
            r0 = r2
        L_0x002c:
            android.content.res.ColorStateList r3 = r8.U
            if (r3 == 0) goto L_0x00e9
            android.content.res.ColorStateList r3 = r8.U
            int r4 = r8.K
            int r3 = r3.getColorForState(r9, r4)
        L_0x0038:
            int r4 = r8.K
            if (r4 == r3) goto L_0x0043
            r8.K = r3
            boolean r3 = r8.T
            if (r3 == 0) goto L_0x0043
            r0 = r2
        L_0x0043:
            fy r3 = r8.C
            if (r3 == 0) goto L_0x00ec
            fy r3 = r8.C
            android.content.res.ColorStateList r3 = r3.a
            if (r3 == 0) goto L_0x00ec
            fy r3 = r8.C
            android.content.res.ColorStateList r3 = r3.a
            int r4 = r8.L
            int r3 = r3.getColorForState(r9, r4)
        L_0x0057:
            int r4 = r8.L
            if (r4 == r3) goto L_0x005e
            r8.L = r3
            r0 = r2
        L_0x005e:
            int[] r4 = r8.getState()
            if (r4 == 0) goto L_0x00f3
            int r5 = r4.length
            r3 = r1
        L_0x0066:
            if (r3 >= r5) goto L_0x00f3
            r6 = r4[r3]
            r7 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r6 != r7) goto L_0x00ef
            r3 = r2
        L_0x0070:
            if (r3 == 0) goto L_0x00f6
            boolean r3 = r8.n
            if (r3 == 0) goto L_0x00f6
            r3 = r2
        L_0x0077:
            boolean r4 = r8.A
            if (r4 == r3) goto L_0x00fd
            android.graphics.drawable.Drawable r4 = r8.p
            if (r4 == 0) goto L_0x00fd
            float r0 = r8.e()
            r8.A = r3
            float r3 = r8.e()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00fa
            r0 = r2
            r3 = r2
        L_0x008f:
            android.content.res.ColorStateList r4 = r8.Q
            if (r4 == 0) goto L_0x009b
            android.content.res.ColorStateList r1 = r8.Q
            int r4 = r8.M
            int r1 = r1.getColorForState(r9, r4)
        L_0x009b:
            int r4 = r8.M
            if (r4 == r1) goto L_0x00f8
            r8.M = r1
            android.content.res.ColorStateList r1 = r8.Q
            android.graphics.PorterDuff$Mode r3 = r8.R
            android.graphics.PorterDuffColorFilter r1 = defpackage.gm.a(r8, r1, r3)
            r8.P = r1
        L_0x00ab:
            android.graphics.drawable.Drawable r1 = r8.i
            boolean r1 = a(r1)
            if (r1 == 0) goto L_0x00ba
            android.graphics.drawable.Drawable r1 = r8.i
            boolean r1 = r1.setState(r9)
            r2 = r2 | r1
        L_0x00ba:
            android.graphics.drawable.Drawable r1 = r8.p
            boolean r1 = a(r1)
            if (r1 == 0) goto L_0x00c9
            android.graphics.drawable.Drawable r1 = r8.p
            boolean r1 = r1.setState(r9)
            r2 = r2 | r1
        L_0x00c9:
            android.graphics.drawable.Drawable r1 = r8.k
            boolean r1 = a(r1)
            if (r1 == 0) goto L_0x00d8
            android.graphics.drawable.Drawable r1 = r8.k
            boolean r1 = r1.setState(r10)
            r2 = r2 | r1
        L_0x00d8:
            if (r2 == 0) goto L_0x00dd
            r8.invalidateSelf()
        L_0x00dd:
            if (r0 == 0) goto L_0x00e2
            r8.a()
        L_0x00e2:
            return r2
        L_0x00e3:
            r0 = r1
            goto L_0x0012
        L_0x00e6:
            r3 = r1
            goto L_0x0025
        L_0x00e9:
            r3 = r1
            goto L_0x0038
        L_0x00ec:
            r3 = r1
            goto L_0x0057
        L_0x00ef:
            int r3 = r3 + 1
            goto L_0x0066
        L_0x00f3:
            r3 = r1
            goto L_0x0070
        L_0x00f6:
            r3 = r1
            goto L_0x0077
        L_0x00f8:
            r2 = r3
            goto L_0x00ab
        L_0x00fa:
            r0 = r1
            r3 = r2
            goto L_0x008f
        L_0x00fd:
            r3 = r0
            r0 = r1
            goto L_0x008f
        L_0x0100:
            r0 = r3
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ep.a(int[], int[]):boolean");
    }

    private static boolean a(android.content.res.ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean a(android.graphics.drawable.Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    @android.annotation.TargetApi(23)
    public final boolean onLayoutDirectionChanged(int i2) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (b()) {
            onLayoutDirectionChanged |= this.i.setLayoutDirection(i2);
        }
        if (c()) {
            onLayoutDirectionChanged |= this.p.setLayoutDirection(i2);
        }
        if (d()) {
            onLayoutDirectionChanged |= this.k.setLayoutDirection(i2);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i2) {
        boolean onLevelChange = super.onLevelChange(i2);
        if (b()) {
            onLevelChange |= this.i.setLevel(i2);
        }
        if (c()) {
            onLevelChange |= this.p.setLevel(i2);
        }
        if (d()) {
            onLevelChange |= this.k.setLevel(i2);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (b()) {
            visible |= this.i.setVisible(z2, z3);
        }
        if (c()) {
            visible |= this.p.setVisible(z2, z3);
        }
        if (d()) {
            visible |= this.k.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void setAlpha(int i2) {
        if (this.N != i2) {
            this.N = i2;
            invalidateSelf();
        }
    }

    public final int getAlpha() {
        return this.N;
    }

    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        if (this.O != colorFilter) {
            this.O = colorFilter;
            invalidateSelf();
        }
    }

    public final android.graphics.ColorFilter getColorFilter() {
        return this.O;
    }

    public final void setTintList(android.content.res.ColorStateList colorStateList) {
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            onStateChange(getState());
        }
    }

    public final void setTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.R != mode) {
            this.R = mode;
            this.P = defpackage.gm.a((android.graphics.drawable.Drawable) this, this.Q, mode);
            invalidateSelf();
        }
    }

    public final int getOpacity() {
        return -3;
    }

    @android.annotation.TargetApi(21)
    public final void getOutline(android.graphics.Outline outline) {
        android.graphics.Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.c);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.c);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    public final void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j2) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    public final void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public static void b(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final void c(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            defpackage.jd.b(drawable, defpackage.jd.e(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.k) {
                if (drawable.isStateful()) {
                    drawable.setState(this.S);
                }
                defpackage.jd.a(drawable, this.l);
            } else if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    private final android.graphics.ColorFilter i() {
        return this.O != null ? this.O : this.P;
    }

    public final void g() {
        this.U = this.T ? defpackage.fz.a(this.f) : null;
    }

    public final void a(java.lang.CharSequence charSequence) {
        java.lang.String str;
        android.text.SpannableStringBuilder spannableStringBuilder;
        java.lang.String str2;
        if (this.g != charSequence) {
            defpackage.qh a2 = defpackage.qh.a();
            defpackage.ql qlVar = a2.f;
            if (charSequence == null) {
                spannableStringBuilder = null;
            } else {
                boolean a3 = qlVar.a(charSequence, charSequence.length());
                android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder();
                if ((a2.e & 2) != 0) {
                    boolean a4 = (a3 ? defpackage.qm.b : defpackage.qm.a).a(charSequence, charSequence.length());
                    if (!a2.d && (a4 || defpackage.qh.b(charSequence) == 1)) {
                        str2 = defpackage.qh.b;
                    } else if (!a2.d || (a4 && defpackage.qh.b(charSequence) != -1)) {
                        str2 = "";
                    } else {
                        str2 = defpackage.qh.c;
                    }
                    spannableStringBuilder2.append(str2);
                }
                if (a3 != a2.d) {
                    spannableStringBuilder2.append(a3 ? (char) 8235 : 8234);
                    spannableStringBuilder2.append(charSequence);
                    spannableStringBuilder2.append(8236);
                } else {
                    spannableStringBuilder2.append(charSequence);
                }
                boolean a5 = (a3 ? defpackage.qm.b : defpackage.qm.a).a(charSequence, charSequence.length());
                if (!a2.d && (a5 || defpackage.qh.a(charSequence) == 1)) {
                    str = defpackage.qh.b;
                } else if (!a2.d || (a5 && defpackage.qh.a(charSequence) != -1)) {
                    str = "";
                } else {
                    str = defpackage.qh.c;
                }
                spannableStringBuilder2.append(str);
                spannableStringBuilder = spannableStringBuilder2;
            }
            this.g = spannableStringBuilder;
            this.W = true;
            invalidateSelf();
            a();
        }
    }

    public final void a(defpackage.fy fyVar) {
        if (this.C != fyVar) {
            this.C = fyVar;
            if (fyVar != null) {
                fyVar.a(this.y, this.E);
                this.W = true;
            }
            onStateChange(getState());
            a();
        }
    }

    public final void d(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.i;
        if (drawable2 != drawable) {
            float e2 = e();
            this.i = drawable;
            float e3 = e();
            b(drawable2);
            if (b()) {
                c(this.i);
            }
            invalidateSelf();
            if (e2 != e3) {
                a();
            }
        }
    }

    public final void b(boolean z2) {
        if (this.D != z2) {
            boolean d2 = d();
            this.D = z2;
            boolean d3 = d();
            if (d2 != d3) {
                if (d3) {
                    c(this.k);
                } else {
                    b(this.k);
                }
                invalidateSelf();
                a();
            }
        }
    }
}
