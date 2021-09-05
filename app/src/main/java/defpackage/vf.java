package defpackage;

/* renamed from: vf reason: default package */
/* compiled from: PG */
public class vf {
    private static java.lang.reflect.Method a;
    private static boolean b;

    vf() {
    }

    public void a(android.widget.PopupWindow popupWindow, android.view.View view, int i, int i2, int i3) {
        if ((defpackage.jd.a(i3, ViewCompat.a.j(view)) & 7) == 5) {
            i -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i, i2);
    }

    public void a(android.widget.PopupWindow popupWindow, boolean z) {
    }

    public void a(android.widget.PopupWindow popupWindow, int i) {
        if (!b) {
            try {
                java.lang.reflect.Method declaredMethod = android.widget.PopupWindow.class.getDeclaredMethod("setWindowLayoutType", new java.lang.Class[]{java.lang.Integer.TYPE});
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.Exception e) {
            }
            b = true;
        }
        if (a != null) {
            try {
                a.invoke(popupWindow, new java.lang.Object[]{java.lang.Integer.valueOf(i)});
            } catch (java.lang.Exception e2) {
            }
        }
    }
}
