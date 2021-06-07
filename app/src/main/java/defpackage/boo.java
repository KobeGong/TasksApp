package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: boo  reason: default package */
/* compiled from: PG */
public final class boo extends biq implements bom {
    public static final Parcelable.Creator CREATOR = new bon();
    private final bol a;
    private final String b;
    private final String c;

    public boo(bol bol, String str, String str2) {
        this.a = bol;
        this.b = str;
        this.c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 2, this.a, i);
        bjr.a(parcel, 3, this.b);
        bjr.a(parcel, 4, this.c);
        bjr.r(parcel, q);
    }

    @Override // defpackage.bcs
    public final boolean a() {
        return true;
    }
}
