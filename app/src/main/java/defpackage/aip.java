package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: aip  reason: default package */
/* compiled from: PG */
public final class aip extends air {
    private final Throwable a;
    private final boolean b;

    aip(Throwable th) {
        if (th == null) {
            throw new NullPointerException("Null getError");
        }
        this.a = th;
        this.b = false;
    }

    @Override // defpackage.air
    public final Throwable a() {
        return this.a;
    }

    @Override // defpackage.air
    public final boolean b() {
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(valueOf).length() + 37).append("ErrorInfo{getError=").append(valueOf).append(", willRetry=false").append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof air)) {
            return false;
        }
        air air = (air) obj;
        return this.a.equals(air.a()) && !air.b();
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 1237;
    }
}
