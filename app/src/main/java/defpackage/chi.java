package defpackage;

import java.util.List;
import java.util.concurrent.Future;

/* renamed from: chi  reason: default package */
final /* synthetic */ class chi implements Runnable {
    private final che a;
    private final List b;

    chi(che che, List list) {
        this.a = che;
        this.b = list;
    }

    public final void run() {
        Exception e;
        che che = this.a;
        List<Future> list = this.b;
        cml g = che.g();
        for (Future future : list) {
            try {
                g = ((cma) future.get()).a();
                if (g != null) {
                    try {
                        che.a(g, g);
                    } catch (Exception e2) {
                        e = e2;
                        cdm.c("BatteryMetricService", "unpexpected failure", e, new Object[0]);
                    }
                }
            } catch (Exception e3) {
                g = g;
                e = e3;
                cdm.c("BatteryMetricService", "unpexpected failure", e, new Object[0]);
            }
        }
        che.a(g);
    }
}
