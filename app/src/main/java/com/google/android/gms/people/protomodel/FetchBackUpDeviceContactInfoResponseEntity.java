package com.google.android.gms.people.protomodel;

/* compiled from: PG */
public class FetchBackUpDeviceContactInfoResponseEntity extends defpackage.biq implements defpackage.bnu {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.boe();
    private final java.util.List a;
    private java.util.List b;

    public FetchBackUpDeviceContactInfoResponseEntity(java.util.List list) {
        this.a = list;
    }

    public void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.b(parcel, 2, b());
        defpackage.bjr.r(parcel, q);
    }

    public final boolean a() {
        return true;
    }

    public final java.util.List b() {
        if (this.b == null && this.a != null) {
            this.b = new java.util.ArrayList(this.a.size());
            for (defpackage.bnt add : this.a) {
                this.b.add(add);
            }
        }
        return this.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.bnu)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return defpackage.azb.a((java.lang.Object) b(), (java.lang.Object) ((defpackage.bnu) obj).b());
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{b()});
    }
}
