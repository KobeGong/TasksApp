package defpackage;

/* renamed from: mf reason: default package */
/* compiled from: PG */
final class FragmentManagerState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.mg();
    public FragmentState[] a;
    public int[] b;
    public BackStackState[] c;
    public int d = -1;
    public int e;

    public FragmentManagerState() {
    }

    public FragmentManagerState(android.os.Parcel parcel) {
        this.a = (FragmentState[]) parcel.createTypedArray(FragmentState.CREATOR);
        this.b = parcel.createIntArray();
        this.c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
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
