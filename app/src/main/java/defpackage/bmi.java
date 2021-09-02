package defpackage;

/* renamed from: bmi reason: default package */
/* compiled from: PG */
public final class bmi extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bmv();
    private java.lang.String a;
    private java.util.List b;

    public bmi() {
    }

    public bmi(java.lang.String str, java.util.List list) {
        this.a = str;
        this.b = list;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.util.List list;
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 2, this.a);
        if (this.b == null) {
            list = java.util.Collections.emptyList();
        } else {
            list = this.b;
        }
        defpackage.bjr.b(parcel, 3, list);
        defpackage.bjr.r(parcel, q);
    }
}
