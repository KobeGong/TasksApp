package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bod  reason: default package */
/* compiled from: PG */
public final class bod extends biq implements bob {
    public static final Parcelable.Creator CREATOR = new boc();
    private final bol a;
    private final String b;

    public bod(bol bol, String str) {
        this.a = bol;
        this.b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 2, this.a, i);
        bjr.a(parcel, 3, this.b);
        bjr.r(parcel, q);
    }

    @Override // defpackage.bcs
    public final boolean a() {
        return true;
    }
}
