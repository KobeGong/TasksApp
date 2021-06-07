package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: eav  reason: default package */
/* compiled from: PG */
public final class eav {
    public static final eaw a = a(eaw.class.getClassLoader());
    private static final Logger b = Logger.getLogger(eav.class.getName());

    private static eaw a(ClassLoader classLoader) {
        try {
            return (eaw) dtj.a(Class.forName("io.opencensus.impl.stats.StatsComponentImpl", true, classLoader), eaw.class);
        } catch (ClassNotFoundException e) {
            b.logp(Level.FINE, "io.opencensus.stats.Stats", "loadStatsComponent", "Couldn't load full implementation for StatsComponent, now trying to load lite implementation.", (Throwable) e);
            try {
                return (eaw) dtj.a(Class.forName("io.opencensus.impllite.stats.StatsComponentImplLite", true, classLoader), eaw.class);
            } catch (ClassNotFoundException e2) {
                b.logp(Level.FINE, "io.opencensus.stats.Stats", "loadStatsComponent", "Couldn't load lite implementation for StatsComponent, now using default implementation for StatsComponent.", (Throwable) e2);
                return new eas();
            }
        }
    }

    private eav() {
    }
}
