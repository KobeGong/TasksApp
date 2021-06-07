package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ahr  reason: default package */
/* compiled from: PG */
public final class ahr {
    private static Method a;

    public static boolean a(View view) {
        if (sn.a.j(view) == 1) {
            return true;
        }
        return false;
    }

    public static void a(View view, Rect rect, Rect rect2) {
        if (a != null) {
            try {
                a.invoke(view, rect, rect2);
            } catch (Exception e) {
            }
        }
    }

    public static void b(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                a = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    a.setAccessible(true);
                }
            } catch (NoSuchMethodException e) {
            }
        }
    }
}
