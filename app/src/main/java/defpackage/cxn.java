package defpackage;

/* renamed from: cxn reason: default package */
/* compiled from: PG */
class cxn extends defpackage.cxi {
    public static final java.util.logging.Logger e = java.util.logging.Logger.getLogger(defpackage.cxn.class.getName());
    public defpackage.cxo f;

    cxn() {
    }

    /* access modifiers changed from: protected */
    public final void c() {
        boolean isCancelled;
        super.c();
        defpackage.cxo cxo = this.f;
        if (cxo != null) {
            this.f = null;
            defpackage.csn csn = cxo.a;
            boolean b = b();
            if (b) {
                cxo.d();
            }
            if ((csn != null) && isCancelled()) {
                defpackage.cth cth = (defpackage.cth) csn.iterator();
                while (cth.hasNext()) {
                    ((defpackage.cyi) cth.next()).cancel(b);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final java.lang.String d() {
        defpackage.cxo cxo = this.f;
        if (cxo == null) {
            return null;
        }
        defpackage.csn csn = cxo.a;
        if (csn == null) {
            return null;
        }
        java.lang.String valueOf = java.lang.String.valueOf(csn);
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 10).append("futures=[").append(valueOf).append("]").toString();
    }

    static boolean a(java.util.Set set, java.lang.Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }
}
