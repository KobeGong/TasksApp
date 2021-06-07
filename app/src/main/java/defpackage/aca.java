package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: aca  reason: default package */
/* compiled from: PG */
final class aca extends abw {
    public final SeekBar b;
    public Drawable c;
    private ColorStateList d = null;
    private PorterDuff.Mode e = null;
    private boolean f = false;
    private boolean g = false;

    aca(SeekBar seekBar) {
        super(seekBar);
        this.b = seekBar;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.abw
    public final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        agw a = agw.a(this.b.getContext(), attributeSet, xu.Q, i, 0);
        Drawable b2 = a.b(xu.R);
        if (b2 != null) {
            this.b.setThumb(b2);
        }
        Drawable a2 = a.a(xu.S);
        if (this.c != null) {
            this.c.setCallback(null);
        }
        this.c = a2;
        if (a2 != null) {
            a2.setCallback(this.b);
            jd.b(a2, sn.a.j(this.b));
            if (a2.isStateful()) {
                a2.setState(this.b.getDrawableState());
            }
            a();
        }
        this.b.invalidate();
        if (a.f(xu.U)) {
            this.e = add.a(a.a(xu.U, -1), this.e);
            this.g = true;
        }
        if (a.f(xu.T)) {
            this.d = a.e(xu.T);
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
            this.c = jd.d(this.c.mutate());
            if (this.f) {
                jd.a(this.c, this.d);
            }
            if (this.g) {
                jd.a(this.c, this.e);
            }
            if (this.c.isStateful()) {
                this.c.setState(this.b.getDrawableState());
            }
        }
    }
}
