package defpackage;

import java.util.Arrays;

/* renamed from: dxp  reason: default package */
/* compiled from: PG */
final class dxp extends doo {
    private final dna a;
    private final dor b;
    private final dpb c;

    dxp(dpb dpb, dor dor, dna dna) {
        this.c = (dpb) cld.a(dpb, "method");
        this.b = (dor) cld.a(dor, "headers");
        this.a = (dna) cld.a(dna, "callOptions");
    }

    @Override // defpackage.doo
    public final dor b() {
        return this.b;
    }

    @Override // defpackage.doo
    public final dna a() {
        return this.a;
    }

    @Override // defpackage.doo
    public final dpb c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dxp dxp = (dxp) obj;
        return cru.d(this.a, dxp.a) && cru.d(this.b, dxp.b) && cru.d(this.c, dxp.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(valueOf).length() + 31 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length()).append("[method=").append(valueOf).append(" headers=").append(valueOf2).append(" callOptions=").append(valueOf3).append("]").toString();
    }
}
