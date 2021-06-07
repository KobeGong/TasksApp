package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class TokenData extends biq implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aws();
    public final String a;
    private int b;
    private final Long c;
    private final boolean d;
    private final boolean e;
    private final List f;

    public static TokenData a(Bundle bundle, String str) {
        bundle.setClassLoader(TokenData.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(TokenData.class.getClassLoader());
        return (TokenData) bundle2.getParcelable("TokenData");
    }

    public TokenData(int i, String str, Long l, boolean z, boolean z2, List list) {
        this.b = i;
        this.a = azb.b(str);
        this.c = l;
        this.d = z;
        this.e = z2;
        this.f = list;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        if (!TextUtils.equals(this.a, tokenData.a) || !azb.a(this.c, tokenData.c) || this.d != tokenData.d || this.e != tokenData.e || !azb.a(this.f, tokenData.f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f});
    }

    public void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.c(parcel, 1, this.b);
        bjr.a(parcel, 2, this.a);
        bjr.a(parcel, 3, this.c);
        bjr.a(parcel, 4, this.d);
        bjr.a(parcel, 5, this.e);
        bjr.a(parcel, 6, this.f);
        bjr.r(parcel, q);
    }
}
