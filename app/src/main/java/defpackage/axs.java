package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: axs  reason: default package */
/* compiled from: PG */
public final class axs extends biq {
    public static final Parcelable.Creator CREATOR = new bfb();
    private final String a;
    private final int b;

    public axs(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 1, this.a);
        bjr.c(parcel, 2, this.b);
        bjr.r(parcel, q);
    }
}
