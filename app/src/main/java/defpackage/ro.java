package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: ro  reason: default package */
/* compiled from: PG */
final class ro extends rq {
    ro() {
    }

    @Override // defpackage.rq
    public final View.AccessibilityDelegate a(rn rnVar) {
        return new rp(rnVar);
    }

    @Override // defpackage.rq
    public final tp a(View.AccessibilityDelegate accessibilityDelegate, View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new tp(accessibilityNodeProvider);
        }
        return null;
    }

    @Override // defpackage.rq
    public final boolean a(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
        return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
    }
}
