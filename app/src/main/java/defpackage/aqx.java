package defpackage;

import android.content.res.Resources;
import com.google.android.apps.tasks.R;
import com.google.android.apps.tasks.ui.components.snackbar.Snackbar;

/* renamed from: aqx  reason: default package */
public final /* synthetic */ class aqx implements Runnable {
    private final aoc a;
    private final Object b;

    public aqx(aoc aoc, Object obj) {
        this.a = aoc;
        this.b = obj;
    }

    public final void run() {
        dcd dcd;
        aoc aoc = this.a;
        Object obj = this.b;
        if (!aoc.a.r()) {
            if (aoc.a.s != null) {
                aoc.a.s.a(3);
            }
            if (obj instanceof ajp) {
                ajp ajp = (ajp) obj;
                Resources resources = aoc.a.getResources();
                int b2 = ajp.b();
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(ajp.b());
                dcb a2 = ajp.a();
                if (a2.c == null) {
                    dcd = dcd.c;
                } else {
                    dcd = a2.c;
                }
                objArr[1] = dcd.a;
                String quantityString = resources.getQuantityString(R.plurals.deleted_and_moved_task_restored, b2, objArr);
                aoc.a.s = Snackbar.a(aoc.a.m(), quantityString, 0);
                aoc.a.s.d.setContentDescription(quantityString);
                aoc.a.s.a();
            } else if (obj instanceof ajn) {
                aoc.a.a((ajn) obj);
            }
        }
    }
}
