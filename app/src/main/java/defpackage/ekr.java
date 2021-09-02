package defpackage;

/* renamed from: ekr reason: default package */
/* compiled from: PG */
public final class ekr {
    private static final java.lang.Object a = new java.lang.Object();
    private static int b = 0;

    public static java.lang.String a(android.content.Context context) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(context.getPackageName());
        sb.append('/');
        sb.append(b(context));
        sb.append(" (Linux; U; Android ");
        sb.append(android.os.Build.VERSION.RELEASE);
        sb.append("; ");
        sb.append(java.util.Locale.getDefault().toString());
        java.lang.String str = android.os.Build.MODEL;
        if (str.length() > 0) {
            sb.append("; ");
            sb.append(str);
        }
        java.lang.String str2 = android.os.Build.ID;
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

    private static int b(android.content.Context context) {
        int i;
        synchronized (a) {
            if (b == 0) {
                try {
                    b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                    throw new java.lang.IllegalStateException("Cannot determine package version");
                }
            }
            i = b;
        }
        return i;
    }
}
