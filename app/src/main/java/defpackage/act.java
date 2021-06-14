package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: act  reason: default package */
/* compiled from: PG */
final class act implements Runnable {
    private final /* synthetic */ ArrayList a;
    private final /* synthetic */ acs b;

    act(acs acs, ArrayList arrayList) {
        this.b = acs;
        this.a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            adc adc = (adc) arrayList.get(i);
            acs acs = this.b;
            ViewHolder afv = adc.a;
            int i3 = adc.b;
            int i4 = adc.c;
            int i5 = adc.d;
            int i6 = adc.e;
            View view = afv.a;
            int i7 = i5 - i3;
            int i8 = i6 - i4;
            if (i7 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i8 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            acs.e.add(afv);
            animate.setDuration(acs.k).setListener(new acy(acs, afv, i7, view, i8, animate)).start();
            i = i2;
        }
        this.a.clear();
        this.b.b.remove(this.a);
    }
}
