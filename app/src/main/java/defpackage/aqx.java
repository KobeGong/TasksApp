package defpackage;

/* renamed from: aqx reason: default package */
public final /* synthetic */ class aqx implements java.lang.Runnable {
    private final defpackage.aoc a;
    private final java.lang.Object b;

    public aqx(defpackage.aoc aoc, java.lang.Object obj) {
        this.a = aoc;
        this.b = obj;
    }

    public final void run() {
        defpackage.dcd dcd;
        defpackage.aoc aoc = this.a;
        java.lang.Object obj = this.b;
        if (!aoc.a.r()) {
            if (aoc.a.s != null) {
                aoc.a.s.a(3);
            }
            if (obj instanceof defpackage.ajp) {
                defpackage.ajp ajp = (defpackage.ajp) obj;
                android.content.res.Resources resources = aoc.a.getResources();
                int b2 = ajp.b();
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = java.lang.Integer.valueOf(ajp.b());
                defpackage.dcb a2 = ajp.a();
                if (a2.c == null) {
                    dcd = defpackage.dcd.c;
                } else {
                    dcd = a2.c;
                }
                objArr[1] = dcd.a;
                java.lang.String quantityString = resources.getQuantityString(2131886081, b2, objArr);
                aoc.a.s = com.google.android.apps.tasks.ui.components.snackbar.Snackbar.a(aoc.a.m(), (java.lang.CharSequence) quantityString, 0);
                aoc.a.s.d.setContentDescription(quantityString);
                aoc.a.s.a();
            } else if (obj instanceof defpackage.ajn) {
                aoc.a.a((defpackage.ajn) obj);
            }
        }
    }
}
