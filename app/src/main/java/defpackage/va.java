package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: va  reason: default package */
/* compiled from: PG */
final class va implements Parcelable.Creator {
    va() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new uz[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new uz(parcel);
    }
}
