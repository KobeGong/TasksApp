package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bki  reason: default package */
/* compiled from: PG */
public final class bki extends biq {
    public static final Parcelable.Creator CREATOR = new bkj();
    private int a;
    private beb b;

    bki(int i, beb beb) {
        this.a = i;
        this.b = beb;
    }

    public bki(beb beb) {
        this(1, beb);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.c(parcel, 1, this.a);
        bjr.a(parcel, 2, this.b, i);
        bjr.r(parcel, q);
    }
}
