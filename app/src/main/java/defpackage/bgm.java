package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bgm  reason: default package */
/* compiled from: PG */
public final class bgm extends biq {
    public static final Parcelable.Creator CREATOR = new bgt();
    private String a;
    private boolean b;

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 2, this.a);
        bjr.a(parcel, 3, this.b);
        bjr.r(parcel, q);
    }

    bgm(String str, boolean z) {
        this.a = str;
        this.b = z;
    }
}
