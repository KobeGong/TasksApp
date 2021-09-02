package defpackage;

/* renamed from: eai reason: default package */
/* compiled from: PG */
final class eai extends defpackage.eaj {
    private final long a = 0;
    private final int b = 0;

    eai() {
    }

    public final long a() {
        return 0;
    }

    public final int b() {
        return 0;
    }

    public final java.lang.String toString() {
        return "Timestamp{seconds=0" + ", nanos=0" + "}";
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.eaj)) {
            return false;
        }
        defpackage.eaj eaj = (defpackage.eaj) obj;
        if (0 == eaj.a() && eaj.b() == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return -721379959;
    }
}
