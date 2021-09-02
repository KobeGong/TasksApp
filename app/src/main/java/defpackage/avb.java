package defpackage;

/* renamed from: avb reason: default package */
/* compiled from: PG */
public final class avb extends defpackage.avc {
    @java.lang.Deprecated
    public static java.lang.String a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return defpackage.avc.b(context, new android.accounts.Account(str, "com.google"), str2);
    }

    public static java.lang.String a(android.content.Context context, android.accounts.Account account, java.lang.String str) {
        return defpackage.avc.b(context, account, str);
    }

    public static void a(android.content.Context context, java.lang.String str) {
        defpackage.azb.c("Calling this from your main thread can lead to deadlock");
        defpackage.avc.a(context);
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str2 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str2);
        if (!bundle.containsKey(defpackage.avc.a)) {
            bundle.putString(defpackage.avc.a, str2);
        }
        defpackage.avc.a(context, defpackage.avc.b, new defpackage.awr(str, bundle));
    }

    public static java.lang.String b(android.content.Context context, java.lang.String str) {
        defpackage.azb.a(str, (java.lang.Object) "accountName must be provided");
        defpackage.azb.c("Calling this from your main thread can lead to deadlock");
        defpackage.avc.a(context);
        android.os.Bundle bundle = new android.os.Bundle();
        return defpackage.avc.a(context, new android.accounts.Account(str, "com.google"), "^^_account_id_^^", bundle);
    }

    public static android.accounts.Account[] c(android.content.Context context, java.lang.String str) {
        defpackage.azb.b(str);
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return defpackage.avc.d(context, str);
        }
        return android.accounts.AccountManager.get(context).getAccountsByType(str);
    }
}
