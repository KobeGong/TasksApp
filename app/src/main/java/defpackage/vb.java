package defpackage;

import android.os.Build;
import android.widget.PopupWindow;

/* renamed from: vb  reason: default package */
/* compiled from: PG */
public final class vb {
    public static final vf a;

    public static void a(PopupWindow popupWindow, boolean z) {
        a.a(popupWindow, z);
    }

    public static void a(PopupWindow popupWindow, int i) {
        a.a(popupWindow, i);
    }

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            a = new ve();
        } else if (Build.VERSION.SDK_INT >= 21) {
            a = new vd();
        } else if (Build.VERSION.SDK_INT >= 19) {
            a = new vc();
        } else {
            a = new vf();
        }
    }
}
