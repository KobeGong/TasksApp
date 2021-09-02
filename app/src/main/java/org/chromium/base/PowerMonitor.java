package org.chromium.base;

/* compiled from: PG */
public class PowerMonitor {
    private static org.chromium.base.PowerMonitor a;
    private boolean b;

    private PowerMonitor() {
    }

    private static native void nativeOnBatteryChargingChanged();

    public static void a(android.content.Intent intent) {
        boolean z = true;
        int intExtra = intent.getIntExtra("plugged", -1);
        org.chromium.base.PowerMonitor powerMonitor = a;
        if (intExtra == 2 || intExtra == 1) {
            z = false;
        }
        powerMonitor.b = z;
        nativeOnBatteryChargingChanged();
    }

    @org.chromium.base.annotations.CalledByNative
    private static boolean isBatteryPower() {
        if (a == null) {
            org.chromium.base.ThreadUtils.b();
            if (a == null) {
                android.content.Context context = defpackage.ehw.a;
                a = new org.chromium.base.PowerMonitor();
                android.content.Intent registerReceiver = context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver != null) {
                    a(registerReceiver);
                }
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
                intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
                context.registerReceiver(new defpackage.egx(), intentFilter);
            }
        }
        return a.b;
    }
}
