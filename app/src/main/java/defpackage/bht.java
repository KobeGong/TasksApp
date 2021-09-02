package defpackage;

/* renamed from: bht reason: default package */
/* compiled from: PG */
public final class bht {
    public bht(defpackage.bjr bjr) {
        defpackage.azb.b((java.lang.Object) bjr, (java.lang.Object) "Callbacks must not be null.");
    }

    public static boolean a(android.content.Context context, android.content.Intent intent) {
        defpackage.azb.b((java.lang.Object) context, (java.lang.Object) "Context must not be null.");
        defpackage.azb.b((java.lang.Object) intent, (java.lang.Object) "Intent must not be null.");
        return intent.hasExtra("com.google.android.gms.accounts.ACCOUNT_DATA");
    }
}
