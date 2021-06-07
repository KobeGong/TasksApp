package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bnd  reason: default package */
/* compiled from: PG */
public final class bnd extends biq {
    public static final Parcelable.Creator CREATOR = new bnk();
    private final int a;
    private final String b;

    public bnd(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.c(parcel, 2, this.a);
        bjr.a(parcel, 3, this.b);
        bjr.r(parcel, q);
    }
}
