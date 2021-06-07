package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: afr  reason: default package */
/* compiled from: PG */
final class afr implements Parcelable.ClassLoaderCreator {
    afr() {
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new afq(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new afq[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new afq(parcel, null);
    }
}
