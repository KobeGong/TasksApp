package defpackage;

/* renamed from: dmt reason: default package */
/* compiled from: PG */
public final class dmt implements defpackage.ecz {
    private final java.util.Map a;

    public static defpackage.dmu b() {
        return new defpackage.dmu();
    }

    public dmt(java.util.Map map) {
        this.a = java.util.Collections.unmodifiableMap(map);
    }

    public final /* synthetic */ java.lang.Object a() {
        java.util.LinkedHashMap b = defpackage.dgv.b(this.a.size());
        for (java.util.Map.Entry entry : this.a.entrySet()) {
            b.put(entry.getKey(), ((defpackage.ecz) entry.getValue()).a());
        }
        return java.util.Collections.unmodifiableMap(b);
    }

    static {
        new defpackage.dms(defpackage.dgv.a((java.lang.Object) java.util.Collections.emptyMap(), "instance cannot be null"));
    }
}
