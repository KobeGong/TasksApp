package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ky  reason: default package */
/* compiled from: PG */
final class ky implements Parcelable.Creator {
    ky() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new kx[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new kx(parcel);
    }
}
