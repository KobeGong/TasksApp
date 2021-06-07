package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dv  reason: default package */
/* compiled from: PG */
final class dv implements Parcelable.ClassLoaderCreator {
    dv() {
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new du(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new du[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new du(parcel, null);
    }
}
