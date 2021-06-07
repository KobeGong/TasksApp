package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: acu  reason: default package */
/* compiled from: PG */
final class acu implements Runnable {
    private final /* synthetic */ ArrayList a;
    private final /* synthetic */ acs b;

    acu(acs acs, ArrayList arrayList) {
        this.b = acs;
        this.a = arrayList;
    }

    public final void run() {
        View view;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            adb adb = (adb) arrayList.get(i);
            acs acs = this.b;
            afv afv = adb.a;
            View view2 = afv == null ? null : afv.a;
            afv afv2 = adb.b;
            if (afv2 != null) {
                view = afv2.a;
            } else {
                view = null;
            }
            if (view2 != null) {
                ViewPropertyAnimator duration = view2.animate().setDuration(acs.l);
                acs.g.add(adb.a);
                duration.translationX((float) (adb.e - adb.c));
                duration.translationY((float) (adb.f - adb.d));
                duration.alpha(0.0f).setListener(new acz(acs, adb, duration, view2)).start();
            }
            if (view != null) {
                ViewPropertyAnimator animate = view.animate();
                acs.g.add(adb.b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(acs.l).alpha(1.0f).setListener(new ada(acs, adb, animate, view)).start();
            }
            i = i2;
        }
        this.a.clear();
        this.b.c.remove(this.a);
    }
}
