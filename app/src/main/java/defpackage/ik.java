package defpackage;

/* renamed from: ik reason: default package */
/* compiled from: PG */
final class ik extends android.util.Property {
    ik(java.lang.Class cls, java.lang.String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return null;
    }

    public final /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View view = (android.view.View) obj;
        android.graphics.PointF pointF = (android.graphics.PointF) obj2;
        defpackage.kb.a(view, view.getLeft(), view.getTop(), java.lang.Math.round(pointF.x), java.lang.Math.round(pointF.y));
    }
}
