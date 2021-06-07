package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: aaw  reason: default package */
/* compiled from: PG */
final class aaw implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aax();
    public int a;

    aaw() {
    }

    aaw(Parcel parcel) {
        this.a = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
