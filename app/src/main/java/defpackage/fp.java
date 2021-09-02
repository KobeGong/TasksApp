package defpackage;

/* renamed from: fp reason: default package */
/* compiled from: PG */
public final class fp {
    private static final int[] a = {2130772212};
    private static final int[] b = {2130771999};

    public static android.content.res.TypedArray a(android.content.Context context, android.util.AttributeSet attributeSet, int[] iArr, int i, int i2) {
        a(context, attributeSet, i, i2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static defpackage.agw a(android.content.Context context, android.util.AttributeSet attributeSet, int[] iArr, int i) {
        a(context, attributeSet, i, 2132017719);
        return defpackage.agw.a(context, attributeSet, iArr, i, 2132017719);
    }

    private static void a(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.fm.g, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(defpackage.fm.h, false);
        obtainStyledAttributes.recycle();
        if (z) {
            a(context, b, "Theme.MaterialComponents");
        }
        a(context, a, "Theme.AppCompat");
    }

    private static void a(android.content.Context context, int[] iArr, java.lang.String str) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean hasValue = obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (!hasValue) {
            throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 77).append("The style on this component requires your app theme to be ").append(str).append(" (or a descendant).").toString());
        }
    }
}
