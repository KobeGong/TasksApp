package defpackage;

/* renamed from: eah reason: default package */
/* compiled from: PG */
final class eah extends defpackage.dne {
    private final defpackage.eaf a;
    private java.lang.Object b;

    eah(defpackage.eaf eaf) {
        this.a = eaf;
    }

    public final void a(defpackage.dor dor) {
    }

    public final void a(java.lang.Object obj) {
        if (this.b != null) {
            throw defpackage.dpw.h.a("More than one value received for unary call").b();
        }
        this.b = obj;
    }

    public final void a(defpackage.dpw dpw, defpackage.dor dor) {
        if (dpw.a()) {
            if (this.b == null) {
                this.a.a((java.lang.Throwable) defpackage.dpw.h.a("No value received for unary call").a(dor));
            }
            this.a.a(this.b);
            return;
        }
        this.a.a((java.lang.Throwable) dpw.a(dor));
    }
}
