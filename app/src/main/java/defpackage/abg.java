package defpackage;

/* renamed from: abg reason: default package */
/* compiled from: PG */
final class abg {
    private final android.view.View a;
    private final defpackage.abl b;
    private int c = -1;
    private defpackage.agu d;
    private defpackage.agu e;
    private defpackage.agu f;

    abg(android.view.View view) {
        this.a = view;
        this.b = defpackage.abl.a();
    }

    /* access modifiers changed from: 0000 */
    public final void a(android.util.AttributeSet attributeSet, int i) {
        defpackage.agw a2 = defpackage.agw.a(this.a.getContext(), attributeSet, defpackage.xu.dd, i, 0);
        try {
            if (a2.f(defpackage.xu.de)) {
                this.c = a2.g(defpackage.xu.de, -1);
                android.content.res.ColorStateList b2 = this.b.b(this.a.getContext(), this.c);
                if (b2 != null) {
                    b(b2);
                }
            }
            if (a2.f(defpackage.xu.df)) {
                defpackage.sn.a.a(this.a, a2.e(defpackage.xu.df));
            }
            if (a2.f(defpackage.xu.dg)) {
                defpackage.sn.a.a(this.a, defpackage.add.a(a2.a(defpackage.xu.dg, -1), null));
            }
        } finally {
            a2.b.recycle();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i) {
        this.c = i;
        b(this.b != null ? this.b.b(this.a.getContext(), i) : null);
        d();
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        this.c = -1;
        b(null);
        d();
    }

    /* access modifiers changed from: 0000 */
    public final void a(android.content.res.ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new defpackage.agu();
        }
        this.e.a = colorStateList;
        this.e.d = true;
        d();
    }

    /* access modifiers changed from: 0000 */
    public final android.content.res.ColorStateList b() {
        if (this.e != null) {
            return this.e.a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final void a(android.graphics.PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new defpackage.agu();
        }
        this.e.b = mode;
        this.e.c = true;
        d();
    }

    /* access modifiers changed from: 0000 */
    public final android.graphics.PorterDuff.Mode c() {
        if (this.e != null) {
            return this.e.b;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        boolean z = false;
        android.graphics.drawable.Drawable background = this.a.getBackground();
        if (background != null) {
            int i = android.os.Build.VERSION.SDK_INT;
            boolean z2 = i > 21 ? this.d != null : i == 21;
            if (z2) {
                if (this.f == null) {
                    this.f = new defpackage.agu();
                }
                defpackage.agu agu = this.f;
                agu.a();
                android.content.res.ColorStateList y = defpackage.sn.a.y(this.a);
                if (y != null) {
                    agu.d = true;
                    agu.a = y;
                }
                android.graphics.PorterDuff.Mode z3 = defpackage.sn.a.z(this.a);
                if (z3 != null) {
                    agu.c = true;
                    agu.b = z3;
                }
                if (agu.d || agu.c) {
                    defpackage.abl.a(background, agu, this.a.getDrawableState());
                    z = true;
                }
                if (z) {
                    return;
                }
            }
            if (this.e != null) {
                defpackage.abl.a(background, this.e, this.a.getDrawableState());
            } else if (this.d != null) {
                defpackage.abl.a(background, this.d, this.a.getDrawableState());
            }
        }
    }

    private final void b(android.content.res.ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new defpackage.agu();
            }
            this.d.a = colorStateList;
            this.d.d = true;
        } else {
            this.d = null;
        }
        d();
    }
}
