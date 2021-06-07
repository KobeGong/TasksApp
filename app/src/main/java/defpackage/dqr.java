package defpackage;

import java.nio.ByteBuffer;
import java.util.logging.Logger;

/* renamed from: dqr  reason: default package */
/* compiled from: PG */
public abstract class dqr extends dqy implements dta, dxl {
    public static final Logger o = Logger.getLogger(dqr.class.getName());
    private final dva a;
    private boolean b;
    private volatile boolean c;

    public dqr(dzy dzy, dzo dzo, dzt dzt, dor dor, boolean z) {
        cld.a(dor, "headers");
        cld.a(dzt, "transportTracer");
        this.b = z;
        if (!z) {
            this.a = new dxi(this, dzy, dzo);
        } else {
            this.a = new dqs(this, dor, dzo);
        }
    }

    public abstract dqt a();

    /* renamed from: b */
    public abstract dri c();

    @Override // defpackage.dta
    public final void a(int i) {
        this.a.a(i);
    }

    @Override // defpackage.dta
    public final void b(int i) {
        c().i.b(i);
    }

    @Override // defpackage.dta
    public final void a(boolean z) {
        c().n = z;
    }

    @Override // defpackage.dta
    public final void a(dob dob) {
        dri c2 = c();
        cld.b(c2.m == null, "Already called start");
        c2.o = (dob) cld.a(dob, "decompressorRegistry");
    }

    @Override // defpackage.dta
    public final void a(dzq dzq) {
        dri c2 = c();
        cld.b(c2.m == null, "Already called setListener");
        c2.m = (dzq) cld.a(dzq, "listener");
        if (!this.b) {
            a().a(null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dqy
    public final dva d() {
        return this.a;
    }

    @Override // defpackage.dzp
    public final void c(int i) {
        dqt a2 = a();
        synchronized (a2.a.m.a) {
            dqn dqn = a2.a.m;
            try {
                dqn.i.c(i);
            } catch (Throwable th) {
                dqn.a(th);
            }
        }
    }

    @Override // defpackage.dxl
    public final void a(dzx dzx, boolean z, boolean z2) {
        ByteBuffer byteBuffer;
        cld.a(dzx != null || z, "null frame before EOS");
        dqt a2 = a();
        synchronized (a2.a.m.a) {
            if (!a2.a.m.d) {
                if (dzx != null) {
                    byteBuffer = dzx.a;
                    byteBuffer.flip();
                } else {
                    byteBuffer = dqk.a;
                }
                dqk dqk = a2.a;
                int remaining = byteBuffer.remaining();
                dri c2 = dqk.c();
                synchronized (c2.j) {
                    c2.k = remaining + c2.k;
                }
                if (!a2.a.m.c) {
                    a2.a.m.b.add(new dqm(byteBuffer, z, z2));
                } else {
                    dqk dqk2 = a2.a;
                    dqk2.i.a(byteBuffer, z);
                    if (z2) {
                        dqk2.i.b();
                    }
                }
            }
        }
    }

    @Override // defpackage.dta
    public final void e() {
        if (!c().p) {
            c().p = true;
            d().c();
        }
    }

    @Override // defpackage.dta
    public final void b(dpw dpw) {
        cld.a(!dpw.a(), "Should not cancel with OK status");
        this.c = true;
        dqt a2 = a();
        synchronized (a2.a.m.a) {
            if (!a2.a.m.d) {
                a2.a.m.d = true;
                a2.a.m.f = dpw;
                dqn dqn = a2.a.m;
                for (dqm dqm : dqn.b) {
                    dqm.a.clear();
                }
                dqn.b.clear();
                if (a2.a.i != null) {
                    a2.a.i.c();
                } else {
                    a2.a.f.a(a2.a, dpw);
                }
            }
        }
    }
}
