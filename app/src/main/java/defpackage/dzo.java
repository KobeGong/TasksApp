package defpackage;

/* renamed from: dzo reason: default package */
/* compiled from: PG */
public final class dzo {
    private static final defpackage.dzo c = new defpackage.dzo(new defpackage.dqc[0]);
    public final defpackage.dqc[] a;
    public final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(false);

    public static defpackage.dzo a(defpackage.dna dna, defpackage.dor dor) {
        java.util.List list = dna.h;
        if (list.isEmpty()) {
            return c;
        }
        defpackage.dqc[] dqcArr = new defpackage.dqc[list.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= dqcArr.length) {
                return new defpackage.dzo(dqcArr);
            }
            dqcArr[i2] = ((defpackage.dnm) list.get(i2)).a(dor);
            i = i2 + 1;
        }
    }

    private dzo(defpackage.dqc[] dqcArr) {
        this.a = dqcArr;
    }

    public final void a() {
        for (defpackage.dqc b2 : this.a) {
            b2.b();
        }
    }

    public final void a(int i, long j, long j2) {
        for (defpackage.dqc a2 : this.a) {
            a2.a(i, j, j2);
        }
    }

    public final void a(long j) {
        for (defpackage.dqc b2 : this.a) {
            b2.b(j);
        }
    }

    public final void b(long j) {
        for (defpackage.dqc a2 : this.a) {
            a2.a(j);
        }
    }

    public final void c(long j) {
        for (defpackage.dqc d : this.a) {
            d.d(j);
        }
    }

    public final void d(long j) {
        for (defpackage.dqc c2 : this.a) {
            c2.c(j);
        }
    }
}
