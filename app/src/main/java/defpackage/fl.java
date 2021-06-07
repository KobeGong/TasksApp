package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: fl  reason: default package */
/* compiled from: PG */
final class fl implements Parcelable.ClassLoaderCreator {
    fl() {
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new fk(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new fk[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new fk(parcel, null);
    }
}
