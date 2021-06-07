package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: acm  reason: default package */
/* compiled from: PG */
public final class acm {
    public final aco a;
    public final acn b = new acn();
    public final List c = new ArrayList();

    public acm(aco aco) {
        this.a = aco;
    }

    public final void a(View view) {
        this.c.add(view);
        aco aco = this.a;
        afv c2 = RecyclerView.c(view);
        if (c2 != null) {
            RecyclerView recyclerView = aco.a;
            if (c2.n != -1) {
                c2.m = c2.n;
            } else {
                c2.m = sn.a.d(c2.a);
            }
            recyclerView.a(c2, 4);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b(View view) {
        if (!this.c.remove(view)) {
            return false;
        }
        this.a.b(view);
        return true;
    }

    public final void a(View view, int i, boolean z) {
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
        aco aco = this.a;
        aco.a.addView(view, a2);
        RecyclerView recyclerView = aco.a;
        RecyclerView.c(view);
        if (recyclerView.t != null) {
            for (int size = recyclerView.t.size() - 1; size >= 0; size--) {
                ((afi) recyclerView.t.get(size)).a();
            }
        }
    }

    /* access modifiers changed from: package-private */
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

    public final View b(int i) {
        return this.a.b(a(i));
    }

    public final void a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
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
        aco aco = this.a;
        afv c2 = RecyclerView.c(view);
        if (c2 != null) {
            if (c2.n() || c2.b()) {
                c2.i();
            } else {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + c2 + aco.a.a());
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

    public final View c(int i) {
        return this.a.b(i);
    }

    /* access modifiers changed from: package-private */
    public final void d(int i) {
        afv c2;
        int a2 = a(i);
        this.b.d(a2);
        aco aco = this.a;
        View b2 = aco.b(a2);
        if (!(b2 == null || (c2 = RecyclerView.c(b2)) == null)) {
            if (!c2.n() || c2.b()) {
                c2.b(256);
            } else {
                throw new IllegalArgumentException("called detach on an already detached child " + c2 + aco.a.a());
            }
        }
        aco.a.detachViewFromParent((RecyclerView) a2);
    }

    /* access modifiers changed from: package-private */
    public final int c(View view) {
        int a2 = this.a.a(view);
        if (a2 != -1 && !this.b.c(a2)) {
            return a2 - this.b.e(a2);
        }
        return -1;
    }

    public final boolean d(View view) {
        return this.c.contains(view);
    }

    public final String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}
