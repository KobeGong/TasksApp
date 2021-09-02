package defpackage;

/* renamed from: bap reason: default package */
/* compiled from: PG */
final class bap implements java.lang.Runnable {
    private /* synthetic */ defpackage.axq a;
    private /* synthetic */ defpackage.bbl b;

    bap(defpackage.bbl bbl, defpackage.axq axq) {
        this.b = bbl;
        this.a = axq;
    }

    public final void run() {
        if (this.a.b()) {
            this.b.e = true;
            if (this.b.a.h()) {
                this.b.a();
            } else {
                this.b.a.a((defpackage.bdp) null, java.util.Collections.emptySet());
            }
        } else {
            ((defpackage.bak) this.b.f.n.get(this.b.b)).a(this.a);
        }
    }
}
