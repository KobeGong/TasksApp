package defpackage;

/* renamed from: bgn reason: default package */
/* compiled from: PG */
public final class bgn extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bgu();
    public int a;
    private int b;

    bgn(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public bgn() {
        this(0, 0);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.c(parcel, 2, this.a);
        defpackage.bjr.c(parcel, 3, this.b);
        defpackage.bjr.r(parcel, q);
    }
}
