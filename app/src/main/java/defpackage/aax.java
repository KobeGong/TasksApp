package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: aax  reason: default package */
/* compiled from: PG */
final class aax implements Parcelable.Creator {
    aax() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new aaw[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new aaw(parcel);
    }
}
