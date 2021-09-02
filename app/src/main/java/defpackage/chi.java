package defpackage;

/* renamed from: chi reason: default package */
final /* synthetic */ class chi implements java.lang.Runnable {
    private final defpackage.che a;
    private final java.util.List b;

    chi(defpackage.che che, java.util.List list) {
        this.a = che;
        this.b = list;
    }

    public final void run() {
        java.lang.Throwable e;
        defpackage.che che = this.a;
        java.util.List list = this.b;
        defpackage.cml g = che.g();
        java.util.Iterator it = list.iterator();
        while (true) {
            defpackage.cml cml = g;
            if (it.hasNext()) {
                try {
                    g = ((defpackage.cma) ((java.util.concurrent.Future) it.next()).get()).a();
                    if (cml != null) {
                        try {
                            che.a(cml, g);
                        } catch (java.lang.Exception e2) {
                            e = e2;
                            defpackage.cdm.c("BatteryMetricService", "unpexpected failure", e, new java.lang.Object[0]);
                        }
                    }
                } catch (java.lang.Exception e3) {
                    java.lang.Throwable th = e3;
                    g = cml;
                    e = th;
                }
            } else {
                che.a(cml);
                return;
            }
        }
    }
}
