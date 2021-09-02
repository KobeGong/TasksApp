package com.google.android.gms.common.api;

/* compiled from: PG */
public final class Scope extends defpackage.biq implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bcp();
    public final java.lang.String a;
    private int b;

    public Scope(int i, java.lang.String str) {
        defpackage.azb.a(str, (java.lang.Object) "scopeUri must not be null or empty");
        this.b = i;
        this.a = str;
    }

    public Scope(java.lang.String str) {
        this(1, str);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.common.api.Scope)) {
            return false;
        }
        return this.a.equals(((com.google.android.gms.common.api.Scope) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return this.a;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.c(parcel, 1, this.b);
        defpackage.bjr.a(parcel, 2, this.a);
        defpackage.bjr.r(parcel, q);
    }
}
