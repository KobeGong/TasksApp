package defpackage;

/* renamed from: adr reason: default package */
/* compiled from: PG */
public final class adr implements java.lang.Runnable {
    public static final java.lang.ThreadLocal a = new java.lang.ThreadLocal();
    private static java.util.Comparator f = new defpackage.ads();
    public java.util.ArrayList b = new java.util.ArrayList();
    public long c;
    private long d;
    private java.util.ArrayList e = new java.util.ArrayList();

    public final void a(android.support.v7.widget.RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.d == 0) {
            this.d = android.support.v7.widget.RecyclerView.o();
            recyclerView.post(this);
        }
        defpackage.afg afg = recyclerView.C;
        afg.a = i;
        afg.b = i2;
    }

    private static defpackage.afv a(android.support.v7.widget.RecyclerView recyclerView, int i, long j) {
        boolean z;
        int b2 = recyclerView.g.b();
        int i2 = 0;
        while (true) {
            if (i2 >= b2) {
                z = false;
                break;
            }
            defpackage.afv c2 = android.support.v7.widget.RecyclerView.c(recyclerView.g.c(i2));
            if (c2.c == i && !c2.j()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        defpackage.afn afn = recyclerView.e;
        try {
            recyclerView.i();
            defpackage.afv a2 = afn.a(i, j);
            if (a2 != null) {
                if (!a2.l() || a2.j()) {
                    afn.a(a2, false);
                } else {
                    afn.a(a2.a);
                }
            }
            return a2;
        } finally {
            recyclerView.b(false);
        }
    }

    public final void run() {
        int i;
        defpackage.adt adt;
        int i2;
        long j;
        try {
            defpackage.jd.c("RV Prefetch");
            if (this.b.isEmpty()) {
                this.d = 0;
                return;
            }
            int size = this.b.size();
            long j2 = 0;
            int i3 = 0;
            while (i3 < size) {
                android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) this.b.get(i3);
                if (recyclerView.getWindowVisibility() == 0) {
                    j = java.lang.Math.max(recyclerView.getDrawingTime(), j2);
                } else {
                    j = j2;
                }
                i3++;
                j2 = j;
            }
            if (j2 == 0) {
                this.d = 0;
                defpackage.jd.b();
                return;
            }
            long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(j2) + this.c;
            int size2 = this.b.size();
            int i4 = 0;
            int i5 = 0;
            while (i5 < size2) {
                android.support.v7.widget.RecyclerView recyclerView2 = (android.support.v7.widget.RecyclerView) this.b.get(i5);
                if (recyclerView2.getWindowVisibility() == 0) {
                    recyclerView2.C.a(recyclerView2, false);
                    i2 = recyclerView2.C.d + i4;
                } else {
                    i2 = i4;
                }
                i5++;
                i4 = i2;
            }
            this.e.ensureCapacity(i4);
            int i6 = 0;
            int i7 = 0;
            while (i7 < size2) {
                android.support.v7.widget.RecyclerView recyclerView3 = (android.support.v7.widget.RecyclerView) this.b.get(i7);
                if (recyclerView3.getWindowVisibility() == 0) {
                    defpackage.afg afg = recyclerView3.C;
                    int abs = java.lang.Math.abs(afg.a) + java.lang.Math.abs(afg.b);
                    int i8 = i6;
                    for (int i9 = 0; i9 < (afg.d << 1); i9 += 2) {
                        if (i8 >= this.e.size()) {
                            defpackage.adt adt2 = new defpackage.adt();
                            this.e.add(adt2);
                            adt = adt2;
                        } else {
                            adt = (defpackage.adt) this.e.get(i8);
                        }
                        int i10 = afg.c[i9 + 1];
                        adt.a = i10 <= abs;
                        adt.b = abs;
                        adt.c = i10;
                        adt.d = recyclerView3;
                        adt.e = afg.c[i9];
                        i8++;
                    }
                    i = i8;
                } else {
                    i = i6;
                }
                i7++;
                i6 = i;
            }
            java.util.Collections.sort(this.e, f);
            for (int i11 = 0; i11 < this.e.size(); i11++) {
                defpackage.adt adt3 = (defpackage.adt) this.e.get(i11);
                if (adt3.d == null) {
                    break;
                }
                defpackage.afv a2 = a(adt3.d, adt3.e, adt3.a ? Long.MAX_VALUE : nanos);
                if (a2 != null && a2.b != null && a2.l() && !a2.j()) {
                    android.support.v7.widget.RecyclerView recyclerView4 = (android.support.v7.widget.RecyclerView) a2.b.get();
                    if (recyclerView4 != null) {
                        if (recyclerView4.u && recyclerView4.g.b() != 0) {
                            recyclerView4.b();
                        }
                        defpackage.afg afg2 = recyclerView4.C;
                        afg2.a(recyclerView4, true);
                        if (afg2.d != 0) {
                            defpackage.jd.c("RV Nested Prefetch");
                            defpackage.aft aft = recyclerView4.D;
                            defpackage.aet aet = recyclerView4.k;
                            aft.d = 1;
                            aft.e = aet.a();
                            aft.g = false;
                            aft.h = false;
                            aft.i = false;
                            for (int i12 = 0; i12 < (afg2.d << 1); i12 += 2) {
                                a(recyclerView4, afg2.c[i12], nanos);
                            }
                        }
                    }
                }
                adt3.a = false;
                adt3.b = 0;
                adt3.c = 0;
                adt3.d = null;
                adt3.e = 0;
            }
            this.d = 0;
            defpackage.jd.b();
        } catch (Throwable th) {
            this.d = 0;
            throw th;
        } finally {
            defpackage.jd.b();
        }
    }
}
