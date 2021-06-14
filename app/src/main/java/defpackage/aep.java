package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: aep  reason: default package */
/* compiled from: PG */
public class aep {
    public final LayoutManager a;
    public int b;
    public final Rect c;

    private aep(LayoutManager afd) {
        this.b = Integer.MIN_VALUE;
        this.c = new Rect();
        this.a = afd;
    }

    public final int a() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return e() - this.b;
    }

    public int a(View view) {
        return LayoutManager.c(view) - ((afh) view.getLayoutParams()).topMargin;
    }

    public int b(View view) {
        return ((afh) view.getLayoutParams()).bottomMargin + LayoutManager.e(view);
    }

    public int c(View view) {
        this.a.a(view, this.c);
        return this.c.bottom;
    }

    public int d(View view) {
        this.a.a(view, this.c);
        return this.c.top;
    }

    public int e(View view) {
        afh afh = (afh) view.getLayoutParams();
        Rect rect = ((afh) view.getLayoutParams()).b;
        int i = rect.bottom;
        return afh.bottomMargin + i + view.getMeasuredHeight() + rect.top + afh.topMargin;
    }

    public int f(View view) {
        afh afh = (afh) view.getLayoutParams();
        Rect rect = ((afh) view.getLayoutParams()).b;
        int i = rect.right;
        return afh.rightMargin + i + view.getMeasuredWidth() + rect.left + afh.leftMargin;
    }

    public int b() {
        return this.a.m();
    }

    public int c() {
        return this.a.m - this.a.o();
    }

    public int d() {
        return this.a.m;
    }

    public void a(int i) {
        LayoutManager afd = this.a;
        if (afd.b != null) {
            RecyclerView recyclerView = afd.b;
            int a2 = recyclerView.g.a();
            for (int i2 = 0; i2 < a2; i2++) {
                recyclerView.g.b(i2).offsetTopAndBottom(i);
            }
        }
    }

    public int e() {
        return (this.a.m - this.a.m()) - this.a.o();
    }

    public int f() {
        return this.a.o();
    }

    public int g() {
        return this.a.k;
    }

    aep(LayoutManager afd, char c2) {
        this(afd);
    }
}
