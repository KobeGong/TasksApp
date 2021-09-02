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

    public abstract boolean a(defpackage.afv afv, defpackage.afb afb, defpackage.afb afb2);

    public abstract boolean a(defpackage.afv afv, defpackage.afv afv2, defpackage.afb afb, defpackage.afb afb2);

    public abstract boolean b();

    public abstract boolean b(defpackage.afv afv, defpackage.afb afb, defpackage.afb afb2);

    public abstract void c(defpackage.afv afv);

    public abstract boolean c(defpackage.afv afv, defpackage.afb afb, defpackage.afb afb2);

    public abstract void d();

    public static int d(defpackage.afv afv) {
        int i2 = afv.j & 14;
        if (afv.j()) {
            return 4;
        }
        if ((i2 & 4) != 0) {
            return i2;
        }
        int i3 = afv.d;
        int d = afv.d();
        if (i3 == -1 || d == -1 || i3 == d) {
            return i2;
        }
        return i2 | 2048;
    }

    public final void e(defpackage.afv afv) {
        boolean z;
        boolean z2 = true;
        if (this.h != null) {
            defpackage.afa afa = this.h;
            afv.a(true);
            if (afv.h != null && afv.i == null) {
                afv.h = null;
            }
            afv.i = null;
            if (!((afv.j & 16) != 0)) {
                android.support.v7.widget.RecyclerView recyclerView = afa.a;
                android.view.View view = afv.a;
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
                    defpackage.afv c = android.support.v7.widget.RecyclerView.c(view);
                    recyclerView.e.b(c);
                    recyclerView.e.a(c);
                }
                if (z) {
                    z2 = false;
                }
                recyclerView.a(z2);
                if (!z && afv.n()) {
                    afa.a.removeDetachedView(afv.a, false);
                }
            }
        }
    }

    public boolean f(defpackage.afv afv) {
        return true;
    }

    public boolean a(defpackage.afv afv, java.util.List list) {
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
