package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: PG */
public class SignInAccount extends biq implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new awl();
    public GoogleSignInAccount a;
    @Deprecated
    private String b;
    @Deprecated
    private String c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.a = googleSignInAccount;
        this.b = azb.a(str, (Object) "8.3 and 8.4 SDKs require non-null email");
        this.c = azb.a(str2, (Object) "8.3 and 8.4 SDKs require non-null userId");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 4, this.b);
        bjr.a(parcel, 7, this.a, i);
        bjr.a(parcel, 8, this.c);
        bjr.r(parcel, q);
    }
}
