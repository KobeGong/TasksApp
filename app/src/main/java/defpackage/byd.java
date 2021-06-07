package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.TargetApi;
import android.content.ContentProviderClient;
import android.content.Context;
import android.os.Parcelable;
import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: byd  reason: default package */
/* compiled from: PG */
public final class byd {
    public Context a;

    public final boolean a() {
        return bwj.a(this.a, "android.permission.GET_ACCOUNTS") || bwj.f();
    }

    public final Set b() {
        if (bwj.a(this.a, "android.permission.GET_ACCOUNTS")) {
            return c();
        }
        if (bwj.f()) {
            return d();
        }
        return Collections.emptySet();
    }

    private final Set c() {
        HashSet hashSet = new HashSet();
        for (Account account : AccountManager.get(this.a).getAccountsByType("com.google")) {
            hashSet.add(account.name);
        }
        return hashSet;
    }

    @TargetApi(17)
    private final Set d() {
        bty.a("DeviceAccountsUtilImpl", "Try to retrieve accounts list from Accounts ContentProvider.", new Object[0]);
        ContentProviderClient acquireContentProviderClient = this.a.getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
        if (acquireContentProviderClient == null) {
            Object[] objArr = new Object[0];
            if (bty.a(5)) {
                Log.w("Notifications", bty.f("DeviceAccountsUtilImpl", "Accounts ContentProvider is missing. Trying AccountManager", objArr));
            }
            return c();
        }
        try {
            Parcelable[] parcelableArray = acquireContentProviderClient.call("get_accounts", "com.google", null).getParcelableArray("accounts");
            HashSet hashSet = new HashSet();
            for (Parcelable parcelable : parcelableArray) {
                hashSet.add(((Account) parcelable).name);
            }
            return hashSet;
        } catch (Exception e) {
            bty.b("DeviceAccountsUtilImpl", e, "Accounts ContentProvider failed.", new Object[0]);
            return Collections.emptySet();
        } finally {
            acquireContentProviderClient.release();
        }
    }
}
