package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.tasks.R;

/* access modifiers changed from: package-private */
/* renamed from: ata  reason: default package */
/* compiled from: PG */
public final class ata extends View.AccessibilityDelegate {
    private final /* synthetic */ asi a;

    ata(asi asi) {
        this.a = asi;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, this.a.k().getString(R.string.a11y_action_edit_subtask)));
    }
}