package defpackage;

/* renamed from: btq reason: default package */
/* compiled from: PG */
public final class btq extends defpackage.btw {
    private final java.util.List a;

    public btq(java.util.List list) {
        this.a = list;
    }

    public final java.util.List a() {
        return this.a;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.a);
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 36).append("PreferenceResult{preferenceEntries=").append(valueOf).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.btw)) {
            return false;
        }
        return this.a.equals(((defpackage.btw) obj).a());
    }

    public final int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }
}
