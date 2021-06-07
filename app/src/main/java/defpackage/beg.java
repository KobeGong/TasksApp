package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.tasks.R;

/* renamed from: beg  reason: default package */
/* compiled from: PG */
public final class beg {
    private static final ri a = new ri();

    public static String a(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return a(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return a(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", new StringBuilder(33).append("Unexpected error code ").append(i).toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return a(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return a(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String b(Context context, int i) {
        String a2;
        if (i == 6) {
            a2 = a(context, "common_google_play_services_resolution_required_title");
        } else {
            a2 = a(context, i);
        }
        if (a2 == null) {
            return context.getResources().getString(R.string.common_google_play_services_notification_ticker);
        }
        return a2;
    }

    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        String b = b(context);
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_text, b);
            case 2:
                if (azb.a(context)) {
                    return resources.getString(R.string.common_google_play_services_wear_update_text);
                }
                return resources.getString(R.string.common_google_play_services_update_text, b);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_text, b);
            case 4:
            case 6:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, b);
            case 5:
                return a(context, "common_google_play_services_invalid_account_text", b);
            case 7:
                return a(context, "common_google_play_services_network_error_text", b);
            case 9:
                return resources.getString(R.string.common_google_play_services_unsupported_text, b);
            case 16:
                return a(context, "common_google_play_services_api_unavailable_text", b);
            case 17:
                return a(context, "common_google_play_services_sign_in_failed_text", b);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, b);
            case 20:
                return a(context, "common_google_play_services_restricted_profile_text", b);
        }
    }

    public static String d(Context context, int i) {
        if (i == 6) {
            return a(context, "common_google_play_services_resolution_required_text", b(context));
        }
        return c(context, i);
    }

    public static String e(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_button);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_button);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_button);
            default:
                return resources.getString(17039370);
        }
    }

    private static String b(Context context) {
        String packageName = context.getPackageName();
        try {
            bjf a2 = bjg.a.a(context);
            return a2.a.getPackageManager().getApplicationLabel(a2.a.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            String str = context.getApplicationInfo().name;
            return !TextUtils.isEmpty(str) ? str : packageName;
        }
    }

    private static String a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String a2 = a(context, str);
        if (a2 == null) {
            a2 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, a2, str2);
    }

    private static String a(Context context, String str) {
        synchronized (a) {
            String str2 = (String) a.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources a2 = axy.a(context);
            if (a2 == null) {
                return null;
            }
            int identifier = a2.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String valueOf = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf.length() != 0 ? "Missing resource: ".concat(valueOf) : new String("Missing resource: "));
                return null;
            }
            String string = a2.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                String valueOf2 = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf2.length() != 0 ? "Got empty resource: ".concat(valueOf2) : new String("Got empty resource: "));
                return null;
            }
            a.put(str, string);
            return string;
        }
    }

    public static String a(Context context) {
        return context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
    }
}
