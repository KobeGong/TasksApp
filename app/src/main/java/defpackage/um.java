package defpackage;

/* renamed from: um reason: default package */
/* compiled from: PG */
public final class um {
    private static final defpackage.uo a;

    public static void a(android.widget.EdgeEffect edgeEffect, float f, float f2) {
        a.a(edgeEffect, f, f2);
    }

    static {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            a = new defpackage.un();
        } else {
            a = new defpackage.uo();
        }
    }
}
