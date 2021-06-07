package defpackage;

import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: ajm  reason: default package */
/* compiled from: PG */
public final class ajm extends ajq {
    private final List a;
    private final dce b;
    private final long c;

    ajm(List list, dce dce, long j) {
        if (list == null) {
            throw new NullPointerException("Null tasks");
        }
        this.a = list;
        if (dce == null) {
            throw new NullPointerException("Null structure");
        }
        this.b = dce;
        this.c = j;
    }

    @Override // defpackage.ajq
    public final List a() {
        return this.a;
    }

    @Override // defpackage.ajq
    public final dce b() {
        return this.b;
    }

    @Override // defpackage.ajq
    public final long c() {
        return this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return new StringBuilder(String.valueOf(valueOf).length() + 72 + String.valueOf(valueOf2).length()).append("TaskListStructure{tasks=").append(valueOf).append(", structure=").append(valueOf2).append(", lastSyncedMs=").append(this.c).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajq)) {
            return false;
        }
        ajq ajq = (ajq) obj;
        return this.a.equals(ajq.a()) && this.b.equals(ajq.b()) && this.c == ajq.c();
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ ((int) ((this.c >>> 32) ^ this.c));
    }
}
