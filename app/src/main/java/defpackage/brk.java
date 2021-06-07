package defpackage;

import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: brk  reason: default package */
/* compiled from: PG */
public class brk {
    private final Object a = new Object();
    private final Map b = new qr();
    private final Map c = new qr();

    brk() {
    }

    public ayd a(bqu bqu) {
        if (bqu instanceof brh) {
            return ((brh) bqu).a();
        }
        return null;
    }

    public aye a(bqv bqv) {
        if (!(bqv instanceof bri)) {
            return null;
        }
        bmb bmb = new bmb();
        bmb.a = ((bri) bqv).a;
        azb.b(bmb.a >= 0, "Must provide valid client application ID!");
        return new bma(bmb);
    }

    public ayr a(bqz bqz) {
        ayr brl;
        synchronized (this.a) {
            if (this.b.containsKey(bqz)) {
                brl = (ayr) this.b.get(bqz);
            } else {
                brl = new brl(bqz);
                this.b.put(bqz, brl);
            }
        }
        return brl;
    }

    public ays a(bra bra) {
        ays brm;
        synchronized (this.a) {
            if (this.c.containsKey(bra)) {
                brm = (ays) this.c.get(bra);
            } else {
                brm = new brm(this, bra);
                this.c.put(bra, brm);
            }
        }
        return brm;
    }

    public ayp a(bqw bqw) {
        if (bqw instanceof brs) {
            return ((brs) bqw).a;
        }
        return null;
    }

    public bqt a(axq axq) {
        return new brj(axq);
    }

    public void b(bqz bqz) {
        synchronized (this.a) {
            this.b.remove(bqz);
        }
    }

    public void b(bra bra) {
        synchronized (this.a) {
            this.c.remove(bra);
        }
    }
}
