package defpackage;

/* renamed from: agw reason: default package */
/* compiled from: PG */
public final class agw {
    public final android.content.Context a;
    public final android.content.res.TypedArray b;
    public android.util.TypedValue c;

    public static defpackage.agw a(android.content.Context context, android.util.AttributeSet attributeSet, int[] iArr) {
        return new defpackage.agw(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static defpackage.agw a(android.content.Context context, android.util.AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new defpackage.agw(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public static defpackage.agw a(android.content.Context context, int i, int[] iArr) {
        return new defpackage.agw(context, context.obtainStyledAttributes(i, iArr));
    }

    private agw(android.content.Context context, android.content.res.TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public final android.graphics.drawable.Drawable a(int i) {
        if (this.b.hasValue(i)) {
            int resourceId = this.b.getResourceId(i, 0);
            if (resourceId != 0) {
                return defpackage.xw.b(this.a, resourceId);
            }
        }
        return this.b.getDrawable(i);
    }

    public final android.graphics.drawable.Drawable b(int i) {
        if (this.b.hasValue(i)) {
            int resourceId = this.b.getResourceId(i, 0);
            if (resourceId != 0) {
                return defpackage.abl.a().a(this.a, resourceId, true);
            }
        }
        return null;
    }

    public final java.lang.CharSequence c(int i) {
        return this.b.getText(i);
    }

    public final java.lang.String d(int i) {
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

    public final android.content.res.ColorStateList e(int i) {
        if (this.b.hasValue(i)) {
            int resourceId = this.b.getResourceId(i, 0);
            if (resourceId != 0) {
                android.content.res.ColorStateList a2 = defpackage.xw.a(this.a, resourceId);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return this.b.getColorStateList(i);
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
