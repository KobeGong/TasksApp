package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: abg  reason: default package */
/* compiled from: PG */
public final class abg {
    private final View a;
    private final abl b;
    private int c = -1;
    private agu d;
    private agu e;
    private agu f;

    abg(View view) {
        this.a = view;
        this.b = abl.a();
    }

    /* access modifiers changed from: package-private */
    public final void a(AttributeSet attributeSet, int i) {
        agw a2 = agw.a(this.a.getContext(), attributeSet, xu.dd, i, 0);
        try {
            if (a2.f(xu.de)) {
                this.c = a2.g(xu.de, -1);
                ColorStateList b2 = this.b.b(this.a.getContext(), this.c);
                if (b2 != null) {
                    b(b2);
                }
            }
            if (a2.f(xu.df)) {
                sn.a.a(this.a, a2.e(xu.df));
            }
            if (a2.f(xu.dg)) {
                sn.a.a(this.a, add.a(a2.a(xu.dg, -1), null));
            }
        } finally {
            a2.b.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i) {
        this.c = i;
        b(this.b != null ? this.b.b(this.a.getContext(), i) : null);
        d();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.c = -1;
        b(null);
        d();
    }

    /* access modifiers changed from: package-private */
    public final void a(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new agu();
        }
        this.e.a = colorStateList;
        this.e.d = true;
        d();
    }

    /* access modifiers changed from: package-private */
    public final ColorStateList b() {
        if (this.e != null) {
            return this.e.a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void a(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new agu();
        }
        this.e.b = mode;
        this.e.c = true;
        d();
    }

    /* access modifiers changed from: package-private */
    public final PorterDuff.Mode c() {
        if (this.e != null) {
            return this.e.b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        boolean z;
        boolean z2 = false;
        Drawable background = this.a.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            if (i > 21) {
                z = this.d != null;
            } else if (i == 21) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.f == null) {
                    this.f = new agu();
                }
                agu agu = this.f;
                agu.a();
                ColorStateList y = sn.a.y(this.a);
                if (y != null) {
                    agu.d = true;
                    agu.a = y;
                }
                PorterDuff.Mode z3 = sn.a.z(this.a);
                if (z3 != null) {
                    agu.c = true;
                    agu.b = z3;
                }
                if (agu.d || agu.c) {
                    abl.a(background, agu, this.a.getDrawableState());
                    z2 = true;
                }
                if (z2) {
                    return;
                }
            }
            if (this.e != null) {
                abl.a(background, this.e, this.a.getDrawableState());
            } else if (this.d != null) {
                abl.a(background, this.d, this.a.getDrawableState());
            }
        }
    }

    private final void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new agu();
            }
            this.d.a = colorStateList;
            this.d.d = true;
        } else {
            this.d = null;
        }
        d();
    }
}
