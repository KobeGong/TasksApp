package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: agm  reason: default package */
/* compiled from: PG */
final class agm implements Parcelable.ClassLoaderCreator {
    agm() {
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new agl(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new agl[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new agl(parcel, null);
    }
}
