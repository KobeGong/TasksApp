package defpackage;

@java.lang.Deprecated
/* renamed from: ok reason: default package */
/* compiled from: PG */
public abstract class ok extends android.content.BroadcastReceiver {
    private static final android.util.SparseArray a = new android.util.SparseArray();
    private static int b = 1;

    public static android.content.ComponentName a(android.content.Context context, android.content.Intent intent) {
        synchronized (a) {
            int i = b;
            int i2 = b + 1;
            b = i2;
            if (i2 <= 0) {
                b = 1;
            }
            intent.putExtra("android.support.content.wakelockid", i);
            android.content.ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            android.os.PowerManager.WakeLock newWakeLock = ((android.os.PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            a.put(i, newWakeLock);
            return startService;
        }
    }

    public static boolean a(android.content.Intent intent) {
        int intExtra = intent.getIntExtra("android.support.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (a) {
            android.os.PowerManager.WakeLock wakeLock = (android.os.PowerManager.WakeLock) a.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                a.remove(intExtra);
                return true;
            }
            android.util.Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            return true;
        }
    }
}
