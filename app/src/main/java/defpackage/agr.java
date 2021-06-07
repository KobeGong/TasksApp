package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;

/* access modifiers changed from: package-private */
/* renamed from: agr  reason: default package */
/* compiled from: PG */
public final class agr {
    public static final int[] a = {-16842910};
    public static final int[] b = {16842908};
    public static final int[] c = {16842919};
    public static final int[] d = {16842912};
    public static final int[] e = new int[0];
    private static final ThreadLocal f = new ThreadLocal();
    private static final int[] g = new int[1];

    public static int a(Context context, int i) {
        g[0] = i;
        agw a2 = agw.a(context, (AttributeSet) null, g);
        try {
            return a2.b(0, 0);
        } finally {
            a2.b.recycle();
        }
    }

    public static ColorStateList b(Context context, int i) {
        g[0] = i;
        agw a2 = agw.a(context, (AttributeSet) null, g);
        try {
            return a2.e(0);
        } finally {
            a2.b.recycle();
        }
    }

    public static int c(Context context, int i) {
        ColorStateList b2 = b(context, i);
        if (b2 != null && b2.isStateful()) {
            return b2.getColorForState(a, b2.getDefaultColor());
        }
        TypedValue typedValue = (TypedValue) f.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f2 = typedValue.getFloat();
        int a2 = a(context, i);
        return os.b(a2, Math.round(f2 * ((float) Color.alpha(a2))));
    }
}
