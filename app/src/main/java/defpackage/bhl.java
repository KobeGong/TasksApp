package defpackage;

/* renamed from: bhl reason: default package */
/* compiled from: PG */
public final class bhl extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bhm();
    private int a;
    private java.lang.String b;
    private android.content.Intent c;

    public bhl(int i, java.lang.String str, android.content.Intent intent) {
        this.a = i;
        this.b = str;
        this.c = intent;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.c(parcel, 2, this.a);
        defpackage.bjr.a(parcel, 3, this.b);
        defpackage.bjr.a(parcel, 4, (android.os.Parcelable) this.c, i);
        defpackage.bjr.r(parcel, q);
    }
}
