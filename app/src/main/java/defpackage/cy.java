package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cy  reason: default package */
/* compiled from: PG */
final class cy implements Parcelable.ClassLoaderCreator {
    cy() {
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new cx(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new cx[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new cx(parcel, null);
    }
}
