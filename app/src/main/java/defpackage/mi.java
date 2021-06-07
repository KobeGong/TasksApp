package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: mi  reason: default package */
/* compiled from: PG */
final class mi implements Parcelable.Creator {
    mi() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new mh[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new mh(parcel);
    }
}
