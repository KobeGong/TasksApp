package defpackage;

import java.util.LinkedHashMap;

/* renamed from: dmu  reason: default package */
/* compiled from: PG */
public final class dmu {
    public final LinkedHashMap a = dgv.b(5);

    dmu() {
    }

    public final dmu a(Object obj, ecz ecz) {
        this.a.put(dgv.a(obj, "key"), (ecz) dgv.a(ecz, "provider"));
        return this;
    }
}
