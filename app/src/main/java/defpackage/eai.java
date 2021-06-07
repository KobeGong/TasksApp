package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: eai  reason: default package */
/* compiled from: PG */
public final class eai extends eaj {
    private final long a = 0;
    private final int b = 0;

    eai() {
    }

    @Override // defpackage.eaj
    public final long a() {
        return 0;
    }

    @Override // defpackage.eaj
    public final int b() {
        return 0;
    }

    public final String toString() {
        return new StringBuilder(58).append("Timestamp{seconds=0").append(", nanos=0").append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eaj)) {
            return false;
        }
        eaj eaj = (eaj) obj;
        return 0 == eaj.a() && eaj.b() == 0;
    }

    public final int hashCode() {
        return -721379959;
    }
}
