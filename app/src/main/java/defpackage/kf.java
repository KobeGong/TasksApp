package defpackage;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: kf  reason: default package */
/* compiled from: PG */
class kf extends ke {
    private static Method a;
    private static boolean b;
    private static Method c;
    private static boolean d;

    kf() {
    }

    @Override // defpackage.ki
    public final void a(View view, float f) {
        if (!b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setTransitionAlpha", Float.TYPE);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            b = true;
        }
        if (a != null) {
            try {
                a.invoke(view, Float.valueOf(f));
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        } else {
            view.setAlpha(f);
        }
    }

    @Override // defpackage.ki
    public final float b(View view) {
        if (!d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            d = true;
        }
        if (c != null) {
            try {
                return ((Float) c.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
        return super.b(view);
    }

    @Override // defpackage.ki
    public final void c(View view) {
    }

    @Override // defpackage.ki
    public final void d(View view) {
    }
}
