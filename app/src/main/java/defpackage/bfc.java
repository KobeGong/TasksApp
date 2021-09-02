package defpackage;

/* renamed from: bfc reason: default package */
/* compiled from: PG */
final class bfc {
    private static defpackage.bdx a;
    private static final java.lang.Object b = new java.lang.Object();
    private static android.content.Context c;

    static synchronized void a(android.content.Context context) {
        synchronized (defpackage.bfc.class) {
            if (c != null) {
                android.util.Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                c = context.getApplicationContext();
            }
        }
    }

    private static boolean a() {
        defpackage.bdx bdy;
        if (a != null) {
            return true;
        }
        defpackage.azb.b((java.lang.Object) c);
        synchronized (b) {
            if (a == null) {
                try {
                    android.os.IBinder a2 = com.google.android.gms.dynamite.DynamiteModule.a(c, com.google.android.gms.dynamite.DynamiteModule.a, "com.google.android.gms.googlecertificates").a("com.google.android.gms.common.GoogleCertificatesImpl");
                    if (a2 == null) {
                        bdy = null;
                    } else {
                        android.os.IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        if (queryLocalInterface instanceof defpackage.bdx) {
                            bdy = (defpackage.bdx) queryLocalInterface;
                        } else {
                            bdy = new defpackage.bdy(a2);
                        }
                    }
                    a = bdy;
                } catch (defpackage.bfr e) {
                    android.util.Log.e("GoogleCertificates", "Failed to load com.google.android.gms.googlecertificates", e);
                    return false;
                }
            }
        }
        return true;
    }

    static boolean a(java.lang.String str, defpackage.bfd bfd) {
        return a(str, bfd, false);
    }

    static boolean b(java.lang.String str, defpackage.bfd bfd) {
        return a(str, bfd, true);
    }

    private static boolean a(java.lang.String str, defpackage.bfd bfd, boolean z) {
        boolean z2 = false;
        if (!a()) {
            return z2;
        }
        defpackage.azb.b((java.lang.Object) c);
        try {
            return a.a(new defpackage.bfj(str, bfd, z), defpackage.bfo.a((java.lang.Object) c.getPackageManager()));
        } catch (android.os.RemoteException e) {
            android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return z2;
        }
    }
}
