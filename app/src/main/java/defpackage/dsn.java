package defpackage;

/* renamed from: dsn reason: default package */
/* compiled from: PG */
final class dsn extends defpackage.dog {
    private final /* synthetic */ defpackage.dsm a;

    dsn(defpackage.dsm dsm, defpackage.dne dne) {
        this.a = dsm;
        super(dne);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (defpackage.dsg.b.getAndSet(r0, 1) != 0) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.dpw r4, defpackage.dor r5) {
        /*
            r3 = this;
            r2 = 1
            dsm r0 = r3.a
            dsi r0 = r0.b
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.dsg.b
            if (r1 == 0) goto L_0x0015
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.dsg.b
            int r1 = r1.getAndSet(r0, r2)
            if (r1 == 0) goto L_0x001b
        L_0x0011:
            super.a(r4, r5)
            return
        L_0x0015:
            int r1 = r0.a
            if (r1 != 0) goto L_0x0011
            r0.a = r2
        L_0x001b:
            ecc r1 = r0.c
            boolean r0 = r0.b
            defpackage.dsg.a(r4, r0)
            r1.a()
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsn.a(dpw, dor):void");
    }
}
