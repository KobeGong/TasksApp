package defpackage;

/* renamed from: bmh reason: default package */
/* compiled from: PG */
public final class bmh extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bmu();
    private int a;
    private java.util.List b;

    public bmh() {
    }

    public bmh(int i, java.util.List list) {
        this.a = i;
        this.b = list;
    }

    public final java.lang.String toString() {
        return defpackage.azb.a((java.lang.Object) this).a("spamStatus", java.lang.Integer.valueOf(this.a)).a("person", this.b).toString();
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.util.List list;
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.c(parcel, 2, this.a);
        if (this.b == null) {
            list = java.util.Collections.emptyList();
        } else {
            list = this.b;
        }
        defpackage.bjr.b(parcel, 3, list);
        defpackage.bjr.r(parcel, q);
    }
}
