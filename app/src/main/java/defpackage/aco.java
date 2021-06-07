package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: aco  reason: default package */
/* compiled from: PG */
public final class aco {
    public final /* synthetic */ RecyclerView a;

    public final int a(View view) {
        return this.a.indexOfChild(view);
    }

    public final void a(int i) {
        View childAt = this.a.getChildAt(i);
        if (childAt != null) {
            this.a.g(childAt);
            childAt.clearAnimation();
        }
        this.a.removeViewAt(i);
    }

    public final View b(int i) {
        return this.a.getChildAt(i);
    }

    public final void b(View view) {
        afv c = RecyclerView.c(view);
        if (c != null) {
            this.a.a(c, c.m);
            c.m = 0;
        }
    }

    public aco(RecyclerView recyclerView) {
        this.a = recyclerView;
    }
}
