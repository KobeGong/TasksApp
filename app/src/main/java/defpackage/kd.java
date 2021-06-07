package defpackage;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* renamed from: kd  reason: default package */
/* compiled from: PG */
final class kd extends Property {
    kd(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public final /* synthetic */ Object get(Object obj) {
        return sn.a.p((View) obj);
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        sn.a.a((View) obj, (Rect) obj2);
    }
}
