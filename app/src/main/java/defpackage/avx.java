package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: avx  reason: default package */
/* compiled from: PG */
public final class avx extends biq {
    public static final Parcelable.Creator CREATOR = new avw();
    public int a;
    private int b;
    private Bundle c;

    avx(int i, int i2, Bundle bundle) {
        this.b = i;
        this.a = i2;
        this.c = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.c(parcel, 1, this.b);
        bjr.c(parcel, 2, this.a);
        bjr.a(parcel, 3, this.c);
        bjr.r(parcel, q);
    }
}
