package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: hd  reason: default package */
/* compiled from: PG */
final class hd implements Parcelable.ClassLoaderCreator {
    hd() {
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new hc(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new hc[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new hc(parcel, null);
    }
}
