package defpackage;

/* renamed from: awz reason: default package */
/* compiled from: PG */
public final class awz extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.axo();
    private final boolean a;
    private final long b;
    private final long c;

    public awz(boolean z, long j, long j2) {
        this.a = z;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.awz)) {
            return false;
        }
        defpackage.awz awz = (defpackage.awz) obj;
        if (this.a == awz.a && this.b == awz.b && this.c == awz.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Boolean.valueOf(this.a), java.lang.Long.valueOf(this.b), java.lang.Long.valueOf(this.c)});
    }

    public final java.lang.String toString() {
        return "CollectForDebugParcelable[skipPersistentStorage: " + this.a + ",collectForDebugStartTimeMillis: " + this.b + ",collectForDebugExpiryTimeMillis: " + this.c + "]";
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 1, this.a);
        defpackage.bjr.a(parcel, 2, this.c);
        defpackage.bjr.a(parcel, 3, this.b);
        defpackage.bjr.r(parcel, q);
    }
}
