package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ecp  reason: default package */
/* compiled from: PG */
public final class ecp {
    public static final ecj a = a(ecj.class.getClassLoader());
    private static final Logger b = Logger.getLogger(ecp.class.getName());

    private static ecj a(ClassLoader classLoader) {
        try {
            return (ecj) dtj.a(Class.forName("io.opencensus.impl.trace.TraceComponentImpl", true, classLoader), ecj.class);
        } catch (ClassNotFoundException e) {
            b.logp(Level.FINE, "io.opencensus.trace.Tracing", "loadTraceComponent", "Couldn't load full implementation for TraceComponent, now trying to load lite implementation.", (Throwable) e);
            try {
                return (ecj) dtj.a(Class.forName("io.opencensus.impllite.trace.TraceComponentImplLite", true, classLoader), ecj.class);
            } catch (ClassNotFoundException e2) {
                b.logp(Level.FINE, "io.opencensus.trace.Tracing", "loadTraceComponent", "Couldn't load lite implementation for TraceComponent, now using default implementation for TraceComponent.", (Throwable) e2);
                return new eck();
            }
        }
    }

    private ecp() {
    }
}
