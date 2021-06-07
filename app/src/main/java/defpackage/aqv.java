package defpackage;

import com.google.android.apps.tasks.R;
import com.google.android.apps.tasks.ui.components.snackbar.Snackbar;

/* renamed from: aqv  reason: default package */
public final /* synthetic */ class aqv implements Runnable {
    private final aoc a;
    private final String b;

    public aqv(aoc aoc, String str) {
        this.a = aoc;
        this.b = str;
    }

    public final void run() {
        aoc aoc = this.a;
        String str = this.b;
        if (!aoc.a.r()) {
            aoc.a.s = Snackbar.a(aoc.a.m(), str, -2);
            aoc.a.s.d.setContentDescription(str);
            aoc.a.s.a(aoc.a.getResources().getString(R.string.undo), aqy.a);
            aoc.a.s.a();
            if (bdk.b(aoc.a.getApplicationContext())) {
                aoc.a.s.d.sendAccessibilityEvent(8);
            }
        }
    }
}
