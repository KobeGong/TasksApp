package org.chromium.net;

/* compiled from: PG */
public class AndroidCellularSignalStrength {
    private static final org.chromium.net.AndroidCellularSignalStrength b = new org.chromium.net.AndroidCellularSignalStrength();
    public volatile int a = Integer.MIN_VALUE;

    private AndroidCellularSignalStrength() {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("AndroidCellularSignalStrength");
            handlerThread.start();
            new android.os.Handler(handlerThread.getLooper()).post(new defpackage.ehj(this));
        }
    }

    @android.annotation.TargetApi(23)
    @org.chromium.base.annotations.CalledByNative
    private static int getSignalStrengthLevel() {
        return b.a;
    }
}
