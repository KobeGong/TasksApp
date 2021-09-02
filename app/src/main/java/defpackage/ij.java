package defpackage;

/* renamed from: ij reason: default package */
/* compiled from: PG */
final class ij extends android.util.Property {
    ij(java.lang.Class cls, java.lang.String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return null;
    }

    public final /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.ip ipVar = (defpackage.ip) obj;
        android.graphics.PointF pointF = (android.graphics.PointF) obj2;
        ipVar.c = java.lang.Math.round(pointF.x);
        ipVar.d = java.lang.Math.round(pointF.y);
        ipVar.f++;
        if (ipVar.e == ipVar.f) {
            ipVar.a();
        }
    }
}
