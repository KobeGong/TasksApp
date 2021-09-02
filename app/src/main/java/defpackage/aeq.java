package defpackage;

/* renamed from: aeq reason: default package */
/* compiled from: PG */
public final class aeq implements java.lang.Runnable {
    private final /* synthetic */ android.support.v7.widget.RecyclerView a;

    public aeq(android.support.v7.widget.RecyclerView recyclerView) {
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
