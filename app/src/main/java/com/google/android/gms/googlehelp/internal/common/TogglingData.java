package com.google.android.gms.googlehelp.internal.common;

/* compiled from: PG */
public class TogglingData extends defpackage.biq implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bhn();
    private java.lang.String a;
    private java.lang.String b;
    private java.lang.String c;

    public TogglingData(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    private TogglingData() {
    }

    public void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 2, this.a);
        defpackage.bjr.a(parcel, 3, this.b);
        defpackage.bjr.a(parcel, 4, this.c);
        defpackage.bjr.r(parcel, q);
    }
}
