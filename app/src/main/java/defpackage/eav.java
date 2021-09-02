package defpackage;

/* renamed from: eav reason: default package */
/* compiled from: PG */
public final class eav {
    public static final defpackage.eaw a = a(defpackage.eaw.class.getClassLoader());
    private static final java.util.logging.Logger b = java.util.logging.Logger.getLogger(defpackage.eav.class.getName());

    private static defpackage.eaw a(java.lang.ClassLoader classLoader) {
        try {
            return (defpackage.eaw) defpackage.dtj.a(java.lang.Class.forName("io.opencensus.impl.stats.StatsComponentImpl", true, classLoader), defpackage.eaw.class);
        } catch (java.lang.ClassNotFoundException e) {
            b.logp(java.util.logging.Level.FINE, "io.opencensus.stats.Stats", "loadStatsComponent", "Couldn't load full implementation for StatsComponent, now trying to load lite implementation.", e);
            try {
                return (defpackage.eaw) defpackage.dtj.a(java.lang.Class.forName("io.opencensus.impllite.stats.StatsComponentImplLite", true, classLoader), defpackage.eaw.class);
            } catch (java.lang.ClassNotFoundException e2) {
                b.logp(java.util.logging.Level.FINE, "io.opencensus.stats.Stats", "loadStatsComponent", "Couldn't load lite implementation for StatsComponent, now using default implementation for StatsComponent.", e2);
                return new defpackage.eas();
            }
        }
    }

    private eav() {
    }
}
