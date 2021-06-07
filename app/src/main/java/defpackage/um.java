package defpackage;

import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: um  reason: default package */
/* compiled from: PG */
public final class um {
    private static final uo a;

    public static void a(EdgeEffect edgeEffect, float f, float f2) {
        a.a(edgeEffect, f, f2);
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            a = new un();
        } else {
            a = new uo();
        }
    }
}
