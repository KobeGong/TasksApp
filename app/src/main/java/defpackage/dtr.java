package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: dtr  reason: default package */
/* compiled from: PG */
public final class dtr implements Runnable {
    private final /* synthetic */ dts a;
    private final /* synthetic */ dtb b;

    dtr(dts dts, dtb dtb) {
        this.a = dts;
        this.b = dtb;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        dts dts = this.a;
        dtb dtb = this.b;
        dns c = dts.b.c();
        try {
            dta a2 = dtb.a(dts.a.c(), dts.a.b(), dts.a.a());
            dts.b.a(c);
            dts.a(a2);
        } catch (Throwable th) {
            dts.b.a(c);
            throw th;
        }
    }
}
