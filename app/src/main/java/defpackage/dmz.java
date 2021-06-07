package defpackage;

/* renamed from: dmz  reason: default package */
/* compiled from: PG */
public final class dmz {
    public final dtb a;
    public final dpb b;
    public final dor c;
    public final dna d;
    public final dns e;
    public boolean f;
    private final Object g = new Object();
    private dta h;
    private dtt i;

    public final void a(dpw dpw) {
        boolean z;
        boolean z2 = true;
        if (!dpw.a()) {
            z = true;
        } else {
            z = false;
        }
        cld.a(z, "Cannot fail with OK status");
        if (this.f) {
            z2 = false;
        }
        cld.b(z2, "apply() or fail() already called");
        a(new duu(dpw));
    }

    public dmz(dtb dtb, dpb dpb, dor dor, dna dna) {
        this.a = dtb;
        this.b = dpb;
        this.c = dor;
        this.d = dna;
        this.e = dns.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        if (r4.i == null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        defpackage.cld.b(r1, "delayedStream is null");
        r4.i.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.dta r5) {
        /*
            r4 = this;
            r2 = 0
            r1 = 1
            boolean r0 = r4.f
            if (r0 != 0) goto L_0x0019
            r0 = r1
        L_0x0007:
            java.lang.String r3 = "already finalized"
            defpackage.cld.b(r0, r3)
            r4.f = r1
            java.lang.Object r3 = r4.g
            monitor-enter(r3)
            dta r0 = r4.h     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x001b
            r4.h = r5     // Catch:{ all -> 0x002b }
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
        L_0x0018:
            return
        L_0x0019:
            r0 = r2
            goto L_0x0007
        L_0x001b:
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            dtt r0 = r4.i
            if (r0 == 0) goto L_0x002e
        L_0x0020:
            java.lang.String r0 = "delayedStream is null"
            defpackage.cld.b(r1, r0)
            dtt r0 = r4.i
            r0.a(r5)
            goto L_0x0018
        L_0x002b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x002e:
            r1 = r2
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmz.a(dta):void");
    }

    public final dta a() {
        dta dta;
        synchronized (this.g) {
            if (this.h == null) {
                this.i = new dtt();
                dta = this.i;
                this.h = dta;
            } else {
                dta = this.h;
            }
        }
        return dta;
    }
}
