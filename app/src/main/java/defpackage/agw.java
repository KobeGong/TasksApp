package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: agw  reason: default package */
/* compiled from: PG */
public final class agw {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    public static agw a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new agw(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static agw a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new agw(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public static agw a(Context context, int i, int[] iArr) {
        return new agw(context, context.obtainStyledAttributes(i, iArr));
    }

    private agw(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public final Drawable a(int i) {
        int resourceId;
        if (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) {
            return this.b.getDrawable(i);
        }
        return xw.b(this.a, resourceId);
    }

    public final Drawable b(int i) {
        int resourceId;
        if (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return abl.a().a(this.a, resourceId, true);
    }

    public final CharSequence c(int i) {
        return this.b.getText(i);
    }

    public final String d(int i) {
        return this.b.getString(i);
    }

    public final boolean a(int i, boolean z) {
        return this.b.getBoolean(i, z);
    }

    public final int a(int i, int i2) {
        return this.b.getInt(i, i2);
    }

    public final float a(int i, float f) {
        return this.b.getFloat(i, f);
    }

    public final int b(int i, int i2) {
        return this.b.getColor(i, i2);
    }

    public final ColorStateList e(int i) {
        int resourceId;
        ColorStateList a2;
        return (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0 || (a2 = xw.a(this.a, resourceId)) == null) ? this.b.getColorStateList(i) : a2;
    }

    public final int c(int i, int i2) {
        return this.b.getInteger(i, i2);
    }

    public final int d(int i, int i2) {
        return this.b.getDimensionPixelOffset(i, i2);
    }

    public final int e(int i, int i2) {
        return this.b.getDimensionPixelSize(i, i2);
    }

    public final int f(int i, int i2) {
        return this.b.getLayoutDimension(i, i2);
    }

    public final int g(int i, int i2) {
        return this.b.getResourceId(i, i2);
    }

    public final boolean f(int i) {
        return this.b.hasValue(i);
    }
}
