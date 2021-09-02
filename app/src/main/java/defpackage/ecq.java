package defpackage;

/* renamed from: ecq reason: default package */
/* compiled from: PG */
final class ecq extends defpackage.ecu {
    private final java.util.Map a;
    private final java.util.Map b;

    ecq(java.util.Map map, java.util.Map map2) {
        if (map == null) {
            throw new java.lang.NullPointerException("Null numbersOfLatencySampledSpans");
        }
        this.a = map;
        if (map2 == null) {
            throw new java.lang.NullPointerException("Null numbersOfErrorSampledSpans");
        }
        this.b = map2;
    }

    public final java.util.Map a() {
        return this.a;
    }

    public final java.util.Map b() {
        return this.b;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.a);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.b);
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 78 + java.lang.String.valueOf(valueOf2).length()).append("PerSpanNameSummary{numbersOfLatencySampledSpans=").append(valueOf).append(", numbersOfErrorSampledSpans=").append(valueOf2).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.ecu)) {
            return false;
        }
        defpackage.ecu ecu = (defpackage.ecu) obj;
        if (!this.a.equals(ecu.a()) || !this.b.equals(ecu.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
