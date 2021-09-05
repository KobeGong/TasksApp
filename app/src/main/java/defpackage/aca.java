package defpackage;

/* renamed from: aca reason: default package */
/* compiled from: PG */
final class aca extends defpackage.abw {
    public final android.widget.SeekBar b;
    public android.graphics.drawable.Drawable c;
    private android.content.res.ColorStateList d = null;
    private android.graphics.PorterDuff.Mode e = null;
    private boolean f = false;
    private boolean g = false;

    aca(android.widget.SeekBar seekBar) {
        super(seekBar);
        this.b = seekBar;
    }

    /* access modifiers changed from: 0000 */
    public final void a(android.util.AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        defpackage.agw a = defpackage.agw.a(this.b.getContext(), attributeSet, defpackage.xu.Q, i, 0);
        android.graphics.drawable.Drawable b2 = a.b(defpackage.xu.R);
        if (b2 != null) {
            this.b.setThumb(b2);
        }
        android.graphics.drawable.Drawable a2 = a.a(defpackage.xu.S);
        if (this.c != null) {
            this.c.setCallback(null);
        }
        this.c = a2;
        if (a2 != null) {
            a2.setCallback(this.b);
            defpackage.jd.b(a2, ViewCompat.a.j(this.b));
            if (a2.isStateful()) {
                a2.setState(this.b.getDrawableState());
            }
            a();
        }
        this.b.invalidate();
        if (a.f(defpackage.xu.U)) {
            this.e = defpackage.add.a(a.a(defpackage.xu.U, -1), this.e);
            this.g = true;
        }
        if (a.f(defpackage.xu.T)) {
            this.d = a.e(defpackage.xu.T);
            this.f = true;
        }
        a.b.recycle();
        a();
    }

    private final void a() {
        if (this.c == null) {
            return;
        }
        if (this.f || this.g) {
            this.c = defpackage.jd.d(this.c.mutate());
            if (this.f) {
                defpackage.jd.a(this.c, this.d);
            }
            if (this.g) {
                defpackage.jd.a(this.c, this.e);
            }
            if (this.c.isStateful()) {
                this.c.setState(this.b.getDrawableState());
            }
        }
    }
}
