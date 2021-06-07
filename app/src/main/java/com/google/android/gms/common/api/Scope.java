package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: PG */
public final class Scope extends biq implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bcp();
    public final String a;
    private int b;

    public Scope(int i, String str) {
        azb.a(str, (Object) "scopeUri must not be null or empty");
        this.b = i;
        this.a = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.a.equals(((Scope) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.c(parcel, 1, this.b);
        bjr.a(parcel, 2, this.a);
        bjr.r(parcel, q);
    }
}
