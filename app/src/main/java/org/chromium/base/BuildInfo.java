package org.chromium.base;

/* compiled from: PG */
public class BuildInfo {
    private final java.lang.String a;
    private final int b;
    private final java.lang.String c;
    private final int d;
    private final java.lang.String e;
    private final java.lang.String f;
    private final java.lang.String g;
    private final java.lang.String h;
    private final java.lang.String i;
    private final java.lang.String j;

    @org.chromium.base.annotations.CalledByNative
    private static java.lang.String[] getAll() {
        org.chromium.base.BuildInfo buildInfo = defpackage.egm.a;
        return new java.lang.String[]{android.os.Build.BRAND, android.os.Build.DEVICE, android.os.Build.ID, android.os.Build.MANUFACTURER, android.os.Build.MODEL, java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT), android.os.Build.TYPE, android.os.Build.BOARD, defpackage.ehw.a.getPackageName(), java.lang.String.valueOf(buildInfo.b), buildInfo.a, buildInfo.c, java.lang.String.valueOf(buildInfo.d), buildInfo.e, buildInfo.i, buildInfo.g, buildInfo.f, buildInfo.h, defpackage.egl.a, buildInfo.j};
    }

    private static java.lang.String a(java.lang.CharSequence charSequence) {
        return charSequence == null ? "" : charSequence.toString();
    }

    public BuildInfo() {
        java.lang.String str;
        try {
            android.content.Context context = defpackage.ehw.a;
            java.lang.String packageName = context.getPackageName();
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            this.b = packageInfo.versionCode;
            this.c = packageName;
            this.d = this.b;
            this.e = a(packageInfo.versionName);
            this.a = a(packageManager.getApplicationLabel(packageInfo.applicationInfo));
            this.f = a(packageManager.getInstallerPackageName(this.c));
            android.content.pm.PackageInfo packageInfo2 = null;
            try {
                packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 0);
            } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            }
            if (packageInfo2 != null) {
                str = java.lang.String.valueOf(packageInfo2.versionCode);
            } else {
                str = "gms versionCode not available.";
            }
            this.g = str;
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                this.h = android.text.TextUtils.join(", ", android.os.Build.SUPPORTED_ABIS);
            } else {
                this.h = java.lang.String.format("ABI1: %s, ABI2: %s", new java.lang.Object[]{android.os.Build.CPU_ABI, android.os.Build.CPU_ABI2});
            }
            this.j = java.lang.String.format("@%x", new java.lang.Object[]{java.lang.Long.valueOf(this.d > 10 ? (long) this.d : packageInfo.lastUpdateTime)});
            this.i = android.os.Build.FINGERPRINT.substring(0, java.lang.Math.min(android.os.Build.FINGERPRINT.length(), 128));
        } catch (android.content.pm.PackageManager.NameNotFoundException e3) {
            throw new java.lang.RuntimeException(e3);
        }
    }
}
