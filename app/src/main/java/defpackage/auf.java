package defpackage;

/* renamed from: auf reason: default package */
/* compiled from: PG */
final class auf extends android.view.View.AccessibilityDelegate {
    private final /* synthetic */ android.view.View a;

    auf(android.view.View view) {
        this.a = view;
    }

    public final void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(16, this.a.getResources().getString(2131951617)));
    }
}
