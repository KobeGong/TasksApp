package defpackage;

import java.util.Collections;
import java.util.Map;

/* renamed from: dmv  reason: default package */
/* compiled from: PG */
public final class dmv {
    public static final dmv b = new dmv(Collections.emptyMap());
    public final Map a;

    dmv(Map map) {
        this.a = map;
    }

    public final Object a(dmx dmx) {
        return this.a.get(dmx);
    }

    public static dmw a() {
        return new dmw(b);
    }

    public final String toString() {
        return this.a.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dmv dmv = (dmv) obj;
        if (this.a.size() != dmv.a.size()) {
            return false;
        }
        for (Map.Entry entry : this.a.entrySet()) {
            if (!dmv.a.containsKey(entry.getKey())) {
                return false;
            }
            if (!cru.d(entry.getValue(), dmv.a.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
