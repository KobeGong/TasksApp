package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: aya  reason: default package */
/* compiled from: PG */
public class aya {
    private static aya b;
    public final Context a;

    private aya(Context context) {
        this.a = context.getApplicationContext();
    }

    public static aya a(Context context) {
        azb.b(context);
        synchronized (aya.class) {
            if (b == null) {
                bfc.a(context);
                b = new aya(context);
            }
        }
        return b;
    }

    public final boolean a(String str) {
        try {
            PackageInfo b2 = bjg.a.a(this.a).b(str, 64);
            if (b2 == null) {
                return false;
            }
            if (axz.d(this.a)) {
                return b(b2, true);
            }
            boolean b3 = b(b2, false);
            if (!b3 && b(b2, true)) {
                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
            }
            return b3;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    public static boolean a(PackageInfo packageInfo, boolean z) {
        bfd a2;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                a2 = a(packageInfo, bfg.a);
            } else {
                a2 = a(packageInfo, bfg.a[0]);
            }
            if (a2 != null) {
                return true;
            }
        }
        return false;
    }

    private static boolean b(PackageInfo packageInfo, boolean z) {
        boolean z2 = false;
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
        } else {
            bfe bfe = new bfe(packageInfo.signatures[0].toByteArray());
            String str = packageInfo.packageName;
            if (z) {
                z2 = bfc.b(str, bfe);
            } else {
                z2 = bfc.a(str, bfe);
            }
            if (!z2) {
                new StringBuilder(27).append("Cert not in list. atk=").append(z);
            }
        }
        return z2;
    }

    static bfd a(PackageInfo packageInfo, bfd... bfdArr) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        bfe bfe = new bfe(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < bfdArr.length; i++) {
            if (bfdArr[i].equals(bfe)) {
                return bfdArr[i];
            }
        }
        return null;
    }
}
