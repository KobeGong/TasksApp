package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: sn  reason: default package */
/* compiled from: PG */
public final class sn {
    public static final sw a;

    public static void a(View view, tl tlVar) {
        sw.a(view, tlVar);
    }

    public static void a(View view, rn rnVar) {
        sw.a(view, rnVar);
    }

    public static boolean a(View view) {
        return sw.B(view);
    }

    public static void a(View view, boolean z) {
        a.a(view, z);
    }

    public static void a(View view, Runnable runnable) {
        a.a(view, runnable);
    }

    public static void a(View view, Runnable runnable, long j) {
        a.a(view, runnable, j);
    }

    public static void a(View view, int i) {
        a.a(view, i);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.a(view, i, i2, i3, i4);
    }

    public static te b(View view) {
        sw swVar = a;
        if (swVar.a == null) {
            swVar.a = new WeakHashMap();
        }
        te teVar = (te) swVar.a.get(view);
        if (teVar != null) {
            return teVar;
        }
        te teVar2 = new te(view);
        swVar.a.put(view, teVar2);
        return teVar2;
    }

    public static void a(View view, float f) {
        a.a(view, f);
    }

    public static void b(View view, float f) {
        a.b(view, f);
    }

    public static void a(View view, String str) {
        a.a(view, str);
    }

    @Deprecated
    public static void b(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    public static void a(View view, sl slVar) {
        a.a(view, slVar);
    }

    public static void a(View view, Drawable drawable) {
        a.a(view, drawable);
    }

    public static void c(View view) {
        if (view instanceof sg) {
            ((sg) view).a(1);
        }
    }

    public static void b(View view, int i) {
        a.c(view, i);
    }

    public static void c(View view, int i) {
        a.b(view, i);
    }

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            a = new sv((char) 0);
        } else if (Build.VERSION.SDK_INT >= 24) {
            a = new sv((byte) 0);
        } else if (Build.VERSION.SDK_INT >= 23) {
            a = new sv();
        } else if (Build.VERSION.SDK_INT >= 21) {
            a = new st();
        } else if (Build.VERSION.SDK_INT >= 19) {
            a = new ss();
        } else if (Build.VERSION.SDK_INT >= 18) {
            a = new sr();
        } else if (Build.VERSION.SDK_INT >= 17) {
            a = new sq();
        } else {
            a = new sp();
        }
    }
}
