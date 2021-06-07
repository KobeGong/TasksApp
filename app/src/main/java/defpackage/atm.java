package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: atm  reason: default package */
/* compiled from: PG */
public final class atm extends atw {
    private final String a;
    private final int b;

    atm(String str, int i) {
        if (str == null) {
            throw new NullPointerException("Null taskId");
        }
        this.a = str;
        this.b = i;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.atw
    public final String a() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.atw
    public final int b() {
        return this.b;
    }

    public final String toString() {
        String str = this.a;
        return new StringBuilder(String.valueOf(str).length() + 41).append("TaskMove{taskId=").append(str).append(", toPosition=").append(this.b).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof atw)) {
            return false;
        }
        atw atw = (atw) obj;
        return this.a.equals(atw.a()) && this.b == atw.b();
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }
}
