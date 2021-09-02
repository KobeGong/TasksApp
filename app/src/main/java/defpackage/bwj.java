package defpackage;

/* renamed from: bwj reason: default package */
/* compiled from: PG */
public final class bwj implements defpackage.ecz {
    private static defpackage.bxl a;

    public final /* synthetic */ java.lang.Object a() {
        throw new java.lang.NoSuchMethodError();
    }

    public static synchronized void a(defpackage.bxx bxx) {
        synchronized (defpackage.bwj.class) {
            defpackage.cld.b(!g(), (java.lang.Object) "ChimeInstall must be initialized only once.");
            defpackage.bxz bxz = new defpackage.bxz();
            bxz.a = (defpackage.bxm) defpackage.dgv.a((java.lang.Object) new defpackage.bxm(bxx));
            if (bxz.a == null) {
                throw new java.lang.IllegalStateException(java.lang.String.valueOf(defpackage.bxm.class.getCanonicalName()).concat(" must be set"));
            }
            if (bxz.b == null) {
                bxz.b = new defpackage.brv();
            }
            if (bxz.c == null) {
                bxz.c = new defpackage.bqi();
            }
            defpackage.bxl bxl = new defpackage.bxl(bxz);
            a = bxl;
            defpackage.bxk.a = bxl;
        }
    }

    private static synchronized boolean g() {
        boolean z;
        synchronized (defpackage.bwj.class) {
            z = a != null;
        }
        return z;
    }

    public static synchronized defpackage.bxl b() {
        defpackage.bxl bxl;
        synchronized (defpackage.bwj.class) {
            defpackage.cld.b(g(), (java.lang.Object) "ChimeInstall has not been initialized.");
            bxl = a;
        }
        return bxl;
    }

    public static boolean c() {
        return android.os.Build.VERSION.SDK_INT >= 26;
    }

    public static boolean d() {
        return android.os.Build.VERSION.SDK_INT >= 24;
    }

    public static boolean e() {
        return android.os.Build.VERSION.SDK_INT >= 21;
    }

    public static boolean f() {
        return android.os.Build.VERSION.SDK_INT >= 17;
    }

    public static boolean a(android.content.Context context, java.lang.String str) {
        return defpackage.ob.a(context, str) == 0;
    }

    public static boolean a(android.content.Context context) {
        return c() && context.getApplicationInfo().targetSdkVersion >= 26;
    }
}
