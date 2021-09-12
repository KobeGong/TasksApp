package defpackage;

/* renamed from: agp reason: default package */
/* compiled from: PG */
public abstract class agp extends defpackage.aey {
    private boolean a = true;

    public abstract boolean a(RecyclerViewHolder afv);

    public abstract boolean a(RecyclerViewHolder afv, int i, int i2, int i3, int i4);

    public abstract boolean a(RecyclerViewHolder afv, RecyclerViewHolder afv2, int i, int i2, int i3, int i4);

    public abstract boolean b(RecyclerViewHolder afv);

    public final boolean f(RecyclerViewHolder afv) {
        return !this.a || afv.isInvalid();
    }

    public final boolean a(RecyclerViewHolder afv, defpackage.afb afb, defpackage.afb afb2) {
        int i = afb.a;
        int i2 = afb.b;
        android.view.View view = afv.itemView;
        int i3 = afb2 == null ? view.getLeft() : afb2.a;
        int i4 = afb2 == null ? view.getTop() : afb2.b;
        if (afv.isRemoved() || (i == i3 && i2 == i4)) {
            return a(afv);
        }
        view.layout(i3, i4, view.getWidth() + i3, view.getHeight() + i4);
        return a(afv, i, i2, i3, i4);
    }

    public boolean b(RecyclerViewHolder afv, defpackage.afb afb, defpackage.afb afb2) {
        if (afb == null || (afb.a == afb2.a && afb.b == afb2.b)) {
            return b(afv);
        }
        return a(afv, afb.a, afb.b, afb2.a, afb2.b);
    }

    public final boolean c(RecyclerViewHolder afv, defpackage.afb afb, defpackage.afb afb2) {
        if (afb.a == afb2.a && afb.b == afb2.b) {
            e(afv);
            return false;
        }
        return a(afv, afb.a, afb.b, afb2.a, afb2.b);
    }

    public final boolean a(RecyclerViewHolder afv, RecyclerViewHolder afv2, defpackage.afb afb, defpackage.afb afb2) {
        int i;
        int i2;
        int i3 = afb.a;
        int i4 = afb.b;
        if (afv2.shouldIgnore()) {
            i = afb.a;
            i2 = afb.b;
        } else {
            i = afb2.a;
            i2 = afb2.b;
        }
        return a(afv, afv2, i3, i4, i, i2);
    }
}
