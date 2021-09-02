package org.chromium.base;

/* compiled from: PG */
public class EventLog {
    @org.chromium.base.annotations.CalledByNative
    public static void writeEvent(int i, int i2) {
        android.util.EventLog.writeEvent(i, i2);
    }
}
