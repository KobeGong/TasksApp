package defpackage;

/* renamed from: rn reason: default package */
/* compiled from: PG */
public class rn {
    private static final defpackage.rq b = new defpackage.ro();
    private static final android.view.View.AccessibilityDelegate c = new android.view.View.AccessibilityDelegate();
    public final android.view.View.AccessibilityDelegate a = b.a(this);

    public static void a(android.view.View view, int i) {
        c.sendAccessibilityEvent(view, i);
    }

    public static void b(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        c.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public static boolean c(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return c.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public static void d(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        c.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void a(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        c.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void a(android.view.View view, defpackage.tl tlVar) {
        c.onInitializeAccessibilityNodeInfo(view, tlVar.a);
    }

    public static boolean a(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return c.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public defpackage.tp a(android.view.View view) {
        return b.a(c, view);
    }

    public boolean a(android.view.View view, int i, android.os.Bundle bundle) {
        return b.a(c, view, i, bundle);
    }
}
