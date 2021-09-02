package defpackage;

/* renamed from: aoo reason: default package */
/* compiled from: PG */
final class aoo extends android.view.View.AccessibilityDelegate {
    private final /* synthetic */ BottomSheetMenuDialogFragment a;

    aoo(BottomSheetMenuDialogFragment aol) {
        this.a = aol;
    }

    public final void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.getText().add(this.a.getResource().getString(2131951636));
        } else {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }
}
