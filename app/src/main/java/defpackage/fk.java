package defpackage;

/* renamed from: fk reason: default package */
/* compiled from: PG */
public final class fk extends android.util.SparseArray implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.fl();

    public fk() {
    }

    public fk(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        android.os.Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i = 0; i < readInt; i++) {
            put(iArr[i], readParcelableArray[i]);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int size = size();
        int[] iArr = new int[size];
        android.os.Parcelable[] parcelableArr = new android.os.Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = keyAt(i2);
            parcelableArr[i2] = (android.os.Parcelable) valueAt(i2);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
