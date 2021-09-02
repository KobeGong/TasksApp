package defpackage;

/* renamed from: avc reason: default package */
/* compiled from: PG */
public class avc {
    @android.annotation.SuppressLint({"InlinedApi"})
    public static final java.lang.String a = "androidPackageName";
    public static final android.content.ComponentName b = new android.content.ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    public static final defpackage.bjb c = new defpackage.bjb("Auth", "GoogleAuthUtil");
    private static final java.lang.String[] d = {"com.google", "com.google.work", "cn.google"};

    public static java.lang.String b(android.content.Context context, android.accounts.Account account, java.lang.String str) {
        return a(context, account, str, new android.os.Bundle());
    }

    public static java.lang.String a(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) {
        a(account);
        defpackage.azb.c("Calling this from your main thread can lead to deadlock");
        defpackage.azb.a(str, (java.lang.Object) "Scope cannot be empty or null.");
        a(account);
        a(context);
        android.os.Bundle bundle2 = new android.os.Bundle(bundle);
        java.lang.String str2 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str2);
        if (android.text.TextUtils.isEmpty(bundle2.getString(a))) {
            bundle2.putString(a, str2);
        }
        bundle2.putLong("service_connection_start_time_millis", android.os.SystemClock.elapsedRealtime());
        return ((com.google.android.gms.auth.TokenData) a(context, b, new defpackage.awq(account, str, bundle2))).a;
    }

    @android.annotation.TargetApi(23)
    static android.accounts.Account[] d(android.content.Context context, java.lang.String str) {
        defpackage.axv.b(context);
        android.content.ContentProviderClient acquireContentProviderClient = ((android.content.Context) defpackage.azb.b((java.lang.Object) context)).getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
        if (acquireContentProviderClient == null) {
            throw new android.os.RemoteException("The com.google.android.gms.auth.accounts provider is not available.");
        }
        try {
            android.os.Parcelable[] parcelableArray = acquireContentProviderClient.call("get_accounts", str, new android.os.Bundle()).getParcelableArray("accounts");
            android.accounts.Account[] accountArr = new android.accounts.Account[parcelableArray.length];
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < parcelableArray.length) {
                    accountArr[i2] = (android.accounts.Account) parcelableArray[i2];
                    i = i2 + 1;
                } else {
                    acquireContentProviderClient.release();
                    return accountArr;
                }
            }
        } catch (java.lang.Exception e) {
            java.lang.String str2 = "Accounts ContentProvider failed: ";
            java.lang.String valueOf = java.lang.String.valueOf(e.getMessage());
            throw new android.os.RemoteException(valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2));
        } catch (Throwable th) {
            acquireContentProviderClient.release();
            throw th;
        }
    }

    private static void a(android.accounts.Account account) {
        if (account == null) {
            throw new java.lang.IllegalArgumentException("Account cannot be null");
        } else if (android.text.TextUtils.isEmpty(account.name)) {
            throw new java.lang.IllegalArgumentException("Account name cannot be empty!");
        } else {
            java.lang.String[] strArr = d;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                if (!strArr[i].equals(account.type)) {
                    i++;
                } else {
                    return;
                }
            }
            throw new java.lang.IllegalArgumentException("Account type not supported");
        }
    }

    static void a(android.content.Context context) {
        try {
            defpackage.axz.c(context.getApplicationContext());
        } catch (defpackage.axx e) {
            throw new defpackage.ave(e.a, e.getMessage(), new android.content.Intent(e.b));
        } catch (defpackage.axw e2) {
            throw new defpackage.ava(e2.getMessage());
        }
    }

    static java.lang.Object a(android.content.Context context, android.content.ComponentName componentName, defpackage.avd avd) {
        defpackage.bez bez = new defpackage.bez();
        defpackage.bdn a2 = defpackage.bdn.a(context);
        if (a2.a(new defpackage.bdo(componentName), (android.content.ServiceConnection) bez)) {
            try {
                defpackage.azb.c("BlockingServiceConnection.getService() called on main thread");
                if (bez.a) {
                    throw new java.lang.IllegalStateException("Cannot call get on this connection more than once");
                }
                bez.a = true;
                java.lang.Object a3 = avd.a((android.os.IBinder) bez.b.take());
                a2.a(componentName, (android.content.ServiceConnection) bez);
                return a3;
            } catch (android.os.RemoteException | java.lang.InterruptedException e) {
                c.c("GoogleAuthUtil", "Error on service connection.", e);
                throw new java.io.IOException("Error on service connection.", e);
            } catch (Throwable th) {
                a2.a(componentName, (android.content.ServiceConnection) bez);
                throw th;
            }
        } else {
            throw new java.io.IOException("Could not bind to service.");
        }
    }

    static /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        if (obj != null) {
            return obj;
        }
        c.b("GoogleAuthUtil", "Binder call returned null.");
        throw new java.io.IOException("Service unavailable.");
    }
}
