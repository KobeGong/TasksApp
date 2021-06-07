package defpackage;

import android.graphics.Matrix;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: kg  reason: default package */
/* compiled from: PG */
class kg extends kf {
    private static Method a;
    private static boolean b;
    private static Method c;
    private static boolean d;

    kg() {
    }

    @Override // defpackage.ki
    public final void a(View view, Matrix matrix) {
        if (!b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToGlobal", Matrix.class);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            b = true;
        }
        if (a != null) {
            try {
                a.invoke(view, matrix);
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }

    @Override // defpackage.ki
    public final void b(View view, Matrix matrix) {
        if (!d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToLocal", Matrix.class);
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            d = true;
        }
        if (c != null) {
            try {
                c.invoke(view, matrix);
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }
}
