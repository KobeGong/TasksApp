package com.google.android.gms.auth.api.signin;

/* compiled from: PG */
public class GoogleSignInOptions extends defpackage.biq implements defpackage.aye, com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.awk();
    public static final com.google.android.gms.common.api.Scope a = new com.google.android.gms.common.api.Scope("openid");
    public static final com.google.android.gms.common.api.Scope b = new com.google.android.gms.common.api.Scope("https://www.googleapis.com/auth/games_lite");
    public static final com.google.android.gms.common.api.Scope c = new com.google.android.gms.common.api.Scope("https://www.googleapis.com/auth/games");
    public static final com.google.android.gms.auth.api.signin.GoogleSignInOptions d;
    private static final com.google.android.gms.common.api.Scope e = new com.google.android.gms.common.api.Scope("profile");
    private static java.util.Comparator o = new defpackage.awj();
    private int f;
    /* access modifiers changed from: private */
    public final java.util.ArrayList g;
    /* access modifiers changed from: private */
    public android.accounts.Account h;
    /* access modifiers changed from: private */
    public boolean i;
    /* access modifiers changed from: private */
    public final boolean j;
    /* access modifiers changed from: private */
    public final boolean k;
    /* access modifiers changed from: private */
    public java.lang.String l;
    /* access modifiers changed from: private */
    public java.lang.String m;
    /* access modifiers changed from: private */
    public java.util.ArrayList n;

    public static com.google.android.gms.auth.api.signin.GoogleSignInOptions a(java.lang.String str) {
        android.accounts.Account account;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.util.HashSet hashSet = new java.util.HashSet();
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new com.google.android.gms.common.api.Scope(jSONArray.getString(i2)));
        }
        java.lang.String optString = jSONObject.optString("accountName", null);
        if (!android.text.TextUtils.isEmpty(optString)) {
            account = new android.accounts.Account(optString, "com.google");
        } else {
            account = null;
        }
        return new com.google.android.gms.auth.api.signin.GoogleSignInOptions(3, new java.util.ArrayList(hashSet), account, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null), (java.util.Map) new java.util.HashMap());
    }

    public GoogleSignInOptions(int i2, java.util.ArrayList arrayList, android.accounts.Account account, boolean z, boolean z2, boolean z3, java.lang.String str, java.lang.String str2, java.util.ArrayList arrayList2) {
        this(i2, arrayList, account, z, z2, z3, str, str2, b((java.util.List) arrayList2));
    }

    public GoogleSignInOptions(int i2, java.util.ArrayList arrayList, android.accounts.Account account, boolean z, boolean z2, boolean z3, java.lang.String str, java.lang.String str2, java.util.Map map) {
        this.f = i2;
        this.g = arrayList;
        this.h = account;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = str;
        this.m = str2;
        this.n = new java.util.ArrayList(map.values());
    }

    public final java.util.ArrayList a() {
        return new java.util.ArrayList(this.g);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<avx>, for r4v0, types: [java.util.List, java.util.List<avx>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map b(java.util.List<defpackage.avx> r4) {
        /*
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            if (r4 != 0) goto L_0x0009
            r0 = r1
        L_0x0008:
            return r0
        L_0x0009:
            java.util.Iterator r2 = r4.iterator()
        L_0x000d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = r2.next()
            avx r0 = (defpackage.avx) r0
            int r3 = r0.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.put(r3, r0)
            goto L_0x000d
        L_0x0023:
            r0 = r1
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.b(java.util.List):java.util.Map");
    }

    public void writeToParcel(android.os.Parcel parcel, int i2) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.c(parcel, 1, this.f);
        defpackage.bjr.b(parcel, 2, (java.util.List) a());
        defpackage.bjr.a(parcel, 3, (android.os.Parcelable) this.h, i2);
        defpackage.bjr.a(parcel, 4, this.i);
        defpackage.bjr.a(parcel, 5, this.j);
        defpackage.bjr.a(parcel, 6, this.k);
        defpackage.bjr.a(parcel, 7, this.l);
        defpackage.bjr.a(parcel, 8, this.m);
        defpackage.bjr.b(parcel, 9, (java.util.List) this.n);
        defpackage.bjr.r(parcel, q);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) obj;
            if (this.n.size() > 0 || googleSignInOptions.n.size() > 0 || this.g.size() != googleSignInOptions.a().size() || !this.g.containsAll(googleSignInOptions.a())) {
                return false;
            }
            if (this.h == null) {
                if (googleSignInOptions.h != null) {
                    return false;
                }
            } else if (!this.h.equals(googleSignInOptions.h)) {
                return false;
            }
            if (android.text.TextUtils.isEmpty(this.l)) {
                if (!android.text.TextUtils.isEmpty(googleSignInOptions.l)) {
                    return false;
                }
            } else if (!this.l.equals(googleSignInOptions.l)) {
                return false;
            }
            if (this.k == googleSignInOptions.k && this.i == googleSignInOptions.i && this.j == googleSignInOptions.j) {
                return true;
            }
            return false;
        } catch (java.lang.ClassCastException e2) {
            return false;
        }
    }

    public int hashCode() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.g;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            java.lang.Object obj = arrayList2.get(i2);
            i2++;
            arrayList.add(((com.google.android.gms.common.api.Scope) obj).a);
        }
        java.util.Collections.sort(arrayList);
        return new defpackage.avz().a((java.lang.Object) arrayList).a((java.lang.Object) this.h).a((java.lang.Object) this.l).a(this.k).a(this.i).a(this.j).a;
    }

    public final org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Collections.sort(this.g, o);
            java.util.ArrayList arrayList = this.g;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                java.lang.Object obj = arrayList.get(i2);
                i2++;
                jSONArray.put(((com.google.android.gms.common.api.Scope) obj).a);
            }
            jSONObject.put("scopes", jSONArray);
            if (this.h != null) {
                jSONObject.put("accountName", this.h.name);
            }
            jSONObject.put("idTokenRequested", this.i);
            jSONObject.put("forceCodeForRefreshToken", this.k);
            jSONObject.put("serverAuthRequested", this.j);
            if (!android.text.TextUtils.isEmpty(this.l)) {
                jSONObject.put("serverClientId", this.l);
            }
            if (!android.text.TextUtils.isEmpty(this.m)) {
                jSONObject.put("hostedDomain", this.m);
            }
            return jSONObject;
        } catch (org.json.JSONException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    static {
        new com.google.android.gms.common.api.Scope("email");
        defpackage.avp a2 = new defpackage.avp().a();
        a2.a.add(e);
        d = a2.b();
        new defpackage.avp().a(b, new com.google.android.gms.common.api.Scope[0]).b();
    }
}
