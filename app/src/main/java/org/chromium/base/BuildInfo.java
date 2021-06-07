package org.chromium.base;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import org.chromium.base.annotations.CalledByNative;

/* compiled from: PG */
public class BuildInfo {
    private final String a;
    private final int b;
    private final String c;
    private final int d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;

    @CalledByNative
    private static String[] getAll() {
        BuildInfo buildInfo = egm.a;
        return new String[]{Build.BRAND, Build.DEVICE, Build.ID, Build.MANUFACTURER, Build.MODEL, String.valueOf(Build.VERSION.SDK_INT), Build.TYPE, Build.BOARD, ehw.a.getPackageName(), String.valueOf(buildInfo.b), buildInfo.a, buildInfo.c, String.valueOf(buildInfo.d), buildInfo.e, buildInfo.i, buildInfo.g, buildInfo.f, buildInfo.h, egl.a, buildInfo.j};
    }

    private static String a(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence.toString();
    }

    public BuildInfo() {
        String str;
        try {
            Context context = ehw.a;
            String packageName = context.getPackageName();
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            this.b = packageInfo.versionCode;
            this.c = packageName;
            this.d = this.b;
            this.e = a(packageInfo.versionName);
            this.a = a(packageManager.getApplicationLabel(packageInfo.applicationInfo));
            this.f = a(packageManager.getInstallerPackageName(this.c));
            PackageInfo packageInfo2 = null;
            try {
                packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e2) {
            }
            if (packageInfo2 != null) {
                str = String.valueOf(packageInfo2.versionCode);
            } else {
                str = "gms versionCode not available.";
            }
            this.g = str;
            if (Build.VERSION.SDK_INT >= 21) {
                this.h = TextUtils.join(", ", Build.SUPPORTED_ABIS);
            } else {
                this.h = String.format("ABI1: %s, ABI2: %s", Build.CPU_ABI, Build.CPU_ABI2);
            }
            this.j = String.format("@%x", Long.valueOf(this.d > 10 ? (long) this.d : packageInfo.lastUpdateTime));
            this.i = Build.FINGERPRINT.substring(0, Math.min(Build.FINGERPRINT.length(), 128));
        } catch (PackageManager.NameNotFoundException e3) {
            throw new RuntimeException(e3);
        }
    }
}
