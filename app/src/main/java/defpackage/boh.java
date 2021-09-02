package defpackage;

/* renamed from: boh reason: default package */
/* compiled from: PG */
public final class boh extends defpackage.biq implements defpackage.bof {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bog();
    private final defpackage.bol a;
    private final java.lang.String b;
    private final java.lang.String c;
    private final java.lang.String d;
    private final java.lang.String e;
    private final java.lang.String f;

    public boh(defpackage.bol bol, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.a = bol;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 2, (android.os.Parcelable) this.a, i);
        defpackage.bjr.a(parcel, 3, this.b);
        defpackage.bjr.a(parcel, 4, this.c);
        defpackage.bjr.a(parcel, 5, this.d);
        defpackage.bjr.a(parcel, 6, this.e);
        defpackage.bjr.a(parcel, 7, this.f);
        defpackage.bjr.r(parcel, q);
    }

    public final boolean a() {
        return true;
    }
}
