package defpackage;

import android.accounts.Account;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.auth.TokenData;
import java.io.IOException;

/* renamed from: avc  reason: default package */
/* compiled from: PG */
public class avc {
    @SuppressLint({"InlinedApi"})
    public static final String a = "androidPackageName";
    public static final ComponentName b = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    public static final bjb c = new bjb("Auth", "GoogleAuthUtil");
    private static final String[] d = {"com.google", "com.google.work", "cn.google"};

    public static String b(Context context, Account account, String str) {
        return a(context, account, str, new Bundle());
    }

    public static String a(Context context, Account account, String str, Bundle bundle) {
        a(account);
        azb.c("Calling this from your main thread can lead to deadlock");
        azb.a(str, (Object) "Scope cannot be empty or null.");
        a(account);
        a(context);
        Bundle bundle2 = new Bundle(bundle);
        String str2 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str2);
        if (TextUtils.isEmpty(bundle2.getString(a))) {
            bundle2.putString(a, str2);
        }
        bundle2.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        return ((TokenData) a(context, b, new awq(account, str, bundle2))).a;
    }

    @TargetApi(23)
    static Account[] d(Context context, String str) {
        axv.b(context);
        ContentProviderClient acquireContentProviderClient = ((Context) azb.b(context)).getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
        if (acquireContentProviderClient == null) {
            throw new RemoteException("The com.google.android.gms.auth.accounts provider is not available.");
        }
        try {
            Parcelable[] parcelableArray = acquireContentProviderClient.call("get_accounts", str, new Bundle()).getParcelableArray("accounts");
            Account[] accountArr = new Account[parcelableArray.length];
            for (int i = 0; i < parcelableArray.length; i++) {
                accountArr[i] = (Account) parcelableArray[i];
            }
            acquireContentProviderClient.release();
            return accountArr;
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new RemoteException(valueOf.length() != 0 ? "Accounts ContentProvider failed: ".concat(valueOf) : new String("Accounts ContentProvider failed: "));
        } catch (Throwable th) {
            acquireContentProviderClient.release();
            throw th;
        }
    }

    private static void a(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        } else if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        } else {
            for (String str : d) {
                if (str.equals(account.type)) {
                    return;
                }
            }
            throw new IllegalArgumentException("Account type not supported");
        }
    }

    static void a(Context context) {
        try {
            axz.c(context.getApplicationContext());
        } catch (axx e) {
            throw new ave(e.a, e.getMessage(), new Intent(e.b));
        } catch (axw e2) {
            throw new ava(e2.getMessage());
        }
    }

    static Object a(Context context, ComponentName componentName, avd avd) {
        bez bez = new bez();
        bdn a2 = bdn.a(context);
        if (a2.a(new bdo(componentName), bez)) {
            try {
                azb.c("BlockingServiceConnection.getService() called on main thread");
                if (bez.a) {
                    throw new IllegalStateException("Cannot call get on this connection more than once");
                }
                bez.a = true;
                Object a3 = avd.a((IBinder) bez.b.take());
                a2.a(componentName, bez);
                return a3;
            } catch (RemoteException | InterruptedException e) {
                c.c("GoogleAuthUtil", "Error on service connection.", e);
                throw new IOException("Error on service connection.", e);
            } catch (Throwable th) {
                a2.a(componentName, bez);
                throw th;
            }
        } else {
            throw new IOException("Could not bind to service.");
        }
    }

    static /* synthetic */ Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        c.b("GoogleAuthUtil", "Binder call returned null.");
        throw new IOException("Service unavailable.");
    }
}
