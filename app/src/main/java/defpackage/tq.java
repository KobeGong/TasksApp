package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: tq  reason: default package */
/* compiled from: PG */
public class tq extends AccessibilityNodeProvider {
    public final tp a;

    tq(tp tpVar) {
        this.a = tpVar;
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        tl a2 = this.a.a(i);
        if (a2 == null) {
            return null;
        }
        return a2.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public List findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return this.a.a(i, i2, bundle);
    }
}
