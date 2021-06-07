package defpackage;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: rz  reason: default package */
/* compiled from: PG */
public final class rz {
    private static Field a;
    private static boolean b;
    private static final sb c;

    static void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            b = true;
        }
        if (a != null) {
            try {
                a.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    public static void b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        c.a(layoutInflater, factory2);
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            c = new sa();
        } else {
            c = new sb();
        }
    }
}
