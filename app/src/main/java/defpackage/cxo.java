package defpackage;

/* renamed from: cxo reason: default package */
/* compiled from: PG */
abstract class cxo extends defpackage.cxq implements java.lang.Runnable {
    public defpackage.csn a;
    public final boolean b;
    public final /* synthetic */ defpackage.cxn c;

    cxo(defpackage.cxn cxn, defpackage.csn csn, boolean z) {
        this.c = cxn;
        super(csn.size());
        this.a = (defpackage.csn) defpackage.cld.a((java.lang.Object) csn);
        this.b = z;
    }

    /* access modifiers changed from: 0000 */
    public abstract void c();

    public final void run() {
        a();
    }

    /* access modifiers changed from: 0000 */
    public final void a(java.lang.Throwable th) {
        boolean z;
        boolean z2;
        java.lang.String str;
        boolean z3 = true;
        defpackage.cld.a((java.lang.Object) th);
        if (this.b) {
            z2 = this.c.a(th);
            if (z2) {
                b();
                z = true;
            } else {
                java.util.Set set = this.seenExceptions;
                if (set == null) {
                    java.util.Set newSetFromMap = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
                    a(newSetFromMap);
                    defpackage.cxq.d.a(this, newSetFromMap);
                    set = this.seenExceptions;
                }
                z = defpackage.cxn.a(set, th);
            }
        } else {
            z = true;
            z2 = false;
        }
        boolean z4 = th instanceof java.lang.Error;
        boolean z5 = this.b;
        if (z2) {
            z3 = false;
        }
        if ((z & z3 & z5) || z4) {
            if (th instanceof java.lang.Error) {
                str = "Input Future failed with Error";
            } else {
                str = "Got more than one input Future failure. Logging failures after the first";
            }
            defpackage.cxn.e.logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture$RunningState", "handleException", str, th);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(java.util.Set set) {
        if (!this.c.isCancelled()) {
            defpackage.cxn.a(set, ((defpackage.cxc) this.c.value).b);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        int a2 = defpackage.cxq.d.a(this);
        defpackage.cld.b(a2 >= 0, (java.lang.Object) "Less than 0 remaining futures");
        if (a2 == 0) {
            c();
        }
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        this.a = null;
    }

    /* access modifiers changed from: 0000 */
    public void d() {
    }
}
