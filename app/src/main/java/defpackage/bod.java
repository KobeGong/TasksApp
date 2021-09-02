package defpackage;

/* renamed from: bod reason: default package */
/* compiled from: PG */
public final class bod extends defpackage.biq implements defpackage.bob {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.boc();
    private final defpackage.bol a;
    private final java.lang.String b;

    public bod(defpackage.bol bol, java.lang.String str) {
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
