package android.support.design.button;

/* compiled from: PG */
public class MaterialButton extends defpackage.abh {
    public android.graphics.drawable.Drawable a;
    private final defpackage.el c;
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
    private android.graphics.PorterDuff.Mode o;
    private android.content.res.ColorStateList p;

    public MaterialButton(android.content.Context context) {
        this(context, null);
    }

    public MaterialButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130772050);
    }

    public MaterialButton(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        int i3;
        android.graphics.drawable.Drawable a2;
        super(context, attributeSet, i2);
        android.content.res.TypedArray a3 = defpackage.fp.a(context, attributeSet, defpackage.em.a, i2, 2132017756);
        int dimensionPixelOffset = a3.getDimensionPixelOffset(defpackage.em.h, 0);
        int dimensionPixelOffset2 = a3.getDimensionPixelOffset(defpackage.em.k, dimensionPixelOffset);
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            this.d = a3.getDimensionPixelOffset(defpackage.em.m, dimensionPixelOffset2);
        } else {
            this.d = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = a3.getDimensionPixelOffset(defpackage.em.l, dimensionPixelOffset);
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            this.e = a3.getDimensionPixelOffset(defpackage.em.j, dimensionPixelOffset3);
        } else {
            this.e = dimensionPixelOffset3;
        }
        this.f = a3.getDimensionPixelOffset(defpackage.em.n, dimensionPixelOffset);
        this.g = a3.getDimensionPixelOffset(defpackage.em.i, dimensionPixelOffset);
        this.h = a3.getDimensionPixelOffset(defpackage.em.e, 0);
        this.i = a3.getDimensionPixelOffset(defpackage.em.f, 0);
        this.j = a3.getDimensionPixelOffset(defpackage.em.g, 0);
        this.k = a3.getDimensionPixelOffset(defpackage.em.d, 0);
        this.l = a3.getDimensionPixelOffset(defpackage.em.b, 0);
        this.m = a3.getDimensionPixelOffset(defpackage.em.c, 0);
        this.n = a3.getDimensionPixelSize(defpackage.em.s, 0);
        this.o = defpackage.gm.a(a3.getInt(defpackage.em.u, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        this.p = defpackage.gm.a(getContext(), a3, defpackage.em.t);
        this.a = defpackage.gm.b(getContext(), a3, defpackage.em.r);
        this.c = new defpackage.el(this);
        defpackage.el elVar = this.c;
        elVar.c = a3.getDimensionPixelOffset(defpackage.em.e, 0);
        elVar.d = a3.getDimensionPixelOffset(defpackage.em.f, 0);
        elVar.e = a3.getDimensionPixelOffset(defpackage.em.g, 0);
        elVar.f = a3.getDimensionPixelOffset(defpackage.em.d, 0);
        elVar.g = a3.getDimensionPixelSize(defpackage.em.q, 0);
        elVar.h = a3.getDimensionPixelSize(defpackage.em.x, 0);
        elVar.i = defpackage.gm.a(a3.getInt(defpackage.em.p, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        elVar.j = defpackage.gm.a(elVar.b.getContext(), a3, defpackage.em.o);
        elVar.k = defpackage.gm.a(elVar.b.getContext(), a3, defpackage.em.w);
        elVar.l = defpackage.gm.a(elVar.b.getContext(), a3, defpackage.em.v);
        elVar.m.setStyle(android.graphics.Paint.Style.STROKE);
        elVar.m.setStrokeWidth((float) elVar.h);
        android.graphics.Paint paint = elVar.m;
        if (elVar.k != null) {
            i3 = elVar.k.getColorForState(elVar.b.getDrawableState(), 0);
        } else {
            i3 = 0;
        }
        paint.setColor(i3);
        android.support.design.button.MaterialButton materialButton = elVar.b;
        if (defpackage.el.a) {
            elVar.t = new android.graphics.drawable.GradientDrawable();
            elVar.t.setCornerRadius(((float) elVar.g) + 1.0E-5f);
            elVar.t.setColor(-1);
            elVar.a();
            elVar.u = new android.graphics.drawable.GradientDrawable();
            elVar.u.setCornerRadius(((float) elVar.g) + 1.0E-5f);
            elVar.u.setColor(0);
            elVar.u.setStroke(elVar.h, elVar.k);
            android.graphics.drawable.InsetDrawable a4 = elVar.a(new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{elVar.t, elVar.u}));
            elVar.v = new android.graphics.drawable.GradientDrawable();
            elVar.v.setCornerRadius(((float) elVar.g) + 1.0E-5f);
            elVar.v.setColor(-1);
            a2 = new defpackage.ek(defpackage.fz.a(elVar.l), a4, elVar.v);
        } else {
            elVar.p = new android.graphics.drawable.GradientDrawable();
            elVar.p.setCornerRadius(((float) elVar.g) + 1.0E-5f);
            elVar.p.setColor(-1);
            elVar.q = defpackage.jd.d((android.graphics.drawable.Drawable) elVar.p);
            defpackage.jd.a(elVar.q, elVar.j);
            if (elVar.i != null) {
                defpackage.jd.a(elVar.q, elVar.i);
            }
            elVar.r = new android.graphics.drawable.GradientDrawable();
            elVar.r.setCornerRadius(((float) elVar.g) + 1.0E-5f);
            elVar.r.setColor(-1);
            elVar.s = defpackage.jd.d((android.graphics.drawable.Drawable) elVar.r);
            defpackage.jd.a(elVar.s, elVar.l);
            a2 = elVar.a(new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{elVar.q, elVar.s}));
        }
        super.setBackgroundDrawable(a2);
        a3.recycle();
        setCompoundDrawablePadding(this.n);
        c();
    }

    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        if (android.os.Build.VERSION.SDK_INT < 21 && d()) {
            defpackage.el elVar = this.c;
            if (canvas != null && elVar.k != null && elVar.h > 0) {
                elVar.n.set(elVar.b.getBackground().getBounds());
                elVar.o.set(((float) elVar.n.left) + (((float) elVar.h) / 2.0f) + ((float) elVar.c), ((float) elVar.n.top) + (((float) elVar.h) / 2.0f) + ((float) elVar.e), (((float) elVar.n.right) - (((float) elVar.h) / 2.0f)) - ((float) elVar.d), (((float) elVar.n.bottom) - (((float) elVar.h) / 2.0f)) - ((float) elVar.f));
                float f2 = ((float) elVar.g) - (((float) elVar.h) / 2.0f);
                canvas.drawRoundRect(elVar.o, f2, f2, elVar.m);
            }
        }
    }

    public final void a(android.content.res.ColorStateList colorStateList) {
        if (d()) {
            defpackage.el elVar = this.c;
            if (elVar.j != colorStateList) {
                elVar.j = colorStateList;
                if (defpackage.el.a) {
                    elVar.a();
                } else if (elVar.q != null) {
                    defpackage.jd.a(elVar.q, elVar.j);
                }
            }
        } else if (this.c != null) {
            super.a(colorStateList);
        }
    }

    public final android.content.res.ColorStateList d_() {
        if (d()) {
            return this.c.j;
        }
        return super.d_();
    }

    public final void a(android.graphics.PorterDuff.Mode mode) {
        if (d()) {
            defpackage.el elVar = this.c;
            if (elVar.i != mode) {
                elVar.i = mode;
                if (defpackage.el.a) {
                    elVar.a();
                } else if (elVar.q != null && elVar.i != null) {
                    defpackage.jd.a(elVar.q, elVar.i);
                }
            }
        } else if (this.c != null) {
            super.a(mode);
        }
    }

    public final android.graphics.PorterDuff.Mode b() {
        if (d()) {
            return this.c.i;
        }
        return super.b();
    }

    public void setBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        a(colorStateList);
    }

    public android.content.res.ColorStateList getBackgroundTintList() {
        return d_();
    }

    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        a(mode);
    }

    public android.graphics.PorterDuff.Mode getBackgroundTintMode() {
        return b();
    }

    public void setBackgroundColor(int i2) {
        if (d()) {
            defpackage.el elVar = this.c;
            if (defpackage.el.a && elVar.t != null) {
                elVar.t.setColor(i2);
            } else if (!defpackage.el.a && elVar.p != null) {
                elVar.p.setColor(i2);
            }
        } else {
            super.setBackgroundColor(i2);
        }
    }

    public void setBackground(android.graphics.drawable.Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundResource(int i2) {
        android.graphics.drawable.Drawable drawable = null;
        if (i2 != 0) {
            drawable = defpackage.xw.b(getContext(), i2);
        }
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        if (d()) {
            if (drawable != getBackground()) {
                defpackage.el elVar = this.c;
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
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (android.os.Build.VERSION.SDK_INT == 21 && this.c != null) {
            defpackage.el elVar = this.c;
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
            defpackage.jd.a(this.a, this.p);
            if (this.o != null) {
                defpackage.jd.a(this.a, this.o);
            }
        }
        defpackage.vo.a.b((android.widget.TextView) this, this.a);
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
        defpackage.sn.a(this, i5, i6, i3 + i7 + this.i, this.g + this.k);
    }

    private final boolean d() {
        return this.c != null && !this.c.w;
    }
}
