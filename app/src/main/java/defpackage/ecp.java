package defpackage;

/* renamed from: ecp reason: default package */
/* compiled from: PG */
public final class ecp {
    public static final defpackage.ecj a = a(defpackage.ecj.class.getClassLoader());
    private static final java.util.logging.Logger b = java.util.logging.Logger.getLogger(defpackage.ecp.class.getName());

    private static defpackage.ecj a(java.lang.ClassLoader classLoader) {
        try {
            return (defpackage.ecj) defpackage.dtj.a(java.lang.Class.forName("io.opencensus.impl.trace.TraceComponentImpl", true, classLoader), defpackage.ecj.class);
        } catch (java.lang.ClassNotFoundException e) {
            b.logp(java.util.logging.Level.FINE, "io.opencensus.trace.Tracing", "loadTraceComponent", "Couldn't load full implementation for TraceComponent, now trying to load lite implementation.", e);
            try {
                return (defpackage.ecj) defpackage.dtj.a(java.lang.Class.forName("io.opencensus.impllite.trace.TraceComponentImplLite", true, classLoader), defpackage.ecj.class);
            } catch (java.lang.ClassNotFoundException e2) {
                b.logp(java.util.logging.Level.FINE, "io.opencensus.trace.Tracing", "loadTraceComponent", "Couldn't load lite implementation for TraceComponent, now using default implementation for TraceComponent.", e2);
                return new defpackage.eck();
            }
        }
    }

    private ecp() {
    }
}
