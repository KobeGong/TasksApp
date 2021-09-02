package defpackage;

/* renamed from: ajj reason: default package */
/* compiled from: PG */
final class ajj extends defpackage.ajn {
    private final java.lang.String a;

    ajj(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null taskListId");
        }
        this.a = str;
    }

    public final java.lang.String a() {
        return this.a;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 31).append("DeleteTaskListData{taskListId=").append(str).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.ajn)) {
            return false;
        }
        return this.a.equals(((defpackage.ajn) obj).a());
    }

    public final int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }
}
