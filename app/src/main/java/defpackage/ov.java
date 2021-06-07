package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.util.Log;

/* renamed from: ov  reason: default package */
/* compiled from: PG */
public final class ov {
    public static final ow a;
    public static final qy b = new qy(16);

    public static String a(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    public static Typeface a(Context context, ol olVar, Resources resources, int i, int i2, op opVar, Handler handler, boolean z) {
        Typeface a2;
        int i3;
        boolean z2 = true;
        if (olVar instanceof oo) {
            oo ooVar = (oo) olVar;
            if (z) {
                if (ooVar.c != 0) {
                    z2 = false;
                }
            } else if (opVar != null) {
                z2 = false;
            }
            if (z) {
                i3 = ooVar.b;
            } else {
                i3 = -1;
            }
            a2 = pt.a(context, ooVar.a, opVar, null, z2, i3, i2);
        } else {
            a2 = a.a(context, (om) olVar, resources, i2);
            if (opVar != null) {
                if (a2 != null) {
                    opVar.a(a2, (Handler) null);
                } else {
                    opVar.a(-3, (Handler) null);
                }
            }
        }
        if (a2 != null) {
            b.a(a(resources, i, i2), a2);
        }
        return a2;
    }

    public static Typeface a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a2 = a.a(context, resources, i, str, i2);
        if (a2 != null) {
            b.a(a(resources, i, i2), a2);
        }
        return a2;
    }

    static {
        if (jd.a()) {
            a = new pa();
        } else if (Build.VERSION.SDK_INT >= 26) {
            a = new oz();
        } else {
            if (Build.VERSION.SDK_INT >= 24) {
                if (oy.a == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (oy.a != null) {
                    a = new oy();
                }
            }
            if (Build.VERSION.SDK_INT >= 21) {
                a = new ox();
            } else {
                a = new pb();
            }
        }
    }
}
