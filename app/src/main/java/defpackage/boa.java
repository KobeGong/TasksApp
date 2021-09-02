package defpackage;

/* renamed from: boa reason: default package */
/* compiled from: PG */
public final class boa extends defpackage.biq implements defpackage.bny {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bnz();
    private final defpackage.bol a;
    private final java.lang.Long b;

    public boa(defpackage.bol bol, java.lang.Long l) {
        this.a = bol;
        this.b = l;
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
