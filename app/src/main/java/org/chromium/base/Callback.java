package org.chromium.base;

import org.chromium.base.annotations.CalledByNative;

/* compiled from: PG */
public interface Callback {

    /* compiled from: PG */
    public class Helper {
        @CalledByNative
        static void onObjectResultFromNative(Callback callback, Object obj) {
            callback.a();
        }

        @CalledByNative
        static void onBooleanResultFromNative(Callback callback, boolean z) {
            Boolean.valueOf(z);
            callback.a();
        }

        @CalledByNative
        static void onIntResultFromNative(Callback callback, int i) {
            Integer.valueOf(i);
            callback.a();
        }
    }

    void a();
}
