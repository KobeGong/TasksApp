package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bgn  reason: default package */
/* compiled from: PG */
public final class bgn extends biq {
    public static final Parcelable.Creator CREATOR = new bgu();
    public int a;
    private int b;

    bgn(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public bgn() {
        this(0, 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.c(parcel, 2, this.a);
        bjr.c(parcel, 3, this.b);
        bjr.r(parcel, q);
    }
}
