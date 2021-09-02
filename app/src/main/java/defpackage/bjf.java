package defpackage;

/* renamed from: bjf reason: default package */
/* compiled from: PG */
public final class bjf {
    public android.content.Context a;

    public bjf(android.content.Context context) {
        this.a = context;
    }

    public final android.content.pm.ApplicationInfo a(java.lang.String str, int i) {
        return this.a.getPackageManager().getApplicationInfo(str, i);
    }

    public final android.content.pm.PackageInfo b(java.lang.String str, int i) {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }

    @android.annotation.TargetApi(19)
    public final boolean a(int i, java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            try {
                ((android.app.AppOpsManager) this.a.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (java.lang.SecurityException e) {
                return false;
            }
        } else {
            java.lang.String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
            if (packagesForUid == null) {
                return false;
            }
            for (java.lang.String equals : packagesForUid) {
                if (str.equals(equals)) {
                    return true;
                }
            }
            return false;
        }
    }
}
