package defpackage;

/* renamed from: bmm reason: default package */
/* compiled from: PG */
public final class bmm extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bmz();
    private java.util.List a = new java.util.ArrayList();
    private java.util.List b = new java.util.ArrayList();
    private java.util.List c = new java.util.ArrayList();
    private java.lang.String d;
    private defpackage.bmp e;
    private boolean f;
    private boolean g;
    private java.lang.String h;
    private java.lang.String i;
    private java.lang.String j;
    private int k;

    bmm(java.util.List list, java.util.List list2, java.util.List list3, java.lang.String str, defpackage.bmp bmp, boolean z, boolean z2, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i2) {
        this.c = list3;
        this.a = list;
        this.b = list2;
        this.d = str;
        this.e = bmp;
        this.f = z;
        this.g = z2;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = i2;
    }

    public bmm() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.bmm)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        defpackage.bmm bmm = (defpackage.bmm) obj;
        if (!defpackage.azb.a((java.lang.Object) this.a, (java.lang.Object) bmm.a) || !defpackage.azb.a((java.lang.Object) null, (java.lang.Object) null) || !defpackage.azb.a((java.lang.Object) this.b, (java.lang.Object) bmm.b) || !defpackage.azb.a((java.lang.Object) null, (java.lang.Object) null) || !defpackage.azb.a((java.lang.Object) this.d, (java.lang.Object) bmm.d) || !defpackage.azb.a((java.lang.Object) this.e, (java.lang.Object) bmm.e) || !defpackage.azb.a((java.lang.Object) this.c, (java.lang.Object) bmm.c) || !defpackage.azb.a((java.lang.Object) java.lang.Boolean.valueOf(this.f), (java.lang.Object) java.lang.Boolean.valueOf(bmm.f)) || !defpackage.azb.a((java.lang.Object) java.lang.Boolean.valueOf(this.g), (java.lang.Object) java.lang.Boolean.valueOf(bmm.g)) || !defpackage.azb.a((java.lang.Object) this.h, (java.lang.Object) bmm.h) || !defpackage.azb.a((java.lang.Object) this.i, (java.lang.Object) bmm.i) || !defpackage.azb.a((java.lang.Object) this.j, (java.lang.Object) bmm.j) || !defpackage.azb.a((java.lang.Object) java.lang.Integer.valueOf(this.k), (java.lang.Object) java.lang.Integer.valueOf(bmm.k))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.a, null, this.b, this.c, null, this.d, this.e, java.lang.Boolean.valueOf(this.f), java.lang.Boolean.valueOf(this.g), this.h, this.i, this.j, java.lang.Integer.valueOf(this.k)});
    }

    public final java.lang.String toString() {
        return defpackage.azb.a((java.lang.Object) this).a("names", this.a).a("emails", null).a("photos", this.b).a("sortedContactMethods", this.c).a("phones", null).a("provenanceReference", this.d).a("metadata", this.e).a("isStarred", java.lang.Boolean.valueOf(this.f)).a("sendToVoicemail", java.lang.Boolean.valueOf(this.g)).a("customRingtone", this.h).a("lookupKey", this.i).a("secondaryProvenanceReference", this.j).a("pinnedPosition", java.lang.Integer.valueOf(this.k)).toString();
    }

    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.b(parcel, 3, java.util.Collections.unmodifiableList(this.a));
        defpackage.bjr.b(parcel, 5, java.util.Collections.unmodifiableList(this.b));
        defpackage.bjr.b(parcel, 6, this.c);
        defpackage.bjr.a(parcel, 7, this.d);
        defpackage.bjr.a(parcel, 8, (android.os.Parcelable) this.e, i2);
        defpackage.bjr.a(parcel, 9, this.f);
        defpackage.bjr.a(parcel, 10, this.g);
        defpackage.bjr.a(parcel, 11, this.h);
        defpackage.bjr.a(parcel, 12, this.i);
        defpackage.bjr.a(parcel, 13, this.j);
        defpackage.bjr.c(parcel, 14, this.k);
        defpackage.bjr.r(parcel, q);
    }
}
