package org.chromium.base;

import org.chromium.base.annotations.CalledByNative;

/* compiled from: PG */
public class JNIUtils {
    private static Boolean a;

    @CalledByNative
    public static Object getClassLoader() {
        return JNIUtils.class.getClassLoader();
    }

    @CalledByNative
    public static boolean isSelectiveJniRegistrationEnabled() {
        if (a == null) {
            a = false;
        }
        return a.booleanValue();
    }
}
