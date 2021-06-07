package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: aeb  reason: default package */
/* compiled from: PG */
final class aeb implements Parcelable.Creator {
    aeb() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new aea[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new aea(parcel);
    }
}
