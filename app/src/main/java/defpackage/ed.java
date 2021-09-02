package defpackage;

/* renamed from: ed reason: default package */
/* compiled from: PG */
public final class ed implements java.lang.Runnable {
    private final android.view.View a;
    private final int b;
    private final /* synthetic */ android.support.design.bottomsheet.BottomSheetBehavior c;

    public ed(android.support.design.bottomsheet.BottomSheetBehavior bottomSheetBehavior, android.view.View view, int i) {
        this.c = bottomSheetBehavior;
        this.a = view;
        this.b = i;
    }

    public final void run() {
        if (this.c.g == null || !this.c.g.a()) {
            this.c.c(this.b);
        } else {
            defpackage.sn.a(this.a, (java.lang.Runnable) this);
        }
    }
}
