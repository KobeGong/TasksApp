package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: acv  reason: default package */
/* compiled from: PG */
final class acv implements Runnable {
    private final /* synthetic */ ArrayList a;
    private final /* synthetic */ acs b;

    acv(acs acs, ArrayList arrayList) {
        this.b = acs;
        this.a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ViewHolder afv = (ViewHolder) obj;
            acs acs = this.b;
            View view = afv.a;
            ViewPropertyAnimator animate = view.animate();
            acs.d.add(afv);
            animate.alpha(1.0f).setDuration(acs.i).setListener(new acx(acs, afv, view, animate)).start();
        }
        this.a.clear();
        this.b.a.remove(this.a);
    }
}
