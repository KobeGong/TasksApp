package defpackage;

/* renamed from: dif reason: default package */
/* compiled from: PG */
abstract class dif {
    private static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.dhn.class.getName());
    private static java.lang.String b = "dgx";

    dif() {
    }

    /* access modifiers changed from: protected */
    public abstract defpackage.dhw a();

    static defpackage.dhw a(java.lang.Class cls) {
        java.lang.String format;
        java.lang.String str;
        java.lang.ClassLoader classLoader = defpackage.dif.class.getClassLoader();
        if (cls.equals(defpackage.dhw.class)) {
            format = b;
        } else if (!cls.getPackage().equals(defpackage.dif.class.getPackage())) {
            throw new java.lang.IllegalArgumentException(cls.getName());
        } else {
            format = java.lang.String.format("%s.BlazeGenerated%sLoader", new java.lang.Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        }
        try {
            return (defpackage.dhw) cls.cast(((defpackage.dif) java.lang.Class.forName(format, true, classLoader).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0])).a());
        } catch (java.lang.NoSuchMethodException e) {
            throw new java.lang.IllegalStateException(e);
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.IllegalStateException(e2);
        } catch (java.lang.IllegalAccessException e3) {
            throw new java.lang.IllegalStateException(e3);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            throw new java.lang.IllegalStateException(e4);
        } catch (java.lang.ClassNotFoundException e5) {
            java.util.Iterator it = java.util.ServiceLoader.load(defpackage.dif.class, classLoader).iterator();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((defpackage.dhw) cls.cast(((defpackage.dif) it.next()).a()));
                } catch (java.util.ServiceConfigurationError e6) {
                    java.util.logging.Logger logger = a;
                    java.util.logging.Level level = java.util.logging.Level.SEVERE;
                    java.lang.String str2 = "com.google.protobuf.GeneratedExtensionRegistryLoader";
                    java.lang.String str3 = "load";
                    java.lang.String str4 = "Unable to load ";
                    java.lang.String valueOf = java.lang.String.valueOf(cls.getSimpleName());
                    if (valueOf.length() != 0) {
                        str = str4.concat(valueOf);
                    } else {
                        str = new java.lang.String(str4);
                    }
                    logger.logp(level, str2, str3, str, e6);
                }
            }
            if (arrayList.size() == 1) {
                return (defpackage.dhw) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (defpackage.dhw) cls.getMethod("combine", new java.lang.Class[]{java.util.Collection.class}).invoke(null, new java.lang.Object[]{arrayList});
            } catch (java.lang.NoSuchMethodException e7) {
                throw new java.lang.IllegalStateException(e7);
            } catch (java.lang.IllegalAccessException e8) {
                throw new java.lang.IllegalStateException(e8);
            } catch (java.lang.reflect.InvocationTargetException e9) {
                throw new java.lang.IllegalStateException(e9);
            }
        }
    }
}
