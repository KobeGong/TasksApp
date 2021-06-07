package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
public class GoogleSignInAccount extends biq implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new awi();
    private static bex c = bey.a;
    public String a;
    public String b;
    private int d;
    private String e;
    private String f;
    private String g;
    private Uri h;
    private String i;
    private long j;
    private List k;
    private String l;
    private String m;
    private Set n = new HashSet();

    public static GoogleSignInAccount a(String str) {
        Long l2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        Uri uri = null;
        String optString = jSONObject.optString("photoUrl", null);
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.optString("tokenId", null);
        String optString4 = jSONObject.optString("email", null);
        String optString5 = jSONObject.optString("displayName", null);
        String optString6 = jSONObject.optString("givenName", null);
        String optString7 = jSONObject.optString("familyName", null);
        Long valueOf = Long.valueOf(parseLong);
        String string = jSONObject.getString("obfuscatedIdentifier");
        if (valueOf == null) {
            l2 = Long.valueOf(c.a() / 1000);
        } else {
            l2 = valueOf;
        }
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, uri, null, l2.longValue(), azb.b(string), new ArrayList((Collection) azb.b(hashSet)), optString6, optString7);
        googleSignInAccount.i = jSONObject.optString("serverAuthCode", null);
        return googleSignInAccount;
    }

    public GoogleSignInAccount(int i2, String str, String str2, String str3, String str4, Uri uri, String str5, long j2, String str6, List list, String str7, String str8) {
        this.d = i2;
        this.e = str;
        this.f = str2;
        this.a = str3;
        this.g = str4;
        this.h = uri;
        this.i = str5;
        this.j = j2;
        this.b = str6;
        this.k = list;
        this.l = str7;
        this.m = str8;
    }

    public final Set a() {
        HashSet hashSet = new HashSet(this.k);
        hashSet.addAll(this.n);
        return hashSet;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int q = bjr.q(parcel, 20293);
        bjr.c(parcel, 1, this.d);
        bjr.a(parcel, 2, this.e);
        bjr.a(parcel, 3, this.f);
        bjr.a(parcel, 4, this.a);
        bjr.a(parcel, 5, this.g);
        bjr.a(parcel, 6, this.h, i2);
        bjr.a(parcel, 7, this.i);
        bjr.a(parcel, 8, this.j);
        bjr.a(parcel, 9, this.b);
        bjr.b(parcel, 10, this.k);
        bjr.a(parcel, 11, this.l);
        bjr.a(parcel, 12, this.m);
        bjr.r(parcel, q);
    }

    public int hashCode() {
        return ((this.b.hashCode() + 527) * 31) + a().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.b.equals(this.b) && googleSignInAccount.a().equals(a());
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.e != null) {
                jSONObject.put("id", this.e);
            }
            if (this.f != null) {
                jSONObject.put("tokenId", this.f);
            }
            if (this.a != null) {
                jSONObject.put("email", this.a);
            }
            if (this.g != null) {
                jSONObject.put("displayName", this.g);
            }
            if (this.l != null) {
                jSONObject.put("givenName", this.l);
            }
            if (this.m != null) {
                jSONObject.put("familyName", this.m);
            }
            if (this.h != null) {
                jSONObject.put("photoUrl", this.h.toString());
            }
            if (this.i != null) {
                jSONObject.put("serverAuthCode", this.i);
            }
            jSONObject.put("expirationTime", this.j);
            jSONObject.put("obfuscatedIdentifier", this.b);
            JSONArray jSONArray = new JSONArray();
            Scope[] scopeArr = (Scope[]) this.k.toArray(new Scope[this.k.size()]);
            Arrays.sort(scopeArr, awh.a);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.a);
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }
}
