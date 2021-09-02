package defpackage;

/* renamed from: arc reason: default package */
/* compiled from: PG */
final class arc implements android.view.ViewTreeObserver.OnWindowFocusChangeListener {
    private final /* synthetic */ android.view.View a;
    private final /* synthetic */ defpackage.arb b;

    arc(defpackage.arb arb, android.view.View view) {
        this.b = arb;
        this.a = view;
    }

    @android.annotation.TargetApi(18)
    public final void onWindowFocusChanged(boolean z) {
        FragmentActivity j = this.b.getActivity();
        if (j != null && j.hasWindowFocus() && !this.b.n) {
            this.a.requestFocus();
            defpackage.bdk.a(this.a, true);
        }
        this.a.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
    }
}
