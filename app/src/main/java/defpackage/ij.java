package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* renamed from: ij  reason: default package */
/* compiled from: PG */
final class ij extends Property {
    ij(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        ip ipVar = (ip) obj;
        PointF pointF = (PointF) obj2;
        ipVar.c = Math.round(pointF.x);
        ipVar.d = Math.round(pointF.y);
        ipVar.f++;
        if (ipVar.e == ipVar.f) {
            ipVar.a();
        }
    }
}
