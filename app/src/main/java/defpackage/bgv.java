package defpackage;

import android.content.SharedPreferences;
import android.util.Log;

/* renamed from: bgv  reason: default package */
/* compiled from: PG */
public final class bgv extends bjr {
    public static Boolean a(SharedPreferences sharedPreferences, String str, Boolean bool) {
        try {
            return (Boolean) bjr.a(new bgw(sharedPreferences, str, bool));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return bool;
        }
    }

    public static Integer a(SharedPreferences sharedPreferences, String str, Integer num) {
        try {
            return (Integer) bjr.a(new bgx(sharedPreferences, str, num));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return num;
        }
    }

    public static Long a(SharedPreferences sharedPreferences, String str, Long l) {
        try {
            return (Long) bjr.a(new bgy(sharedPreferences, str, l));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return l;
        }
    }

    public static String a(SharedPreferences sharedPreferences, String str, String str2) {
        try {
            return (String) bjr.a(new bgz(sharedPreferences, str, str2));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return str2;
        }
    }
}
