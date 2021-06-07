package defpackage;

import java.util.HashMap;

/* renamed from: f  reason: default package */
/* compiled from: PG */
public final class f extends g {
    public HashMap a = new HashMap();

    /* access modifiers changed from: protected */
    @Override // defpackage.g
    public final j a(Object obj) {
        return (j) this.a.get(obj);
    }

    @Override // defpackage.g
    public final Object a(Object obj, Object obj2) {
        j a2 = a(obj);
        if (a2 != null) {
            return a2.b;
        }
        this.a.put(obj, b(obj, obj2));
        return null;
    }

    @Override // defpackage.g
    public final Object b(Object obj) {
        Object b = super.b(obj);
        this.a.remove(obj);
        return b;
    }

    public final boolean c(Object obj) {
        return this.a.containsKey(obj);
    }
}
