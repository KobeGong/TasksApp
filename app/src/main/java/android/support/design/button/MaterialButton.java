package android.support.design.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.apps.tasks.R;

/* compiled from: PG */
public class MaterialButton extends abh {
    public Drawable a;
    private final el c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private PorterDuff.Mode o;
    private ColorStateList p;

    public MaterialButton(Context context) {
        this(context, null);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int i3;
        Drawable a2;
        TypedArray a3 = fp.a(context, attributeSet, em.a, i2, 2132017756);
        int dimensionPixelOffset = a3.getDimensionPixelOffset(em.h, 0);
        int dimensionPixelOffset2 = a3.getDimensionPixelOffset(em.k, dimensionPixelOffset);
        if (Build.VERSION.SDK_INT >= 17) {
            this.d = a3.getDimensionPixelOffset(em.m, dimensionPixelOffset2);
        } else {
            this.d = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = a3.getDimensionPixelOffset(em.l, dimensionPixelOffset);
        if (Build.VERSION.SDK_INT >= 17) {
            this.e = a3.getDimensionPixelOffset(em.j, dimensionPixelOffset3);
        } else {
            this.e = dimensionPixelOffset3;
        }
        this.f = a3.getDimensionPixelOffset(em.n, dimensionPixelOffset);
        this.g = a3.getDimensionPixelOffset(em.i, dimensionPixelOffset);
        this.h = a3.getDimensionPixelOffset(em.e, 0);
        this.i = a3.getDimensionPixelOffset(em.f, 0);
        this.j = a3.getDimensionPixelOffset(em.g, 0);
        this.k = a3.getDimensionPixelOffset(em.d, 0);
        this.l = a3.getDimensionPixelOffset(em.b, 0);
        this.m = a3.getDimensionPixelOffset(em.c, 0);
        this.n = a3.getDimensionPixelSize(em.s, 0);
        this.o = gm.a(a3.getInt(em.u, -1), PorterDuff.Mode.SRC_IN);
        this.p = gm.a(getContext(), a3, em.t);
        this.a = gm.b(getContext(), a3, em.r);
        this.c = new el(this);
        el elVar = this.c;
        elVar.c = a3.getDimensionPixelOffset(em.e, 0);
        elVar.d = a3.getDimensionPixelOffset(em.f, 0);
        elVar.e = a3.getDimensionPixelOffset(em.g, 0);
        elVar.f = a3.getDimensionPixelOffset(em.d, 0);
        elVar.g = a3.getDimensionPixelSize(em.q, 0);
        elVar.h = a3.getDimensionPixelSize(em.x, 0);
        elVar.i = gm.a(a3.getInt(em.p, -1), PorterDuff.Mode.SRC_IN);
        elVar.j = gm.a(elVar.b.getContext(), a3, em.o);
        elVar.k = gm.a(elVar.b.getContext(), a3, em.w);
        elVar.l = gm.a(elVar.b.getContext(), a3, em.v);
        elVar.m.setStyle(Paint.Style.STROKE);
        elVar.m.setStrokeWidth((float) elVar.h);
        Paint paint = elVar.m;
        if (elVar.k != null) {
            i3 = elVar.k.getColorForState(elVar.b.getDrawableState(), 0);
        } else {
            i3 = 0;
        }
        paint.setColor(i3);
        MaterialButton materialButton = elVar.b;
        if (el.a) {
            elVar.t = new GradientDrawable();
            elVar.t.setCornerRadius(((float) elVar.g) + 1.0E-5f);
            elVar.t.setColor(-1);
            elVar.a();
            elVar.u = new GradientDrawable();
            elVar.u.setCornerRadius(((float) elVar.g) + 1.0E-5f);
            elVar.u.setColor(0);
            elVar.u.setStroke(elVar.h, elVar.k);
            InsetDrawable a4 = elVar.a(new LayerDrawable(new Drawable[]{elVar.t, elVar.u}));
            elVar.v = new GradientDrawable();
            elVar.v.setCornerRadius(((float) elVar.g) + 1.0E-5f);
            elVar.v.setColor(-1);
            a2 = new ek(fz.a(elVar.l), a4, elVar.v);
        } else {
            elVar.p = new GradientDrawable();
            elVar.p.setCornerRadius(((float) elVar.g) + 1.0E-5f);
            elVar.p.setColor(-1);
            elVar.q = jd.d(elVar.p);
            jd.a(elVar.q, elVar.j);
            if (elVar.i != null) {
                jd.a(elVar.q, elVar.i);
            }
            elVar.r = new GradientDrawable();
            elVar.r.setCornerRadius(((float) elVar.g) + 1.0E-5f);
            elVar.r.setColor(-1);
            elVar.s = jd.d(elVar.r);
            jd.a(elVar.s, elVar.l);
            a2 = elVar.a(new LayerDrawable(new Drawable[]{elVar.q, elVar.s}));
        }
        super.setBackgroundDrawable(a2);
        a3.recycle();
        setCompoundDrawablePadding(this.n);
        c();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (Build.VERSION.SDK_INT < 21 && d()) {
            el elVar = this.c;
            if (canvas != null && elVar.k != null && elVar.h > 0) {
                elVar.n.set(elVar.b.getBackground().getBounds());
                elVar.o.set(((float) elVar.n.left) + (((float) elVar.h) / 2.0f) + ((float) elVar.c), ((float) elVar.n.top) + (((float) elVar.h) / 2.0f) + ((float) elVar.e), (((float) elVar.n.right) - (((float) elVar.h) / 2.0f)) - ((float) elVar.d), (((float) elVar.n.bottom) - (((float) elVar.h) / 2.0f)) - ((float) elVar.f));
                float f2 = ((float) elVar.g) - (((float) elVar.h) / 2.0f);
                canvas.drawRoundRect(elVar.o, f2, f2, elVar.m);
            }
        }
    }

    @Override // defpackage.abh, defpackage.sm
    public final void a(ColorStateList colorStateList) {
        if (d()) {
            el elVar = this.c;
            if (elVar.j != colorStateList) {
                elVar.j = colorStateList;
                if (el.a) {
                    elVar.a();
                } else if (elVar.q != null) {
                    jd.a(elVar.q, elVar.j);
                }
            }
        } else if (this.c != null) {
            super.a(colorStateList);
        }
    }

    @Override // defpackage.abh, defpackage.sm
    public final ColorStateList d_() {
        if (d()) {
            return this.c.j;
        }
        return super.d_();
    }

    @Override // defpackage.abh, defpackage.sm
    public final void a(PorterDuff.Mode mode) {
        if (d()) {
            el elVar = this.c;
            if (elVar.i != mode) {
                elVar.i = mode;
                if (el.a) {
                    elVar.a();
                } else if (elVar.q != null && elVar.i != null) {
                    jd.a(elVar.q, elVar.i);
                }
            }
        } else if (this.c != null) {
            super.a(mode);
        }
    }

    @Override // defpackage.abh, defpackage.sm
    public final PorterDuff.Mode b() {
        if (d()) {
            return this.c.i;
        }
        return super.b();
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        a(colorStateList);
    }

    public ColorStateList getBackgroundTintList() {
        return d_();
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        a(mode);
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return b();
    }

    public void setBackgroundColor(int i2) {
        if (d()) {
            el elVar = this.c;
            if (el.a && elVar.t != null) {
                elVar.t.setColor(i2);
            } else if (!el.a && elVar.p != null) {
                elVar.p.setColor(i2);
            }
        } else {
            super.setBackgroundColor(i2);
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // defpackage.abh
    public void setBackgroundResource(int i2) {
        Drawable drawable = null;
        if (i2 != 0) {
            drawable = xw.b(getContext(), i2);
        }
        setBackgroundDrawable(drawable);
    }

    @Override // defpackage.abh
    public void setBackgroundDrawable(Drawable drawable) {
        if (d()) {
            if (drawable != getBackground()) {
                el elVar = this.c;
                elVar.w = true;
                elVar.b.a(elVar.j);
                elVar.b.a(elVar.i);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.abh
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT == 21 && this.c != null) {
            el elVar = this.c;
            int i6 = i5 - i3;
            int i7 = i4 - i2;
            if (elVar.v != null) {
                elVar.v.setBounds(elVar.c, elVar.e, i7 - elVar.d, i6 - elVar.f);
            }
        }
    }

    public final void c() {
        int i2;
        int i3 = 0;
        if (this.a != null) {
            this.a = this.a.mutate();
            jd.a(this.a, this.p);
            if (this.o != null) {
                jd.a(this.a, this.o);
            }
        }
        vo.a.b(this, this.a);
        int i4 = this.d;
        if (this.a != null) {
            i2 = this.l;
        } else {
            i2 = 0;
        }
        int i5 = i2 + i4 + this.h;
        int i6 = this.f + this.j;
        int i7 = this.e;
        if (this.a != null) {
            i3 = this.m;
        }
        sn.a(this, i5, i6, i3 + i7 + this.i, this.g + this.k);
    }

    private final boolean d() {
        return this.c != null && !this.c.w;
    }
}
