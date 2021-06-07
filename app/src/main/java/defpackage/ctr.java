package defpackage;

/* renamed from: ctr  reason: default package */
/* compiled from: PG */
final class ctr {
    private final ctt a;
    private final String b;

    ctr(ctt ctt, String str) {
        this.a = (ctt) cub.a(ctt, "log site");
        this.b = (String) cub.a(str, "log site key");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ctr)) {
            return false;
        }
        ctr ctr = (ctr) obj;
        if (!this.a.equals(ctr.a) || !this.b.equals(ctr.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        return new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(str).length()).append("SpecializedLogSiteKey{ logSite=").append(valueOf).append(", extraKey='").append(str).append("' }").toString();
    }
}
