package defpackage;

/* renamed from: ro reason: default package */
/* compiled from: PG */
final class ro extends defpackage.rq {
    ro() {
    }

    public final android.view.View.AccessibilityDelegate a(defpackage.rn rnVar) {
        return new defpackage.rp(rnVar);
    }

    public final defpackage.tp a(android.view.View.AccessibilityDelegate accessibilityDelegate, android.view.View view) {
        android.view.accessibility.AccessibilityNodeProvider accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new defpackage.tp(accessibilityNodeProvider);
        }
        return null;
    }

    public final boolean a(android.view.View.AccessibilityDelegate accessibilityDelegate, android.view.View view, int i, android.os.Bundle bundle) {
        return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
    }
}
