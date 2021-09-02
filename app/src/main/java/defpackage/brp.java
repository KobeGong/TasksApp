package defpackage;

/* renamed from: brp reason: default package */
/* compiled from: PG */
public final class brp implements defpackage.bre {
    private final com.google.android.gms.common.api.Status a;

    public brp(com.google.android.gms.common.api.Status status) {
        this.a = status;
    }

    public final defpackage.bre a() {
        return this;
    }

    public final boolean b() {
        return this.a.a();
    }

    public final java.lang.String c() {
        return this.a.g;
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.brp)) {
            return false;
        }
        return this.a.equals(((defpackage.brp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    static {
        new defpackage.brq();
    }
}
