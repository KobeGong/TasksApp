package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;

/* renamed from: avb  reason: default package */
/* compiled from: PG */
public final class avb extends avc {
    @Deprecated
    public static String a(Context context, String str, String str2) {
        return avc.b(context, new Account(str, "com.google"), str2);
    }

    public static String a(Context context, Account account, String str) {
        return avc.b(context, account, str);
    }

    public static void a(Context context, String str) {
        azb.c("Calling this from your main thread can lead to deadlock");
        avc.a(context);
        Bundle bundle = new Bundle();
        String str2 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str2);
        if (!bundle.containsKey(avc.a)) {
            bundle.putString(avc.a, str2);
        }
        avc.a(context, avc.b, new awr(str, bundle));
    }

    public static String b(Context context, String str) {
        azb.a(str, (Object) "accountName must be provided");
        azb.c("Calling this from your main thread can lead to deadlock");
        avc.a(context);
        return avc.a(context, new Account(str, "com.google"), "^^_account_id_^^", new Bundle());
    }

    public static Account[] c(Context context, String str) {
        azb.b(str);
        if (Build.VERSION.SDK_INT >= 23) {
            return avc.d(context, str);
        }
        return AccountManager.get(context).getAccountsByType(str);
    }
}
