package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: eaz  reason: default package */
/* compiled from: PG */
public final class eaz extends ebk {
    private final String a;

    eaz(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
    }

    @Override // defpackage.ebk
    public final String a() {
        return this.a;
    }

    public final String toString() {
        String str = this.a;
        return new StringBuilder(String.valueOf(str).length() + 13).append("TagKey{name=").append(str).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebk) {
            return this.a.equals(((ebk) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }
}
