package defpackage;

/* renamed from: kb reason: default package */
/* compiled from: PG */
final class kb {
    public static final defpackage.ki a;
    public static final android.util.Property b = new defpackage.kc(java.lang.Float.class, "translationAlpha");
    private static java.lang.reflect.Field c;
    private static boolean d;

    static void a(android.view.View view, float f) {
        a.a(view, f);
    }

    static void a(android.view.View view, int i) {
        if (!d) {
            try {
                java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mViewFlags");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException e) {
            }
            d = true;
        }
        if (c != null) {
            try {
                c.setInt(view, (c.getInt(view) & -13) | i);
            } catch (java.lang.IllegalAccessException e2) {
            }
        }
    }

    static void a(android.view.View view, int i, int i2, int i3, int i4) {
        a.a(view, i, i2, i3, i4);
    }

    static {
        if (android.os.Build.VERSION.SDK_INT >= 22) {
            a = new defpackage.kh();
        } else if (android.os.Build.VERSION.SDK_INT >= 21) {
            a = new defpackage.kg();
        } else if (android.os.Build.VERSION.SDK_INT >= 19) {
            a = new defpackage.kf();
        } else if (android.os.Build.VERSION.SDK_INT >= 18) {
            a = new defpackage.ke();
        } else {
            a = new defpackage.ki();
        }
        new defpackage.kd(android.graphics.Rect.class, "clipBounds");
    }
}
