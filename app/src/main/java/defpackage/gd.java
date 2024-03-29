package defpackage;

/* renamed from: gd reason: default package */
/* compiled from: PG */
public final class gd extends android.graphics.drawable.Drawable implements defpackage.pf {
    public boolean a;
    public float b;
    public float c;
    public android.graphics.Paint.Style d;
    private final android.graphics.Paint e;
    private final android.graphics.Matrix[] f;
    private final android.graphics.Matrix[] g;
    private final defpackage.ge[] h;
    private final android.graphics.Matrix i;
    private final android.graphics.Path j;
    private final android.graphics.PointF k;
    private final defpackage.ge l;
    private final android.graphics.Region m;
    private final android.graphics.Region n;
    private final float[] o;
    private final float[] p;
    private defpackage.gi q;
    private int r;
    private int s;
    private int t;
    private int u;
    private float v;
    private android.graphics.PorterDuffColorFilter w;
    private android.graphics.PorterDuff.Mode x;
    private android.content.res.ColorStateList y;

    public gd() {
        this(null);
    }

    public gd(defpackage.gi giVar) {
        this.e = new android.graphics.Paint();
        this.f = new android.graphics.Matrix[4];
        this.g = new android.graphics.Matrix[4];
        this.h = new defpackage.ge[4];
        this.i = new android.graphics.Matrix();
        this.j = new android.graphics.Path();
        this.k = new android.graphics.PointF();
        this.l = new defpackage.ge();
        this.m = new android.graphics.Region();
        this.n = new android.graphics.Region();
        this.o = new float[2];
        this.p = new float[2];
        this.q = null;
        this.a = false;
        this.b = 1.0f;
        this.r = -16777216;
        this.s = 5;
        this.t = 10;
        this.u = 255;
        this.v = 1.0f;
        this.c = 0.0f;
        this.d = android.graphics.Paint.Style.FILL_AND_STROKE;
        this.x = android.graphics.PorterDuff.Mode.SRC_IN;
        this.y = null;
        this.q = giVar;
        for (int i2 = 0; i2 < 4; i2++) {
            this.f[i2] = new android.graphics.Matrix();
            this.g[i2] = new android.graphics.Matrix();
            this.h[i2] = new defpackage.ge();
        }
    }

    public final void setTintList(android.content.res.ColorStateList colorStateList) {
        this.y = colorStateList;
        a();
        invalidateSelf();
    }

    public final void setTintMode(android.graphics.PorterDuff.Mode mode) {
        this.x = mode;
        a();
        invalidateSelf();
    }

    public final void setTint(int i2) {
        setTintList(android.content.res.ColorStateList.valueOf(i2));
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i2) {
        this.u = i2;
        invalidateSelf();
    }

    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final android.graphics.Region getTransparentRegion() {
        android.graphics.Rect bounds = getBounds();
        this.m.set(bounds);
        a(bounds.width(), bounds.height(), this.j);
        this.n.setPath(this.j, this.m);
        this.m.op(this.n, android.graphics.Region.Op.DIFFERENCE);
        return this.m;
    }

    public final void a(float f2) {
        this.b = f2;
        invalidateSelf();
    }

