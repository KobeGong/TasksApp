package defpackage;

/* renamed from: acm reason: default package */
/* compiled from: PG */
public final class acm {
    public final defpackage.aco a;
    public final defpackage.acn b = new defpackage.acn();
    public final java.util.List c = new java.util.ArrayList();

    public acm(defpackage.aco aco) {
        this.a = aco;
    }

    public final void a(android.view.View view) {
        this.c.add(view);
        defpackage.aco aco = this.a;
        defpackage.afv c2 = android.support.v7.widget.RecyclerView.c(view);
        if (c2 != null) {
            android.support.v7.widget.RecyclerView recyclerView = aco.a;
            if (c2.n != -1) {
                c2.m = c2.n;
            } else {
                c2.m = ViewCompat.a.d(c2.a);
            }
            recyclerView.a(c2, 4);
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean b(android.view.View view) {
        if (!this.c.remove(view)) {
            return false;
        }
        this.a.b(view);
        return true;
    }

    public final void a(android.view.View view, int i, boolean z) {
        int a2;
        if (i < 0) {
            a2 = this.a.a.getChildCount();
        } else {
            a2 = a(i);
        }
        this.b.a(a2, z);
        if (z) {
            a(view);
        }
        defpackage.aco aco = this.a;
        aco.a.addView(view, a2);
        android.support.v7.widget.RecyclerView recyclerView = aco.a;
        android.support.v7.widget.RecyclerView.c(view);
        if (recyclerView.t != null) {
            for (int size = recyclerView.t.size() - 1; size >= 0; size--) {
                ((defpackage.afi) recyclerView.t.get(size)).a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final int a(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.a.a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int e = i - (i2 - this.b.e(i2));
            if (e == 0) {
                while (this.b.c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += e;
        }
        return -1;
    }

    public final android.view.View b(int i) {
        return this.a.b(a(i));
    }

    public final void a(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams, boolean z) {
        int a2;
        if (i < 0) {
            a2 = this.a.a.getChildCount();
        } else {
            a2 = a(i);
        }
        this.b.a(a2, z);
        if (z) {
            a(view);
        }
        defpackage.aco aco = this.a;
        defpackage.afv c2 = android.support.v7.widget.RecyclerView.c(view);
        if (c2 != null) {
            if (c2.n() || c2.b()) {
                c2.i();
            } else {
                throw new java.lang.IllegalArgumentException("Called attach on a child which is not detached: " + c2 + aco.a.a());
            }
        }
        aco.a.attachViewToParent(view, a2, layoutParams);
    }

    public final int a() {
        return this.a.a.getChildCount() - this.c.size();
    }

    public final int b() {
        return this.a.a.getChildCount();
    }

    public final android.view.View c(int i) {
        return this.a.b(i);
    }

    /* access modifiers changed from: 0000 */
    public final void d(int i) {
        int a2 = a(i);
        this.b.d(a2);
        defpackage.aco aco = this.a;
        android.view.View b2 = aco.b(a2);
        if (b2 != null) {
            defpackage.afv c2 = android.support.v7.widget.RecyclerView.c(b2);
            if (c2 != null) {
                if (!c2.n() || c2.b()) {
                    c2.b(256);
                } else {
                    throw new java.lang.IllegalArgumentException("called detach on an already detached child " + c2 + aco.a.a());
                }
            }
        }
        aco.a.detachViewFromParent(a2);
    }

    /* access modifiers changed from: 0000 */
    public final int c(android.view.View view) {
        int a2 = this.a.a(view);
        if (a2 != -1 && !this.b.c(a2)) {
            return a2 - this.b.e(a2);
        }
        return -1;
    }

    public final boolean d(android.view.View view) {
        return this.c.contains(view);
    }

    public final java.lang.String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}
