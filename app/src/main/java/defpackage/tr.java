package defpackage;

/* renamed from: tr reason: default package */
/* compiled from: PG */
final class tr extends defpackage.tq {
    tr(defpackage.tp tpVar) {
        super(tpVar);
    }

    public final android.view.accessibility.AccessibilityNodeInfo findFocus(int i) {
        defpackage.tl b = this.a.b(i);
        if (b == null) {
            return null;
        }
        return b.a;
    }
}
