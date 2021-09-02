package defpackage;

/* renamed from: aog reason: default package */
/* compiled from: PG */
final class aog extends defpackage.aof {
    private final java.lang.String a;
    private final Fragment b;

    aog(java.lang.String str, Fragment lcVar) {
        this.a = str;
        this.b = lcVar;
    }

    /* access modifiers changed from: 0000 */
    public final java.lang.String a() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public final Fragment b() {
        return this.b;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        java.lang.String valueOf = java.lang.String.valueOf(this.b);
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 42 + java.lang.String.valueOf(valueOf).length()).append("ActivityConfig{selectedListId=").append(str).append(", fragment=").append(valueOf).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.aof)) {
            return false;
        }
        defpackage.aof aof = (defpackage.aof) obj;
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
