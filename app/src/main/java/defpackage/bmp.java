package defpackage;

/* renamed from: bmp reason: default package */
/* compiled from: PG */
public final class bmp extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bmq();
    private final byte[] a;
    private long b;
    private java.lang.String c;

    public bmp(byte[] bArr, long j, java.lang.String str) {
        this.a = bArr;
        this.b = j;
        this.c = str;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 2, this.a);
        defpackage.bjr.a(parcel, 3, this.b);
        defpackage.bjr.a(parcel, 4, this.c);
        defpackage.bjr.r(parcel, q);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.bmp)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        defpackage.bmp bmp = (defpackage.bmp) obj;
        if (!java.util.Arrays.equals(this.a, bmp.a) || !defpackage.azb.a((java.lang.Object) java.lang.Long.valueOf(this.b), (java.lang.Object) java.lang.Long.valueOf(bmp.b)) || !defpackage.azb.a((java.lang.Object) this.c, (java.lang.Object) bmp.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (java.util.Arrays.hashCode(this.a) * 31) + java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Long.valueOf(this.b), this.c});
    }

    static {
        new defpackage.bmp(null, Long.MIN_VALUE, null);
    }
}
