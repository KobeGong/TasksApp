package defpackage;

/* renamed from: vz reason: default package */
/* compiled from: PG */
public final class vz {
    private static final java.lang.ThreadLocal a = new java.lang.ThreadLocal();
    private static final java.lang.ThreadLocal b = new java.lang.ThreadLocal();

    public static void a(android.view.ViewGroup viewGroup, android.view.View view, android.graphics.Rect rect) {
        android.graphics.Matrix matrix;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        android.graphics.Matrix matrix2 = (android.graphics.Matrix) a.get();
        if (matrix2 == null) {
            android.graphics.Matrix matrix3 = new android.graphics.Matrix();
            a.set(matrix3);
            matrix = matrix3;
        } else {
            matrix2.reset();
            matrix = matrix2;
        }
        a((android.view.ViewParent) viewGroup, view, matrix);
        android.graphics.RectF rectF = (android.graphics.RectF) b.get();
        if (rectF == null) {
            rectF = new android.graphics.RectF();
            b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    private static void a(android.view.ViewParent viewParent, android.view.View view, android.graphics.Matrix matrix) {
        android.view.ViewParent parent = view.getParent();
        if ((parent instanceof android.view.View) && parent != viewParent) {
            android.view.View view2 = (android.view.View) parent;
            a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
