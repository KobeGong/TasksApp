package defpackage;

import android.view.View;

/* renamed from: agp  reason: default package */
/* compiled from: PG */
public abstract class agp extends aey {
    private boolean a = true;

    public abstract boolean a(afv afv);

    public abstract boolean a(afv afv, int i, int i2, int i3, int i4);

    public abstract boolean a(afv afv, afv afv2, int i, int i2, int i3, int i4);

    public abstract boolean b(afv afv);

    @Override // defpackage.aey
    public final boolean f(afv afv) {
        return !this.a || afv.j();
    }

    @Override // defpackage.aey
    public final boolean a(afv afv, afb afb, afb afb2) {
        int i = afb.a;
        int i2 = afb.b;
        View view = afv.a;
        int left = afb2 == null ? view.getLeft() : afb2.a;
        int top = afb2 == null ? view.getTop() : afb2.b;
        if (afv.m() || (i == left && i2 == top)) {
            return a(afv);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return a(afv, i, i2, left, top);
    }

    @Override // defpackage.aey
    public boolean b(afv afv, afb afb, afb afb2) {
        if (afb == null || (afb.a == afb2.a && afb.b == afb2.b)) {
            return b(afv);
        }
        return a(afv, afb.a, afb.b, afb2.a, afb2.b);
    }

    @Override // defpackage.aey
    public final boolean c(afv afv, afb afb, afb afb2) {
        if (afb.a != afb2.a || afb.b != afb2.b) {
            return a(afv, afb.a, afb.b, afb2.a, afb2.b);
        }
        e(afv);
        return false;
    }

    @Override // defpackage.aey
    public final boolean a(afv afv, afv afv2, afb afb, afb afb2) {
        int i;
        int i2;
        int i3 = afb.a;
        int i4 = afb.b;
        if (afv2.b()) {
            i = afb.a;
            i2 = afb.b;
        } else {
            i = afb2.a;
            i2 = afb2.b;
        }
        return a(afv, afv2, i3, i4, i, i2);
    }
}