    public final void draw(android.graphics.Canvas canvas) {
        this.e.setColorFilter(this.w);
        int alpha = this.e.getAlpha();
        android.graphics.Paint paint = this.e;
        int i2 = this.u;
        paint.setAlpha(((i2 + (i2 >>> 7)) * alpha) >>> 8);
        this.e.setStrokeWidth(this.c);
        this.e.setStyle(this.d);
        if (this.s > 0 && this.a) {
            this.e.setShadowLayer((float) this.t, 0.0f, (float) this.s, this.r);
        }
        if (this.q != null) {
            a(canvas.getWidth(), canvas.getHeight(), this.j);
            canvas.drawPath(this.j, this.e);
        } else {
            canvas.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), this.e);
        }
        this.e.setAlpha(alpha);
    }

    private static void a(int i2, int i3, int i4, android.graphics.PointF pointF) {
        switch (i2) {
            case 1:
                pointF.set((float) i3, 0.0f);
                return;
            case 2:
                pointF.set((float) i3, (float) i4);
                return;
            case 3:
                pointF.set(0.0f, (float) i4);
                return;
            default:
                pointF.set(0.0f, 0.0f);
                return;
        }
    }

    private final float a(int i2, int i3, int i4) {
        int i5 = (i2 + 1) % 4;
        a(i2, i3, i4, this.k);
        float f2 = this.k.x;
        float f3 = this.k.y;
        a(i5, i3, i4, this.k);
        return (float) java.lang.Math.atan2((double) (this.k.y - f3), (double) (this.k.x - f2));
    }

    private final void a(int i2, int i3, android.graphics.Path path) {
        defpackage.gc gcVar;
        path.rewind();
        if (this.q != null) {
            for (int i4 = 0; i4 < 4; i4++) {
                a(i4, i2, i3, this.k);
                a(((i4 - 1) + 4) % 4, i2, i3, this.k);
                float f2 = this.k.x;
                float f3 = this.k.y;
                a((i4 + 1) % 4, i2, i3, this.k);
                float f4 = this.k.x;
                float f5 = this.k.y;
                a(i4, i2, i3, this.k);
                float f6 = this.k.x;
                float f7 = this.k.y;
                float f8 = f4 - f6;
                float f9 = f5 - f7;
                java.lang.Math.atan2((double) (f3 - f7), (double) (f2 - f6));
                java.lang.Math.atan2((double) f9, (double) f8);
                switch (i4) {
                    case 1:
                        defpackage.gb gbVar = this.q.b;
                        break;
                    case 2:
                        defpackage.gb gbVar2 = this.q.c;
                        break;
                    case 3:
                        defpackage.gb gbVar3 = this.q.d;
                        break;
                    default:
                        defpackage.gb gbVar4 = this.q.a;
                        break;
                }
                float a2 = a(((i4 - 1) + 4) % 4, i2, i3) + 1.5707964f;
                this.f[i4].reset();
                this.f[i4].setTranslate(this.k.x, this.k.y);
                this.f[i4].preRotate((float) java.lang.Math.toDegrees((double) a2));
                this.o[0] = this.h[i4].a;
                this.o[1] = this.h[i4].b;
                this.f[i4].mapPoints(this.o);
                float a3 = a(i4, i2, i3);
                this.g[i4].reset();
                this.g[i4].setTranslate(this.o[0], this.o[1]);
                this.g[i4].preRotate((float) java.lang.Math.toDegrees((double) a3));
            }
            int i5 = 0;
            while (true) {
                int i6 = i5;
                if (i6 < 4) {
                    this.o[0] = 0.0f;
                    this.o[1] = 0.0f;
                    this.f[i6].mapPoints(this.o);
                    if (i6 == 0) {
                        path.moveTo(this.o[0], this.o[1]);
                    } else {
                        path.lineTo(this.o[0], this.o[1]);
                    }
                    this.h[i6].a(this.f[i6], path);
                    int i7 = (i6 + 1) % 4;
                    this.o[0] = this.h[i6].a;
                    this.o[1] = this.h[i6].b;
                    this.f[i6].mapPoints(this.o);
                    this.p[0] = 0.0f;
                    this.p[1] = 0.0f;
                    this.f[i7].mapPoints(this.p);
                    float hypot = (float) java.lang.Math.hypot((double) (this.o[0] - this.p[0]), (double) (this.o[1] - this.p[1]));
                    this.l.a();
                    switch (i6) {
                        case 1:
                            gcVar = this.q.f;
                            break;
                        case 2:
                            gcVar = this.q.g;
                            break;
                        case 3:
                            gcVar = this.q.h;
                            break;
                        default:
                            gcVar = this.q.e;
                            break;
                    }
                    gcVar.a(hypot, this.b, this.l);
                    this.l.a(this.g[i6], path);
                    i5 = i6 + 1;
                } else {
                    path.close();
                }
            }
        }
        if (this.v != 1.0f) {
            this.i.reset();
            this.i.setScale(this.v, this.v, (float) (i2 / 2), (float) (i3 / 2));
            path.transform(this.i);
        }
    }

    private final void a() {
        if (this.y == null || this.x == null) {
            this.w = null;
        } else {
            this.w = new android.graphics.PorterDuffColorFilter(this.y.getColorForState(getState(), 0), this.x);
        }
    }
}
