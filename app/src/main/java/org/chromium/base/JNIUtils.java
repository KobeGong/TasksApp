package org.chromium.base;

/* compiled from: PG */
public class JNIUtils {
    private static java.lang.Boolean a;

    @org.chromium.base.annotations.CalledByNative
    public static java.lang.Object getClassLoader() {
        return org.chromium.base.JNIUtils.class.getClassLoader();
    }

    @org.chromium.base.annotations.CalledByNative
    public static boolean isSelectiveJniRegistrationEnabled() {
        if (a == null) {
            a = java.lang.Boolean.valueOf(false);
        }
        return a.booleanValue();
    }
}
