package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: dtm  reason: default package */
/* compiled from: PG */
public final class dtm implements dxb {
    public final Object a = new Object();
    public final dso b;
    public Runnable c;
    public Runnable d;
    public dxc e;
    public Collection f = new LinkedHashSet();
    public dpw g;
    private final dwd h = dwd.a(getClass().getName());
    private final Executor i;
    private Runnable j;
    private doq k;
    private long l;

    dtm(Executor executor, dso dso) {
        this.i = executor;
        this.b = dso;
    }

    @Override // defpackage.dxb
    public final Runnable a(dxc dxc) {
        this.e = dxc;
        this.j = new dtn(dxc);
        this.c = new dto(dxc);
        this.d = new dtp(dxc);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r2 = defpackage.dvc.a(r2.a(), r11.i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r2 == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        r0 = r2.a(r3.c(), r3.b(), r3.a());
        r8.b.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        r4 = r8.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005c, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005f, code lost:
        if (r8.g == null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0061, code lost:
        r0 = new defpackage.duu(r8.g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0069, code lost:
        r8.b.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0073, code lost:
        if (r0 != r8.l) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0075, code lost:
        r0 = a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0079, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007a, code lost:
        r8.b.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0080, code lost:
        r2 = r8.k;
        r0 = r8.l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0084, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return r0;
     */
    @Override // defpackage.dtb
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.dta a(defpackage.dpb r9, defpackage.dor r10, defpackage.dna r11) {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtm.a(dpb, dor, dna):dta");
    }

    private final dts a(doo doo) {
        dts dts = new dts(this, doo);
        this.f.add(dts);
        if (c() == 1) {
            this.b.a(this.j);
        }
        return dts;
    }

    @Override // defpackage.dxb
    public final void a(dpw dpw) {
        synchronized (this.a) {
            if (this.g == null) {
                this.g = dpw;
                this.b.a(new dtq(this, dpw));
                if (!a() && this.d != null) {
                    this.b.a(this.d);
                    this.d = null;
                }
                this.b.a();
            }
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            z = !this.f.isEmpty();
        }
        return z;
    }

    private final int c() {
        int size;
        synchronized (this.a) {
            size = this.f.size();
        }
        return size;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r4 = new java.util.ArrayList();
        r0 = r0;
        r5 = r0.size();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r2 >= r5) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        r3 = r2 + 1;
        r1 = (defpackage.dts) r0.get(r2);
        r2 = r10.a();
        r6 = r1.a.a();
        r7 = defpackage.dvc.a(r2, r6.i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r7 == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        r2 = r9.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        if (r6.c == null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        r2 = r6.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        r2.execute(new defpackage.dtr(r1, r7));
        r4.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        r1 = r9.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0066, code lost:
        if (a() != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0068, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006d, code lost:
        r9.f.removeAll(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0078, code lost:
        if (r9.f.isEmpty() == false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007a, code lost:
        r9.f = new java.util.LinkedHashSet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0085, code lost:
        if (a() != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0087, code lost:
        r9.b.a(r9.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
        if (r9.g == null) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        if (r9.d == null) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0096, code lost:
        r9.b.a(r9.d);
        r9.d = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a0, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a1, code lost:
        r9.b.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.doq r10) {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtm.a(doq):void");
    }

    @Override // defpackage.dzw
    public final dwd b() {
        return this.h;
    }
}
