package defpackage;

/* renamed from: bor reason: default package */
/* compiled from: PG */
public final class bor extends defpackage.biq implements defpackage.bop {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.boq();
    private final defpackage.bol a;
    private final java.lang.String b;

    public bor(defpackage.bol bol, java.lang.String str) {
        this.a = bol;
        this.b = str;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 2, (android.os.Parcelable) this.a, i);
        defpackage.bjr.a(parcel, 3, this.b);
        defpackage.bjr.r(parcel, q);
    }

    public final boolean a() {
        return true;
    }
}
