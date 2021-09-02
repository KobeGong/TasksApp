package defpackage;

/* renamed from: abs reason: default package */
/* compiled from: PG */
public final class abs {
    private final android.widget.ImageView a;
    private defpackage.agu b;
    private defpackage.agu c;

    public abs(android.widget.ImageView imageView) {
        this.a = imageView;
    }

    public final void a(android.util.AttributeSet attributeSet, int i) {
        defpackage.agw a2 = defpackage.agw.a(this.a.getContext(), attributeSet, defpackage.xu.M, i, 0);
        try {
            android.graphics.drawable.Drawable drawable = this.a.getDrawable();
            if (drawable == null) {
                int g = a2.g(defpackage.xu.N, -1);
                if (g != -1) {
                    drawable = defpackage.xw.b(this.a.getContext(), g);
                    if (drawable != null) {
                        this.a.setImageDrawable(drawable);
                    }
                }
            }
            if (drawable != null) {
                defpackage.add.a(drawable);
            }
            if (a2.f(defpackage.xu.O)) {
                defpackage.ut.a.a(this.a, a2.e(defpackage.xu.O));
            }
            if (a2.f(defpackage.xu.P)) {
                defpackage.ut.a.a(this.a, defpackage.add.a(a2.a(defpackage.xu.P, -1), null));
            }
        } finally {
            a2.b.recycle();
        }
    }

    public final void a(int i) {
        if (i != 0) {
            android.graphics.drawable.Drawable b2 = defpackage.xw.b(this.a.getContext(), i);
            if (b2 != null) {
                defpackage.add.a(b2);
            }
            this.a.setImageDrawable(b2);
        } else {
            this.a.setImageDrawable(null);
        }
        d();
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        android.graphics.drawable.Drawable background = this.a.getBackground();
        if (android.os.Build.VERSION.SDK_INT < 21 || !(background instanceof android.graphics.drawable.RippleDrawable)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final void a(android.content.res.ColorStateList colorStateList) {
        if (this.b == null) {
            this.b = new defpackage.agu();
        }
        this.b.a = colorStateList;
        this.b.d = true;
        d();
    }

    /* access modifiers changed from: 0000 */
    public final android.content.res.ColorStateList b() {
        if (this.b != null) {
            return this.b.a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final void a(android.graphics.PorterDuff.Mode mode) {
        if (this.b == null) {
            this.b = new defpackage.agu();
        }
        this.b.b = mode;
        this.b.c = true;
        d();
    }

    /* access modifiers changed from: 0000 */
    public final android.graphics.PorterDuff.Mode c() {
        if (this.b != null) {
            return this.b.b;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        boolean z;
        boolean z2 = false;
        android.graphics.drawable.Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            defpackage.add.a(drawable);
        }
        if (drawable != null) {
            int i = android.os.Build.VERSION.SDK_INT;
            if (i > 21 || i != 21) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (this.c == null) {
                    this.c = new defpackage.agu();
                }
                defpackage.agu agu = this.c;
                agu.a();
                android.content.res.ColorStateList a2 = defpackage.ut.a.a(this.a);
                if (a2 != null) {
                    agu.d = true;
                    agu.a = a2;
                }
                android.graphics.PorterDuff.Mode b2 = defpackage.ut.a.b(this.a);
                if (b2 != null) {
                    agu.c = true;
                    agu.b = b2;
                }
                if (agu.d || agu.c) {
                    defpackage.abl.a(drawable, agu, this.a.getDrawableState());
                    z2 = true;
                }
                if (z2) {
                    return;
                }
            }
            if (this.b != null) {
                defpackage.abl.a(drawable, this.b, this.a.getDrawableState());
            }
        }
    }
}
