package defpackage;

/* renamed from: cip reason: default package */
/* compiled from: PG */
public final class cip {
    private static volatile defpackage.cip h;
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final int d;
    public final defpackage.bqf e;
    public final long f;
    public final java.lang.Long g;

    private cip(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Long l, defpackage.bqf bqf) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.g = l;
        this.e = bqf;
        this.f = bqf.a().getTotalSpace() / 1024;
    }

    static defpackage.cip a(android.content.Context context) {
        if (h == null) {
            synchronized (defpackage.cip.class) {
                if (h == null) {
                    h = c(context);
                }
            }
        }
        return h;
    }

    public static defpackage.clt b(android.content.Context context) {
        defpackage.cky.a((java.lang.Object) context);
        return new defpackage.ciq(context);
    }

    private static defpackage.cip c(android.content.Context context) {
        int i = 1;
        java.lang.String packageName = ((android.content.Context) defpackage.cky.a((java.lang.Object) context)).getPackageName();
        java.lang.String d2 = defpackage.cnx.d(context);
        java.lang.String str = null;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        try {
            str = packageManager.getPackageInfo(packageName, 0).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            defpackage.cdm.a(5, "MetricStamper", "Failed to get PackageInfo for: %s", packageName);
        }
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                i = 2;
            } else if (android.os.Build.VERSION.SDK_INT >= 21 && packageManager.hasSystemFeature("android.software.leanback")) {
                i = 3;
            }
        }
        return new defpackage.cip(packageName, d2, str, i, defpackage.cky.c(context), new defpackage.bqf(context));
    }
}
