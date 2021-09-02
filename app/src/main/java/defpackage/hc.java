package defpackage;

/* renamed from: hc reason: default package */
/* compiled from: PG */
public final class hc extends defpackage.rl {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.hd();
    public android.util.SparseArray a;

    public hc(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        android.os.Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.a = new android.util.SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.a.append(iArr[i], readParcelableArray[i]);
        }
    }

    public hc(android.os.Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int i2 = this.a != null ? this.a.size() : 0;
        parcel.writeInt(i2);
        int[] iArr = new int[i2];
        android.os.Parcelable[] parcelableArr = new android.os.Parcelable[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = this.a.keyAt(i3);
            parcelableArr[i3] = (android.os.Parcelable) this.a.valueAt(i3);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
