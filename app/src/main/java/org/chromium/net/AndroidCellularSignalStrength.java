package org.chromium.net;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import org.chromium.base.annotations.CalledByNative;

/* compiled from: PG */
public class AndroidCellularSignalStrength {
    private static final AndroidCellularSignalStrength b = new AndroidCellularSignalStrength();
    public volatile int a = Integer.MIN_VALUE;

    private AndroidCellularSignalStrength() {
        if (Build.VERSION.SDK_INT >= 23) {
            HandlerThread handlerThread = new HandlerThread("AndroidCellularSignalStrength");
            handlerThread.start();
            new Handler(handlerThread.getLooper()).post(new ehj(this));
        }
    }

    @TargetApi(23)
    @CalledByNative
    private static int getSignalStrengthLevel() {
        return b.a;
    }
}
