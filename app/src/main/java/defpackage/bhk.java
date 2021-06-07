package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bhk  reason: default package */
/* compiled from: PG */
public final class bhk extends biq {
    public static final Parcelable.Creator CREATOR = new bhp();
    private String a;
    private String b;
    private String c;
    private String d;

    public bhk(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str4;
        this.d = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 2, this.a);
        bjr.a(parcel, 3, this.b);
        bjr.a(parcel, 4, this.c);
        bjr.a(parcel, 5, this.d);
        bjr.r(parcel, q);
    }
}
