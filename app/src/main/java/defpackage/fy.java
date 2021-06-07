package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: fy  reason: default package */
/* compiled from: PG */
public final class fy {
    public final ColorStateList a;
    public final ColorStateList b;
    public final float c;
    public final float d;
    public final float e;
    private final float f;
    private final int g;
    private final int h;
    private final String i;
    private final int j;
    private boolean k = false;
    private Typeface l;

    public fy(Context context, int i2) {
        int i3 = 12;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, fx.a);
        this.f = obtainStyledAttributes.getDimension(fx.i, 0.0f);
        this.a = gm.a(context, obtainStyledAttributes, fx.f);
        gm.a(context, obtainStyledAttributes, fx.g);
        gm.a(context, obtainStyledAttributes, fx.h);
        this.g = obtainStyledAttributes.getInt(fx.j, 0);
        this.h = obtainStyledAttributes.getInt(fx.k, 1);
        i3 = !obtainStyledAttributes.hasValue(12) ? 10 : i3;
        this.j = obtainStyledAttributes.getResourceId(i3, 0);
        this.i = obtainStyledAttributes.getString(i3);
        obtainStyledAttributes.getBoolean(fx.l, false);
        this.b = gm.a(context, obtainStyledAttributes, fx.b);
        this.c = obtainStyledAttributes.getFloat(fx.c, 0.0f);
        this.d = obtainStyledAttributes.getFloat(fx.d, 0.0f);
        this.e = obtainStyledAttributes.getFloat(fx.e, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private final Typeface a(Context context) {
        if (this.k) {
            return this.l;
        }
        if (!context.isRestricted()) {
            try {
                this.l = jd.a(context, this.j);
                if (this.l != null) {
                    this.l = Typeface.create(this.l, this.g);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException e2) {
            } catch (Exception e3) {
                String valueOf = String.valueOf(this.i);
                if (valueOf.length() != 0) {
                    "Error loading font ".concat(valueOf);
                } else {
                    new String("Error loading font ");
                }
            }
        }
        if (this.l == null) {
            this.l = Typeface.create(this.i, this.g);
        }
        if (this.l == null) {
            switch (this.h) {
                case 1:
                    this.l = Typeface.SANS_SERIF;
                    break;
                case 2:
                    this.l = Typeface.SERIF;
                    break;
                case 3:
                    this.l = Typeface.MONOSPACE;
                    break;
                default:
                    this.l = Typeface.DEFAULT;
                    break;
            }
            if (this.l != null) {
                this.l = Typeface.create(this.l, this.g);
            }
        }
        this.k = true;
        return this.l;
    }

    public final void a(Context context, TextPaint textPaint) {
        Typeface a2 = a(context);
        textPaint.setTypeface(a2);
        int style = this.g & (a2.getStyle() ^ -1);
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f);
    }
}
