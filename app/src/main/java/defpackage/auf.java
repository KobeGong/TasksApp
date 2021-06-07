package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.tasks.R;

/* access modifiers changed from: package-private */
/* renamed from: auf  reason: default package */
/* compiled from: PG */
public final class auf extends View.AccessibilityDelegate {
    private final /* synthetic */ View a;

    auf(View view) {
        this.a = view;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, this.a.getResources().getString(R.string.a11y_action_edit_task)));
    }
}
