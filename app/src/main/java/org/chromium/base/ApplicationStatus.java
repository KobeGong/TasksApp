package org.chromium.base;

/* compiled from: PG */
public class ApplicationStatus {
    public static defpackage.egk a;
    public static final defpackage.egu b = new defpackage.egu();
    private static final java.lang.Object c = new java.lang.Object();
    @android.annotation.SuppressLint({"SupportAnnotationUsage"})
    private static java.lang.Integer d;
    private static final java.util.Map e = new java.util.concurrent.ConcurrentHashMap();

    private ApplicationStatus() {
    }

    private static native void nativeOnApplicationStateChange(int i);

    public static android.app.Activity a() {
        return null;
    }

    @org.chromium.base.annotations.CalledByNative
    public static int getStateForApplication() {
        int intValue;
        boolean z;
        boolean z2 = false;
        int i = 1;
        synchronized (c) {
            if (d == null) {
                java.util.Iterator it = e.values().iterator();
                boolean z3 = false;
                while (true) {
                    if (it.hasNext()) {
                        int i2 = ((defpackage.egj) it.next()).a;
                        if (i2 != 4 && i2 != 5 && i2 != 6) {
                            break;
                        } else if (i2 == 4) {
                            z3 = true;
                        } else {
                            if (i2 == 5) {
                                z = true;
                            } else {
                                z = z2;
                            }
                            z2 = z;
                        }
                    } else {
                        i = z3 ? 2 : z2 ? 3 : 4;
                    }
                }
                d = java.lang.Integer.valueOf(i);
            }
            intValue = d.intValue();
        }
        return intValue;
    }

    public static void a(defpackage.egk egk) {
        defpackage.egu egu = b;
        if (egk != null && !egu.a.contains(egk)) {
            egu.a.add(egk);
            egu.c++;
        }
    }

    @org.chromium.base.annotations.CalledByNative
    private static void registerThreadSafeNativeApplicationStateListener() {
        defpackage.egi egi = new defpackage.egi();
        if (org.chromium.base.ThreadUtils.a().getLooper() == android.os.Looper.myLooper()) {
            egi.run();
        } else {
            org.chromium.base.ThreadUtils.a().post(egi);
        }
    }

    static {
        new defpackage.egu();
        new defpackage.egu();
    }
}
