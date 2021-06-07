package defpackage;

/* renamed from: chj  reason: default package */
final /* synthetic */ class chj implements Runnable {
    private final che a;
    private final int b;
    private final String c = null;
    private final boolean d = true;

    chj(che che, int i) {
        this.a = che;
        this.b = i;
    }

    public final void run() {
        che che = this.a;
        int i = this.b;
        boolean z = this.d;
        cky.c();
        if (!che.c) {
            synchronized (che.d) {
                cml a2 = che.a(i, null, z).a();
                cml g = che.g();
                if (che.a(a2)) {
                    che.a(g, a2);
                } else {
                    che.d();
                    cdm.a(5, "BatteryMetricService", "Failure storing persistent snapshot and helper data", new Object[0]);
                }
            }
            return;
        }
        cdm.a(3, "BatteryMetricService", "shutdown - skipping capture", new Object[0]);
    }
}
