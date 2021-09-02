package defpackage;

/* renamed from: ehx reason: default package */
/* compiled from: PG */
public abstract class ehx {
    private static final java.lang.String b = defpackage.ehx.class.getSimpleName();
    public final android.content.Context a;

    public ehx(android.content.Context context) {
        this.a = context;
    }

    public abstract defpackage.ehu a();

    public abstract java.lang.String b();

    public abstract java.lang.String c();

    public abstract boolean d();

    public java.lang.String toString() {
        return "[class=" + getClass().getName() + ", name=" + b() + ", version=" + c() + ", enabled=" + d() + "]";
    }

    public static java.util.List a(android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int identifier = context.getResources().getIdentifier("CronetProviderClassName", "string", context.getPackageName());
        if (identifier != 0) {
            java.lang.String string = context.getResources().getString(identifier);
            if (!a(context, string, arrayList, true)) {
                throw new java.lang.RuntimeException("Unable to instantiate Cronet implementation class " + string + " that is listed as in the app string resource file under CronetProviderClassName key");
            }
        }
        a(context, "org.chromium.net.impl.NativeCronetProvider", arrayList, false);
        a(context, "org.chromium.net.impl.JavaCronetProvider", arrayList, false);
        return arrayList;
    }

    private static boolean a(android.content.Context context, java.lang.String str, java.util.List list, boolean z) {
        try {
            list.add((defpackage.ehx) context.getClassLoader().loadClass(str).asSubclass(defpackage.ehx.class).getConstructor(new java.lang.Class[]{android.content.Context.class}).newInstance(new java.lang.Object[]{context}));
            return true;
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
            if (z) {
                android.util.Log.e(b, "Unable to load provider class: " + str, e);
            } else {
                new java.lang.StringBuilder("Tried to load ").append(str).append(" provider class but it wasn't included in the app classpath");
            }
            return false;
        }
    }
}
