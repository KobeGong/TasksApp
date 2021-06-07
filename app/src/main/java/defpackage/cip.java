package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: cip  reason: default package */
/* compiled from: PG */
public final class cip {
    private static volatile cip h;
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final bqf e;
    public final long f;
    public final Long g;

    private cip(String str, String str2, String str3, int i, Long l, bqf bqf) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.g = l;
        this.e = bqf;
        this.f = bqf.a().getTotalSpace() / 1024;
    }

    static cip a(Context context) {
        if (h == null) {
            synchronized (cip.class) {
                if (h == null) {
                    h = c(context);
                }
            }
        }
        return h;
    }

    public static clt b(Context context) {
        cky.a((Object) context);
        return new ciq(context);
    }

    private static cip c(Context context) {
        int i = 1;
        String packageName = ((Context) cky.a((Object) context)).getPackageName();
        String d2 = cnx.d(context);
        String str = null;
        PackageManager packageManager = context.getPackageManager();
        try {
            str = packageManager.getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            cdm.a(5, "MetricStamper", "Failed to get PackageInfo for: %s", packageName);
        }
        if (Build.VERSION.SDK_INT >= 20) {
            if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                i = 2;
            } else if (Build.VERSION.SDK_INT >= 21 && packageManager.hasSystemFeature("android.software.leanback")) {
                i = 3;
            }
        }
        return new cip(packageName, d2, str, i, cky.c(context), new bqf(context));
    }
}
