package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ebn  reason: default package */
/* compiled from: PG */
public final class ebn {
    public static final ebo a = a(ebo.class.getClassLoader());
    private static final Logger b = Logger.getLogger(ebn.class.getName());

    private ebn() {
    }

    private static ebo a(ClassLoader classLoader) {
        try {
            return (ebo) dtj.a(Class.forName("io.opencensus.impl.tags.TagsComponentImpl", true, classLoader), ebo.class);
        } catch (ClassNotFoundException e) {
            b.logp(Level.FINE, "io.opencensus.tags.Tags", "loadTagsComponent", "Couldn't load full implementation for TagsComponent, now trying to load lite implementation.", (Throwable) e);
            try {
                return (ebo) dtj.a(Class.forName("io.opencensus.impllite.tags.TagsComponentImplLite", true, classLoader), ebo.class);
            } catch (ClassNotFoundException e2) {
                b.logp(Level.FINE, "io.opencensus.tags.Tags", "loadTagsComponent", "Couldn't load lite implementation for TagsComponent, now using default implementation for TagsComponent.", (Throwable) e2);
                return new ebg();
            }
        }
    }
}
