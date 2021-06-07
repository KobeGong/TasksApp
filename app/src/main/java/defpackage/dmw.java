package defpackage;

import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: dmw  reason: default package */
/* compiled from: PG */
public final class dmw {
    private dmv a;
    private Map b;

    dmw(dmv dmv) {
        this.a = dmv;
    }

    public final Map a(int i) {
        if (this.b == null) {
            this.b = new IdentityHashMap(i);
        }
        return this.b;
    }

    public final dmw a(dmx dmx, Object obj) {
        a(1).put(dmx, obj);
        return this;
    }

    public final dmv a() {
        if (this.b != null) {
            for (Map.Entry entry : this.a.a.entrySet()) {
                if (!this.b.containsKey(entry.getKey())) {
                    this.b.put((dmx) entry.getKey(), entry.getValue());
                }
            }
            this.a = new dmv(this.b);
            this.b = null;
        }
        return this.a;
    }
}
