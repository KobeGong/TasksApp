package defpackage;

/* renamed from: dqz reason: default package */
/* compiled from: PG */
public final class dqz implements defpackage.dtl, defpackage.dxe {
    public final defpackage.dxe a;
    public final defpackage.dxd b;
    public final java.util.Queue c = new java.util.ArrayDeque();
    private final defpackage.dri d;

    public dqz(defpackage.dxe dxe, defpackage.dri dri, defpackage.dxd dxd) {
        this.a = (defpackage.dxe) defpackage.cld.a((java.lang.Object) dxe, (java.lang.Object) "listener");
        this.d = (defpackage.dri) defpackage.cld.a((java.lang.Object) dri, (java.lang.Object) "transportExecutor");
        dxd.a = this;
        this.b = dxd;
    }

    public final void b(int i) {
        this.b.b = i;
    }

    public final void a(defpackage.doa doa) {
        this.b.a(doa);
    }

    public final void a(defpackage.dvk dvk) {
        this.b.a(dvk);
    }

    public final void c(int i) {
        this.a.a((defpackage.dzr) new defpackage.drh(this, new defpackage.dra(this, i)));
    }

    public final void a(defpackage.dxv dxv) {
        this.a.a((defpackage.dzr) new defpackage.drh(this, new defpackage.drb(this, dxv)));
    }

    public final void a() {
        this.a.a((defpackage.dzr) new defpackage.drh(this, new defpackage.drc(this)));
    }

    public final void close() {
        this.b.c = true;
        this.a.a((defpackage.dzr) new defpackage.drh(this, new defpackage.drd(this)));
    }

    public final void a(int i) {
        this.d.a((java.lang.Runnable) new defpackage.dre(this, i));
    }

    public final void a(defpackage.dzr dzr) {
        while (true) {
            java.io.InputStream a2 = dzr.a();
            if (a2 != null) {
                this.c.add(a2);
            } else {
                return;
            }
        }
    }

    public final void a(boolean z) {
        this.d.a((java.lang.Runnable) new defpackage.drf(this, z));
    }

    public final void a(java.lang.Throwable th) {
        this.d.a((java.lang.Runnable) new defpackage.drg(this, th));
    }
}
