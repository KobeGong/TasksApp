package defpackage;

/* renamed from: aco reason: default package */
/* compiled from: PG */
public final class aco {
    public final /* synthetic */ android.support.v7.widget.RecyclerView a;

    public final int a(android.view.View view) {
        return this.a.indexOfChild(view);
    }

    public final void a(int i) {
        android.view.View childAt = this.a.getChildAt(i);
        if (childAt != null) {
            this.a.g(childAt);
            childAt.clearAnimation();
        }
        this.a.removeViewAt(i);
    }

    public final android.view.View b(int i) {
        return this.a.getChildAt(i);
    }

    public final void b(android.view.View view) {
        RecyclerViewHolder c = android.support.v7.widget.RecyclerView.getChildViewHolderInt(view);
        if (c != null) {
            this.a.a(c, c.m);
            c.m = 0;
        }
    }

    public aco(android.support.v7.widget.RecyclerView recyclerView) {
        this.a = recyclerView;
    }
}
