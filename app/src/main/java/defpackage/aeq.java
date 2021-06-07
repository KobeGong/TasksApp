package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: aeq  reason: default package */
/* compiled from: PG */
public final class aeq implements Runnable {
    private final /* synthetic */ RecyclerView a;

    public aeq(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void run() {
        if (this.a.q && !this.a.isLayoutRequested()) {
            if (!this.a.o) {
                this.a.requestLayout();
                return;
            }
            boolean z = this.a.r;
            this.a.c();
        }
    }
}
