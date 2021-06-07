package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
public class GoogleSignInOptions extends biq implements aye, ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new awk();
    public static final Scope a = new Scope("openid");
    public static final Scope b = new Scope("https://www.googleapis.com/auth/games_lite");
    public static final Scope c = new Scope("https://www.googleapis.com/auth/games");
    public static final GoogleSignInOptions d;
    private static final Scope e = new Scope("profile");
    private static Comparator o = new awj();
    private int f;
    private final ArrayList g;
    private Account h;
    private boolean i;
    private final boolean j;
    private final boolean k;
    private String l;
    private String m;
    private ArrayList n;

    public static GoogleSignInOptions a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        String optString = jSONObject.optString("accountName", null);
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null), new HashMap());
    }

    public GoogleSignInOptions(int i2, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList arrayList2) {
        this(i2, arrayList, account, z, z2, z3, str, str2, b(arrayList2));
    }

    public GoogleSignInOptions(int i2, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map) {
        this.f = i2;
        this.g = arrayList;
        this.h = account;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = str;
        this.m = str2;
        this.n = new ArrayList(map.values());
    }

    public final ArrayList a() {
        return new ArrayList(this.g);
    }

    /* access modifiers changed from: private */
    public static Map b(List list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            avx avx = (avx) it.next();
            hashMap.put(Integer.valueOf(avx.a), avx);
        }
        return hashMap;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int q = bjr.q(parcel, 20293);
        bjr.c(parcel, 1, this.f);
        bjr.b(parcel, 2, a());
        bjr.a(parcel, 3, this.h, i2);
        bjr.a(parcel, 4, this.i);
        bjr.a(parcel, 5, this.j);
        bjr.a(parcel, 6, this.k);
        bjr.a(parcel, 7, this.l);
        bjr.a(parcel, 8, this.m);
        bjr.b(parcel, 9, this.n);
        bjr.r(parcel, q);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
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
            if (TextUtils.isEmpty(this.l)) {
                if (!TextUtils.isEmpty(googleSignInOptions.l)) {
                    return false;
                }
            } else if (!this.l.equals(googleSignInOptions.l)) {
                return false;
            }
            if (this.k == googleSignInOptions.k && this.i == googleSignInOptions.i && this.j == googleSignInOptions.j) {
                return true;
            }
            return false;
        } catch (ClassCastException e2) {
            return false;
        }
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.g;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            arrayList.add(((Scope) obj).a);
        }
        Collections.sort(arrayList);
        return new avz().a(arrayList).a(this.h).a(this.l).a(this.k).a(this.i).a(this.j).a;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.g, o);
            ArrayList arrayList = this.g;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                jSONArray.put(((Scope) obj).a);
            }
            jSONObject.put("scopes", jSONArray);
            if (this.h != null) {
                jSONObject.put("accountName", this.h.name);
            }
            jSONObject.put("idTokenRequested", this.i);
            jSONObject.put("forceCodeForRefreshToken", this.k);
            jSONObject.put("serverAuthRequested", this.j);
            if (!TextUtils.isEmpty(this.l)) {
                jSONObject.put("serverClientId", this.l);
            }
            if (!TextUtils.isEmpty(this.m)) {
                jSONObject.put("hostedDomain", this.m);
            }
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    static {
        new Scope("email");
        avp a2 = new avp().a();
        a2.a.add(e);
        d = a2.b();
        new avp().a(b, new Scope[0]).b();
    }
}
