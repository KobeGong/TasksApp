package defpackage;

/* renamed from: rz reason: default package */
/* compiled from: PG */
public final class rz {
    private static java.lang.reflect.Field a;
    private static boolean b;
    private static final defpackage.sb c;

    static void a(android.view.LayoutInflater layoutInflater, android.view.LayoutInflater.Factory2 factory2) {
        if (!b) {
            try {
                java.lang.reflect.Field declaredField = android.view.LayoutInflater.class.getDeclaredField("mFactory2");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException e) {
                android.util.Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + android.view.LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            b = true;
        }
        if (a != null) {
            try {
                a.set(layoutInflater, factory2);
            } catch (java.lang.IllegalAccessException e2) {
                android.util.Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    public static void b(android.view.LayoutInflater layoutInflater, android.view.LayoutInflater.Factory2 factory2) {
        c.a(layoutInflater, factory2);
    }

    static {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            c = new defpackage.sa();
        } else {
            c = new defpackage.sb();
        }
    }
}
