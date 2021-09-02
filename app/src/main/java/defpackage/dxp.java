package defpackage;

/* renamed from: dxp reason: default package */
/* compiled from: PG */
final class dxp extends defpackage.doo {
    private final defpackage.dna a;
    private final defpackage.dor b;
    private final defpackage.dpb c;

    dxp(defpackage.dpb dpb, defpackage.dor dor, defpackage.dna dna) {
        this.c = (defpackage.dpb) defpackage.cld.a((java.lang.Object) dpb, (java.lang.Object) "method");
        this.b = (defpackage.dor) defpackage.cld.a((java.lang.Object) dor, (java.lang.Object) "headers");
        this.a = (defpackage.dna) defpackage.cld.a((java.lang.Object) dna, (java.lang.Object) "callOptions");
    }

    public final defpackage.dor b() {
        return this.b;
    }

    public final defpackage.dna a() {
        return this.a;
    }

    public final defpackage.dpb c() {
        return this.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        defpackage.dxp dxp = (defpackage.dxp) obj;
        if (!defpackage.cru.d(this.a, dxp.a) || !defpackage.cru.d(this.b, dxp.b) || !defpackage.cru.d(this.c, dxp.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.a, this.b, this.c});
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.c);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.b);
        java.lang.String valueOf3 = java.lang.String.valueOf(this.a);
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 31 + java.lang.String.valueOf(valueOf2).length() + java.lang.String.valueOf(valueOf3).length()).append("[method=").append(valueOf).append(" headers=").append(valueOf2).append(" callOptions=").append(valueOf3).append("]").toString();
    }
}
