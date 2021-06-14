package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: adr  reason: default package */
/* compiled from: PG */
public final class adr implements Runnable {
    public static final ThreadLocal a = new ThreadLocal();
    private static Comparator f = new ads();
    public ArrayList b = new ArrayList();
    public long c;
    private long d;
    private ArrayList e = new ArrayList();

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.d == 0) {
            this.d = RecyclerView.o();
            recyclerView.post(this);
        }
        afg afg = recyclerView.C;
        afg.a = i;
        afg.b = i2;
    }

    private static ViewHolder a(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int b2 = recyclerView.g.b();
        int i2 = 0;
        while (true) {
            if (i2 >= b2) {
                z = false;
                break;
            }
            ViewHolder c2 = RecyclerView.c(recyclerView.g.c(i2));
            if (c2.c == i && !c2.j()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        afn afn = recyclerView.e;
        try {
            recyclerView.i();
            ViewHolder a2 = afn.a(i, j);
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
        RecyclerView recyclerView;
        int i;
        adt adt;
        int i2;
        long j;
        try {
            jd.c("RV Prefetch");
            if (!this.b.isEmpty()) {
                int size = this.b.size();
                long j2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    RecyclerView recyclerView2 = (RecyclerView) this.b.get(i3);
                    if (recyclerView2.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView2.getDrawingTime(), j2);
                    } else {
                        j = j2;
                    }
                    i3++;
                    j2 = j;
                }
                if (j2 == 0) {
                    this.d = 0;
                    jd.b();
                    return;
                }
                long nanos = TimeUnit.MILLISECONDS.toNanos(j2) + this.c;
                int size2 = this.b.size();
                int i4 = 0;
                int i5 = 0;
                while (i5 < size2) {
                    RecyclerView recyclerView3 = (RecyclerView) this.b.get(i5);
                    if (recyclerView3.getWindowVisibility() == 0) {
                        recyclerView3.C.a(recyclerView3, false);
                        i2 = recyclerView3.C.d + i4;
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
                    RecyclerView recyclerView4 = (RecyclerView) this.b.get(i7);
                    if (recyclerView4.getWindowVisibility() == 0) {
                        afg afg = recyclerView4.C;
                        int abs = Math.abs(afg.a) + Math.abs(afg.b);
                        int i8 = i6;
                        for (int i9 = 0; i9 < (afg.d << 1); i9 += 2) {
                            if (i8 >= this.e.size()) {
                                adt adt2 = new adt();
                                this.e.add(adt2);
                                adt = adt2;
                            } else {
                                adt = (adt) this.e.get(i8);
                            }
                            int i10 = afg.c[i9 + 1];
                            adt.a = i10 <= abs;
                            adt.b = abs;
                            adt.c = i10;
                            adt.d = recyclerView4;
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
                Collections.sort(this.e, f);
                for (int i11 = 0; i11 < this.e.size(); i11++) {
                    adt adt3 = (adt) this.e.get(i11);
                    if (adt3.d == null) {
                        break;
                    }
                    ViewHolder a2 = a(adt3.d, adt3.e, adt3.a ? Long.MAX_VALUE : nanos);
                    if (!(a2 == null || a2.b == null || !a2.l() || a2.j() || (recyclerView = (RecyclerView) a2.b.get()) == null)) {
                        if (recyclerView.u && recyclerView.g.b() != 0) {
                            recyclerView.b();
                        }
                        afg afg2 = recyclerView.C;
                        afg2.a(recyclerView, true);
                        if (afg2.d != 0) {
                            try {
                                jd.c("RV Nested Prefetch");
                                aft aft = recyclerView.D;
                                Adapter aet = recyclerView.adapter;
                                aft.d = 1;
                                aft.e = aet.getCount();
                                aft.g = false;
                                aft.h = false;
                                aft.i = false;
                                for (int i12 = 0; i12 < (afg2.d << 1); i12 += 2) {
                                    a(recyclerView, afg2.c[i12], nanos);
                                }
                            } finally {
                                jd.b();
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
                jd.b();
            }
        } finally {
            this.d = 0;
            jd.b();
        }
    }
}
