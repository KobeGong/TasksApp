package defpackage;

/* renamed from: rp reason: default package */
/* compiled from: PG */
final class rp extends android.view.View.AccessibilityDelegate {
    private final /* synthetic */ defpackage.rn a;

    rp(defpackage.rn rnVar) {
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

    public final android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View view) {
        defpackage.tp a2 = this.a.a(view);
        if (a2 != null) {
            return (android.view.accessibility.AccessibilityNodeProvider) a2.a;
        }
        return null;
    }

    public final boolean performAccessibilityAction(android.view.View view, int i, android.os.Bundle bundle) {
        return this.a.a(view, i, bundle);
    }
}
