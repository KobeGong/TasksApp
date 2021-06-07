package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;

/* access modifiers changed from: package-private */
/* renamed from: hu  reason: default package */
/* compiled from: PG */
public final class hu {
    public static final Matrix a = new Matrix();
    public Paint b;
    public Paint c;
    public final hs d;
    public float e;
    public float f;
    public float g;
    public float h;
    public String i;
    public final qr j;
    private final Path k;
    private final Path l;
    private final Matrix m;
    private PathMeasure n;
    private int o;
    private int p;

    public hu() {
        this.m = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.p = 255;
        this.i = null;
        this.j = new qr();
        this.d = new hs();
        this.k = new Path();
        this.l = new Path();
    }

    public final void setRootAlpha(int i2) {
        this.p = i2;
    }

    public final int getRootAlpha() {
        return this.p;
    }

    public final void setAlpha(float f2) {
        setRootAlpha((int) (255.0f * f2));
    }

    public final float getAlpha() {
        return ((float) getRootAlpha()) / 255.0f;
    }

    public hu(hu huVar) {
        this.m = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.p = 255;
        this.i = null;
        this.j = new qr();
        this.d = new hs(huVar.d, this.j);
        this.k = new Path(huVar.k);
        this.l = new Path(huVar.l);
        this.e = huVar.e;
        this.f = huVar.f;
        this.g = huVar.g;
        this.h = huVar.h;
        this.o = huVar.o;
        this.p = huVar.p;
        this.i = huVar.i;
        if (huVar.i != null) {
            this.j.put(huVar.i, this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(hs hsVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
        hsVar.a.set(matrix);
        hsVar.a.preConcat(hsVar.j);
        canvas.save();
        for (int i4 = 0; i4 < hsVar.b.size(); i4++) {
            Object obj = hsVar.b.get(i4);
            if (obj instanceof hs) {
                a((hs) obj, hsVar.a, canvas, i2, i3, colorFilter);
            } else if (obj instanceof ht) {
                ht htVar = (ht) obj;
                float f2 = ((float) i2) / this.g;
                float f3 = ((float) i3) / this.h;
                float min = Math.min(f2, f3);
                Matrix matrix2 = hsVar.a;
                this.m.set(matrix2);
                this.m.postScale(f2, f3);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                float f4 = (fArr[3] * fArr[0]) - (fArr[1] * fArr[2]);
                float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
                float abs = max > 0.0f ? Math.abs(f4) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.k;
                    path.reset();
                    if (htVar.n != null) {
                        ou.a(htVar.n, path);
                    }
                    Path path2 = this.k;
                    this.l.reset();
                    if (htVar.a()) {
                        this.l.addPath(path2, this.m);
                        canvas.clipPath(this.l);
                    } else {
                        hr hrVar = (hr) htVar;
                        if (!(hrVar.h == 0.0f && hrVar.i == 1.0f)) {
                            float f5 = (hrVar.h + hrVar.j) % 1.0f;
                            float f6 = (hrVar.i + hrVar.j) % 1.0f;
                            if (this.n == null) {
                                this.n = new PathMeasure();
                            }
                            this.n.setPath(this.k, false);
                            float length = this.n.getLength();
                            float f7 = f5 * length;
                            float f8 = f6 * length;
                            path2.reset();
                            if (f7 > f8) {
                                this.n.getSegment(f7, length, path2, true);
                                this.n.getSegment(0.0f, f8, path2, true);
                            } else {
                                this.n.getSegment(f7, f8, path2, true);
                            }
                            path2.rLineTo(0.0f, 0.0f);
                        }
                        this.l.addPath(path2, this.m);
                        if (hrVar.d != 0) {
                            if (this.c == null) {
                                this.c = new Paint();
                                this.c.setStyle(Paint.Style.FILL);
                                this.c.setAntiAlias(true);
                            }
                            Paint paint = this.c;
                            paint.setColor(hp.a(hrVar.d, hrVar.g));
                            paint.setColorFilter(colorFilter);
                            this.l.setFillType(hrVar.f == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(this.l, paint);
                        }
                        if (hrVar.b != 0) {
                            if (this.b == null) {
                                this.b = new Paint();
                                this.b.setStyle(Paint.Style.STROKE);
                                this.b.setAntiAlias(true);
                            }
                            Paint paint2 = this.b;
                            if (hrVar.l != null) {
                                paint2.setStrokeJoin(hrVar.l);
                            }
                            if (hrVar.k != null) {
                                paint2.setStrokeCap(hrVar.k);
                            }
                            paint2.setStrokeMiter(hrVar.m);
                            paint2.setColor(hp.a(hrVar.b, hrVar.e));
                            paint2.setColorFilter(colorFilter);
                            paint2.setStrokeWidth(hrVar.c * abs * min);
                            canvas.drawPath(this.l, paint2);
                        }
                    }
                }
            }
        }
        canvas.restore();
    }
}
