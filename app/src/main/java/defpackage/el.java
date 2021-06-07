package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.support.design.button.MaterialButton;

/* renamed from: el  reason: default package */
/* compiled from: PG */
public final class el {
    public static final boolean a = (Build.VERSION.SDK_INT >= 21);
    public final MaterialButton b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public final Paint m = new Paint(1);
    public final Rect n = new Rect();
    public final RectF o = new RectF();
    public GradientDrawable p;
    public Drawable q;
    public GradientDrawable r;
    public Drawable s;
    public GradientDrawable t;
    public GradientDrawable u;
    public GradientDrawable v;
    public boolean w = false;

    public el(MaterialButton materialButton) {
        this.b = materialButton;
    }

    public final InsetDrawable a(Drawable drawable) {
        return new InsetDrawable(drawable, this.c, this.e, this.d, this.f);
    }

    public final void a() {
        if (this.t != null) {
            jd.a((Drawable) this.t, this.j);
            if (this.i != null) {
                jd.a((Drawable) this.t, this.i);
            }
        }
    }
}
