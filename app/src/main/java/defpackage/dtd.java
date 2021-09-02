package defpackage;

/* renamed from: dtd reason: default package */
/* compiled from: PG */
public final class dtd extends defpackage.dxv {
    public int a;
    private final java.util.Queue b = new java.util.ArrayDeque();

    public final void a(defpackage.dxv dxv) {
        if (!(dxv instanceof defpackage.dtd)) {
            this.b.add(dxv);
            this.a += dxv.a();
            return;
        }
        defpackage.dtd dtd = (defpackage.dtd) dxv;
        while (!dtd.b.isEmpty()) {
            this.b.add((defpackage.dxv) dtd.b.remove());
        }
        this.a += dtd.a;
        dtd.a = 0;
        dtd.close();
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        defpackage.dte dte = new defpackage.dte();
        a(dte, 1);
        return dte.a;
    }

    public final void a(byte[] bArr, int i, int i2) {
        a(new defpackage.dtf(i, bArr), i2);
    }

    public final void close() {
        while (!this.b.isEmpty()) {
            ((defpackage.dxv) this.b.remove()).close();
        }
    }

    private final void a(defpackage.dtg dtg, int i) {
        b(i);
        if (!this.b.isEmpty()) {
            c();
        }
        while (i > 0 && !this.b.isEmpty()) {
            defpackage.dxv dxv = (defpackage.dxv) this.b.peek();
            int min = java.lang.Math.min(i, dxv.a());
            try {
                dtg.a = dtg.a(dxv, min);
            } catch (java.io.IOException e) {
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
            throw new java.lang.AssertionError("Failed executing read operation");
        }
    }

    private final void c() {
        if (((defpackage.dxv) this.b.peek()).a() == 0) {
            ((defpackage.dxv) this.b.remove()).close();
        }
    }

    public final /* synthetic */ defpackage.dxv a(int i) {
        b(i);
        this.a -= i;
        defpackage.dtd dtd = new defpackage.dtd();
        while (i > 0) {
            defpackage.dxv dxv = (defpackage.dxv) this.b.peek();
            if (dxv.a() > i) {
                dtd.a(dxv.a(i));
                i = 0;
            } else {
                dtd.a((defpackage.dxv) this.b.poll());
                i -= dxv.a();
            }
        }
        return dtd;
    }
}
