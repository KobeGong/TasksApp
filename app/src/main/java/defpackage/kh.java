package defpackage;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: kh  reason: default package */
/* compiled from: PG */
final class kh extends kg {
    private static Method a;
    private static boolean b;

    kh() {
    }

    @Override // defpackage.ki
    public final void a(View view, int i, int i2, int i3, int i4) {
        if (!b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setLeftTopRightBottom", Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            b = true;
        }
        if (a != null) {
            try {
                a.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }
}
