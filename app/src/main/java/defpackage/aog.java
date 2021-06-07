package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: aog  reason: default package */
/* compiled from: PG */
public final class aog extends aof {
    private final String a;
    private final lc b;

    aog(String str, lc lcVar) {
        this.a = str;
        this.b = lcVar;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.aof
    public final String a() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.aof
    public final lc b() {
        return this.b;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        return new StringBuilder(String.valueOf(str).length() + 42 + String.valueOf(valueOf).length()).append("ActivityConfig{selectedListId=").append(str).append(", fragment=").append(valueOf).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aof)) {
            return false;
        }
        aof aof = (aof) obj;
        if (this.a != null ? this.a.equals(aof.a()) : aof.a() == null) {
            if (this.b == null) {
                if (aof.b() == null) {
                    return true;
                }
            } else if (this.b.equals(aof.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.a == null ? 0 : this.a.hashCode()) ^ 1000003) * 1000003;
        if (this.b != null) {
            i = this.b.hashCode();
        }
        return hashCode ^ i;
    }
}
