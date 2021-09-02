package defpackage;

/* renamed from: hu reason: default package */
/* compiled from: PG */
final class hu {
    public static final android.graphics.Matrix a = new android.graphics.Matrix();
    public android.graphics.Paint b;
    public android.graphics.Paint c;
    public final defpackage.hs d;
    public float e;
    public float f;
    public float g;
    public float h;
    public java.lang.String i;
    public final defpackage.qr j;
    private final android.graphics.Path k;
    private final android.graphics.Path l;
    private final android.graphics.Matrix m;
    private android.graphics.PathMeasure n;
    private int o;
    private int p;

    public hu() {
        this.m = new android.graphics.Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.p = 255;
        this.i = null;
        this.j = new defpackage.qr();
        this.d = new defpackage.hs();
        this.k = new android.graphics.Path();
        this.l = new android.graphics.Path();
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

    public hu(defpackage.hu huVar) {
        this.m = new android.graphics.Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.p = 255;
        this.i = null;
        this.j = new defpackage.qr();
        this.d = new defpackage.hs(huVar.d, this.j);
        this.k = new android.graphics.Path(huVar.k);
        this.l = new android.graphics.Path(huVar.l);
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

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.hs hsVar, android.graphics.Matrix matrix, android.graphics.Canvas canvas, int i2, int i3, android.graphics.ColorFilter colorFilter) {
        float f2;
        hsVar.a.set(matrix);
        hsVar.a.preConcat(hsVar.j);
        canvas.save();
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 < hsVar.b.size()) {
                java.lang.Object obj = hsVar.b.get(i5);
                if (obj instanceof defpackage.hs) {
                    a((defpackage.hs) obj, hsVar.a, canvas, i2, i3, colorFilter);
                } else if (obj instanceof defpackage.ht) {
                    defpackage.ht htVar = (defpackage.ht) obj;
                    float f3 = ((float) i2) / this.g;
                    float f4 = ((float) i3) / this.h;
                    float min = java.lang.Math.min(f3, f4);
                    android.graphics.Matrix matrix2 = hsVar.a;
                    this.m.set(matrix2);
                    this.m.postScale(f3, f4);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float f5 = (fArr[3] * fArr[0]) - (fArr[1] * fArr[2]);
                    float max = java.lang.Math.max((float) java.lang.Math.hypot((double) fArr[0], (double) fArr[1]), (float) java.lang.Math.hypot((double) fArr[2], (double) fArr[3]));
                    if (max > 0.0f) {
                        f2 = java.lang.Math.abs(f5) / max;
                    } else {
                        f2 = 0.0f;
                    }
                    if (f2 != 0.0f) {
                        android.graphics.Path path = this.k;
                        path.reset();
                        if (htVar.n != null) {
                            defpackage.ou.a(htVar.n, path);
                        }
                        android.graphics.Path path2 = this.k;
                        this.l.reset();
                        if (htVar.a()) {
                            this.l.addPath(path2, this.m);
                            canvas.clipPath(this.l);
                        } else {
                            defpackage.hr hrVar = (defpackage.hr) htVar;
                            if (!(hrVar.h == 0.0f && hrVar.i == 1.0f)) {
                                float f6 = (hrVar.h + hrVar.j) % 1.0f;
                                float f7 = (hrVar.i + hrVar.j) % 1.0f;
                                if (this.n == null) {
                                    this.n = new android.graphics.PathMeasure();
                                }
                                this.n.setPath(this.k, false);
                                float length = this.n.getLength();
                                float f8 = f6 * length;
                                float f9 = f7 * length;
                                path2.reset();
                                if (f8 > f9) {
                                    this.n.getSegment(f8, length, path2, true);
                                    this.n.getSegment(0.0f, f9, path2, true);
                                } else {
                                    this.n.getSegment(f8, f9, path2, true);
                                }
                                path2.rLineTo(0.0f, 0.0f);
                            }
                            this.l.addPath(path2, this.m);
                            if (hrVar.d != 0) {
                                if (this.c == null) {
                                    this.c = new android.graphics.Paint();
                                    this.c.setStyle(android.graphics.Paint.Style.FILL);
                                    this.c.setAntiAlias(true);
                                }
                                android.graphics.Paint paint = this.c;
                                paint.setColor(defpackage.hp.a(hrVar.d, hrVar.g));
                                paint.setColorFilter(colorFilter);
                                this.l.setFillType(hrVar.f == 0 ? android.graphics.Path.FillType.WINDING : android.graphics.Path.FillType.EVEN_ODD);
                                canvas.drawPath(this.l, paint);
                            }
                            if (hrVar.b != 0) {
                                if (this.b == null) {
                                    this.b = new android.graphics.Paint();
                                    this.b.setStyle(android.graphics.Paint.Style.STROKE);
                                    this.b.setAntiAlias(true);
                                }
                                android.graphics.Paint paint2 = this.b;
                                if (hrVar.l != null) {
                                    paint2.setStrokeJoin(hrVar.l);
                                }
                                if (hrVar.k != null) {
                                    paint2.setStrokeCap(hrVar.k);
                                }
                                paint2.setStrokeMiter(hrVar.m);
                                paint2.setColor(defpackage.hp.a(hrVar.b, hrVar.e));
                                paint2.setColorFilter(colorFilter);
                                paint2.setStrokeWidth(hrVar.c * f2 * min);
                                canvas.drawPath(this.l, paint2);
                            }
                        }
                    }
                }
                i4 = i5 + 1;
            } else {
                canvas.restore();
                return;
            }
        }
    }
}
