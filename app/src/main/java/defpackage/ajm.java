package defpackage;

/* renamed from: ajm reason: default package */
/* compiled from: PG */
final class ajm extends defpackage.ajq {
    private final java.util.List a;
    private final defpackage.dce b;
    private final long c;

    ajm(java.util.List list, defpackage.dce dce, long j) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null tasks");
        }
        this.a = list;
        if (dce == null) {
            throw new java.lang.NullPointerException("Null structure");
        }
        this.b = dce;
        this.c = j;
    }

    public final java.util.List a() {
        return this.a;
    }

    public final defpackage.dce b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.a);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.b);
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 72 + java.lang.String.valueOf(valueOf2).length()).append("TaskListStructure{tasks=").append(valueOf).append(", structure=").append(valueOf2).append(", lastSyncedMs=").append(this.c).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.ajq)) {
            return false;
        }
        defpackage.ajq ajq = (defpackage.ajq) obj;
        if (!this.a.equals(ajq.a()) || !this.b.equals(ajq.b()) || this.c != ajq.c()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ ((int) ((this.c >>> 32) ^ this.c));
    }
}
