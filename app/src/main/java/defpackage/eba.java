package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: eba  reason: default package */
/* compiled from: PG */
public final class eba extends ebl {
    private final String a;

    eba(String str) {
        if (str == null) {
            throw new NullPointerException("Null asString");
        }
        this.a = str;
    }

    @Override // defpackage.ebl
    public final String a() {
        return this.a;
    }

    public final String toString() {
        String str = this.a;
        return new StringBuilder(String.valueOf(str).length() + 19).append("TagValue{asString=").append(str).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebl) {
            return this.a.equals(((ebl) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }
}
