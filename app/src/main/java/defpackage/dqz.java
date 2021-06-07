package defpackage;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: dqz  reason: default package */
/* compiled from: PG */
public final class dqz implements dtl, dxe {
    public final dxe a;
    public final dxd b;
    public final Queue c = new ArrayDeque();
    private final dri d;

    public dqz(dxe dxe, dri dri, dxd dxd) {
        this.a = (dxe) cld.a(dxe, "listener");
        this.d = (dri) cld.a(dri, "transportExecutor");
        dxd.a = this;
        this.b = dxd;
    }

    @Override // defpackage.dtl
    public final void b(int i) {
        this.b.b = i;
    }

    @Override // defpackage.dtl
    public final void a(doa doa) {
        this.b.a(doa);
    }

    @Override // defpackage.dtl
    public final void a(dvk dvk) {
        this.b.a(dvk);
    }

    @Override // defpackage.dtl
    public final void c(int i) {
        this.a.a(new drh(this, new dra(this, i)));
    }

    @Override // defpackage.dtl
    public final void a(dxv dxv) {
        this.a.a(new drh(this, new drb(this, dxv)));
    }

    @Override // defpackage.dtl
    public final void a() {
        this.a.a(new drh(this, new drc(this)));
    }

    @Override // defpackage.dtl
    public final void close() {
        this.b.c = true;
        this.a.a(new drh(this, new drd(this)));
    }

    @Override // defpackage.dxe
    public final void a(int i) {
        this.d.a(new dre(this, i));
    }

    @Override // defpackage.dxe
    public final void a(dzr dzr) {
        while (true) {
            InputStream a2 = dzr.a();
            if (a2 != null) {
                this.c.add(a2);
            } else {
                return;
            }
        }
    }

    @Override // defpackage.dxe
    public final void a(boolean z) {
        this.d.a(new drf(this, z));
    }

    @Override // defpackage.dxe
    public final void a(Throwable th) {
        this.d.a(new drg(this, th));
    }
}
