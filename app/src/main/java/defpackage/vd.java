package defpackage;

import android.widget.PopupWindow;
import java.lang.reflect.Field;

/* renamed from: vd  reason: default package */
/* compiled from: PG */
class vd extends vc {
    private static Field a;

    vd() {
    }

    @Override // defpackage.vf
    public void a(PopupWindow popupWindow, boolean z) {
        if (a != null) {
            try {
                a.set(popupWindow, Boolean.valueOf(z));
            } catch (IllegalAccessException e) {
            }
        }
    }

    static {
        try {
            Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
            a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
        }
    }
}
