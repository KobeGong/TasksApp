package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: ep  reason: default package */
/* compiled from: PG */
public final class ep extends Drawable implements Drawable.Callback, pf {
    private static final int[] B = {16842910};
    public boolean A;
    private fy C;
    private boolean D;
    private final TextPaint E = new TextPaint(1);
    private final Paint.FontMetrics F = new Paint.FontMetrics();
    private final RectF G = new RectF();
    private final PointF H = new PointF();
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N = 255;
    private ColorFilter O;
    private PorterDuffColorFilter P;
    private ColorStateList Q;
    private PorterDuff.Mode R = PorterDuff.Mode.SRC_IN;
    private int[] S;
    private boolean T;
    private ColorStateList U;
    private WeakReference V = new WeakReference(null);
    private boolean W = true;
    private float X;
    public ColorStateList a;
    public float b;
    public float c;
    public ColorStateList d;
    public float e;
    public ColorStateList f;
    public CharSequence g;
    public boolean h;
    public Drawable i;
    public float j;
    public Drawable k;
    public ColorStateList l;
    public float m;
    public boolean n;
    public boolean o;
    public Drawable p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public final Context y;
    public final Paint z = new Paint(1);

    public ep(Context context) {
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

    public final void a(eq eqVar) {
        this.V = new WeakReference(eqVar);
    }

    public final void a() {
        eq eqVar = (eq) this.V.get();
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
        CharSequence charSequence = this.g;
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

    public final void draw(Canvas canvas) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int saveLayerAlpha;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            if (this.N < 255) {
                float f2 = (float) bounds.left;
                float f3 = (float) bounds.top;
                float f4 = (float) bounds.right;
                float f5 = (float) bounds.bottom;
                int i6 = this.N;
                if (Build.VERSION.SDK_INT > 21) {
                    saveLayerAlpha = canvas.saveLayerAlpha(f2, f3, f4, f5, i6);
                } else {
                    saveLayerAlpha = canvas.saveLayerAlpha(f2, f3, f4, f5, i6, 31);
                }
                i2 = saveLayerAlpha;
            } else {
                i2 = 0;
            }
            this.z.setColor(this.I);
            this.z.setStyle(Paint.Style.FILL);
            this.z.setColorFilter(i());
            this.G.set(bounds);
            canvas.drawRoundRect(this.G, this.c, this.c, this.z);
            if (this.e > 0.0f) {
                this.z.setColor(this.J);
                this.z.setStyle(Paint.Style.STROKE);
                this.z.setColorFilter(i());
                this.G.set(((float) bounds.left) + (this.e / 2.0f), ((float) bounds.top) + (this.e / 2.0f), ((float) bounds.right) - (this.e / 2.0f), ((float) bounds.bottom) - (this.e / 2.0f));
                float f6 = this.c - (this.e / 2.0f);
                canvas.drawRoundRect(this.G, f6, f6, this.z);
            }
            this.z.setColor(this.K);
            this.z.setStyle(Paint.Style.FILL);
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
                PointF pointF = this.H;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.g != null) {
                    float e2 = this.q + e() + this.t;
                    if (jd.e(this) == 0) {
                        pointF.x = e2 + ((float) bounds.left);
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = ((float) bounds.right) - e2;
                        align = Paint.Align.RIGHT;
                    }
                    this.E.getFontMetrics(this.F);
                    pointF.y = ((float) bounds.centerY()) - ((this.F.descent + this.F.ascent) / 2.0f);
                }
                RectF rectF = this.G;
                rectF.setEmpty();
                if (this.g != null) {
                    float e3 = this.q + e() + this.t;
                    float f11 = this.x + f() + this.u;
                    if (jd.e(this) == 0) {
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
                    fy fyVar = this.C;
                    Context context = this.y;
                    TextPaint textPaint = this.E;
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
                RectF rectF2 = this.G;
                rectF2.setEmpty();
                if (d()) {
                    float f15 = this.x + this.w;
                    if (jd.e(this) == 0) {
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

    private final void a(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (b() || c()) {
            float f2 = this.q + this.r;
            if (jd.e(this) == 0) {
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
            fy fyVar = this.C;
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
        if (!Arrays.equals(this.S, iArr)) {
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
        // Method dump skipped, instructions count: 259
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ep.a(int[], int[]):boolean");
    }

    private static boolean a(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean a(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    @TargetApi(23)
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
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
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

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.O != colorFilter) {
            this.O = colorFilter;
            invalidateSelf();
        }
    }

    public final ColorFilter getColorFilter() {
        return this.O;
    }

    @Override // defpackage.pf
    public final void setTintList(ColorStateList colorStateList) {
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.pf
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.R != mode) {
            this.R = mode;
            this.P = gm.a(this, this.Q, mode);
            invalidateSelf();
        }
    }

    public final int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public final void getOutline(Outline outline) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.c);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.c);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public static void b(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final void c(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            jd.b(drawable, jd.e(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.k) {
                if (drawable.isStateful()) {
                    drawable.setState(this.S);
                }
                jd.a(drawable, this.l);
            } else if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    private final ColorFilter i() {
        return this.O != null ? this.O : this.P;
    }

    public final void g() {
        this.U = this.T ? fz.a(this.f) : null;
    }

    public final void a(CharSequence charSequence) {
        String str;
        SpannableStringBuilder spannableStringBuilder;
        String str2;
        if (this.g != charSequence) {
            qh a2 = qh.a();
            ql qlVar = a2.f;
            if (charSequence == null) {
                spannableStringBuilder = null;
            } else {
                boolean a3 = qlVar.a(charSequence, charSequence.length());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                if ((a2.e & 2) != 0) {
                    boolean a4 = (a3 ? qm.b : qm.a).a(charSequence, charSequence.length());
                    if (!a2.d && (a4 || qh.b(charSequence) == 1)) {
                        str2 = qh.b;
                    } else if (!a2.d || (a4 && qh.b(charSequence) != -1)) {
                        str2 = "";
                    } else {
                        str2 = qh.c;
                    }
                    spannableStringBuilder2.append((CharSequence) str2);
                }
                if (a3 != a2.d) {
                    spannableStringBuilder2.append(a3 ? (char) 8235 : 8234);
                    spannableStringBuilder2.append(charSequence);
                    spannableStringBuilder2.append((char) 8236);
                } else {
                    spannableStringBuilder2.append(charSequence);
                }
                boolean a5 = (a3 ? qm.b : qm.a).a(charSequence, charSequence.length());
                if (!a2.d && (a5 || qh.a(charSequence) == 1)) {
                    str = qh.b;
                } else if (!a2.d || (a5 && qh.a(charSequence) != -1)) {
                    str = "";
                } else {
                    str = qh.c;
                }
                spannableStringBuilder2.append((CharSequence) str);
                spannableStringBuilder = spannableStringBuilder2;
            }
            this.g = spannableStringBuilder;
            this.W = true;
            invalidateSelf();
            a();
        }
    }

    public final void a(fy fyVar) {
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

    public final void d(Drawable drawable) {
        Drawable drawable2 = this.i;
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
