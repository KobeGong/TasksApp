package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: mg  reason: default package */
/* compiled from: PG */
final class mg implements Parcelable.Creator {
    mg() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new mf[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new mf(parcel);
    }
}
