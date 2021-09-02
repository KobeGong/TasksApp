package defpackage;

/* renamed from: ii reason: default package */
/* compiled from: PG */
final class ii extends android.util.Property {
    ii(java.lang.Class cls, java.lang.String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return null;
    }

    public final /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.ip ipVar = (defpackage.ip) obj;
        android.graphics.PointF pointF = (android.graphics.PointF) obj2;
        ipVar.a = java.lang.Math.round(pointF.x);
        ipVar.b = java.lang.Math.round(pointF.y);
        ipVar.e++;
        if (ipVar.e == ipVar.f) {
            ipVar.a();
        }
    }
}
