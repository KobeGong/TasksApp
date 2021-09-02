package defpackage;

/* renamed from: ati reason: default package */
/* compiled from: PG */
final class ati extends android.view.View.AccessibilityDelegate {
    private final /* synthetic */ defpackage.atg a;

    ati(defpackage.atg atg) {
        this.a = atg;
    }

    public final void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        android.content.res.Resources resources = this.a.h.getResources();
        if (this.a.c) {
            i = 2131951623;
        } else {
            i = 2131951629;
        }
        accessibilityNodeInfo.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(16, resources.getString(i)));
    }
}
