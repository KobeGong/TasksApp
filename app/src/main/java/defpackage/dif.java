package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
/* renamed from: dif  reason: default package */
/* compiled from: PG */
public abstract class dif {
    private static final Logger a = Logger.getLogger(dhn.class.getName());
    private static String b = "dgx";

    dif() {
    }

    /* access modifiers changed from: protected */
    public abstract dhw a();

    static dhw a(Class cls) {
        String format;
        String str;
        ClassLoader classLoader = dif.class.getClassLoader();
        if (cls.equals(dhw.class)) {
            format = b;
        } else if (!cls.getPackage().equals(dif.class.getPackage())) {
            throw new IllegalArgumentException(cls.getName());
        } else {
            format = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                return (dhw) cls.cast(((dif) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).a());
            } catch (NoSuchMethodException e) {
                throw new IllegalStateException(e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException(e2);
            } catch (IllegalAccessException e3) {
                throw new IllegalStateException(e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException e5) {
            Iterator it = ServiceLoader.load(dif.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((dhw) cls.cast(((dif) it.next()).a()));
                } catch (ServiceConfigurationError e6) {
                    Logger logger = a;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(cls.getSimpleName());
                    if (valueOf.length() != 0) {
                        str = "Unable to load ".concat(valueOf);
                    } else {
                        str = new String("Unable to load ");
                    }
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", str, (Throwable) e6);
                }
            }
            if (arrayList.size() == 1) {
                return (dhw) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (dhw) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (IllegalAccessException e8) {
                throw new IllegalStateException(e8);
            } catch (InvocationTargetException e9) {
                throw new IllegalStateException(e9);
            }
        }
    }
}
