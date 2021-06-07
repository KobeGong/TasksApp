package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.apps.tasks.R;

/* renamed from: fp  reason: default package */
/* compiled from: PG */
public final class fp {
    private static final int[] a = {R.attr.colorPrimary};
    private static final int[] b = {R.attr.colorSecondaryLight};

    public static TypedArray a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        a(context, attributeSet, i, i2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static agw a(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        a(context, attributeSet, i, 2132017719);
        return agw.a(context, attributeSet, iArr, i, 2132017719);
    }

    private static void a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fm.g, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(fm.h, false);
        obtainStyledAttributes.recycle();
        if (z) {
            a(context, b, "Theme.MaterialComponents");
        }
        a(context, a, "Theme.AppCompat");
    }

    private static void a(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean hasValue = obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (!hasValue) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 77).append("The style on this component requires your app theme to be ").append(str).append(" (or a descendant).").toString());
        }
    }
}
