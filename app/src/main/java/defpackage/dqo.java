package defpackage;

import java.net.InetSocketAddress;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: dqo  reason: default package */
/* compiled from: PG */
public final class dqo implements dth {
    public final String a;
    public dxc b;
    public final Object c = new Object();
    public final Set d = new HashSet();
    public final Executor e;
    public final int f;
    public final boolean g;
    public final dzt h;
    public boolean i;
    public dpw j;
    public boolean k;
    public dqj l;
    private final dwd m = dwd.a(getClass().getName());
    private final InetSocketAddress n;
    private final String o;
    private boolean p;
    private boolean q;

    dqo(dqj dqj, InetSocketAddress inetSocketAddress, String str, String str2, Executor executor, int i2, boolean z, dzt dzt) {
        this.n = (InetSocketAddress) cld.a(inetSocketAddress, "address");
        this.o = str;
        this.a = dvc.a("cronet", str2);
        this.f = i2;
        this.g = z;
        this.e = (Executor) cld.a(executor, "executor");
        this.l = (dqj) cld.a(dqj, "streamFactory");
        this.h = (dzt) cld.a(dzt, "transportTracer");
    }

    @Override // defpackage.dxb
    public final Runnable a(dxc dxc) {
        this.b = (dxc) cld.a(dxc, "listener");
        synchronized (this.c) {
            this.k = true;
        }
        return new dqp(this);
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.n);
        return new StringBuilder(String.valueOf(obj).length() + 2 + String.valueOf(valueOf).length()).append(obj).append("(").append(valueOf).append(")").toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000f, code lost:
        if (r2.p == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0011, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0019, code lost:
        r2.p = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x001c, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x001d, code lost:
        r2.b.a(r3);
        r1 = r2.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0024, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r2.i = true;
        r2.j = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x002a, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x002b, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000a, code lost:
        r1 = r2.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000c, code lost:
        monitor-enter(r1);
     */
    @Override // defpackage.dxb
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.dpw r3) {
        /*
            r2 = this;
            java.lang.Object r1 = r2.c
            monitor-enter(r1)
            boolean r0 = r2.i     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r1)     // Catch:{ all -> 0x0016 }
        L_0x0008:
            return
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x0016 }
            java.lang.Object r1 = r2.c
            monitor-enter(r1)
            boolean r0 = r2.p     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0019
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            goto L_0x0008
        L_0x0013:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            throw r0
        L_0x0016:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0019:
            r0 = 1
            r2.p = r0
            monitor-exit(r1)
            dxc r0 = r2.b
            r0.a(r3)
            java.lang.Object r1 = r2.c
            monitor-enter(r1)
            r0 = 1
            r2.i = r0     // Catch:{ all -> 0x002f }
            r2.j = r3     // Catch:{ all -> 0x002f }
            monitor-exit(r1)     // Catch:{ all -> 0x002f }
            r2.c()
            goto L_0x0008
        L_0x002f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqo.a(dpw):void");
    }

    @Override // defpackage.dth
    public final dmv a() {
        return dmv.b;
    }

    @Override // defpackage.dzw
    public final dwd b() {
        return this.m;
    }

    private final void c() {
        synchronized (this.c) {
            if (this.i && !this.q && this.d.size() == 0) {
                this.q = true;
                this.b.b();
            }
        }
    }

    public final void a(dqk dqk, dpw dpw) {
        synchronized (this.c) {
            if (this.d.remove(dqk)) {
                dqk.m.b(dpw, dpw.l == dpx.CANCELLED || dpw.l == dpx.DEADLINE_EXCEEDED, new dor());
                c();
            }
        }
    }

    @Override // defpackage.dtb
    public final /* synthetic */ dta a(dpb dpb, dor dor, dna dna) {
        cld.a(dpb, "method");
        cld.a(dor, "headers");
        String valueOf = String.valueOf(dpb.b);
        String concat = valueOf.length() != 0 ? "/".concat(valueOf) : new String("/");
        String str = this.o;
        return new dqq(this, new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(concat).length()).append("https://").append(str).append(concat).toString(), dor, dpb, dzo.a(dna, dor), dna).a;
    }
}
