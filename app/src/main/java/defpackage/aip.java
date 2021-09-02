package defpackage;

/* renamed from: aip reason: default package */
/* compiled from: PG */
final class aip extends defpackage.air {
    private final java.lang.Throwable a;
    private final boolean b;

    aip(java.lang.Throwable th) {
        if (th == null) {
            throw new java.lang.NullPointerException("Null getError");
        }
        this.a = th;
        this.b = false;
    }

    public final java.lang.Throwable a() {
        return this.a;
    }

    public final boolean b() {
        return false;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.a);
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 37).append("ErrorInfo{getError=").append(valueOf).append(", willRetry=false").append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.air)) {
            return false;
        }
        defpackage.air air = (defpackage.air) obj;
        if (!this.a.equals(air.a()) || air.b()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 1237;
    }
}
