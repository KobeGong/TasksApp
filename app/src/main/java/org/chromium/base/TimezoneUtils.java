package org.chromium.base;

/* compiled from: PG */
class TimezoneUtils {
    private TimezoneUtils() {
    }

    @org.chromium.base.annotations.CalledByNative
    private static java.lang.String getDefaultTimeZoneId() {
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        java.lang.String id = java.util.TimeZone.getDefault().getID();
        android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
        return id;
    }
}
