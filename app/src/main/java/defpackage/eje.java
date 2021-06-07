package defpackage;

import android.net.TrafficStats;
import java.lang.reflect.Method;

/* renamed from: eje  reason: default package */
/* compiled from: PG */
public final class eje {
    public static final Method a;
    public static final Method b;

    static {
        try {
            a = TrafficStats.class.getMethod("setThreadStatsUid", Integer.TYPE);
            b = TrafficStats.class.getMethod("clearThreadStatsUid", new Class[0]);
        } catch (NoSuchMethodException | SecurityException e) {
            throw new RuntimeException("Unable to get TrafficStats methods", e);
        }
    }
}
