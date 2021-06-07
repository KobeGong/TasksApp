package defpackage;

import java.util.Set;

/* renamed from: bbl  reason: default package */
/* compiled from: PG */
public final class bbl implements bda {
    public final ayj a;
    public final bbu b;
    public bdp c = null;
    public Set d = null;
    public boolean e = false;
    public final /* synthetic */ baj f;

    public final void b(axq axq) {
        bak bak = (bak) this.f.n.get(this.b);
        azb.a(bak.g.g);
        bak.a.e();
        bak.a(axq);
    }

    public bbl(baj baj, ayj ayj, bbu bbu) {
        this.f = baj;
        this.a = ayj;
        this.b = bbu;
    }

    @Override // defpackage.bda
    public final void a(axq axq) {
        this.f.g.post(new bap(this, axq));
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.e && this.c != null) {
            this.a.a(this.c, this.d);
        }
    }
}
