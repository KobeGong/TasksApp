package defpackage;

/* renamed from: aep reason: default package */
/* compiled from: PG */
public class aep {
    public final LayoutManager a;
    public int b;
    public final android.graphics.Rect c;

    private aep(LayoutManager afd) {
        this.b = Integer.MIN_VALUE;
        this.c = new android.graphics.Rect();
        this.a = afd;
    }

    public final int a() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return e() - this.b;
    }

    public int a(android.view.View view) {
        return LayoutManager.c(view) - ((defpackage.afh) view.getLayoutParams()).topMargin;
    }

    public int b(android.view.View view) {
        defpackage.afh afh = (defpackage.afh) view.getLayoutParams();
        return afh.bottomMargin + LayoutManager.e(view);
    }

    public int c(android.view.View view) {
        this.a.a(view, this.c);
        return this.c.bottom;
    }

    public int d(android.view.View view) {
        this.a.a(view, this.c);
        return this.c.top;
    }

    public int e(android.view.View view) {
        defpackage.afh afh = (defpackage.afh) view.getLayoutParams();
        android.graphics.Rect rect = ((defpackage.afh) view.getLayoutParams()).b;
        return afh.bottomMargin + rect.bottom + view.getMeasuredHeight() + rect.top + afh.topMargin;
    }

    public int f(android.view.View view) {
        defpackage.afh afh = (defpackage.afh) view.getLayoutParams();
        android.graphics.Rect rect = ((defpackage.afh) view.getLayoutParams()).b;
        return afh.rightMargin + rect.right + view.getMeasuredWidth() + rect.left + afh.leftMargin;
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
            android.support.v7.widget.RecyclerView recyclerView = afd.b;
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
