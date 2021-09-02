package defpackage;

/* renamed from: bmg reason: default package */
/* compiled from: PG */
public final class bmg extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bmt();
    private final boolean a;
    private final java.lang.String b;

    bmg(boolean z, java.lang.String str) {
        this.a = z;
        this.b = str;
    }

    public final java.lang.String toString() {
        return defpackage.azb.a((java.lang.Object) this).a("isLastCallback", java.lang.Boolean.valueOf(this.a)).a("query", this.b).toString();
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 2, this.a);
        defpackage.bjr.a(parcel, 3, this.b);
        defpackage.bjr.r(parcel, q);
    }
}
