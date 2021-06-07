package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: rn  reason: default package */
/* compiled from: PG */
public class rn {
    private static final rq b = new ro();
    private static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate a = b.a(this);

    public static void a(View view, int i) {
        c.sendAccessibilityEvent(view, i);
    }

    public static void b(View view, AccessibilityEvent accessibilityEvent) {
        c.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public static boolean c(View view, AccessibilityEvent accessibilityEvent) {
        return c.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public static void d(View view, AccessibilityEvent accessibilityEvent) {
        c.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        c.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void a(View view, tl tlVar) {
        c.onInitializeAccessibilityNodeInfo(view, tlVar.a);
    }

    public static boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return c.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public tp a(View view) {
        return b.a(c, view);
    }

    public boolean a(View view, int i, Bundle bundle) {
        return b.a(c, view, i, bundle);
    }
}
