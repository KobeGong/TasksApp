package defpackage;

/* renamed from: dnr  reason: default package */
/* compiled from: PG */
public final class dnr {
    public final dnq a;
    public final dpw b;

    public static dnr a(dnq dnq) {
        cld.a(dnq != dnq.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new dnr(dnq, dpw.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dnr)) {
            return false;
        }
        dnr dnr = (dnr) obj;
        if (!this.a.equals(dnr.a) || !this.b.equals(dnr.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        if (this.b.a()) {
            return this.a.toString();
        }
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length()).append(valueOf).append("(").append(valueOf2).append(")").toString();
    }

    public dnr(dnq dnq, dpw dpw) {
        this.a = (dnq) cld.a(dnq, "state is null");
        this.b = (dpw) cld.a(dpw, "status is null");
    }
}
