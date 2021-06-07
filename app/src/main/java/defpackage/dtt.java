package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dtt  reason: default package */
/* compiled from: PG */
public class dtt implements dta {
    private volatile boolean a;
    private dzq b;
    public dta c;
    private dpw d;
    private List e = new ArrayList();
    private dug f;

    @Override // defpackage.dta
    public final void b(int i) {
        if (this.a) {
            this.c.b(i);
        } else {
            a(new dtu(this, i));
        }
    }

    @Override // defpackage.dta
    public final void a(int i) {
        if (this.a) {
            this.c.a(i);
        } else {
            a(new dty(this, i));
        }
    }

    public final void a(dta dta) {
        synchronized (this) {
            if (this.c == null) {
                this.c = (dta) cld.a(dta, "stream");
                a();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r2.c.isEmpty() == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        r2.c = null;
        r2.b = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        r2 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if (r2.hasNext() == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        ((java.lang.Runnable) r2.next()).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        r1 = r2.c;
        r2.c = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        r3 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
        if (r3.hasNext() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005f, code lost:
        ((java.lang.Runnable) r3.next()).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006c, code lost:
        r1.clear();
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r0 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        monitor-enter(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a() {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtt.a():void");
    }

    private final void a(Runnable runnable) {
        synchronized (this) {
            if (!this.a) {
                this.e.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    @Override // defpackage.dta
    public final void a(String str) {
        cld.b(this.b == null, "May only be called before start");
        cld.a(str, "authority");
        a(new dtz(this, str));
    }

    @Override // defpackage.dta
    public final void a(dzq dzq) {
        dpw dpw;
        boolean z;
        cld.b(this.b == null, "already started");
        synchronized (this) {
            this.b = (dzq) cld.a(dzq, "listener");
            dpw = this.d;
            z = this.a;
            if (!z) {
                dug dug = new dug(dzq);
                this.f = dug;
                dzq = dug;
            }
        }
        if (dpw != null) {
            dzq.b(dpw, new dor());
        } else if (z) {
            this.c.a(dzq);
        } else {
            a(new dua(this, dzq));
        }
    }

    @Override // defpackage.dzp
    public final void a(InputStream inputStream) {
        cld.a(inputStream, "message");
        if (this.a) {
            this.c.a(inputStream);
        } else {
            a(new dub(this, inputStream));
        }
    }

    @Override // defpackage.dzp
    public final void f() {
        if (this.a) {
            this.c.f();
        } else {
            a(new duc(this));
        }
    }

    @Override // defpackage.dta
    public void b(dpw dpw) {
        cld.a(dpw, "reason");
        boolean z = true;
        dzq dzq = null;
        synchronized (this) {
            if (this.c == null) {
                this.c = dxm.a;
                z = false;
                dzq = this.b;
                this.d = dpw;
            }
        }
        if (z) {
            a(new dud(this, dpw));
            return;
        }
        if (dzq != null) {
            dzq.b(dpw, new dor());
        }
        a();
    }

    @Override // defpackage.dta
    public final void e() {
        a(new due(this));
    }

    @Override // defpackage.dzp
    public final void c(int i) {
        if (this.a) {
            this.c.c(i);
        } else {
            a(new duf(this, i));
        }
    }

    @Override // defpackage.dzp
    public final void a(doa doa) {
        cld.a(doa, "compressor");
        a(new dtv(this, doa));
    }

    @Override // defpackage.dta
    public final void a(boolean z) {
        a(new dtw(this, z));
    }

    @Override // defpackage.dta
    public final void a(dob dob) {
        cld.a(dob, "decompressorRegistry");
        a(new dtx(this, dob));
    }
}
