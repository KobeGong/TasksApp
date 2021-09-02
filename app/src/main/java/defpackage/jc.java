package defpackage;

/* renamed from: jc reason: default package */
/* compiled from: PG */
final class jc implements android.animation.TypeEvaluator {
    jc() {
    }

    public final /* synthetic */ java.lang.Object evaluate(float f, java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Rect rect = (android.graphics.Rect) obj;
        android.graphics.Rect rect2 = (android.graphics.Rect) obj2;
        return new android.graphics.Rect(rect.left + ((int) (((float) (rect2.left - rect.left)) * f)), rect.top + ((int) (((float) (rect2.top - rect.top)) * f)), rect.right + ((int) (((float) (rect2.right - rect.right)) * f)), rect.bottom + ((int) (((float) (rect2.bottom - rect.bottom)) * f)));
    }
}
