package defpackage;

/* renamed from: ebs reason: default package */
/* compiled from: PG */
public final class ebs extends defpackage.ebw {
    private final boolean a;
    private final defpackage.ech b;

    public ebs(boolean z, defpackage.ech ech) {
        this.a = z;
        this.b = ech;
    }

    public final boolean a() {
        return this.a;
    }

    public final defpackage.ech b() {
        return this.b;
    }

    public final java.lang.String toString() {
        boolean z = this.a;
        java.lang.String valueOf = java.lang.String.valueOf(this.b);
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 53).append("EndSpanOptions{sampleToLocalSpanStore=").append(z).append(", status=").append(valueOf).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.ebw)) {
            return false;
        }
        defpackage.ebw ebw = (defpackage.ebw) obj;
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
