package defpackage;

import java.util.Collections;

/* renamed from: bap  reason: default package */
/* compiled from: PG */
final class bap implements Runnable {
    private /* synthetic */ axq a;
    private /* synthetic */ bbl b;

    bap(bbl bbl, axq axq) {
        this.b = bbl;
        this.a = axq;
    }

    public final void run() {
        if (this.a.b()) {
            this.b.e = true;
            if (this.b.a.h()) {
                this.b.a();
            } else {
                this.b.a.a((bdp) null, Collections.emptySet());
            }
        } else {
            ((bak) this.b.f.n.get(this.b.b)).a(this.a);
        }
    }
}
