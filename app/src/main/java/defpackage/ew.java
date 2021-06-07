package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;

/* renamed from: ew  reason: default package */
/* compiled from: PG */
public final class ew {
    private static final boolean x = (Build.VERSION.SDK_INT < 18);
    private float A = 15.0f;
    private float B = 15.0f;
    private float C;
    private float D;
    private float E;
    private float F;
    private Typeface G;
    private boolean H;
    private float I;
    private float J;
    private float K;
    private float L;
    private float M;
    private int N;
    private float O;
    private float P;
    private float Q;
    private int R;
    public boolean a;
    public float b;
    public final Rect c;
    public final Rect d;
    public int e = 16;
    public int f = 16;
    public ColorStateList g;
    public ColorStateList h;
    public float i;
    public float j;
    public Typeface k;
    public Typeface l;
    public CharSequence m;
    public CharSequence n;
    public boolean o;
    public Bitmap p;
    public Paint q;
    public float r;
    public float s;
    public int[] t;
    public boolean u;
    public final TextPaint v;
    public TimeInterpolator w;
    private final View y;
    private final RectF z;

    public ew(View view) {
        this.y = view;
        this.v = new TextPaint(129);
        new TextPaint(this.v);
        this.d = new Rect();
        this.c = new Rect();
        this.z = new RectF();
    }

    public final void a() {
        this.a = this.d.width() > 0 && this.d.height() > 0 && this.c.width() > 0 && this.c.height() > 0;
    }

    public final void a(int i2) {
        agw a2 = agw.a(this.y.getContext(), i2, xu.cl);
        if (a2.f(xu.cr)) {
            this.h = a2.e(xu.cr);
        }
        if (a2.f(xu.cu)) {
            this.B = (float) a2.e(xu.cu, (int) this.B);
        }
        this.N = a2.a(xu.cn, 0);
        this.L = a2.a(xu.co, 0.0f);
        this.M = a2.a(xu.cp, 0.0f);
        this.K = a2.a(xu.cq, 0.0f);
        a2.b.recycle();
        this.k = c(i2);
        c();
    }

    public final void b(int i2) {
        agw a2 = agw.a(this.y.getContext(), i2, xu.cl);
        if (a2.f(xu.cr)) {
            this.g = a2.e(xu.cr);
        }
        if (a2.f(xu.cu)) {
            this.A = (float) a2.e(xu.cu, (int) this.A);
        }
        this.R = a2.a(xu.cn, 0);
        this.P = a2.a(xu.co, 0.0f);
        this.Q = a2.a(xu.cp, 0.0f);
        this.O = a2.a(xu.cq, 0.0f);
        a2.b.recycle();
        this.l = c(i2);
        c();
    }

