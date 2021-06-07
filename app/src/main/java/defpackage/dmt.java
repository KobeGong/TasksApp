package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: dmt  reason: default package */
/* compiled from: PG */
public final class dmt implements ecz {
    private final Map a;

    public static dmu b() {
        return new dmu();
    }

    public dmt(Map map) {
        this.a = Collections.unmodifiableMap(map);
    }

    @Override // defpackage.ecz
    public final /* synthetic */ Object a() {
        LinkedHashMap b = dgv.b(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            b.put(entry.getKey(), ((ecz) entry.getValue()).a());
        }
        return Collections.unmodifiableMap(b);
    }

    static {
        new dms(dgv.a(Collections.emptyMap(), "instance cannot be null"));
    }
}
