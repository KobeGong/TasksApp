package com.google.android.gms.auth;

/* compiled from: PG */
public class TokenData extends defpackage.biq implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aws();
    public final java.lang.String a;
    private int b;
    private final java.lang.Long c;
    private final boolean d;
    private final boolean e;
    private final java.util.List f;

    public static com.google.android.gms.auth.TokenData a(android.os.Bundle bundle, java.lang.String str) {
        bundle.setClassLoader(com.google.android.gms.auth.TokenData.class.getClassLoader());
        android.os.Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(com.google.android.gms.auth.TokenData.class.getClassLoader());
        return (com.google.android.gms.auth.TokenData) bundle2.getParcelable("TokenData");
    }

    public TokenData(int i, java.lang.String str, java.lang.Long l, boolean z, boolean z2, java.util.List list) {
        this.b = i;
        this.a = defpackage.azb.b(str);
        this.c = l;
        this.d = z;
        this.e = z2;
        this.f = list;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.auth.TokenData)) {
            return false;
        }
        com.google.android.gms.auth.TokenData tokenData = (com.google.android.gms.auth.TokenData) obj;
        if (!android.text.TextUtils.equals(this.a, tokenData.a) || !defpackage.azb.a((java.lang.Object) this.c, (java.lang.Object) tokenData.c) || this.d != tokenData.d || this.e != tokenData.e || !defpackage.azb.a((java.lang.Object) this.f, (java.lang.Object) tokenData.f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.a, this.c, java.lang.Boolean.valueOf(this.d), java.lang.Boolean.valueOf(this.e), this.f});
    }

    public void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.c(parcel, 1, this.b);
        defpackage.bjr.a(parcel, 2, this.a);
        defpackage.bjr.a(parcel, 3, this.c);
        defpackage.bjr.a(parcel, 4, this.d);
        defpackage.bjr.a(parcel, 5, this.e);
        defpackage.bjr.a(parcel, 6, this.f);
        defpackage.bjr.r(parcel, q);
    }
}
