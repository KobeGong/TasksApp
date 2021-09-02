package defpackage;

/* renamed from: eje reason: default package */
/* compiled from: PG */
public final class eje {
    public static final java.lang.reflect.Method a;
    public static final java.lang.reflect.Method b;

    static {
        try {
            a = android.net.TrafficStats.class.getMethod("setThreadStatsUid", new java.lang.Class[]{java.lang.Integer.TYPE});
            b = android.net.TrafficStats.class.getMethod("clearThreadStatsUid", new java.lang.Class[0]);
        } catch (java.lang.NoSuchMethodException | java.lang.SecurityException e) {
            throw new java.lang.RuntimeException("Unable to get TrafficStats methods", e);
        }
    }
}
