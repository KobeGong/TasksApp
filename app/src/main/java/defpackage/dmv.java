package defpackage;

/* renamed from: dmv reason: default package */
/* compiled from: PG */
public final class dmv {
    public static final defpackage.dmv b = new defpackage.dmv(java.util.Collections.emptyMap());
    public final java.util.Map a;

    dmv(java.util.Map map) {
        this.a = map;
    }

    public final java.lang.Object a(defpackage.dmx dmx) {
        return this.a.get(dmx);
    }

    public static defpackage.dmw a() {
        return new defpackage.dmw(b);
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        defpackage.dmv dmv = (defpackage.dmv) obj;
        if (this.a.size() != dmv.a.size()) {
            return false;
        }
        for (java.util.Map.Entry entry : this.a.entrySet()) {
            if (!dmv.a.containsKey(entry.getKey())) {
                return false;
            }
            if (!defpackage.cru.d(entry.getValue(), dmv.a.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
