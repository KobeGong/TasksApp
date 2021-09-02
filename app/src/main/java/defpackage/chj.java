package defpackage;

/* renamed from: chj reason: default package */
final /* synthetic */ class chj implements java.lang.Runnable {
    private final defpackage.che a;
    private final int b;
    private final java.lang.String c = null;
    private final boolean d = true;

    chj(defpackage.che che, int i) {
        this.a = che;
        this.b = i;
    }

    public final void run() {
        defpackage.che che = this.a;
        int i = this.b;
        boolean z = this.d;
        defpackage.cky.c();
        if (!che.c) {
            synchronized (che.d) {
                defpackage.cml a2 = che.a(i, null, z).a();
                defpackage.cml g = che.g();
                if (che.a(a2)) {
                    che.a(g, a2);
                } else {
                    che.d();
                    defpackage.cdm.a(5, "BatteryMetricService", "Failure storing persistent snapshot and helper data", new java.lang.Object[0]);
                }
            }
            return;
        }
        defpackage.cdm.a(3, "BatteryMetricService", "shutdown - skipping capture", new java.lang.Object[0]);
    }
}
