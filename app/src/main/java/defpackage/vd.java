package defpackage;

/* renamed from: vd reason: default package */
/* compiled from: PG */
class vd extends defpackage.vc {
    private static java.lang.reflect.Field a;

    vd() {
    }

    public void a(android.widget.PopupWindow popupWindow, boolean z) {
        if (a != null) {
            try {
                a.set(popupWindow, java.lang.Boolean.valueOf(z));
            } catch (java.lang.IllegalAccessException e) {
            }
        }
    }

    static {
        try {
            java.lang.reflect.Field declaredField = android.widget.PopupWindow.class.getDeclaredField("mOverlapAnchor");
            a = declaredField;
            declaredField.setAccessible(true);
        } catch (java.lang.NoSuchFieldException e) {
        }
    }
}
