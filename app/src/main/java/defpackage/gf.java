package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: gf  reason: default package */
/* compiled from: PG */
public final class gf extends gh {
    private static final RectF d = new RectF();
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

    @Override // defpackage.gh
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.c;
        matrix.invert(matrix2);
        path.transform(matrix2);
        d.set(this.e, this.f, this.g, this.h);
        path.arcTo(d, this.a, this.b, false);
        path.transform(matrix);
    }
}
