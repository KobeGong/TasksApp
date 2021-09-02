package defpackage;

/* renamed from: gg reason: default package */
/* compiled from: PG */
public final class gg extends defpackage.gh {
    public float a;

    public final void a(android.graphics.Matrix matrix, android.graphics.Path path) {
        android.graphics.Matrix matrix2 = this.c;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.a, 0.0f);
        path.transform(matrix);
    }
}
