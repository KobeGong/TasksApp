package defpackage;

/* renamed from: bak reason: default package */
/* compiled from: PG */
public final class bak implements defpackage.ayr, defpackage.ays, defpackage.bci {
    public final defpackage.ayj a;
    public final defpackage.aze b;
    public final java.util.Set c = new java.util.HashSet();
    public final java.util.Map d = new java.util.HashMap();
    public final int e;
    public boolean f;
    public final /* synthetic */ defpackage.baj g;
    private final java.util.Queue h = new java.util.LinkedList();
    private final defpackage.bbu i;
    private final defpackage.bbi j;
    private defpackage.axq k = null;

    public bak(defpackage.baj baj, defpackage.ayn ayn) {
        this.g = baj;
        this.a = ayn.a(baj.g.getLooper(), this);
        if (this.a instanceof defpackage.bef) {
            defpackage.bef.q();
        }
        this.i = ayn.c;
        this.b = new defpackage.aze();
        this.e = ayn.e;
        if (this.a.h()) {
            this.j = ayn.a(baj.k, baj.g);
        } else {
            this.j = null;
        }
    }

    public final void a(android.os.Bundle bundle) {
        if (android.os.Looper.myLooper() == this.g.g.getLooper()) {
            a();
        } else {
            this.g.g.post(new defpackage.bal(this));
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        d();
        b(defpackage.axq.a);
        f();
        java.util.Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            it.next();
            defpackage.jn jnVar = null;
            try {
                new defpackage.bpw();
                jnVar.a();
            } catch (android.os.DeadObjectException e2) {
                a(1);
                this.a.e();
            } catch (android.os.RemoteException e3) {
            }
        }
        while (this.a.f() && !this.h.isEmpty()) {
            b((defpackage.aza) this.h.remove());
        }
        g();
    }

    public final void a(int i2) {
        if (android.os.Looper.myLooper() == this.g.g.getLooper()) {
            b();
        } else {
            this.g.g.post(new defpackage.bam(this));
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        d();
        this.f = true;
        this.b.a(true, defpackage.bbr.a);
        this.g.g.sendMessageDelayed(android.os.Message.obtain(this.g.g, 9, this.i), this.g.h);
        this.g.g.sendMessageDelayed(android.os.Message.obtain(this.g.g, 11, this.i), this.g.i);
        this.g.m = -1;
    }

    public final void a(defpackage.axq axq, defpackage.ayd ayd, boolean z) {
        if (android.os.Looper.myLooper() == this.g.g.getLooper()) {
            a(axq);
        } else {
            this.g.g.post(new defpackage.ban(this, axq));
        }
    }

    public final void a(defpackage.axq axq) {
        defpackage.azb.a(this.g.g);
        if (this.j != null) {
            defpackage.bbi bbi = this.j;
            if (bbi.f != null) {
                bbi.f.e();
            }
        }
        d();
        this.g.m = -1;
        b(axq);
        if (axq.b == 4) {
            a(defpackage.baj.b);
        } else if (this.h.isEmpty()) {
            this.k = axq;
        } else {
            synchronized (defpackage.baj.c) {
                defpackage.baj.b();
            }
            if (!this.g.a(axq, this.e)) {
                if (axq.b == 18) {
                    this.f = true;
                }
                if (this.f) {
                    this.g.g.sendMessageDelayed(android.os.Message.obtain(this.g.g, 9, this.i), this.g.h);
                    return;
                }
                java.lang.String str = this.i.a.b;
                a(new com.google.android.gms.common.api.Status(17, new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 38).append("API: ").append(str).append(" is not available on this device.").toString()));
            }
        }
    }

    public final void a(defpackage.aza aza) {
        defpackage.azb.a(this.g.g);
        if (this.a.f()) {
            b(aza);
            g();
            return;
        }
        this.h.add(aza);
        if (this.k == null || !this.k.a()) {
            h();
        } else {
            a(this.k);
        }
    }

    public final void c() {
        defpackage.azb.a(this.g.g);
        a(defpackage.baj.a);
        this.b.a(false, defpackage.baj.a);
        for (defpackage.bbc bbt : (defpackage.bbc[]) this.d.keySet().toArray(new defpackage.bbc[this.d.size()])) {
            a((defpackage.aza) new defpackage.bbt(bbt, new defpackage.bpw()));
        }
        b(new defpackage.axq(4));
        if (this.a.f()) {
            this.a.a(new defpackage.bdb(this));
        }
    }

    public final void d() {
        defpackage.azb.a(this.g.g);
        this.k = null;
    }

    public final defpackage.axq e() {
        defpackage.azb.a(this.g.g);
        return this.k;
    }

    private final void b(defpackage.aza aza) {
        aza.a(this.b, j());
        try {
            aza.a(this);
        } catch (android.os.DeadObjectException e2) {
            a(1);
            this.a.e();
        }
    }

    public final void a(com.google.android.gms.common.api.Status status) {
        defpackage.azb.a(this.g.g);
        for (defpackage.aza a2 : this.h) {
            a2.a(status);
        }
        this.h.clear();
    }

    /* access modifiers changed from: 0000 */
    public final void f() {
        if (this.f) {
            this.g.g.removeMessages(11, this.i);
            this.g.g.removeMessages(9, this.i);
            this.f = false;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void g() {
        this.g.g.removeMessages(12, this.i);
        this.g.g.sendMessageDelayed(this.g.g.obtainMessage(12, this.i), this.g.j);
    }

    public final void h() {
        defpackage.azb.a(this.g.g);
        if (!this.a.f() && !this.a.g()) {
            this.a.i();
            if (this.g.m != 0) {
                defpackage.baj baj = this.g;
                this.g.l;
                baj.m = defpackage.axv.a(this.g.k);
                if (this.g.m != 0) {
                    a(new defpackage.axq(this.g.m, null));
                    return;
                }
            }
            defpackage.bbl bbl = new defpackage.bbl(this.g, this.a, this.i);
            if (this.a.h()) {
                defpackage.bbi bbi = this.j;
                if (bbi.f != null) {
                    bbi.f.e();
                }
                bbi.e.h = java.lang.Integer.valueOf(java.lang.System.identityHashCode(bbi));
                bbi.f = (defpackage.bps) bbi.c.a(bbi.a, bbi.b.getLooper(), bbi.e, bbi.e.g, bbi, bbi);
                bbi.g = bbl;
                if (bbi.d == null || bbi.d.isEmpty()) {
                    bbi.b.post(new defpackage.bbj(bbi));
                } else {
                    bbi.f.r();
                }
            }
            this.a.a((defpackage.bda) bbl);
        }
    }

    private final void b(defpackage.axq axq) {
        for (defpackage.bbx bbx : this.c) {
            java.lang.String str = null;
            if (axq == defpackage.axq.a) {
                str = this.a.j();
            }
            bbx.a(this.i, axq, str);
        }
        this.c.clear();
    }

    /* access modifiers changed from: 0000 */
    public final boolean i() {
        return this.a.f();
    }

    public final boolean j() {
        return this.a.h();
    }
}
