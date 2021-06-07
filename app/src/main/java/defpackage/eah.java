package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: eah  reason: default package */
/* compiled from: PG */
public final class eah extends dne {
    private final eaf a;
    private Object b;

    eah(eaf eaf) {
        this.a = eaf;
    }

    @Override // defpackage.dne
    public final void a(dor dor) {
    }

    @Override // defpackage.dne
    public final void a(Object obj) {
        if (this.b != null) {
            throw dpw.h.a("More than one value received for unary call").b();
        }
        this.b = obj;
    }

    @Override // defpackage.dne
    public final void a(dpw dpw, dor dor) {
        if (dpw.a()) {
            if (this.b == null) {
                this.a.a((Throwable) dpw.h.a("No value received for unary call").a(dor));
            }
            this.a.a(this.b);
            return;
        }
        this.a.a((Throwable) dpw.a(dor));
    }
}
