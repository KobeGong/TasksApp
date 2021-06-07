package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: dtd  reason: default package */
/* compiled from: PG */
public final class dtd extends dxv {
    public int a;
    private final Queue b = new ArrayDeque();

    public final void a(dxv dxv) {
        if (!(dxv instanceof dtd)) {
            this.b.add(dxv);
            this.a += dxv.a();
            return;
        }
        dtd dtd = (dtd) dxv;
        while (!dtd.b.isEmpty()) {
            this.b.add((dxv) dtd.b.remove());
        }
        this.a += dtd.a;
        dtd.a = 0;
        dtd.close();
    }

    @Override // defpackage.dxv
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dxv
    public final int b() {
        dte dte = new dte();
        a(dte, 1);
        return dte.a;
    }

    @Override // defpackage.dxv
    public final void a(byte[] bArr, int i, int i2) {
        a(new dtf(i, bArr), i2);
    }

    @Override // defpackage.dxv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (!this.b.isEmpty()) {
            ((dxv) this.b.remove()).close();
        }
    }

    private final void a(dtg dtg, int i) {
        b(i);
        if (!this.b.isEmpty()) {
            c();
        }
        while (i > 0 && !this.b.isEmpty()) {
            dxv dxv = (dxv) this.b.peek();
            int min = Math.min(i, dxv.a());
            try {
                dtg.a = dtg.a(dxv, min);
            } catch (IOException e) {
                dtg.b = e;
            }
            if (!(dtg.b != null)) {
                i -= min;
                this.a -= min;
                c();
            } else {
                return;
            }
        }
        if (i > 0) {
            throw new AssertionError("Failed executing read operation");
        }
    }

    private final void c() {
        if (((dxv) this.b.peek()).a() == 0) {
            ((dxv) this.b.remove()).close();
        }
    }

    @Override // defpackage.dxv
    public final /* synthetic */ dxv a(int i) {
        b(i);
        this.a -= i;
        dtd dtd = new dtd();
        while (i > 0) {
            dxv dxv = (dxv) this.b.peek();
            if (dxv.a() > i) {
                dtd.a(dxv.a(i));
                i = 0;
            } else {
                dtd.a((dxv) this.b.poll());
                i -= dxv.a();
            }
        }
        return dtd;
    }
}
