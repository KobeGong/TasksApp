package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bme  reason: default package */
/* compiled from: PG */
public final class bme extends biq {
    public static final Parcelable.Creator CREATOR = new bmr();
    private bmm a;

    public bme() {
    }

    public bme(bmm bmm) {
        this.a = bmm;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 2, this.a, i);
        bjr.r(parcel, q);
    }

    public final String toString() {
        return azb.a(this).a("person", this.a).toString();
    }
}
