package defpackage;

import java.util.List;

/* renamed from: btq  reason: default package */
/* compiled from: PG */
public final class btq extends btw {
    private final List a;

    public btq(List list) {
        this.a = list;
    }

    @Override // defpackage.btw
    public final List a() {
        return this.a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(valueOf).length() + 36).append("PreferenceResult{preferenceEntries=").append(valueOf).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof btw) {
            return this.a.equals(((btw) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }
}
