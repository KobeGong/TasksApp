package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: PG */
public class TogglingData extends biq implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bhn();
    private String a;
    private String b;
    private String c;

    public TogglingData(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    private TogglingData() {
    }

    public void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 2, this.a);
        bjr.a(parcel, 3, this.b);
        bjr.a(parcel, 4, this.c);
        bjr.r(parcel, q);
    }
}
