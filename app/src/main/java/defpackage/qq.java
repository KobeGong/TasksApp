package defpackage;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: qq  reason: default package */
/* compiled from: PG */
public final class qq {
    private static final Locale a = new Locale("", "");

    public static int a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale != null && !locale.equals(a)) {
            String a2 = qk.a(locale);
            if (a2 == null) {
                switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
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
