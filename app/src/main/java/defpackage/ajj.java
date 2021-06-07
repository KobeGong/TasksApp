package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: ajj  reason: default package */
/* compiled from: PG */
public final class ajj extends ajn {
    private final String a;

    ajj(String str) {
        if (str == null) {
            throw new NullPointerException("Null taskListId");
        }
        this.a = str;
    }

    @Override // defpackage.ajn
    public final String a() {
        return this.a;
    }

    public final String toString() {
        String str = this.a;
        return new StringBuilder(String.valueOf(str).length() + 31).append("DeleteTaskListData{taskListId=").append(str).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajn) {
            return this.a.equals(((ajn) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }
}
