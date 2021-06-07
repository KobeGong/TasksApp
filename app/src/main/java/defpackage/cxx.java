package defpackage;

import java.util.concurrent.RejectedExecutionException;

/* renamed from: cxx  reason: default package */
/* compiled from: PG */
final class cxx extends cxo {
    private cxw e;
    private final /* synthetic */ cxu f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    cxx(cxu cxu, csn csn, boolean z, cxw cxw) {
        super(cxu, csn, z);
        this.f = cxu;
        this.e = cxw;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cxo
    public final void c() {
        cxw cxw = this.e;
        if (cxw != null) {
            try {
                cxw.a.execute(cxw);
            } catch (RejectedExecutionException e2) {
                if (cxw.b) {
                    cxw.c.a((Throwable) e2);
                }
            }
        } else {
            cld.b(this.f.isDone());
        }
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cxo
    public final void b() {
        super.b();
        this.e = null;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cxo
    public final void d() {
        cxw cxw = this.e;
        if (cxw != null) {
            cxw.d();
        }
    }
}
