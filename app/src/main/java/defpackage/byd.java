package defpackage;

/* renamed from: byd reason: default package */
/* compiled from: PG */
public final class byd {
    public android.content.Context a;

    public final boolean a() {
        return defpackage.bwj.a(this.a, "android.permission.GET_ACCOUNTS") || defpackage.bwj.f();
    }

    public final java.util.Set b() {
        if (defpackage.bwj.a(this.a, "android.permission.GET_ACCOUNTS")) {
            return c();
        }
        if (defpackage.bwj.f()) {
            return d();
        }
        return java.util.Collections.emptySet();
    }

    private final java.util.Set c() {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (android.accounts.Account account : android.accounts.AccountManager.get(this.a).getAccountsByType("com.google")) {
            hashSet.add(account.name);
        }
        return hashSet;
    }

    @android.annotation.TargetApi(17)
    private final java.util.Set d() {
        defpackage.bty.a("DeviceAccountsUtilImpl", "Try to retrieve accounts list from Accounts ContentProvider.", new java.lang.Object[0]);
        android.content.ContentProviderClient acquireContentProviderClient = this.a.getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
        if (acquireContentProviderClient == null) {
            java.lang.String str = "DeviceAccountsUtilImpl";
            java.lang.String str2 = "Accounts ContentProvider is missing. Trying AccountManager";
            java.lang.Object[] objArr = new java.lang.Object[0];
            if (defpackage.bty.a(5)) {
                android.util.Log.w("Notifications", defpackage.bty.f(str, str2, objArr));
            }
            return c();
        }
        try {
            android.os.Parcelable[] parcelableArray = acquireContentProviderClient.call("get_accounts", "com.google", null).getParcelableArray("accounts");
            java.util.HashSet hashSet = new java.util.HashSet();
            for (android.os.Parcelable parcelable : parcelableArray) {
                hashSet.add(((android.accounts.Account) parcelable).name);
            }
            acquireContentProviderClient.release();
            return hashSet;
        } catch (java.lang.Exception e) {
            defpackage.bty.b("DeviceAccountsUtilImpl", e, "Accounts ContentProvider failed.", new java.lang.Object[0]);
            java.util.Set emptySet = java.util.Collections.emptySet();
            acquireContentProviderClient.release();
            return emptySet;
        } catch (Throwable th) {
            acquireContentProviderClient.release();
            throw th;
        }
    }
}
