package defpackage;

/* renamed from: atm reason: default package */
/* compiled from: PG */
final class atm extends defpackage.atw {
    private final java.lang.String a;
    private final int b;

    atm(java.lang.String str, int i) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null taskId");
        }
        this.a = str;
        this.b = i;
    }

    /* access modifiers changed from: 0000 */
    public final java.lang.String a() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public final int b() {
        return this.b;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 41).append("TaskMove{taskId=").append(str).append(", toPosition=").append(this.b).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.atw)) {
            return false;
        }
        defpackage.atw atw = (defpackage.atw) obj;
        if (!this.a.equals(atw.a()) || this.b != atw.b()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }
}
