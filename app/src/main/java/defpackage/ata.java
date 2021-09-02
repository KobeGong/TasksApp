package defpackage;

/* renamed from: ata reason: default package */
/* compiled from: PG */
final class ata extends android.view.View.AccessibilityDelegate {
    private final /* synthetic */ EditTaskFragment a;

    ata(EditTaskFragment asi) {
        this.a = asi;
    }

    public final void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(16, this.a.getResource().getString(2131951616)));
    }
}
