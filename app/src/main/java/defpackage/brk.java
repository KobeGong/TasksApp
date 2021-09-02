package defpackage;

/* renamed from: brk reason: default package */
/* compiled from: PG */
class brk {
    private final java.lang.Object a = new java.lang.Object();
    private final java.util.Map b = new defpackage.qr();
    private final java.util.Map c = new defpackage.qr();

    brk() {
    }

    public defpackage.ayd a(defpackage.bqu bqu) {
        if (bqu instanceof defpackage.brh) {
            return ((defpackage.brh) bqu).a();
        }
        return null;
    }

    public defpackage.aye a(defpackage.bqv bqv) {
        if (!(bqv instanceof defpackage.bri)) {
            return null;
        }
        defpackage.bri bri = (defpackage.bri) bqv;
        defpackage.bmb bmb = new defpackage.bmb();
        bmb.a = bri.a;
        defpackage.azb.b(bmb.a >= 0, (java.lang.Object) "Must provide valid client application ID!");
        return new defpackage.bma(bmb);
    }

    public defpackage.ayr a(defpackage.bqz bqz) {
        defpackage.ayr brl;
        synchronized (this.a) {
            if (this.b.containsKey(bqz)) {
                brl = (defpackage.ayr) this.b.get(bqz);
            } else {
                brl = new defpackage.brl(bqz);
                this.b.put(bqz, brl);
            }
        }
        return brl;
    }

    public defpackage.ays a(defpackage.bra bra) {
        defpackage.ays brm;
        synchronized (this.a) {
            if (this.c.containsKey(bra)) {
                brm = (defpackage.ays) this.c.get(bra);
            } else {
                brm = new defpackage.brm(this, bra);
                this.c.put(bra, brm);
            }
        }
        return brm;
    }

    public defpackage.ayp a(defpackage.bqw bqw) {
        if (bqw instanceof defpackage.brs) {
            return ((defpackage.brs) bqw).a;
        }
        return null;
    }

    public defpackage.bqt a(defpackage.axq axq) {
        return new defpackage.brj(axq);
    }

    public void b(defpackage.bqz bqz) {
        synchronized (this.a) {
            this.b.remove(bqz);
        }
    }

    public void b(defpackage.bra bra) {
        synchronized (this.a) {
            this.c.remove(bra);
        }
    }
}
