package defpackage;

import android.util.Property;
import android.view.View;

/* renamed from: kc  reason: default package */
/* compiled from: PG */
final class kc extends Property {
    kc(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(kb.a.b((View) obj));
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        kb.a((View) obj, ((Float) obj2).floatValue());
    }
}
