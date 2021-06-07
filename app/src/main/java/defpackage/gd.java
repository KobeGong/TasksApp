package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: gd  reason: default package */
/* compiled from: PG */
public final class gd extends Drawable implements pf {
    public boolean a;
    public float b;
    public float c;
    public Paint.Style d;
    private final Paint e;
    private final Matrix[] f;
    private final Matrix[] g;
    private final ge[] h;
    private final Matrix i;
    private final Path j;
    private final PointF k;
    private final ge l;
    private final Region m;
    private final Region n;
    private final float[] o;
    private final float[] p;
    private gi q;
    private int r;
    private int s;
    private int t;
    private int u;
    private float v;
    private PorterDuffColorFilter w;
    private PorterDuff.Mode x;
    private ColorStateList y;

    public gd() {
        this(null);
    }

    public gd(gi giVar) {
        this.e = new Paint();
        this.f = new Matrix[4];
        this.g = new Matrix[4];
        this.h = new ge[4];
        this.i = new Matrix();
        this.j = new Path();
        this.k = new PointF();
        this.l = new ge();
        this.m = new Region();
        this.n = new Region();
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
        this.d = Paint.Style.FILL_AND_STROKE;
        this.x = PorterDuff.Mode.SRC_IN;
        this.y = null;
        this.q = giVar;
        for (int i2 = 0; i2 < 4; i2++) {
            this.f[i2] = new Matrix();
            this.g[i2] = new Matrix();
            this.h[i2] = new ge();
        }
    }

    @Override // defpackage.pf
    public final void setTintList(ColorStateList colorStateList) {
        this.y = colorStateList;
        a();
        invalidateSelf();
    }

    @Override // defpackage.pf
    public final void setTintMode(PorterDuff.Mode mode) {
        this.x = mode;
        a();
        invalidateSelf();
    }

    @Override // defpackage.pf
    public final void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i2) {
        this.u = i2;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        this.m.set(bounds);
        a(bounds.width(), bounds.height(), this.j);
        this.n.setPath(this.j, this.m);
        this.m.op(this.n, Region.Op.DIFFERENCE);
        return this.m;
    }

    public final void a(float f2) {
        this.b = f2;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        this.e.setColorFilter(this.w);
        int alpha = this.e.getAlpha();
        Paint paint = this.e;
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

    private static void a(int i2, int i3, int i4, PointF pointF) {
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
        a(i2, i3, i4, this.k);
        float f2 = this.k.x;
        float f3 = this.k.y;
        a((i2 + 1) % 4, i3, i4, this.k);
        return (float) Math.atan2((double) (this.k.y - f3), (double) (this.k.x - f2));
    }

    private final void a(int i2, int i3, Path path) {
        gc gcVar;
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
                Math.atan2((double) (f3 - f7), (double) (f2 - f6));
                Math.atan2((double) (f5 - f7), (double) (f4 - f6));
                switch (i4) {
                    case 1:
                        gb gbVar = this.q.b;
                        break;
                    case 2:
                        gb gbVar2 = this.q.c;
                        break;
                    case 3:
                        gb gbVar3 = this.q.d;
                        break;
                    default:
                        gb gbVar4 = this.q.a;
                        break;
                }
                this.f[i4].reset();
                this.f[i4].setTranslate(this.k.x, this.k.y);
                this.f[i4].preRotate((float) Math.toDegrees((double) (a(((i4 - 1) + 4) % 4, i2, i3) + 1.5707964f)));
                this.o[0] = this.h[i4].a;
                this.o[1] = this.h[i4].b;
                this.f[i4].mapPoints(this.o);
                float a2 = a(i4, i2, i3);
                this.g[i4].reset();
                this.g[i4].setTranslate(this.o[0], this.o[1]);
                this.g[i4].preRotate((float) Math.toDegrees((double) a2));
            }
            for (int i5 = 0; i5 < 4; i5++) {
                this.o[0] = 0.0f;
                this.o[1] = 0.0f;
                this.f[i5].mapPoints(this.o);
                if (i5 == 0) {
                    path.moveTo(this.o[0], this.o[1]);
                } else {
                    path.lineTo(this.o[0], this.o[1]);
                }
                this.h[i5].a(this.f[i5], path);
                this.o[0] = this.h[i5].a;
                this.o[1] = this.h[i5].b;
                this.f[i5].mapPoints(this.o);
                this.p[0] = 0.0f;
                this.p[1] = 0.0f;
                this.f[(i5 + 1) % 4].mapPoints(this.p);
                float hypot = (float) Math.hypot((double) (this.o[0] - this.p[0]), (double) (this.o[1] - this.p[1]));
                this.l.a();
                switch (i5) {
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
                this.l.a(this.g[i5], path);
            }
            path.close();
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
            this.w = new PorterDuffColorFilter(this.y.getColorForState(getState(), 0), this.x);
        }
    }
}
