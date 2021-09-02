package defpackage;

/* renamed from: ajk reason: default package */
/* compiled from: PG */
public final class ajk extends defpackage.ajo {
    private final java.lang.String a;
    private final java.lang.String b;
    private final java.lang.String c;

    public ajk(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null account");
        }
        this.a = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null taskListId");
        }
        this.b = str2;
        if (str3 == null) {
            throw new java.lang.NullPointerException("Null taskId");
        }
        this.c = str3;
    }

    public final java.lang.String a() {
        return this.a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final java.lang.String c() {
        return this.c;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        java.lang.String str2 = this.b;
        java.lang.String str3 = this.c;
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 42 + java.lang.String.valueOf(str2).length() + java.lang.String.valueOf(str3).length()).append("LinkToTask{account=").append(str).append(", taskListId=").append(str2).append(", taskId=").append(str3).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.ajo)) {
            return false;
        }
        defpackage.ajo ajo = (defpackage.ajo) obj;
        if (!this.a.equals(ajo.a()) || !this.b.equals(ajo.b()) || !this.c.equals(ajo.c())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
