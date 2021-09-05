package defpackage;

/* renamed from: do reason: invalid class name and default package and case insensitive filesystem */
public final class PG implements java.lang.Runnable {
    private final android.view.View a;
    private final boolean b;
    private final /* synthetic */ android.support.design.behavior.SwipeDismissBehavior c;

    PG(android.support.design.behavior.SwipeDismissBehavior swipeDismissBehavior, android.view.View view, boolean z) {
        this.c = swipeDismissBehavior;
        this.a = view;
        this.b = z;
    }

    public final void run() {
        if (this.c.a != null && this.c.a.a()) {
            ViewCompat.a(this.a, (java.lang.Runnable) this);
        } else if (this.b && this.c.b != null) {
            this.c.b.a(this.a);
        }
    }
}
