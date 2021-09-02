package defpackage;

/* renamed from: dyw reason: default package */
/* compiled from: PG */
final class dyw implements defpackage.dzq {
    public final defpackage.dza a;
    public final /* synthetic */ defpackage.dyb b;

    dyw(defpackage.dyb dyb, defpackage.dza dza) {
        this.b = dyb;
        this.a = dza;
    }

    public final void a(defpackage.dor dor) {
        int i;
        java.lang.Runnable a2 = this.b.a(this.a);
        if (a2 != null) {
            a2.run();
        }
        if (this.b.l.d == this.a) {
            this.b.t.a(dor);
            if (this.b.k != null) {
                defpackage.dzb dzb = this.b.k;
                do {
                    i = dzb.d.get();
                    if (i != dzb.a) {
                    } else {
                        return;
                    }
                } while (!dzb.d.compareAndSet(i, java.lang.Math.min(dzb.c + i, dzb.a)));
            }
        }
    }

    public final void b(defpackage.dpw dpw, defpackage.dor dor) {
        a(dpw, defpackage.bg.av, dor);
    }

    public final void a(defpackage.dpw dpw, int i, defpackage.dor dor) {
        defpackage.dyv dyv;
        synchronized (this.b.g) {
            defpackage.dyb dyb = this.b;
            defpackage.dyv dyv2 = this.b.l;
            defpackage.dza dza = this.a;
            dza.b = true;
            if (dyv2.c.contains(dza)) {
                java.util.HashSet hashSet = new java.util.HashSet(dyv2.c);
                hashSet.remove(dza);
                dyv = new defpackage.dyv(dyv2.b, hashSet, dyv2.d, dyv2.e, dyv2.a);
            } else {
                dyv = dyv2;
            }
            dyb.l = dyv;
        }
        if (this.a.c) {
            java.lang.Runnable a2 = this.b.a(this.a);
            if (a2 != null) {
                a2.run();
            }
            if (this.b.l.d == this.a) {
                this.b.t.b(dpw, dor);
                return;
            }
            return;
        }
        if (this.b.l.d == null) {
            if (i == defpackage.bg.aw && !this.b.m) {
                this.b.m = true;
                this.b.d.execute(new defpackage.dyx(this));
                return;
            } else if (i != defpackage.bg.ax) {
                this.b.m = true;
                defpackage.dys a3 = a(this.b.f, dpw, dor);
                if (a3.a) {
                    this.b.o = this.b.e.schedule(new defpackage.dyy(this), a3.b, java.util.concurrent.TimeUnit.MILLISECONDS);
                    return;
                }
            }
        }
        defpackage.dyb.c();
        java.lang.Runnable a4 = this.b.a(this.a);
        if (a4 != null) {
            a4.run();
        }
        if (this.b.l.d == this.a) {
            this.b.t.b(dpw, dor);
        }
    }

    private final defpackage.dys a(defpackage.dyu dyu, defpackage.dpw dpw, defpackage.dor dor) {
        java.lang.Integer num;
        boolean z;
        long j;
        boolean z2;
        boolean z3 = false;
        boolean contains = dyu.e.contains(dpw.l);
        java.lang.String str = (java.lang.String) dor.a(defpackage.dyb.a);
        if (str != null) {
            try {
                num = java.lang.Integer.valueOf(str);
            } catch (java.lang.NumberFormatException e) {
                num = java.lang.Integer.valueOf(-1);
            }
        } else {
            num = null;
        }
        if (this.b.k == null || (!contains && (num == null || num.intValue() >= 0))) {
            z = false;
        } else {
            defpackage.dzb dzb = this.b.k;
            while (true) {
                int i = dzb.d.get();
                if (i == 0) {
                    z2 = false;
                    break;
                }
                int i2 = i - 1000;
                if (dzb.d.compareAndSet(i, java.lang.Math.max(i2, 0))) {
                    z2 = i2 > dzb.b;
                }
            }
            if (!z2) {
                z = true;
            } else {
                z = false;
            }
        }
        if (dyu.a > this.a.d + 1 && !z) {
            if (num == null) {
                if (contains) {
                    j = (long) (this.b.p * 1000.0d * defpackage.dyb.q.nextDouble());
                    this.b.p = java.lang.Math.min(this.b.p * dyu.d, dyu.c);
                    z3 = true;
                    return new defpackage.dys(z3, j);
                }
            } else if (num.intValue() >= 0) {
                j = (long) num.intValue();
                this.b.p = dyu.b;
                z3 = true;
                return new defpackage.dys(z3, j);
            }
        }
        j = 0;
        return new defpackage.dys(z3, j);
    }

    public final void a(defpackage.dzr dzr) {
        defpackage.dyv dyv = this.b.l;
        defpackage.cld.b(dyv.d != null, (java.lang.Object) "Headers should be received prior to messages.");
        if (dyv.d == this.a) {
            this.b.t.a(dzr);
        }
    }

    public final void a() {
        if (this.b.l.c.contains(this.a)) {
            this.b.t.a();
        }
    }
}
