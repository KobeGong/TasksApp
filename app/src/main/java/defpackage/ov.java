package defpackage;

/* renamed from: ov reason: default package */
/* compiled from: PG */
public final class ov {
    public static final defpackage.ow a;
    public static final defpackage.qy b = new defpackage.qy(16);

    public static java.lang.String a(android.content.res.Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    public static android.graphics.Typeface a(android.content.Context context, defpackage.ol olVar, android.content.res.Resources resources, int i, int i2, defpackage.op opVar, android.os.Handler handler, boolean z) {
        android.graphics.Typeface a2;
        int i3;
        boolean z2 = true;
        if (olVar instanceof defpackage.oo) {
            defpackage.oo ooVar = (defpackage.oo) olVar;
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
            a2 = defpackage.pt.a(context, ooVar.a, opVar, null, z2, i3, i2);
        } else {
            a2 = a.a(context, (defpackage.om) olVar, resources, i2);
            if (opVar != null) {
                if (a2 != null) {
                    opVar.a(a2, (android.os.Handler) null);
                } else {
                    opVar.a(-3, (android.os.Handler) null);
                }
            }
        }
        if (a2 != null) {
            b.a(a(resources, i, i2), a2);
        }
        return a2;
    }

    public static android.graphics.Typeface a(android.content.Context context, android.content.res.Resources resources, int i, java.lang.String str, int i2) {
        android.graphics.Typeface a2 = a.a(context, resources, i, str, i2);
        if (a2 != null) {
            b.a(a(resources, i, i2), a2);
        }
        return a2;
    }

    static {
        if (defpackage.jd.a()) {
            a = new defpackage.pa();
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            a = new defpackage.oz();
        } else {
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                if (defpackage.oy.a == null) {
                    android.util.Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (defpackage.oy.a != null) {
                    a = new defpackage.oy();
                }
            }
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                a = new defpackage.ox();
            } else {
                a = new defpackage.pb();
            }
        }
    }
}
