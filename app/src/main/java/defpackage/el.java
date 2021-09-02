package defpackage;

/* renamed from: el reason: default package */
/* compiled from: PG */
public final class el {
    public static final boolean a = (android.os.Build.VERSION.SDK_INT >= 21);
    public final android.support.design.button.MaterialButton b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public android.graphics.PorterDuff.Mode i;
    public android.content.res.ColorStateList j;
    public android.content.res.ColorStateList k;
    public android.content.res.ColorStateList l;
    public final android.graphics.Paint m = new android.graphics.Paint(1);
    public final android.graphics.Rect n = new android.graphics.Rect();
    public final android.graphics.RectF o = new android.graphics.RectF();
    public android.graphics.drawable.GradientDrawable p;
    public android.graphics.drawable.Drawable q;
    public android.graphics.drawable.GradientDrawable r;
    public android.graphics.drawable.Drawable s;
    public android.graphics.drawable.GradientDrawable t;
    public android.graphics.drawable.GradientDrawable u;
    public android.graphics.drawable.GradientDrawable v;
    public boolean w = false;

    public el(android.support.design.button.MaterialButton materialButton) {
        this.b = materialButton;
    }

    public final android.graphics.drawable.InsetDrawable a(android.graphics.drawable.Drawable drawable) {
        return new android.graphics.drawable.InsetDrawable(drawable, this.c, this.e, this.d, this.f);
    }

    public final void a() {
        if (this.t != null) {
            defpackage.jd.a((android.graphics.drawable.Drawable) this.t, this.j);
            if (this.i != null) {
                defpackage.jd.a((android.graphics.drawable.Drawable) this.t, this.i);
            }
        }
    }
}
