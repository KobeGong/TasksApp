package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bhl  reason: default package */
/* compiled from: PG */
public final class bhl extends biq {
    public static final Parcelable.Creator CREATOR = new bhm();
    private int a;
    private String b;
    private Intent c;

    public bhl(int i, String str, Intent intent) {
        this.a = i;
        this.b = str;
        this.c = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.c(parcel, 2, this.a);
        bjr.a(parcel, 3, this.b);
        bjr.a(parcel, 4, this.c, i);
        bjr.r(parcel, q);
    }
}
