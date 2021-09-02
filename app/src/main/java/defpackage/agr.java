package defpackage;

/* renamed from: agr reason: default package */
/* compiled from: PG */
final class agr {
    public static final int[] a = {-16842910};
    public static final int[] b = {16842908};
    public static final int[] c = {16842919};
    public static final int[] d = {16842912};
    public static final int[] e = new int[0];
    private static final java.lang.ThreadLocal f = new java.lang.ThreadLocal();
    private static final int[] g = new int[1];

    public static int a(android.content.Context context, int i) {
        g[0] = i;
        defpackage.agw a2 = defpackage.agw.a(context, (android.util.AttributeSet) null, g);
        try {
            int b2 = a2.b(0, 0);
            return b2;
        } finally {
            a2.b.recycle();
        }
    }

    public static android.content.res.ColorStateList b(android.content.Context context, int i) {
        g[0] = i;
        defpackage.agw a2 = defpackage.agw.a(context, (android.util.AttributeSet) null, g);
        try {
            android.content.res.ColorStateList e2 = a2.e(0);
            return e2;
        } finally {
            a2.b.recycle();
        }
    }

    public static int c(android.content.Context context, int i) {
        android.content.res.ColorStateList b2 = b(context, i);
        if (b2 != null && b2.isStateful()) {
            return b2.getColorForState(a, b2.getDefaultColor());
        }
        android.util.TypedValue typedValue = (android.util.TypedValue) f.get();
        if (typedValue == null) {
            typedValue = new android.util.TypedValue();
            f.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f2 = typedValue.getFloat();
        int a2 = a(context, i);
        return defpackage.os.b(a2, java.lang.Math.round(f2 * ((float) android.graphics.Color.alpha(a2))));
    }
}
