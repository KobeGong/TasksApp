package defpackage;

/* renamed from: ux reason: default package */
/* compiled from: PG */
public final class ux extends defpackage.rn {
    public final boolean a(android.view.View view, int i, android.os.Bundle bundle) {
        if (super.a(view, i, bundle)) {
            return true;
        }
        android.support.v4.widget.NestedScrollView nestedScrollView = (android.support.v4.widget.NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        switch (i) {
            case 4096:
                int min = java.lang.Math.min(((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()) + nestedScrollView.getScrollY(), nestedScrollView.a());
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.b(min);
                return true;
            case 8192:
                int max = java.lang.Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.b(max);
                return true;
            default:
                return false;
        }
    }

    public final void a(android.view.View view, defpackage.tl tlVar) {
        super.a(view, tlVar);
        android.support.v4.widget.NestedScrollView nestedScrollView = (android.support.v4.widget.NestedScrollView) view;
        tlVar.a((java.lang.CharSequence) android.widget.ScrollView.class.getName());
        if (nestedScrollView.isEnabled()) {
            int a = nestedScrollView.a();
            if (a > 0) {
                tlVar.a();
                if (nestedScrollView.getScrollY() > 0) {
                    tlVar.a(8192);
                }
                if (nestedScrollView.getScrollY() < a) {
                    tlVar.a(4096);
                }
            }
        }
    }

    public final void a(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        android.support.v4.widget.NestedScrollView nestedScrollView = (android.support.v4.widget.NestedScrollView) view;
        accessibilityEvent.setClassName(android.widget.ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.a() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.a());
    }
}
