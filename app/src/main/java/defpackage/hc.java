package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* renamed from: hc  reason: default package */
/* compiled from: PG */
public final class hc extends rl {
    public static final Parcelable.Creator CREATOR = new hd();
    public SparseArray a;

    public hc(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.a = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.a.append(iArr[i], readParcelableArray[i]);
        }
    }

    public hc(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // defpackage.rl
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.a != null ? this.a.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.a.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.a.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
