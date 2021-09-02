package defpackage;

/* renamed from: dqq reason: default package */
/* compiled from: PG */
final class dqq implements java.lang.Runnable {
    public final defpackage.dqk a = new defpackage.dqk(this.b, this.g.a, this.g.e, this.c, this.g, this, this.g.c, this.g.f, this.g.g, this.d, this.e, this.f, this.g.h);
    private final /* synthetic */ java.lang.String b;
    private final /* synthetic */ defpackage.dor c;
    private final /* synthetic */ defpackage.dpb d;
    private final /* synthetic */ defpackage.dzo e;
    private final /* synthetic */ defpackage.dna f;
    private final /* synthetic */ defpackage.dqo g;

    dqq(defpackage.dqo dqo, java.lang.String str, defpackage.dor dor, defpackage.dpb dpb, defpackage.dzo dzo, defpackage.dna dna) {
        this.g = dqo;
        this.b = str;
        this.c = dor;
        this.d = dpb;
        this.e = dzo;
        this.f = dna;
    }

    public final void run() {
        synchronized (this.g.c) {
            if (this.g.i) {
                this.a.m.b(this.g.j, true, new defpackage.dor());
            } else if (this.g.k) {
                defpackage.dqo dqo = this.g;
                defpackage.dqk dqk = this.a;
                dqo.d.add(dqk);
                dqk.m.h.n = dqo.l;
            } else {
                throw new java.lang.AssertionError("Transport is not started");
            }
        }
    }
}
