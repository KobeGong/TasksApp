package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rm  reason: default package */
/* compiled from: PG */
final class rm implements Parcelable.ClassLoaderCreator {
    rm() {
    }

    private static rl a(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return rl.d;
        }
        throw new IllegalStateException("superState must be null");
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new rl[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
