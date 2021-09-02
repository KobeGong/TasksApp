package defpackage;

/* renamed from: aqv reason: default package */
public final /* synthetic */ class aqv implements java.lang.Runnable {
    private final defpackage.aoc a;
    private final java.lang.String b;

    public aqv(defpackage.aoc aoc, java.lang.String str) {
        this.a = aoc;
        this.b = str;
    }

    public final void run() {
        defpackage.aoc aoc = this.a;
        java.lang.String str = this.b;
        if (!aoc.a.r()) {
            aoc.a.s = com.google.android.apps.tasks.ui.components.snackbar.Snackbar.a(aoc.a.m(), (java.lang.CharSequence) str, -2);
            aoc.a.s.d.setContentDescription(str);
            aoc.a.s.a((java.lang.CharSequence) aoc.a.getResources().getString(2131951843), defpackage.aqy.a);
            aoc.a.s.a();
            if (defpackage.bdk.b(aoc.a.getApplicationContext())) {
                aoc.a.s.d.sendAccessibilityEvent(8);
            }
        }
    }
}
