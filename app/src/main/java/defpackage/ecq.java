package defpackage;

import java.util.Map;

/* renamed from: ecq  reason: default package */
/* compiled from: PG */
final class ecq extends ecu {
    private final Map a;
    private final Map b;

    ecq(Map map, Map map2) {
        if (map == null) {
            throw new NullPointerException("Null numbersOfLatencySampledSpans");
        }
        this.a = map;
        if (map2 == null) {
            throw new NullPointerException("Null numbersOfErrorSampledSpans");
        }
        this.b = map2;
    }

    @Override // defpackage.ecu
    public final Map a() {
        return this.a;
    }

    @Override // defpackage.ecu
    public final Map b() {
        return this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return new StringBuilder(String.valueOf(valueOf).length() + 78 + String.valueOf(valueOf2).length()).append("PerSpanNameSummary{numbersOfLatencySampledSpans=").append(valueOf).append(", numbersOfErrorSampledSpans=").append(valueOf2).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ecu)) {
            return false;
        }
        ecu ecu = (ecu) obj;
        return this.a.equals(ecu.a()) && this.b.equals(ecu.b());
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
