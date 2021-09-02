package com.google.android.gms.people.model;

/* compiled from: PG */
public final class AvatarReference extends defpackage.biq implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bns();
    private int a;
    private java.lang.String b;

    public AvatarReference(int i, java.lang.String str) {
        defpackage.azb.a(i != 0);
        this.a = i;
        this.b = str;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.c(parcel, 1, this.a);
        defpackage.bjr.a(parcel, 2, this.b);
        defpackage.bjr.r(parcel, q);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.android.gms.people.model.AvatarReference avatarReference = (com.google.android.gms.people.model.AvatarReference) obj;
        if (this.a == avatarReference.a) {
            if (this.b != null) {
                if (this.b.equals(avatarReference.b)) {
                    return true;
                }
            } else if (avatarReference.b == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), this.b});
    }

    public final java.lang.String toString() {
        return defpackage.azb.a((java.lang.Object) this).a("source", java.lang.Integer.valueOf(this.a)).a("location", this.b).toString();
    }
}
