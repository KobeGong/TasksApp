package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bkk  reason: default package */
/* compiled from: PG */
public final class bkk extends biq {
    public static final Parcelable.Creator CREATOR = new bkl();
    public final axq a;
    public final bed b;
    private int c;

    bkk(int i, axq axq, bed bed) {
        this.c = i;
        this.a = axq;
        this.b = bed;
    }

    public bkk() {
        this(new axq(8, null));
    }

    private bkk(axq axq) {
        this(1, axq, null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.c(parcel, 1, this.c);
        bjr.a(parcel, 2, this.a, i);
        bjr.a(parcel, 3, this.b, i);
        bjr.r(parcel, q);
    }
}
