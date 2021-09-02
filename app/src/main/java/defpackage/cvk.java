package defpackage;

/* renamed from: cvk reason: default package */
/* compiled from: PG */
public final class cvk extends defpackage.cut {
    public static final boolean e = defpackage.cvm.a();
    public static final boolean f = (android.os.Build.FINGERPRINT == null || "robolectric".equals(android.os.Build.FINGERPRINT));
    public static final defpackage.cuv g = new defpackage.cvl();

    static boolean j() {
        boolean z = false;
        try {
            java.lang.Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", new java.lang.Class[0]);
            return defpackage.cvm.class.getName().equals(k());
        } catch (Throwable th) {
            return z;
        }
    }

    static java.lang.String k() {
        try {
            return dalvik.system.VMStack.getStackClass2().getName();
        } catch (Throwable th) {
            return null;
        }
    }

    static java.lang.Class l() {
        return dalvik.system.VMStack.getStackClass2();
    }

    /* access modifiers changed from: protected */
    public final defpackage.cuv b() {
        return g;
    }

    /* access modifiers changed from: protected */
    public final defpackage.cup b(java.lang.String str) {
        if (defpackage.cvn.b.get() != null) {
            return ((defpackage.cvj) defpackage.cvn.b.get()).a(str);
        }
        defpackage.cvn cvn = new defpackage.cvn(str.replace('$', '.'));
        defpackage.cvo.a.offer(cvn);
        if (defpackage.cvn.b.get() == null) {
            return cvn;
        }
        defpackage.cvn.b();
        return cvn;
    }

    /* access modifiers changed from: protected */
    public final java.lang.String h() {
        return "platform: Android";
    }

    static {
        android.util.Log.class.getName();
    }
}
