package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: boa  reason: default package */
/* compiled from: PG */
public final class boa extends biq implements bny {
    public static final Parcelable.Creator CREATOR = new bnz();
    private final bol a;
    private final Long b;

    public boa(bol bol, Long l) {
        this.a = bol;
        this.b = l;
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
