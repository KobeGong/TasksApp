package defpackage;

/* renamed from: ew reason: default package */
/* compiled from: PG */
public final class ew {
    private static final boolean x = (android.os.Build.VERSION.SDK_INT < 18);
    private float A = 15.0f;
    private float B = 15.0f;
    private float C;
    private float D;
    private float E;
    private float F;
    private android.graphics.Typeface G;
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
    public final android.graphics.Rect c;
    public final android.graphics.Rect d;
    public int e = 16;
    public int f = 16;
    public android.content.res.ColorStateList g;
    public android.content.res.ColorStateList h;
    public float i;
    public float j;
    public android.graphics.Typeface k;
    public android.graphics.Typeface l;
    public java.lang.CharSequence m;
    public java.lang.CharSequence n;
    public boolean o;
    public android.graphics.Bitmap p;
    public android.graphics.Paint q;
    public float r;
    public float s;
    public int[] t;
    public boolean u;
    public final android.text.TextPaint v;
    public android.animation.TimeInterpolator w;
    private final android.view.View y;
    private final android.graphics.RectF z;

    public ew(android.view.View view) {
        this.y = view;
        this.v = new android.text.TextPaint(129);
        new android.text.TextPaint(this.v);
        this.d = new android.graphics.Rect();
        this.c = new android.graphics.Rect();
        this.z = new android.graphics.RectF();
    }

    public final void a() {
        this.a = this.d.width() > 0 && this.d.height() > 0 && this.c.width() > 0 && this.c.height() > 0;
    }

    public final void a(int i2) {
        defpackage.agw a2 = defpackage.agw.a(this.y.getContext(), i2, defpackage.xu.cl);
        if (a2.f(defpackage.xu.cr)) {
            this.h = a2.e(defpackage.xu.cr);
        }
        if (a2.f(defpackage.xu.cu)) {
            this.B = (float) a2.e(defpackage.xu.cu, (int) this.B);
        }
        this.N = a2.a(defpackage.xu.cn, 0);
        this.L = a2.a(defpackage.xu.co, 0.0f);
        this.M = a2.a(defpackage.xu.cp, 0.0f);
        this.K = a2.a(defpackage.xu.cq, 0.0f);
        a2.b.recycle();
        this.k = c(i2);
        c();
    }

    public final void b(int i2) {
        defpackage.agw a2 = defpackage.agw.a(this.y.getContext(), i2, defpackage.xu.cl);
        if (a2.f(defpackage.xu.cr)) {
            this.g = a2.e(defpackage.xu.cr);
        }
        if (a2.f(defpackage.xu.cu)) {
            this.A = (float) a2.e(defpackage.xu.cu, (int) this.A);
        }
        this.R = a2.a(defpackage.xu.cn, 0);
        this.P = a2.a(defpackage.xu.co, 0.0f);
        this.Q = a2.a(defpackage.xu.cp, 0.0f);
        this.O = a2.a(defpackage.xu.cq, 0.0f);
        a2.b.recycle();
        this.l = c(i2);
        c();
    }

    private final android.graphics.Typeface c(int i2) {
        android.content.res.TypedArray obtainStyledAttributes = this.y.getContext().obtainStyledAttributes(i2, new int[]{16843692});
        try {
            java.lang.String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                return android.graphics.Typeface.create(string, 0);
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
            android.text.TextPaint textPaint = this.v;
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
        ViewCompat.a.c(this.y);
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
        if (this.o && this.p == null && !this.c.isEmpty() && !android.text.TextUtils.isEmpty(this.n)) {
            a(0.0f);
            this.r = this.v.ascent();
            this.I = this.v.descent();
            int round = java.lang.Math.round(this.v.measureText(this.n, 0, this.n.length()));
            int round2 = java.lang.Math.round(this.I - this.r);
            if (round > 0 && round2 > 0) {
                this.p = android.graphics.Bitmap.createBitmap(round, round2, android.graphics.Bitmap.Config.ARGB_8888);
                new android.graphics.Canvas(this.p).drawText(this.n, 0, this.n.length(), 0.0f, ((float) round2) - this.v.descent(), this.v);
                if (this.q == null) {
                    this.q = new android.graphics.Paint(3);
                }
            }
        }
        ViewCompat.a.c(this.y);
    }

    private final void c(float f2) {
        float f3;
        boolean z2;
        boolean z3;
        defpackage.ql qlVar;
        boolean z4 = false;
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
                width = width2 * f4 > width ? java.lang.Math.min(width / f4, width2) : width2;
            }
            if (width > 0.0f) {
                if (this.J != f3 || this.u || z3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.J = f3;
                this.u = false;
            }
            if (this.n == null || z3) {
                this.v.setTextSize(this.J);
                this.v.setTypeface(this.G);
                android.text.TextPaint textPaint = this.v;
                if (this.s != 1.0f) {
                    z4 = true;
                }
                textPaint.setLinearText(z4);
                java.lang.CharSequence ellipsize = android.text.TextUtils.ellipsize(this.m, this.v, width, android.text.TextUtils.TruncateAt.END);
                if (!android.text.TextUtils.equals(ellipsize, this.n)) {
                    this.n = ellipsize;
                    java.lang.CharSequence charSequence = this.n;
                    if (ViewCompat.a.j(this.y) == 1) {
                        qlVar = defpackage.qm.d;
                    } else {
                        qlVar = defpackage.qm.c;
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
            float f4 = this.n != null ? this.v.measureText(this.n, 0, this.n.length()) : 0.0f;
            int i4 = this.f;
            if (this.H) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            int a2 = defpackage.jd.a(i4, i2);
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
                    this.F = ((float) this.d.centerX()) - (f4 / 2.0f);
                    break;
                case 5:
                    this.F = ((float) this.d.right) - f4;
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
            int a3 = defpackage.jd.a(i5, i3);
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

    public final void a(java.lang.CharSequence charSequence) {
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
        return java.lang.Math.abs(f2 - f3) < 0.001f;
    }

    private static int a(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return android.graphics.Color.argb((int) ((((float) android.graphics.Color.alpha(i2)) * f3) + (((float) android.graphics.Color.alpha(i3)) * f2)), (int) ((((float) android.graphics.Color.red(i2)) * f3) + (((float) android.graphics.Color.red(i3)) * f2)), (int) ((((float) android.graphics.Color.green(i2)) * f3) + (((float) android.graphics.Color.green(i3)) * f2)), (int) ((f3 * ((float) android.graphics.Color.blue(i2))) + (((float) android.graphics.Color.blue(i3)) * f2)));
    }

    private static float a(float f2, float f3, float f4, android.animation.TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return defpackage.cs.a(f2, f3, f4);
    }

    public static boolean a(android.graphics.Rect rect, int i2, int i3, int i4, int i5) {
        return rect.left == i2 && rect.top == i3 && rect.right == i4 && rect.bottom == i5;
    }
}
