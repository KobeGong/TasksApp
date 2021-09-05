package defpackage;

/* renamed from: cgd reason: default package */
/* compiled from: PG */
public final class cgd implements java.lang.Runnable {
    private final android.view.View a;
    private final int b;
    private final /* synthetic */ com.google.android.libraries.onegoogle.bottomdrawer.BottomDrawerBehavior c;

    public cgd(com.google.android.libraries.onegoogle.bottomdrawer.BottomDrawerBehavior bottomDrawerBehavior, android.view.View view, int i) {
        this.c = bottomDrawerBehavior;
        this.a = view;
        this.b = i;
    }

    public final void run() {
        if (this.c.d == null || !this.c.d.a()) {
            this.c.c(this.b);
        } else {
            ViewCompat.a(this.a, (java.lang.Runnable) this);
        }
    }
}
