package defpackage;

/* renamed from: vo reason: default package */
/* compiled from: PG */
public final class vo {
    public static final defpackage.vs a;

    public static void a(android.widget.TextView textView, int i) {
        a.a(textView, i);
    }

    static {
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            a = new defpackage.vr(0);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            a = new defpackage.vr(0);
        } else if (android.os.Build.VERSION.SDK_INT >= 23) {
            a = new defpackage.vr();
        } else if (android.os.Build.VERSION.SDK_INT >= 18) {
            a = new defpackage.vq();
        } else if (android.os.Build.VERSION.SDK_INT >= 17) {
            a = new defpackage.vp();
        } else {
            a = new defpackage.vs(0);
        }
    }
}
