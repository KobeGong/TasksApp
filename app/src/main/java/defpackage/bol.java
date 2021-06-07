package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bol  reason: default package */
/* compiled from: PG */
public final class bol extends biq implements Parcelable, bcs {
    public static final Parcelable.Creator CREATOR = new bok();
    private final Integer a;
    private final Boolean b;

    public bol(Integer num, Boolean bool) {
        this.a = num;
        this.b = bool;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, this.a);
        Boolean bool = this.b;
        if (bool != null) {
            bjr.b(parcel, 4, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        bjr.r(parcel, q);
    }

    @Override // defpackage.bcs
    public final boolean a() {
        return true;
    }
}
