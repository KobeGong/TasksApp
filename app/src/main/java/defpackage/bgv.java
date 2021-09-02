package defpackage;

/* renamed from: bgv reason: default package */
/* compiled from: PG */
public final class bgv extends defpackage.bjr {
    public static java.lang.Boolean a(android.content.SharedPreferences sharedPreferences, java.lang.String str, java.lang.Boolean bool) {
        try {
            return (java.lang.Boolean) defpackage.bjr.a((java.util.concurrent.Callable) new defpackage.bgw(sharedPreferences, str, bool));
        } catch (java.lang.Exception e) {
            java.lang.String str2 = "FlagDataUtils";
            java.lang.String str3 = "Flag value not available, returning default: ";
            java.lang.String valueOf = java.lang.String.valueOf(e.getMessage());
            android.util.Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new java.lang.String(str3));
            return bool;
        }
    }

    public static java.lang.Integer a(android.content.SharedPreferences sharedPreferences, java.lang.String str, java.lang.Integer num) {
        try {
            return (java.lang.Integer) defpackage.bjr.a((java.util.concurrent.Callable) new defpackage.bgx(sharedPreferences, str, num));
        } catch (java.lang.Exception e) {
            java.lang.String str2 = "FlagDataUtils";
            java.lang.String str3 = "Flag value not available, returning default: ";
            java.lang.String valueOf = java.lang.String.valueOf(e.getMessage());
            android.util.Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new java.lang.String(str3));
            return num;
        }
    }

    public static java.lang.Long a(android.content.SharedPreferences sharedPreferences, java.lang.String str, java.lang.Long l) {
        try {
            return (java.lang.Long) defpackage.bjr.a((java.util.concurrent.Callable) new defpackage.bgy(sharedPreferences, str, l));
        } catch (java.lang.Exception e) {
            java.lang.String str2 = "FlagDataUtils";
            java.lang.String str3 = "Flag value not available, returning default: ";
            java.lang.String valueOf = java.lang.String.valueOf(e.getMessage());
            android.util.Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new java.lang.String(str3));
            return l;
        }
    }

    public static java.lang.String a(android.content.SharedPreferences sharedPreferences, java.lang.String str, java.lang.String str2) {
        try {
            return (java.lang.String) defpackage.bjr.a((java.util.concurrent.Callable) new defpackage.bgz(sharedPreferences, str, str2));
        } catch (java.lang.Exception e) {
            java.lang.String str3 = "FlagDataUtils";
            java.lang.String str4 = "Flag value not available, returning default: ";
            java.lang.String valueOf = java.lang.String.valueOf(e.getMessage());
            android.util.Log.w(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new java.lang.String(str4));
            return str2;
        }
    }
}
