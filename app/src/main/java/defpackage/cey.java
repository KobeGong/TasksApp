package defpackage;

/* renamed from: cey reason: default package */
/* compiled from: PG */
final class cey extends defpackage.xg {
    public com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer a;
    private final defpackage.cgi b = new defpackage.cez(this);
    private final defpackage.rn c = new defpackage.cfa(this);

    cey(android.content.Context context) {
        super(context, 2132017362);
        a();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    public final void setContentView(android.view.View view) {
        defpackage.cky.a(view instanceof defpackage.cff, (java.lang.Object) "Content of dialog must be BaseAccountMenuView");
        android.support.design.widget.CoordinatorLayout coordinatorLayout = (android.support.design.widget.CoordinatorLayout) android.view.View.inflate(getContext(), 2131034142, null);
        this.a = (com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer) coordinatorLayout.findViewById(2131755237);
        this.a.addView(view);
        defpackage.sn.a((android.view.View) this.a, this.c);
        this.a.a(this.b);
        super.setContentView((android.view.View) coordinatorLayout);
    }

    public final void onAttachedToWindow() {
        if (this.a != null && isShowing()) {
            this.a.a();
        }
    }

    public final void dismiss() {
        if (this.a == null || !this.a.b()) {
            super.dismiss();
        } else {
            this.a.c();
        }
    }

    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            return true;
        }
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }
}
