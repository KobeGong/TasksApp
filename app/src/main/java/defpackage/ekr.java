package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Locale;

/* renamed from: ekr  reason: default package */
/* compiled from: PG */
public final class ekr {
    private static final Object a = new Object();
    private static int b = 0;

    public static String a(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append('/');
        sb.append(b(context));
        sb.append(" (Linux; U; Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("; ");
        sb.append(Locale.getDefault().toString());
        String str = Build.MODEL;
        if (str.length() > 0) {
            sb.append("; ");
            sb.append(str);
        }
        String str2 = Build.ID;
        if (str2.length() > 0) {
            sb.append("; Build/");
            sb.append(str2);
        }
        sb.append(";");
        sb.append(" Cronet/");
        sb.append("67.0.3387.0");
        sb.append(')');
        return sb.toString();
    }

    private static int b(Context context) {
        int i;
        synchronized (a) {
            if (b == 0) {
                try {
                    b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalStateException("Cannot determine package version");
                }
            }
            i = b;
        }
        return i;
    }
}
