package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
/* renamed from: mf  reason: default package */
/* compiled from: PG */
public final class mf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new mg();
    public mh[] a;
    public int[] b;
    public kx[] c;
    public int d = -1;
    public int e;

    public mf() {
    }

    public mf(Parcel parcel) {
        this.a = (mh[]) parcel.createTypedArray(mh.CREATOR);
        this.b = parcel.createIntArray();
        this.c = (kx[]) parcel.createTypedArray(kx.CREATOR);
        this.d = parcel.readInt();
        this.e = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.a, i);
        parcel.writeIntArray(this.b);
        parcel.writeTypedArray(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }
}
