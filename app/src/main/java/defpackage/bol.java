package defpackage;

/* renamed from: bol reason: default package */
/* compiled from: PG */
public final class bol extends defpackage.biq implements android.os.Parcelable, defpackage.bcs {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bok();
    private final java.lang.Integer a;
    private final java.lang.Boolean b;

    public bol(java.lang.Integer num, java.lang.Boolean bool) {
        this.a = num;
        this.b = bool;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, this.a);
        java.lang.Boolean bool = this.b;
        if (bool != null) {
            defpackage.bjr.b(parcel, 4, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        defpackage.bjr.r(parcel, q);
    }

    public final boolean a() {
        return true;
    }
}
