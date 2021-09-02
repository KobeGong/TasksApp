package com.google.android.gms.auth.api.signin;

/* compiled from: PG */
public class SignInAccount extends defpackage.biq implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.awl();
    public com.google.android.gms.auth.api.signin.GoogleSignInAccount a;
    @java.lang.Deprecated
    private java.lang.String b;
    @java.lang.Deprecated
    private java.lang.String c;

    public SignInAccount(java.lang.String str, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, java.lang.String str2) {
        this.a = googleSignInAccount;
        this.b = defpackage.azb.a(str, (java.lang.Object) "8.3 and 8.4 SDKs require non-null email");
        this.c = defpackage.azb.a(str2, (java.lang.Object) "8.3 and 8.4 SDKs require non-null userId");
    }

    public void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 4, this.b);
        defpackage.bjr.a(parcel, 7, (android.os.Parcelable) this.a, i);
        defpackage.bjr.a(parcel, 8, this.c);
        defpackage.bjr.r(parcel, q);
    }
}