    private final Typeface c(int i2) {
        TypedArray obtainStyledAttributes = this.y.getContext().obtainStyledAttributes(i2, new int[]{16843692});
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                return Typeface.create(string, 0);
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void b() {
        a(this.b);
    }

    private final void a(float f2) {
        int defaultColor;
        this.z.left = a((float) this.c.left, (float) this.d.left, f2, null);
        this.z.top = a(this.C, this.D, f2, null);
        this.z.right = a((float) this.c.right, (float) this.d.right, f2, null);
        this.z.bottom = a((float) this.c.bottom, (float) this.d.bottom, f2, null);
        this.i = a(this.E, this.F, f2, null);
        this.j = a(this.C, this.D, f2, null);
        b(a(this.A, this.B, f2, this.w));
        if (this.h != this.g) {
            TextPaint textPaint = this.v;
            if (this.t != null) {
                defaultColor = this.g.getColorForState(this.t, 0);
            } else {
                defaultColor = this.g.getDefaultColor();
            }
            textPaint.setColor(a(defaultColor, d(), f2));
        } else {
            this.v.setColor(d());
        }
        this.v.setShadowLayer(a(this.O, this.K, f2, null), a(this.P, this.L, f2, null), a(this.Q, this.M, f2, null), a(this.R, this.N, f2));
        sn.a.c(this.y);
    }

    private final int d() {
        if (this.t != null) {
            return this.h.getColorForState(this.t, 0);
        }
        return this.h.getDefaultColor();
    }

    private final void b(float f2) {
        c(f2);
        this.o = x && this.s != 1.0f;
        if (this.o && this.p == null && !this.c.isEmpty() && !TextUtils.isEmpty(this.n)) {
            a(0.0f);
            this.r = this.v.ascent();
            this.I = this.v.descent();
            int round = Math.round(this.v.measureText(this.n, 0, this.n.length()));
            int round2 = Math.round(this.I - this.r);
            if (round > 0 && round2 > 0) {
                this.p = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                new Canvas(this.p).drawText(this.n, 0, this.n.length(), 0.0f, ((float) round2) - this.v.descent(), this.v);
                if (this.q == null) {
                    this.q = new Paint(3);
                }
            }
        }
        sn.a.c(this.y);
    }

    private final void c(float f2) {
        float f3;
        boolean z2;
        ql qlVar;
        boolean z3 = false;
        if (this.m != null) {
            float width = (float) this.d.width();
            float width2 = (float) this.c.width();
            if (a(f2, this.B)) {
                f3 = this.B;
                this.s = 1.0f;
                if (this.G != this.k) {
                    this.G = this.k;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                f3 = this.A;
                if (this.G != this.l) {
                    this.G = this.l;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (a(f2, this.A)) {
                    this.s = 1.0f;
                } else {
                    this.s = f2 / this.A;
                }
                float f4 = this.B / this.A;
                width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
            }
            if (width > 0.0f) {
                if (this.J != f3 || this.u || z2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.J = f3;
                this.u = false;
            }
            if (this.n == null || z2) {
                this.v.setTextSize(this.J);
                this.v.setTypeface(this.G);
                TextPaint textPaint = this.v;
                if (this.s != 1.0f) {
                    z3 = true;
                }
                textPaint.setLinearText(z3);
                CharSequence ellipsize = TextUtils.ellipsize(this.m, this.v, width, TextUtils.TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.n)) {
                    this.n = ellipsize;
                    CharSequence charSequence = this.n;
                    if (sn.a.j(this.y) == 1) {
                        qlVar = qm.d;
                    } else {
                        qlVar = qm.c;
                    }
                    this.H = qlVar.a(charSequence, charSequence.length());
                }
            }
        }
    }

    public final void c() {
        int i2;
        int i3 = 1;
        float f2 = 0.0f;
        if (this.y.getHeight() > 0 && this.y.getWidth() > 0) {
            float f3 = this.J;
            c(this.B);
            float measureText = this.n != null ? this.v.measureText(this.n, 0, this.n.length()) : 0.0f;
            int i4 = this.f;
            if (this.H) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            int a2 = jd.a(i4, i2);
            switch (a2 & 112) {
                case 48:
                    this.D = ((float) this.d.top) - this.v.ascent();
                    break;
                case 80:
                    this.D = (float) this.d.bottom;
                    break;
                default:
                    this.D = (((this.v.descent() - this.v.ascent()) / 2.0f) - this.v.descent()) + ((float) this.d.centerY());
                    break;
            }
            switch (a2 & 8388615) {
                case 1:
                    this.F = ((float) this.d.centerX()) - (measureText / 2.0f);
                    break;
                case 5:
                    this.F = ((float) this.d.right) - measureText;
                    break;
                default:
                    this.F = (float) this.d.left;
                    break;
            }
            c(this.A);
            if (this.n != null) {
                f2 = this.v.measureText(this.n, 0, this.n.length());
            }
            int i5 = this.e;
            if (!this.H) {
                i3 = 0;
            }
            int a3 = jd.a(i5, i3);
            switch (a3 & 112) {
                case 48:
                    this.C = ((float) this.c.top) - this.v.ascent();
                    break;
                case 80:
                    this.C = (float) this.c.bottom;
                    break;
                default:
                    this.C = (((this.v.descent() - this.v.ascent()) / 2.0f) - this.v.descent()) + ((float) this.c.centerY());
                    break;
            }
            switch (a3 & 8388615) {
                case 1:
                    this.E = ((float) this.c.centerX()) - (f2 / 2.0f);
                    break;
                case 5:
                    this.E = ((float) this.c.right) - f2;
                    break;
                default:
                    this.E = (float) this.c.left;
                    break;
            }
            e();
            b(f3);
            b();
        }
    }

    public final void a(CharSequence charSequence) {
        if (charSequence == null || !charSequence.equals(this.m)) {
            this.m = charSequence;
            this.n = null;
            e();
            c();
        }
    }

    private final void e() {
        if (this.p != null) {
            this.p.recycle();
            this.p = null;
        }
    }

    private static boolean a(float f2, float f3) {
        return Math.abs(f2 - f3) < 0.001f;
    }

    private static int a(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((((float) Color.alpha(i2)) * f3) + (((float) Color.alpha(i3)) * f2)), (int) ((((float) Color.red(i2)) * f3) + (((float) Color.red(i3)) * f2)), (int) ((((float) Color.green(i2)) * f3) + (((float) Color.green(i3)) * f2)), (int) ((f3 * ((float) Color.blue(i2))) + (((float) Color.blue(i3)) * f2)));
    }

    private static float a(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return cs.a(f2, f3, f4);
    }

    public static boolean a(Rect rect, int i2, int i3, int i4, int i5) {
        return rect.left == i2 && rect.top == i3 && rect.right == i4 && rect.bottom == i5;
    }
}
