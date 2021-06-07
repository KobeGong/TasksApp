package defpackage;

import android.os.Build;
import android.util.Log;
import dalvik.system.VMStack;

/* renamed from: cvk  reason: default package */
/* compiled from: PG */
public final class cvk extends cut {
    public static final boolean e = cvm.a();
    public static final boolean f = (Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT));
    public static final cuv g = new cvl();

    static boolean j() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", new Class[0]);
            return cvm.class.getName().equals(k());
        } catch (Throwable th) {
            return false;
        }
    }

    static String k() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable th) {
            return null;
        }
    }

    static Class l() {
        return VMStack.getStackClass2();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.cut
    public final cuv b() {
        return g;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.cut
    public final cup b(String str) {
        if (cvn.b.get() != null) {
            return ((cvj) cvn.b.get()).a(str);
        }
        cvn cvn = new cvn(str.replace('$', '.'));
        cvo.a.offer(cvn);
        if (cvn.b.get() == null) {
            return cvn;
        }
        cvn.b();
        return cvn;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.cut
    public final String h() {
        return "platform: Android";
    }

    static {
        Log.class.getName();
    }
}
