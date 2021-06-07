package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aey  reason: default package */
/* compiled from: PG */
public abstract class aey {
    private ArrayList a = new ArrayList();
    public afa h = null;
    public long i = 120;
    public long j = 120;
    public long k = 250;
    public long l = 250;

    public abstract void a();

    public abstract boolean a(afv afv, afb afb, afb afb2);

    public abstract boolean a(afv afv, afv afv2, afb afb, afb afb2);

    public abstract boolean b();

    public abstract boolean b(afv afv, afb afb, afb afb2);

    public abstract void c(afv afv);

    public abstract boolean c(afv afv, afb afb, afb afb2);

    public abstract void d();

    public static int d(afv afv) {
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

    public final void e(afv afv) {
        boolean z;
        boolean z2 = true;
        if (this.h != null) {
            afa afa = this.h;
            afv.a(true);
            if (afv.h != null && afv.i == null) {
                afv.h = null;
            }
            afv.i = null;
            if (!((afv.j & 16) != 0)) {
                RecyclerView recyclerView = afa.a;
                View view = afv.a;
                recyclerView.d();
                acm acm = recyclerView.g;
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
                    afv c = RecyclerView.c(view);
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

    public boolean f(afv afv) {
        return true;
    }

    public boolean a(afv afv, List list) {
        return f(afv);
    }

    public final void e() {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((aez) this.a.get(i2)).a();
        }
        this.a.clear();
    }
}
