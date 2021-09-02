package org.chromium.base;

/* compiled from: PG */
public class MemoryPressureListener {
    private static native void nativeOnMemoryPressure(int i);

    @org.chromium.base.annotations.CalledByNative
    public static void registerSystemCallback() {
        defpackage.ehw.a.registerComponentCallbacks(new defpackage.egt());
    }

    public static void a(int i) {
        nativeOnMemoryPressure(i);
    }
}
