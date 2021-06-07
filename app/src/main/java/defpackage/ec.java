package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ec  reason: default package */
/* compiled from: PG */
final class ec implements Parcelable.ClassLoaderCreator {
    ec() {
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new eb(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new eb[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new eb(parcel, (ClassLoader) null);
    }
}
