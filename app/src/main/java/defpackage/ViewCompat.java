package defpackage;

/* renamed from: sn reason: default package */
/* compiled from: PG */
public final class ViewCompat {
    public static final defpackage.sw a;

    public static void a(android.view.View view, defpackage.tl tlVar) {
        defpackage.sw.a(view, tlVar);
    }

    public static void a(android.view.View view, defpackage.rn rnVar) {
        defpackage.sw.a(view, rnVar);
    }

    public static boolean a(android.view.View view) {
        return defpackage.sw.B(view);
    }

    public static void a(android.view.View view, boolean z) {
        a.a(view, z);
    }

    public static void a(android.view.View view, java.lang.Runnable runnable) {
        a.a(view, runnable);
    }

    public static void a(android.view.View view, java.lang.Runnable runnable, long j) {
        a.a(view, runnable, j);
    }

    public static void a(android.view.View view, int i) {
        a.a(view, i);
    }

    public static void a(android.view.View view, int i, int i2, int i3, int i4) {
        a.a(view, i, i2, i3, i4);
    }

    public static defpackage.te b(android.view.View view) {
        defpackage.sw swVar = a;
        if (swVar.a == null) {
            swVar.a = new java.util.WeakHashMap();
        }
        defpackage.te teVar = (defpackage.te) swVar.a.get(view);
        if (teVar != null) {
            return teVar;
        }
        defpackage.te teVar2 = new defpackage.te(view);
        swVar.a.put(view, teVar2);
        return teVar2;
    }

    public static void a(android.view.View view, float f) {
        a.a(view, f);
    }

    public static void b(android.view.View view, float f) {
        a.b(view, f);
    }

    public static void a(android.view.View view, java.lang.String str) {
        a.a(view, str);
    }

    @java.lang.Deprecated
    public static void b(android.view.View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    public static void setOnApplyWindowInsetsListener(android.view.View view, OnApplyWindowInsetsListener slVar) {
        a.a(view, slVar);
    }

    public static void a(android.view.View view, android.graphics.drawable.Drawable drawable) {
        a.a(view, drawable);
    }

    public static void c(android.view.View view) {
        if (view instanceof defpackage.sg) {
            ((defpackage.sg) view).a(1);
        }
    }

    public static void b(android.view.View view, int i) {
        a.c(view, i);
    }

    public static void c(android.view.View view, int i) {
        a.b(view, i);
    }

    static {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            a = new defpackage.sv(0);
        } else if (android.os.Build.VERSION.SDK_INT >= 24) {
            a = new defpackage.sv(0);
        } else if (android.os.Build.VERSION.SDK_INT >= 23) {
            a = new defpackage.sv();
        } else if (android.os.Build.VERSION.SDK_INT >= 21) {
            a = new defpackage.st();
        } else if (android.os.Build.VERSION.SDK_INT >= 19) {
            a = new defpackage.ss();
        } else if (android.os.Build.VERSION.SDK_INT >= 18) {
            a = new defpackage.sr();
        } else if (android.os.Build.VERSION.SDK_INT >= 17) {
            a = new defpackage.sq();
        } else {
            a = new defpackage.sp();
        }
    }
}
