package defpackage;

/* renamed from: ebn reason: default package */
/* compiled from: PG */
public final class ebn {
    public static final defpackage.ebo a = a(defpackage.ebo.class.getClassLoader());
    private static final java.util.logging.Logger b = java.util.logging.Logger.getLogger(defpackage.ebn.class.getName());

    private ebn() {
    }

    private static defpackage.ebo a(java.lang.ClassLoader classLoader) {
        try {
            return (defpackage.ebo) defpackage.dtj.a(java.lang.Class.forName("io.opencensus.impl.tags.TagsComponentImpl", true, classLoader), defpackage.ebo.class);
        } catch (java.lang.ClassNotFoundException e) {
            b.logp(java.util.logging.Level.FINE, "io.opencensus.tags.Tags", "loadTagsComponent", "Couldn't load full implementation for TagsComponent, now trying to load lite implementation.", e);
            try {
                return (defpackage.ebo) defpackage.dtj.a(java.lang.Class.forName("io.opencensus.impllite.tags.TagsComponentImplLite", true, classLoader), defpackage.ebo.class);
            } catch (java.lang.ClassNotFoundException e2) {
                b.logp(java.util.logging.Level.FINE, "io.opencensus.tags.Tags", "loadTagsComponent", "Couldn't load lite implementation for TagsComponent, now using default implementation for TagsComponent.", e2);
                return new defpackage.ebg();
            }
        }
    }
}
