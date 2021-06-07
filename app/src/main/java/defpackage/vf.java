package defpackage;

import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: vf  reason: default package */
/* compiled from: PG */
public class vf {
    private static Method a;
    private static boolean b;

    vf() {
    }

    public void a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        if ((jd.a(i3, sn.a.j(view)) & 7) == 5) {
            i -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i, i2);
    }

    public void a(PopupWindow popupWindow, boolean z) {
    }

    public void a(PopupWindow popupWindow, int i) {
        if (!b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception e) {
            }
            b = true;
        }
        if (a != null) {
            try {
                a.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception e2) {
            }
        }
    }
}
