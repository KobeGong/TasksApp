package defpackage;

/* renamed from: fy reason: default package */
/* compiled from: PG */
public final class fy {
    public final android.content.res.ColorStateList a;
    public final android.content.res.ColorStateList b;
    public final float c;
    public final float d;
    public final float e;
    private final float f;
    private final int g;
    private final int h;
    private final java.lang.String i;
    private final int j;
    private boolean k = false;
    private android.graphics.Typeface l;

    public fy(android.content.Context context, int i2) {
        int i3 = 12;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, defpackage.fx.a);
        this.f = obtainStyledAttributes.getDimension(defpackage.fx.i, 0.0f);
        this.a = defpackage.gm.a(context, obtainStyledAttributes, defpackage.fx.f);
        defpackage.gm.a(context, obtainStyledAttributes, defpackage.fx.g);
        defpackage.gm.a(context, obtainStyledAttributes, defpackage.fx.h);
        this.g = obtainStyledAttributes.getInt(defpackage.fx.j, 0);
        this.h = obtainStyledAttributes.getInt(defpackage.fx.k, 1);
        if (!obtainStyledAttributes.hasValue(12)) {
            i3 = 10;
        }
        this.j = obtainStyledAttributes.getResourceId(i3, 0);
        this.i = obtainStyledAttributes.getString(i3);
        obtainStyledAttributes.getBoolean(defpackage.fx.l, false);
        this.b = defpackage.gm.a(context, obtainStyledAttributes, defpackage.fx.b);
        this.c = obtainStyledAttributes.getFloat(defpackage.fx.c, 0.0f);
        this.d = obtainStyledAttributes.getFloat(defpackage.fx.d, 0.0f);
        this.e = obtainStyledAttributes.getFloat(defpackage.fx.e, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private final android.graphics.Typeface a(android.content.Context context) {
        if (this.k) {
            return this.l;
        }
        if (!context.isRestricted()) {
            try {
                this.l = defpackage.jd.a(context, this.j);
                if (this.l != null) {
                    this.l = android.graphics.Typeface.create(this.l, this.g);
                }
            } catch (android.content.res.Resources.NotFoundException | java.lang.UnsupportedOperationException e2) {
            } catch (java.lang.Exception e3) {
                java.lang.String str = "Error loading font ";
                java.lang.String valueOf = java.lang.String.valueOf(this.i);
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    new java.lang.String(str);
                }
            }
        }
        if (this.l == null) {
            this.l = android.graphics.Typeface.create(this.i, this.g);
        }
        if (this.l == null) {
            switch (this.h) {
                case 1:
                    this.l = android.graphics.Typeface.SANS_SERIF;
                    break;
                case 2:
                    this.l = android.graphics.Typeface.SERIF;
                    break;
                case 3:
                    this.l = android.graphics.Typeface.MONOSPACE;
                    break;
                default:
                    this.l = android.graphics.Typeface.DEFAULT;
                    break;
            }
            if (this.l != null) {
                this.l = android.graphics.Typeface.create(this.l, this.g);
            }
        }
        this.k = true;
        return this.l;
    }

    public final void a(android.content.Context context, android.text.TextPaint textPaint) {
        android.graphics.Typeface a2 = a(context);
        textPaint.setTypeface(a2);
        int style = this.g & (a2.getStyle() ^ -1);
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f);
    }
}
