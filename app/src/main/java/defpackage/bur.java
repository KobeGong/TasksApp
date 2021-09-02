package defpackage;

/* renamed from: bur reason: default package */
/* compiled from: PG */
public final class bur {
    public java.lang.String a;
    public java.lang.Integer b;
    public java.lang.String c;
    public defpackage.dgm d;
    public defpackage.dgu e;

    public final defpackage.bur a() {
        this.b = java.lang.Integer.valueOf(0);
        return this;
    }

    public final defpackage.bur a(defpackage.dgm dgm) {
        if (dgm == null) {
            throw new java.lang.NullPointerException("Null threadStateUpdate");
        }
        this.d = dgm;
        return this;
    }
}
