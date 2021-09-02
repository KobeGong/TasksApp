package org.chromium.base;

/* compiled from: PG */
public interface Callback {

    /* compiled from: PG */
    public class Helper {
        @org.chromium.base.annotations.CalledByNative
        static void onObjectResultFromNative(org.chromium.base.Callback callback, java.lang.Object obj) {
            callback.a();
        }

        @org.chromium.base.annotations.CalledByNative
        static void onBooleanResultFromNative(org.chromium.base.Callback callback, boolean z) {
            java.lang.Boolean.valueOf(z);
            callback.a();
        }

        @org.chromium.base.annotations.CalledByNative
        static void onIntResultFromNative(org.chromium.base.Callback callback, int i) {
            java.lang.Integer.valueOf(i);
            callback.a();
        }
    }

    void a();
}
