package defpackage;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* renamed from: il  reason: default package */
/* compiled from: PG */
final class il extends Property {
    il(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        PointF pointF = (PointF) obj2;
        kb.a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
    }
}
