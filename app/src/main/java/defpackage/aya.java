package defpackage;

/* renamed from: aya reason: default package */
/* compiled from: PG */
public class aya {
    private static defpackage.aya b;
    public final android.content.Context a;

    private aya(android.content.Context context) {
        this.a = context.getApplicationContext();
    }

    public static defpackage.aya a(android.content.Context context) {
        defpackage.azb.b((java.lang.Object) context);
        synchronized (defpackage.aya.class) {
            if (b == null) {
                defpackage.bfc.a(context);
                b = new defpackage.aya(context);
            }
        }
        return b;
    }

    public final boolean a(java.lang.String str) {
        try {
            android.content.pm.PackageInfo b2 = defpackage.bjg.a.a(this.a).b(str, 64);
            if (b2 == null) {
                return false;
            }
            if (defpackage.axz.d(this.a)) {
                return b(b2, true);
            }
            boolean b3 = b(b2, false);
            if (!b3 && b(b2, true)) {
                android.util.Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
            }
            return b3;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    public static boolean a(android.content.pm.PackageInfo packageInfo, boolean z) {
        defpackage.bfd a2;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                a2 = a(packageInfo, defpackage.bfg.a);
            } else {
                a2 = a(packageInfo, defpackage.bfg.a[0]);
            }
            if (a2 != null) {
                return true;
            }
        }
        return false;
    }

    private static boolean b(android.content.pm.PackageInfo packageInfo, boolean z) {
        boolean z2 = false;
        if (packageInfo.signatures.length != 1) {
            android.util.Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
        } else {
            defpackage.bfe bfe = new defpackage.bfe(packageInfo.signatures[0].toByteArray());
            java.lang.String str = packageInfo.packageName;
            if (z) {
                z2 = defpackage.bfc.b(str, bfe);
            } else {
                z2 = defpackage.bfc.a(str, bfe);
            }
            if (!z2) {
                new java.lang.StringBuilder(27).append("Cert not in list. atk=").append(z);
            }
        }
        return z2;
    }

    static defpackage.bfd a(android.content.pm.PackageInfo packageInfo, defpackage.bfd... bfdArr) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            android.util.Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        defpackage.bfe bfe = new defpackage.bfe(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < bfdArr.length; i++) {
            if (bfdArr[i].equals(bfe)) {
                return bfdArr[i];
            }
        }
        return null;
    }
}
