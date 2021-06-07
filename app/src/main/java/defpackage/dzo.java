package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: dzo  reason: default package */
/* compiled from: PG */
public final class dzo {
    private static final dzo c = new dzo(new dqc[0]);
    public final dqc[] a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public static dzo a(dna dna, dor dor) {
        List list = dna.h;
        if (list.isEmpty()) {
            return c;
        }
        dqc[] dqcArr = new dqc[list.size()];
        for (int i = 0; i < dqcArr.length; i++) {
            dqcArr[i] = ((dnm) list.get(i)).a(dor);
        }
        return new dzo(dqcArr);
    }

    private dzo(dqc[] dqcArr) {
        this.a = dqcArr;
    }

    public final void a() {
        for (dqc dqc : this.a) {
            dqc.b();
        }
    }

    public final void a(int i, long j, long j2) {
        for (dqc dqc : this.a) {
            dqc.a(i, j, j2);
        }
    }

    public final void a(long j) {
        for (dqc dqc : this.a) {
            dqc.b(j);
        }
    }

    public final void b(long j) {
        for (dqc dqc : this.a) {
            dqc.a(j);
        }
    }

    public final void c(long j) {
        for (dqc dqc : this.a) {
            dqc.d(j);
        }
    }

    public final void d(long j) {
        for (dqc dqc : this.a) {
            dqc.c(j);
        }
    }
}
