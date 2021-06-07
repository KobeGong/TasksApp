package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ahd  reason: default package */
/* compiled from: PG */
final class ahd implements Parcelable.ClassLoaderCreator {
    ahd() {
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ahc(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ahc[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ahc(parcel, null);
    }
}
