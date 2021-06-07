package defpackage;

import java.util.Map;

/* renamed from: div  reason: default package */
/* compiled from: PG */
final class div implements Map.Entry {
    public Map.Entry a;

    div(Map.Entry entry) {
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((diu) this.a.getValue()) == null) {
            return null;
        }
        return diu.a();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof djo)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        diu diu = (diu) this.a.getValue();
        djo djo = diu.b;
        diu.a = null;
        diu.c = null;
        diu.b = (djo) obj;
        return djo;
    }
}
