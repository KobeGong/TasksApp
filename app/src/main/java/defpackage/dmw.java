package defpackage;

/* renamed from: dmw reason: default package */
/* compiled from: PG */
public final class dmw {
    private defpackage.dmv a;
    private java.util.Map b;

    dmw(defpackage.dmv dmv) {
        this.a = dmv;
    }

    public final java.util.Map a(int i) {
        if (this.b == null) {
            this.b = new java.util.IdentityHashMap(i);
        }
        return this.b;
    }

    public final defpackage.dmw a(defpackage.dmx dmx, java.lang.Object obj) {
        a(1).put(dmx, obj);
        return this;
    }

    public final defpackage.dmv a() {
        if (this.b != null) {
            for (java.util.Map.Entry entry : this.a.a.entrySet()) {
                if (!this.b.containsKey(entry.getKey())) {
                    this.b.put((defpackage.dmx) entry.getKey(), entry.getValue());
                }
            }
            this.a = new defpackage.dmv(this.b);
            this.b = null;
        }
        return this.a;
    }
}
