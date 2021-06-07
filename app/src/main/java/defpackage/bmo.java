package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bmo  reason: default package */
/* compiled from: PG */
public final class bmo extends biq {
    public static final Parcelable.Creator CREATOR = new bnb();
    private boolean a;

    public bmo() {
    }

    public bmo(boolean z) {
        this.a = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 2, this.a);
        bjr.r(parcel, q);
    }
}
