package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bmg  reason: default package */
/* compiled from: PG */
public final class bmg extends biq {
    public static final Parcelable.Creator CREATOR = new bmt();
    private final boolean a;
    private final String b;

    bmg(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final String toString() {
        return azb.a(this).a("isLastCallback", Boolean.valueOf(this.a)).a("query", this.b).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 2, this.a);
        bjr.a(parcel, 3, this.b);
        bjr.r(parcel, q);
    }
}
