package defpackage;

/* renamed from: bmf reason: default package */
/* compiled from: PG */
public final class bmf extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bms();
    private int a;
    private java.lang.String b;
    private defpackage.bmj c;
    private defpackage.bmp d;
    private int e;
    private java.lang.String f;
    private boolean g;
    private boolean h;

    public bmf(int i, java.lang.String str, defpackage.bmj bmj, defpackage.bmp bmp, int i2, java.lang.String str2, boolean z, boolean z2) {
        this.a = i;
        this.b = str;
        this.c = bmj;
        this.d = bmp;
        this.e = i2;
        this.f = str2;
        this.g = z;
        this.h = z2;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.c(parcel, 2, this.a);
        defpackage.bjr.a(parcel, 3, this.b);
        defpackage.bjr.a(parcel, 4, (android.os.Parcelable) this.c, i);
        defpackage.bjr.a(parcel, 5, (android.os.Parcelable) this.d, i);
        defpackage.bjr.c(parcel, 6, this.e);
        defpackage.bjr.a(parcel, 7, this.f);
        defpackage.bjr.a(parcel, 8, this.g);
        defpackage.bjr.a(parcel, 9, this.h);
        defpackage.bjr.r(parcel, q);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.bmf)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        defpackage.bmf bmf = (defpackage.bmf) obj;
        if (!defpackage.azb.a((java.lang.Object) this.b, (java.lang.Object) bmf.b) || !defpackage.azb.a((java.lang.Object) java.lang.Integer.valueOf(this.a), (java.lang.Object) java.lang.Integer.valueOf(bmf.a)) || !defpackage.azb.a((java.lang.Object) this.c, (java.lang.Object) bmf.c) || !defpackage.azb.a((java.lang.Object) this.d, (java.lang.Object) bmf.d) || !defpackage.azb.a((java.lang.Object) java.lang.Integer.valueOf(this.e), (java.lang.Object) java.lang.Integer.valueOf(bmf.e)) || !defpackage.azb.a((java.lang.Object) this.f, (java.lang.Object) bmf.f) || !defpackage.azb.a((java.lang.Object) java.lang.Boolean.valueOf(this.g), (java.lang.Object) java.lang.Boolean.valueOf(bmf.g)) || !defpackage.azb.a((java.lang.Object) java.lang.Boolean.valueOf(this.h), (java.lang.Object) java.lang.Boolean.valueOf(bmf.h))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.b, java.lang.Integer.valueOf(this.a), this.c, this.d, java.lang.Integer.valueOf(this.e), this.f, java.lang.Boolean.valueOf(this.g), java.lang.Boolean.valueOf(this.h)});
    }

    public final java.lang.String toString() {
        return defpackage.azb.a((java.lang.Object) this).a("value", this.b).a("getContactMethodType", java.lang.Integer.valueOf(this.a)).a("matchInfo", this.c).a("metadata", this.d).a("classificationType", java.lang.Integer.valueOf(this.e)).a("label", this.f).a("isPrimary", java.lang.Boolean.valueOf(this.g)).a("isSuperPrimary", java.lang.Boolean.valueOf(this.h)).toString();
    }
}
