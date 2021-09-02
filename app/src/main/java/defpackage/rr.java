package defpackage;

/* renamed from: rr reason: default package */
/* compiled from: PG */
final class rr extends android.view.View.AccessibilityDelegate {
    private final /* synthetic */ defpackage.rn a;

    rr(defpackage.rn rnVar) {
        this.a = rnVar;
    }

    public final boolean dispatchPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return defpackage.rn.c(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.a.a(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a.a(view, defpackage.tl.a(accessibilityNodeInfo));
    }

    public final void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        defpackage.rn.d(view, accessibilityEvent);
    }

    public final boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return defpackage.rn.a(viewGroup, view, accessibilityEvent);
    }

    public final void sendAccessibilityEvent(android.view.View view, int i) {
        defpackage.rn.a(view, i);
    }

    public final void sendAccessibilityEventUnchecked(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        defpackage.rn.b(view, accessibilityEvent);
    }
}
