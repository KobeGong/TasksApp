package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: aea  reason: default package */
/* compiled from: PG */
public final class aea implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aeb();
    public int a;
    public int b;
    public boolean c;

    public aea() {
    }

    aea(Parcel parcel) {
        boolean z = true;
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt() != 1 ? false : z;
    }

    public aea(aea aea) {
        this.a = aea.a;
        this.b = aea.b;
        this.c = aea.c;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.a >= 0;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
