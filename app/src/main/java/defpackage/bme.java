package defpackage;

/* renamed from: bme reason: default package */
/* compiled from: PG */
public final class bme extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bmr();
    private defpackage.bmm a;

    public bme() {
    }

    public bme(defpackage.bmm bmm) {
        this.a = bmm;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 2, (android.os.Parcelable) this.a, i);
        defpackage.bjr.r(parcel, q);
    }

    public final java.lang.String toString() {
        return defpackage.azb.a((java.lang.Object) this).a("person", this.a).toString();
    }
}
