package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: abs  reason: default package */
/* compiled from: PG */
public final class abs {
    private final ImageView a;
    private agu b;
    private agu c;

    public abs(ImageView imageView) {
        this.a = imageView;
    }

    public final void a(AttributeSet attributeSet, int i) {
        int g;
        agw a2 = agw.a(this.a.getContext(), attributeSet, xu.M, i, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (!(drawable != null || (g = a2.g(xu.N, -1)) == -1 || (drawable = xw.b(this.a.getContext(), g)) == null)) {
                this.a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                add.a(drawable);
            }
            if (a2.f(xu.O)) {
                ut.a.a(this.a, a2.e(xu.O));
            }
            if (a2.f(xu.P)) {
                ut.a.a(this.a, add.a(a2.a(xu.P, -1), null));
            }
        } finally {
            a2.b.recycle();
        }
    }

    public final void a(int i) {
        if (i != 0) {
            Drawable b2 = xw.b(this.a.getContext(), i);
            if (b2 != null) {
                add.a(b2);
            }
            this.a.setImageDrawable(b2);
        } else {
            this.a.setImageDrawable(null);
        }
        d();
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        Drawable background = this.a.getBackground();
        if (Build.VERSION.SDK_INT < 21 || !(background instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void a(ColorStateList colorStateList) {
        if (this.b == null) {
            this.b = new agu();
        }
        this.b.a = colorStateList;
        this.b.d = true;
        d();
    }

    /* access modifiers changed from: package-private */
    public final ColorStateList b() {
        if (this.b != null) {
            return this.b.a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void a(PorterDuff.Mode mode) {
        if (this.b == null) {
            this.b = new agu();
        }
        this.b.b = mode;
        this.b.c = true;
        d();
    }

    /* access modifiers changed from: package-private */
    public final PorterDuff.Mode c() {
        if (this.b != null) {
            return this.b.b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        boolean z;
        boolean z2 = false;
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            add.a(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            if (i > 21 || i != 21) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (this.c == null) {
                    this.c = new agu();
                }
                agu agu = this.c;
                agu.a();
                ColorStateList a2 = ut.a.a(this.a);
                if (a2 != null) {
                    agu.d = true;
                    agu.a = a2;
                }
                PorterDuff.Mode b2 = ut.a.b(this.a);
                if (b2 != null) {
                    agu.c = true;
                    agu.b = b2;
                }
                if (agu.d || agu.c) {
                    abl.a(drawable, agu, this.a.getDrawableState());
                    z2 = true;
                }
                if (z2) {
                    return;
                }
            }
            if (this.b != null) {
                abl.a(drawable, this.b, this.a.getDrawableState());
            }
        }
    }
}
