package defpackage;

/* renamed from: vb reason: default package */
/* compiled from: PG */
public final class vb {
    public static final defpackage.vf a;

    public static void a(android.widget.PopupWindow popupWindow, boolean z) {
        a.a(popupWindow, z);
    }

    public static void a(android.widget.PopupWindow popupWindow, int i) {
        a.a(popupWindow, i);
    }

    static {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            a = new defpackage.ve();
        } else if (android.os.Build.VERSION.SDK_INT >= 21) {
            a = new defpackage.vd();
        } else if (android.os.Build.VERSION.SDK_INT >= 19) {
            a = new defpackage.vc();
        } else {
            a = new defpackage.vf();
        }
    }
}
