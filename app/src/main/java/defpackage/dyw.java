package defpackage;

import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: dyw  reason: default package */
/* compiled from: PG */
final class dyw implements dzq {
    public final dza a;
    public final /* synthetic */ dyb b;

    dyw(dyb dyb, dza dza) {
        this.b = dyb;
        this.a = dza;
    }

    @Override // defpackage.dzq
    public final void a(dor dor) {
        int i;
        Runnable a2 = this.b.a(this.a);
        if (a2 != null) {
            a2.run();
        }
        if (this.b.l.d == this.a) {
            this.b.t.a(dor);
            if (this.b.k != null) {
                dzb dzb = this.b.k;
                do {
                    i = dzb.d.get();
                    if (i == dzb.a) {
                        return;
                    }
                } while (!dzb.d.compareAndSet(i, Math.min(dzb.c + i, dzb.a)));
            }
        }
    }

    @Override // defpackage.dzq
    public final void b(dpw dpw, dor dor) {
        a(dpw, bg.av, dor);
    }

    @Override // defpackage.dzq
    public final void a(dpw dpw, int i, dor dor) {
        dyv dyv;
        synchronized (this.b.g) {
            dyb dyb = this.b;
            dyv dyv2 = this.b.l;
            dza dza = this.a;
            dza.b = true;
            if (dyv2.c.contains(dza)) {
                HashSet hashSet = new HashSet(dyv2.c);
                hashSet.remove(dza);
                dyv = new dyv(dyv2.b, hashSet, dyv2.d, dyv2.e, dyv2.a);
            } else {
                dyv = dyv2;
            }
            dyb.l = dyv;
        }
        if (this.a.c) {
            Runnable a2 = this.b.a(this.a);
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
            if (i == bg.aw && !this.b.m) {
                this.b.m = true;
                this.b.d.execute(new dyx(this));
                return;
            } else if (i != bg.ax) {
                this.b.m = true;
                dys a3 = a(this.b.f, dpw, dor);
                if (a3.a) {
                    this.b.o = this.b.e.schedule(new dyy(this), a3.b, TimeUnit.MILLISECONDS);
                    return;
                }
            }
        }
        dyb.c();
        Runnable a4 = this.b.a(this.a);
        if (a4 != null) {
            a4.run();
        }
        if (this.b.l.d == this.a) {
            this.b.t.b(dpw, dor);
        }
    }

    private final dys a(dyu dyu, dpw dpw, dor dor) {
        Integer num;
        boolean z;
        long j;
        boolean z2;
        boolean z3 = false;
        boolean contains = dyu.e.contains(dpw.l);
        String str = (String) dor.a(dyb.a);
        if (str != null) {
            try {
                num = Integer.valueOf(str);
            } catch (NumberFormatException e) {
                num = -1;
            }
        } else {
            num = null;
        }
        if (this.b.k == null || (!contains && (num == null || num.intValue() >= 0))) {
            z = false;
        } else {
            dzb dzb = this.b.k;
            while (true) {
                int i = dzb.d.get();
                if (i == 0) {
                    z2 = false;
                    break;
                }
                int i2 = i - 1000;
                if (dzb.d.compareAndSet(i, Math.max(i2, 0))) {
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
                    j = (long) (this.b.p * 1000.0d * dyb.q.nextDouble());
                    this.b.p = Math.min(this.b.p * dyu.d, dyu.c);
                    z3 = true;
                    return new dys(z3, j);
                }
            } else if (num.intValue() >= 0) {
                j = (long) num.intValue();
                this.b.p = dyu.b;
                z3 = true;
                return new dys(z3, j);
            }
        }
        j = 0;
        return new dys(z3, j);
    }

    @Override // defpackage.dzq
    public final void a(dzr dzr) {
        dyv dyv = this.b.l;
        cld.b(dyv.d != null, "Headers should be received prior to messages.");
        if (dyv.d == this.a) {
            this.b.t.a(dzr);
        }
    }

    @Override // defpackage.dzq
    public final void a() {
        if (this.b.l.c.contains(this.a)) {
            this.b.t.a();
        }
    }
}
