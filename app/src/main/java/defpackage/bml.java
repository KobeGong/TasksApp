package defpackage;

/* renamed from: bml reason: default package */
/* compiled from: PG */
public final class bml extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bmy();
    private java.lang.String a;
    private java.lang.String b;
    private java.lang.String c;
    private defpackage.bmj d;
    private java.lang.String e;

    public bml() {
    }

    public bml(java.lang.String str, java.lang.String str2, java.lang.String str3, defpackage.bmj bmj, java.lang.String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bmj;
        this.e = str4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.bml)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        defpackage.bml bml = (defpackage.bml) obj;
        if (!defpackage.azb.a((java.lang.Object) this.a, (java.lang.Object) bml.a) || !defpackage.azb.a((java.lang.Object) this.b, (java.lang.Object) bml.b) || !defpackage.azb.a((java.lang.Object) this.c, (java.lang.Object) bml.c) || !defpackage.azb.a((java.lang.Object) this.d, (java.lang.Object) bml.d) || !defpackage.azb.a((java.lang.Object) this.e, (java.lang.Object) bml.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public final java.lang.String toString() {
        return defpackage.azb.a((java.lang.Object) this).a("displayName", this.a).a("givenName", this.b).a("familyName", this.c).a("matchInfo", this.d).a("alternativeDisplayName", this.e).toString();
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 2, this.a);
        defpackage.bjr.a(parcel, 3, this.b);
        defpackage.bjr.a(parcel, 4, this.c);
        defpackage.bjr.a(parcel, 5, (android.os.Parcelable) this.d, i);
        defpackage.bjr.a(parcel, 6, this.e);
        defpackage.bjr.r(parcel, q);
    }
}
