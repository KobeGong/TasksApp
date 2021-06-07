package org.chromium.base;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import org.chromium.base.annotations.CalledByNative;

/* compiled from: PG */
public class PowerMonitor {
    private static PowerMonitor a;
    private boolean b;

    private PowerMonitor() {
    }

    private static native void nativeOnBatteryChargingChanged();

    public static void a(Intent intent) {
        boolean z = true;
        int intExtra = intent.getIntExtra("plugged", -1);
        PowerMonitor powerMonitor = a;
        if (intExtra == 2 || intExtra == 1) {
            z = false;
        }
        powerMonitor.b = z;
        nativeOnBatteryChargingChanged();
    }

    @CalledByNative
    private static boolean isBatteryPower() {
        if (a == null) {
            ThreadUtils.b();
            if (a == null) {
                Context context = ehw.a;
                a = new PowerMonitor();
                Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver != null) {
                    a(registerReceiver);
                }
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
                intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
                context.registerReceiver(new egx(), intentFilter);
            }
        }
        return a.b;
    }
}
