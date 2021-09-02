package defpackage;

/* renamed from: bhq reason: default package */
/* compiled from: PG */
public final class bhq extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bhs();
    public final java.lang.String a;
    private final java.lang.String b;

    public bhq(java.lang.String str, java.lang.String str2) {
        defpackage.azb.a(str, (java.lang.Object) "Account name must not be empty.");
        this.a = str;
        this.b = str2;
    }

    public static defpackage.bhq a(java.lang.String str) {
        defpackage.azb.a(str, (java.lang.Object) "Account name must not be empty.");
        return new defpackage.bhq(str, null);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 1, this.a);
        defpackage.bjr.a(parcel, 2, this.b);
        defpackage.bjr.r(parcel, q);
    }
}
