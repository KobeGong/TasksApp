package org.chromium.base;

import org.chromium.base.annotations.CalledByNative;

/* compiled from: PG */
public class MemoryPressureListener {
    private static native void nativeOnMemoryPressure(int i);

    @CalledByNative
    public static void registerSystemCallback() {
        ehw.a.registerComponentCallbacks(new egt());
    }

    public static void a(int i) {
        nativeOnMemoryPressure(i);
    }
}
