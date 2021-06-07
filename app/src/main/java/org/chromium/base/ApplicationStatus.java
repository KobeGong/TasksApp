package org.chromium.base;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Looper;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.chromium.base.annotations.CalledByNative;

/* compiled from: PG */
public class ApplicationStatus {
    public static egk a;
    public static final egu b = new egu();
    private static final Object c = new Object();
    @SuppressLint({"SupportAnnotationUsage"})
    private static Integer d;
    private static final Map e = new ConcurrentHashMap();

    private ApplicationStatus() {
    }

    private static native void nativeOnApplicationStateChange(int i);

    public static Activity a() {
        return null;
    }

    @CalledByNative
    public static int getStateForApplication() {
        int intValue;
        boolean z;
        boolean z2 = false;
        int i = 1;
        synchronized (c) {
            if (d == null) {
                Iterator it = e.values().iterator();
                boolean z3 = false;
                while (true) {
                    if (it.hasNext()) {
                        int i2 = ((egj) it.next()).a;
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
                    } else if (z3) {
                        i = 2;
                    } else {
                        i = z2 ? 3 : 4;
                    }
                }
                d = Integer.valueOf(i);
            }
            intValue = d.intValue();
        }
        return intValue;
    }

    public static void a(egk egk) {
        egu egu = b;
        if (egk != null && !egu.a.contains(egk)) {
            egu.a.add(egk);
            egu.c++;
        }
    }

    @CalledByNative
    private static void registerThreadSafeNativeApplicationStateListener() {
        egi egi = new egi();
        if (ThreadUtils.a().getLooper() == Looper.myLooper()) {
            egi.run();
        } else {
            ThreadUtils.a().post(egi);
        }
    }

    static {
        new egu();
        new egu();
    }
}
