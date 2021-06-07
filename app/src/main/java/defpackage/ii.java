package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* renamed from: ii  reason: default package */
/* compiled from: PG */
final class ii extends Property {
    ii(Class cls, String str) {
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
        ipVar.a = Math.round(pointF.x);
        ipVar.b = Math.round(pointF.y);
        ipVar.e++;
        if (ipVar.e == ipVar.f) {
            ipVar.a();
        }
    }
}
