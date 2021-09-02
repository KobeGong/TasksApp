package defpackage;

/* renamed from: df reason: default package */
/* compiled from: PG */
final class df implements java.lang.Runnable {
    private final android.support.design.widget.CoordinatorLayout a;
    private final android.view.View b;
    private final /* synthetic */ defpackage.de c;

    df(defpackage.de deVar, android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
        this.c = deVar;
        this.a = coordinatorLayout;
        this.b = view;
    }

    public final void run() {
        if (this.b != null && this.c.c != null) {
            if (this.c.c.computeScrollOffset()) {
                this.c.a_(this.a, this.b, this.c.c.getCurrY());
                defpackage.sn.a(this.b, (java.lang.Runnable) this);
                return;
            }
            this.c.a(this.a, this.b);
        }
    }
}
