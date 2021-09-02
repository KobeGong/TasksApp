package defpackage;

/* renamed from: dtr reason: default package */
/* compiled from: PG */
final class dtr implements java.lang.Runnable {
    private final /* synthetic */ defpackage.dts a;
    private final /* synthetic */ defpackage.dtb b;

    dtr(defpackage.dts dts, defpackage.dtb dtb) {
        this.a = dts;
        this.b = dtb;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        defpackage.dts dts = this.a;
        defpackage.dtb dtb = this.b;
        defpackage.dns c = dts.b.c();
        try {
            defpackage.dta a2 = dtb.a(dts.a.c(), dts.a.b(), dts.a.a());
            dts.b.a(c);
            dts.a(a2);
        } catch (Throwable th) {
            dts.b.a(c);
            throw th;
        }
    }
}
