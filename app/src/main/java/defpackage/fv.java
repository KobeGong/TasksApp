package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: fv  reason: default package */
/* compiled from: PG */
final class fv implements Parcelable.ClassLoaderCreator {
    fv() {
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new fu(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new fu[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new fu(parcel, null);
    }
}
