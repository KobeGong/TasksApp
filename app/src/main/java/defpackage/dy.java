package defpackage;

/* renamed from: dy reason: default package */
/* compiled from: PG */
public final class dy implements java.lang.Runnable {
    private final /* synthetic */ android.view.View a;
    private final /* synthetic */ int b;
    private final /* synthetic */ android.support.design.bottomsheet.BottomSheetBehavior c;

    public dy(android.support.design.bottomsheet.BottomSheetBehavior bottomSheetBehavior, android.view.View view, int i) {
        this.c = bottomSheetBehavior;
        this.a = view;
        this.b = i;
    }

    public final void run() {
        this.c.b(this.a, this.b);
    }
}
