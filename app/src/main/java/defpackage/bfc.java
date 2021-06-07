package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;

/* access modifiers changed from: package-private */
/* renamed from: bfc  reason: default package */
/* compiled from: PG */
public final class bfc {
    private static bdx a;
    private static final Object b = new Object();
    private static Context c;

    static synchronized void a(Context context) {
        synchronized (bfc.class) {
            if (c != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                c = context.getApplicationContext();
            }
        }
    }

    private static boolean a() {
        bdx bdy;
        if (a != null) {
            return true;
        }
        azb.b(c);
        synchronized (b) {
            if (a == null) {
                try {
                    IBinder a2 = DynamiteModule.a(c, DynamiteModule.a, "com.google.android.gms.googlecertificates").a("com.google.android.gms.common.GoogleCertificatesImpl");
                    if (a2 == null) {
                        bdy = null;
                    } else {
                        IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        if (queryLocalInterface instanceof bdx) {
                            bdy = (bdx) queryLocalInterface;
                        } else {
                            bdy = new bdy(a2);
                        }
                    }
                    a = bdy;
                } catch (bfr e) {
                    Log.e("GoogleCertificates", "Failed to load com.google.android.gms.googlecertificates", e);
                    return false;
                }
            }
        }
        return true;
    }

    static boolean a(String str, bfd bfd) {
        return a(str, bfd, false);
    }

    static boolean b(String str, bfd bfd) {
        return a(str, bfd, true);
    }

    private static boolean a(String str, bfd bfd, boolean z) {
        if (!a()) {
            return false;
        }
        azb.b(c);
        try {
            return a.a(new bfj(str, bfd, z), bfo.a(c.getPackageManager()));
        } catch (RemoteException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }
}
