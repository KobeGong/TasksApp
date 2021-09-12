package defpackage;

/* renamed from: aey reason: default package */
/* compiled from: PG */
public abstract class aey {
    private java.util.ArrayList a = new java.util.ArrayList();
    public defpackage.afa h = null;
    public long i = 120;
    public long j = 120;
    public long k = 250;
    public long l = 250;

    public abstract void a();

    public abstract boolean a(RecyclerViewHolder afv, defpackage.afb afb, defpackage.afb afb2);

    public abstract boolean a(RecyclerViewHolder afv, RecyclerViewHolder afv2, defpackage.afb afb, defpackage.afb afb2);

    public abstract boolean b();

    public abstract boolean b(RecyclerViewHolder afv, defpackage.afb afb, defpackage.afb afb2);

    public abstract void c(RecyclerViewHolder afv);

    public abstract boolean c(RecyclerViewHolder afv, defpackage.afb afb, defpackage.afb afb2);

    public abstract void d();

    public static int d(RecyclerViewHolder afv) {
        int i2 = afv.mFlags & 14;
        if (afv.isInvalid()) {
            return 4;
        }
        if ((i2 & 4) != 0) {
            return i2;
        }
        int i3 = afv.oldPos;
        int d = afv.d();
        if (i3 == -1 || d == -1 || i3 == d) {
            return i2;
        }
        return i2 | 2048;
    }

    public final void e(RecyclerViewHolder afv) {
        boolean z;
        boolean z2 = true;
        if (this.h != null) {
            defpackage.afa afa = this.h;
            afv.a(true);
            if (afv.mShadowedHolder != null && afv.mShadowingHolder == null) {
                afv.mShadowedHolder = null;
            }
            afv.mShadowingHolder = null;
            if (!((afv.mFlags & 16) != 0)) {
                android.support.v7.widget.RecyclerView recyclerView = afa.a;
                android.view.View view = afv.itemView;
                recyclerView.d();
                defpackage.acm acm = recyclerView.g;
                int a2 = acm.a.a(view);
                if (a2 == -1) {
                    acm.b(view);
                    z = true;
                } else if (acm.b.c(a2)) {
                    acm.b.d(a2);
                    acm.b(view);
                    acm.a.a(a2);
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    RecyclerViewHolder c = android.support.v7.widget.RecyclerView.getChildViewHolderInt(view);
                    recyclerView.e.b(c);
                    recyclerView.e.a(c);
                }
                if (z) {
                    z2 = false;
                }
                recyclerView.a(z2);
                if (!z && afv.isTmpDetached()) {
                    afa.a.removeDetachedView(afv.itemView, false);
                }
            }
        }
    }

    public boolean f(RecyclerViewHolder afv) {
        return true;
    }

    public boolean a(RecyclerViewHolder afv, java.util.List list) {
        return f(afv);
    }

    public final void e() {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((defpackage.aez) this.a.get(i2)).a();
        }
        this.a.clear();
    }
}
