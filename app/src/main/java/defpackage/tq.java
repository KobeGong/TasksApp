package defpackage;

/* renamed from: tq reason: default package */
/* compiled from: PG */
class tq extends android.view.accessibility.AccessibilityNodeProvider {
    public final defpackage.tp a;

    tq(defpackage.tp tpVar) {
        this.a = tpVar;
    }

    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        defpackage.tl a2 = this.a.a(i);
        if (a2 == null) {
            return null;
        }
        return a2.a;
    }

    public java.util.List findAccessibilityNodeInfosByText(java.lang.String str, int i) {
        return null;
    }

    public boolean performAction(int i, int i2, android.os.Bundle bundle) {
        return this.a.a(i, i2, bundle);
    }
}
