package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* access modifiers changed from: package-private */
/* renamed from: tr  reason: default package */
/* compiled from: PG */
public final class tr extends tq {
    tr(tp tpVar) {
        super(tpVar);
    }

    public final AccessibilityNodeInfo findFocus(int i) {
        tl b = this.a.b(i);
        if (b == null) {
            return null;
        }
        return b.a;
    }
}
