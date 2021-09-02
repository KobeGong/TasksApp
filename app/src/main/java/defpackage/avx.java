package defpackage;

/* renamed from: avx reason: default package */
/* compiled from: PG */
public final class avx extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.avw();
    public int a;
    private int b;
    private android.os.Bundle c;

    avx(int i, int i2, android.os.Bundle bundle) {
        this.b = i;
        this.a = i2;
        this.c = bundle;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.c(parcel, 1, this.b);
        defpackage.bjr.c(parcel, 2, this.a);
        defpackage.bjr.a(parcel, 3, this.c);
        defpackage.bjr.r(parcel, q);
    }
}
