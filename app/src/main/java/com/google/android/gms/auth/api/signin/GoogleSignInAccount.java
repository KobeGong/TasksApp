package com.google.android.gms.auth.api.signin;

/* compiled from: PG */
public class GoogleSignInAccount extends defpackage.biq implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.awi();
    private static defpackage.bex c = defpackage.bey.a;
    public java.lang.String a;
    public java.lang.String b;
    private int d;
    private java.lang.String e;
    private java.lang.String f;
    private java.lang.String g;
    private android.net.Uri h;
    private java.lang.String i;
    private long j;
    private java.util.List k;
    private java.lang.String l;
    private java.lang.String m;
    private java.util.Set n = new java.util.HashSet();

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount a(java.lang.String str) {
        java.lang.Long l2;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        android.net.Uri uri = null;
        java.lang.String optString = jSONObject.optString("photoUrl", null);
        if (!android.text.TextUtils.isEmpty(optString)) {
            uri = android.net.Uri.parse(optString);
        }
        long parseLong = java.lang.Long.parseLong(jSONObject.getString("expirationTime"));
        java.util.HashSet hashSet = new java.util.HashSet();
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new com.google.android.gms.common.api.Scope(jSONArray.getString(i2)));
        }
        java.lang.String optString2 = jSONObject.optString("id");
        java.lang.String optString3 = jSONObject.optString("tokenId", null);
        java.lang.String optString4 = jSONObject.optString("email", null);
        java.lang.String optString5 = jSONObject.optString("displayName", null);
        java.lang.String optString6 = jSONObject.optString("givenName", null);
        java.lang.String optString7 = jSONObject.optString("familyName", null);
        java.lang.Long valueOf = java.lang.Long.valueOf(parseLong);
        java.lang.String string = jSONObject.getString("obfuscatedIdentifier");
        if (valueOf == null) {
            l2 = java.lang.Long.valueOf(c.a() / 1000);
        } else {
            l2 = valueOf;
        }
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = new com.google.android.gms.auth.api.signin.GoogleSignInAccount(3, optString2, optString3, optString4, optString5, uri, null, l2.longValue(), defpackage.azb.b(string), new java.util.ArrayList((java.util.Collection) defpackage.azb.b((java.lang.Object) hashSet)), optString6, optString7);
        googleSignInAccount.i = jSONObject.optString("serverAuthCode", null);
        return googleSignInAccount;
    }

    public GoogleSignInAccount(int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.net.Uri uri, java.lang.String str5, long j2, java.lang.String str6, java.util.List list, java.lang.String str7, java.lang.String str8) {
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

    public final java.util.Set a() {
        java.util.HashSet hashSet = new java.util.HashSet(this.k);
        hashSet.addAll(this.n);
        return hashSet;
    }

    public void writeToParcel(android.os.Parcel parcel, int i2) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.c(parcel, 1, this.d);
        defpackage.bjr.a(parcel, 2, this.e);
        defpackage.bjr.a(parcel, 3, this.f);
        defpackage.bjr.a(parcel, 4, this.a);
        defpackage.bjr.a(parcel, 5, this.g);
        defpackage.bjr.a(parcel, 6, (android.os.Parcelable) this.h, i2);
        defpackage.bjr.a(parcel, 7, this.i);
        defpackage.bjr.a(parcel, 8, this.j);
        defpackage.bjr.a(parcel, 9, this.b);
        defpackage.bjr.b(parcel, 10, this.k);
        defpackage.bjr.a(parcel, 11, this.l);
        defpackage.bjr.a(parcel, 12, this.m);
        defpackage.bjr.r(parcel, q);
    }

    public int hashCode() {
        return ((this.b.hashCode() + 527) * 31) + a().hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.auth.api.signin.GoogleSignInAccount)) {
            return false;
        }
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) obj;
        if (!googleSignInAccount.b.equals(this.b) || !googleSignInAccount.a().equals(a())) {
            return false;
        }
        return true;
    }

    public final org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
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
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            com.google.android.gms.common.api.Scope[] scopeArr = (com.google.android.gms.common.api.Scope[]) this.k.toArray(new com.google.android.gms.common.api.Scope[this.k.size()]);
            java.util.Arrays.sort(scopeArr, defpackage.awh.a);
            for (com.google.android.gms.common.api.Scope scope : scopeArr) {
                jSONArray.put(scope.a);
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (org.json.JSONException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }
}
