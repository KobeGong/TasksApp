package defpackage;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* renamed from: ik  reason: default package */
/* compiled from: PG */
final class ik extends Property {
    ik(Class cls, String str) {
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
        kb.a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
    }
}
