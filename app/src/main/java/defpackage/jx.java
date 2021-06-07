package defpackage;

import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: jx  reason: default package */
/* compiled from: PG */
final class jx extends jy {
    private static Method a;
    private static boolean b;

    jx() {
    }

    @Override // defpackage.jy
    public final ju a(ViewGroup viewGroup) {
        return new jt(viewGroup);
    }

    @Override // defpackage.jy
    public final void a(ViewGroup viewGroup, boolean z) {
        if (!b) {
            try {
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("suppressLayout", Boolean.TYPE);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            b = true;
        }
        if (a != null) {
            try {
                a.invoke(viewGroup, Boolean.valueOf(z));
            } catch (IllegalAccessException | InvocationTargetException e2) {
            }
        }
    }
}
