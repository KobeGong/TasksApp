package defpackage;

/* renamed from: boo reason: default package */
/* compiled from: PG */
public final class boo extends defpackage.biq implements defpackage.bom {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bon();
    private final defpackage.bol a;
    private final java.lang.String b;
    private final java.lang.String c;

    public boo(defpackage.bol bol, java.lang.String str, java.lang.String str2) {
        this.a = bol;
        this.b = str;
        this.c = str2;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 2, (android.os.Parcelable) this.a, i);
        defpackage.bjr.a(parcel, 3, this.b);
        defpackage.bjr.a(parcel, 4, this.c);
        defpackage.bjr.r(parcel, q);
    }

    public final boolean a() {
        return true;
    }
}
