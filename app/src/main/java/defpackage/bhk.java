package defpackage;

/* renamed from: bhk reason: default package */
/* compiled from: PG */
public final class bhk extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bhp();
    private java.lang.String a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;

    public bhk(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.a = str;
        this.b = str2;
        this.c = str4;
        this.d = str3;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 2, this.a);
        defpackage.bjr.a(parcel, 3, this.b);
        defpackage.bjr.a(parcel, 4, this.c);
        defpackage.bjr.a(parcel, 5, this.d);
        defpackage.bjr.r(parcel, q);
    }
}
