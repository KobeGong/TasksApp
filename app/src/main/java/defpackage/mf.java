package defpackage;

/* renamed from: mf reason: default package */
/* compiled from: PG */
final class mf implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.mg();
    public defpackage.mh[] a;
    public int[] b;
    public defpackage.kx[] c;
    public int d = -1;
    public int e;

    public mf() {
    }

    public mf(android.os.Parcel parcel) {
        this.a = (defpackage.mh[]) parcel.createTypedArray(defpackage.mh.CREATOR);
        this.b = parcel.createIntArray();
        this.c = (defpackage.kx[]) parcel.createTypedArray(defpackage.kx.CREATOR);
        this.d = parcel.readInt();
        this.e = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeTypedArray(this.a, i);
        parcel.writeIntArray(this.b);
        parcel.writeTypedArray(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }
}
