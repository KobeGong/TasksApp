package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.tasks.R;

/* access modifiers changed from: package-private */
/* renamed from: ati  reason: default package */
/* compiled from: PG */
public final class ati extends View.AccessibilityDelegate {
    private final /* synthetic */ atg a;

    ati(atg atg) {
        this.a = atg;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Resources resources = this.a.h.getResources();
        if (this.a.c) {
            i = R.string.a11y_collapse_completed;
        } else {
            i = R.string.a11y_expand_completed;
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, resources.getString(i)));
    }
}
