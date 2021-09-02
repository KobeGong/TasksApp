package defpackage;

/* renamed from: bki reason: default package */
/* compiled from: PG */
public final class bki extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bkj();
    private int a;
    private defpackage.beb b;

    bki(int i, defpackage.beb beb) {
        this.a = i;
        this.b = beb;
    }

    public bki(defpackage.beb beb) {
        this(1, beb);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.c(parcel, 1, this.a);
        defpackage.bjr.a(parcel, 2, (android.os.Parcelable) this.b, i);
        defpackage.bjr.r(parcel, q);
    }
}
