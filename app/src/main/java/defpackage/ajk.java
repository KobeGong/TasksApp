package defpackage;

/* renamed from: ajk  reason: default package */
/* compiled from: PG */
public final class ajk extends ajo {
    private final String a;
    private final String b;
    private final String c;

    public ajk(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null account");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null taskListId");
        }
        this.b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null taskId");
        }
        this.c = str3;
    }

    @Override // defpackage.ajo
    public final String a() {
        return this.a;
    }

    @Override // defpackage.ajo
    public final String b() {
        return this.b;
    }

    @Override // defpackage.ajo
    public final String c() {
        return this.c;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        return new StringBuilder(String.valueOf(str).length() + 42 + String.valueOf(str2).length() + String.valueOf(str3).length()).append("LinkToTask{account=").append(str).append(", taskListId=").append(str2).append(", taskId=").append(str3).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajo)) {
            return false;
        }
        ajo ajo = (ajo) obj;
        return this.a.equals(ajo.a()) && this.b.equals(ajo.b()) && this.c.equals(ajo.c());
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
