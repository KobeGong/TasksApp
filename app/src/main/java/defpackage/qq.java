package defpackage;

/* renamed from: qq reason: default package */
/* compiled from: PG */
public final class qq {
    private static final java.util.Locale a = new java.util.Locale("", "");

    public static int a(java.util.Locale locale) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            return android.text.TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale != null && !locale.equals(a)) {
            java.lang.String a2 = defpackage.qk.a(locale);
            if (a2 == null) {
                switch (java.lang.Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
                    case 1:
                    case 2:
                        return 1;
                    default:
                        return 0;
                }
            } else if (a2.equalsIgnoreCase("Arab") || a2.equalsIgnoreCase("Hebr")) {
                return 1;
            }
        }
        return 0;
    }
}
