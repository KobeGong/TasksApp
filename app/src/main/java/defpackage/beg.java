package defpackage;

/* renamed from: beg reason: default package */
/* compiled from: PG */
public final class beg {
    private static final defpackage.ri a = new defpackage.ri();

    public static java.lang.String a(android.content.Context context, int i) {
        android.content.res.Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(2131951700);
            case 2:
                return resources.getString(2131951707);
            case 3:
                return resources.getString(2131951697);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                android.util.Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return a(context, "common_google_play_services_invalid_account_title");
            case 7:
                android.util.Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return a(context, "common_google_play_services_network_error_title");
            case 8:
                android.util.Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                android.util.Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                android.util.Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                android.util.Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 16:
                android.util.Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                android.util.Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return a(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                android.util.Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return a(context, "common_google_play_services_restricted_profile_title");
            default:
                android.util.Log.e("GoogleApiAvailability", "Unexpected error code " + i);
                return null;
        }
    }

    public static java.lang.String b(android.content.Context context, int i) {
        java.lang.String a2;
        if (i == 6) {
            a2 = a(context, "common_google_play_services_resolution_required_title");
        } else {
            a2 = a(context, i);
        }
        if (a2 == null) {
            return context.getResources().getString(2131951702);
        }
        return a2;
    }

    public static java.lang.String c(android.content.Context context, int i) {
        android.content.res.Resources resources = context.getResources();
        java.lang.String b = b(context);
        switch (i) {
            case 1:
                return resources.getString(2131951699, new java.lang.Object[]{b});
            case 2:
                if (defpackage.azb.a(context)) {
                    return resources.getString(2131951709);
                }
                return resources.getString(2131951706, new java.lang.Object[]{b});
            case 3:
                return resources.getString(2131951696, new java.lang.Object[]{b});
            case 5:
                return a(context, "common_google_play_services_invalid_account_text", b);
            case 7:
                return a(context, "common_google_play_services_network_error_text", b);
            case 9:
                return resources.getString(2131951704, new java.lang.Object[]{b});
            case 16:
                return a(context, "common_google_play_services_api_unavailable_text", b);
            case 17:
                return a(context, "common_google_play_services_sign_in_failed_text", b);
            case 18:
                return resources.getString(2131951708, new java.lang.Object[]{b});
            case 20:
                return a(context, "common_google_play_services_restricted_profile_text", b);
            default:
                return resources.getString(2131951703, new java.lang.Object[]{b});
        }
    }

    public static java.lang.String d(android.content.Context context, int i) {
        if (i == 6) {
            return a(context, "common_google_play_services_resolution_required_text", b(context));
        }
        return c(context, i);
    }

    public static java.lang.String e(android.content.Context context, int i) {
        android.content.res.Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(2131951698);
            case 2:
                return resources.getString(2131951705);
            case 3:
                return resources.getString(2131951695);
            default:
                return resources.getString(17039370);
        }
    }

    private static java.lang.String b(android.content.Context context) {
        java.lang.String packageName = context.getPackageName();
        try {
            defpackage.bjf a2 = defpackage.bjg.a.a(context);
            return a2.a.getPackageManager().getApplicationLabel(a2.a.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.NullPointerException e) {
            java.lang.String str = context.getApplicationInfo().name;
            if (!android.text.TextUtils.isEmpty(str)) {
                return str;
            }
            return packageName;
        }
    }

    private static java.lang.String a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        android.content.res.Resources resources = context.getResources();
        java.lang.String a2 = a(context, str);
        if (a2 == null) {
            a2 = resources.getString(2131951703);
        }
        return java.lang.String.format(resources.getConfiguration().locale, a2, new java.lang.Object[]{str2});
    }

    private static java.lang.String a(android.content.Context context, java.lang.String str) {
        synchronized (a) {
            java.lang.String str2 = (java.lang.String) a.get(str);
            if (str2 != null) {
                return str2;
            }
            android.content.res.Resources a2 = defpackage.axy.a(context);
            if (a2 == null) {
                return null;
            }
            int identifier = a2.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                java.lang.String str3 = "GoogleApiAvailability";
                java.lang.String str4 = "Missing resource: ";
                java.lang.String valueOf = java.lang.String.valueOf(str);
                android.util.Log.w(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new java.lang.String(str4));
                return null;
            }
            java.lang.String string = a2.getString(identifier);
            if (android.text.TextUtils.isEmpty(string)) {
                java.lang.String str5 = "GoogleApiAvailability";
                java.lang.String str6 = "Got empty resource: ";
                java.lang.String valueOf2 = java.lang.String.valueOf(str);
                android.util.Log.w(str5, valueOf2.length() != 0 ? str6.concat(valueOf2) : new java.lang.String(str6));
                return null;
            }
            a.put(str, string);
            return string;
        }
    }

    public static java.lang.String a(android.content.Context context) {
        return context.getResources().getString(2131951701);
    }
}
