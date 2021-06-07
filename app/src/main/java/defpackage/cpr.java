package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cpr  reason: default package */
/* compiled from: PG */
final class cpr implements Parcelable.Creator {
    cpr() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new cpq[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new cpq(parcel);
    }
}
