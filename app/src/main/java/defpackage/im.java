package defpackage;

/* renamed from: im reason: default package */
/* compiled from: PG */
final class im extends android.util.Property {
    im(java.lang.Class cls, java.lang.String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return null;
    }

    public final /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View view = (android.view.View) obj;
        android.graphics.PointF pointF = (android.graphics.PointF) obj2;
        int round = java.lang.Math.round(pointF.x);
        int round2 = java.lang.Math.round(pointF.y);
        defpackage.kb.a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
    }
}
