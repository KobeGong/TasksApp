package defpackage;

import android.content.Context;
import android.os.Build;

/* renamed from: bwj  reason: default package */
/* compiled from: PG */
public final class bwj implements ecz {
    private static bxl a;

    @Override // defpackage.ecz
    public final /* synthetic */ Object a() {
        throw new NoSuchMethodError();
    }

    public static synchronized void a(bxx bxx) {
        synchronized (bwj.class) {
            cld.b(!g(), "ChimeInstall must be initialized only once.");
            bxz bxz = new bxz();
            bxz.a = (bxm) dgv.a(new bxm(bxx));
            if (bxz.a == null) {
                throw new IllegalStateException(String.valueOf(bxm.class.getCanonicalName()).concat(" must be set"));
            }
            if (bxz.b == null) {
                bxz.b = new brv();
            }
            if (bxz.c == null) {
                bxz.c = new bqi();
            }
            bxl bxl = new bxl(bxz);
            a = bxl;
            bxk.a = bxl;
        }
    }

    private static synchronized boolean g() {
        boolean z;
        synchronized (bwj.class) {
            z = a != null;
        }
        return z;
    }

    public static synchronized bxl b() {
        bxl bxl;
        synchronized (bwj.class) {
            cld.b(g(), "ChimeInstall has not been initialized.");
            bxl = a;
        }
        return bxl;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 17;
    }

    public static boolean a(Context context, String str) {
        return ob.a(context, str) == 0;
    }

    public static boolean a(Context context) {
        return c() && context.getApplicationInfo().targetSdkVersion >= 26;
    }
}
