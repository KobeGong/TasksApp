package defpackage;

/* renamed from: gf reason: default package */
/* compiled from: PG */
public final class gf extends defpackage.gh {
    private static final android.graphics.RectF d = new android.graphics.RectF();
    public float a;
    public float b;
    private float e;
    private float f;
    private float g;
    private float h;

    public gf(float f2, float f3, float f4, float f5) {
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = f5;
    }

    public final void a(android.graphics.Matrix matrix, android.graphics.Path path) {
        android.graphics.Matrix matrix2 = this.c;
        matrix.invert(matrix2);
        path.transform(matrix2);
        d.set(this.e, this.f, this.g, this.h);
        path.arcTo(d, this.a, this.b, false);
        path.transform(matrix);
    }
}
