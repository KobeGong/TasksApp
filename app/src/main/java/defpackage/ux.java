package defpackage;

import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

/* renamed from: ux  reason: default package */
/* compiled from: PG */
public final class ux extends rn {
    @Override // defpackage.rn
    public final boolean a(View view, int i, Bundle bundle) {
        if (super.a(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        switch (i) {
            case 4096:
                int min = Math.min(((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()) + nestedScrollView.getScrollY(), nestedScrollView.a());
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.b(min);
                return true;
            case 8192:
                int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.b(max);
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.rn
    public final void a(View view, tl tlVar) {
        int a;
        super.a(view, tlVar);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        tlVar.a(ScrollView.class.getName());
        if (nestedScrollView.isEnabled() && (a = nestedScrollView.a()) > 0) {
            tlVar.a();
            if (nestedScrollView.getScrollY() > 0) {
                tlVar.a(8192);
            }
            if (nestedScrollView.getScrollY() < a) {
                tlVar.a(4096);
            }
        }
    }

    @Override // defpackage.rn
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.a() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.a());
    }
}
