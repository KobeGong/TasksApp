package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: gg  reason: default package */
/* compiled from: PG */
public final class gg extends gh {
    public float a;

    @Override // defpackage.gh
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.c;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.a, 0.0f);
        path.transform(matrix);
    }
}
