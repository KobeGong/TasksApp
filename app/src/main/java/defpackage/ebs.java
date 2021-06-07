package defpackage;

/* renamed from: ebs  reason: default package */
/* compiled from: PG */
public final class ebs extends ebw {
    private final boolean a;
    private final ech b;

    public ebs(boolean z, ech ech) {
        this.a = z;
        this.b = ech;
    }

    @Override // defpackage.ebw
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.ebw
    public final ech b() {
        return this.b;
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        return new StringBuilder(String.valueOf(valueOf).length() + 53).append("EndSpanOptions{sampleToLocalSpanStore=").append(z).append(", status=").append(valueOf).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ebw)) {
            return false;
        }
        ebw ebw = (ebw) obj;
        if (this.a == ebw.a()) {
            if (this.b == null) {
                if (ebw.b() == null) {
                    return true;
                }
            } else if (this.b.equals(ebw.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b == null ? 0 : this.b.hashCode()) ^ (1000003 * ((this.a ? 1231 : 1237) ^ 1000003));
    }
}
