package defpackage;

import com.google.android.apps.tasks.common.TaskApplication;
import java.util.List;

/* renamed from: aui  reason: default package */
final /* synthetic */ class aui implements Runnable {
    private final auh a;
    private final int b;

    aui(auh auh, int i) {
        this.a = auh;
        this.b = i;
    }

    public final void run() {
        int i;
        int i2;
        String str = null;
        auh auh = this.a;
        int i3 = this.b;
        MySortAdapter atv = (MySortAdapter) auh.a;
        cld.a(i3 < atv.m.size());
        atv.p = null;
        if (atv.f != null && i3 >= 0) {
            dby dby = (dby) atv.m.get(i3);
            if (atv.k(i3)) {
                i = 0;
                int i4 = i3 - 1;
                while (true) {
                    if (i4 >= 0) {
                        if (!atv.k(i4)) {
                            str = atv.g(i4).d;
                            break;
                        } else {
                            i++;
                            i4--;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                int i5 = i3 - 1;
                i = i3;
                while (i5 > 0) {
                    if (atv.o.containsKey(((dby) atv.m.get(i5)).d)) {
                        i2 = i - 1;
                    } else {
                        i2 = i;
                    }
                    i5--;
                    i = i2;
                }
            }
            dby g = atv.g(i3);
            if (g != null && atv.n.containsKey(g.d) && !atv.k(i3)) {
                List list = (List) atv.n.get(g.d);
                atv.m.addAll(i3 + 1, list);
                atv.n.remove(g.d);
                atv.a(i3 + 1, list.size());
            }
            if (atv.f != null) {
                auj.N().a(atv.f.a.X, dby.d, i, str);
            }
            if (bdk.b(TaskApplication.b().getApplicationContext())) {
                atv.mObservable.b();
            }
        }
    }
}
