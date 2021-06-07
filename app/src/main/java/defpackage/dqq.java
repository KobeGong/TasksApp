package defpackage;

/* renamed from: dqq  reason: default package */
/* compiled from: PG */
final class dqq implements Runnable {
    public final dqk a = new dqk(this.b, this.g.a, this.g.e, this.c, this.g, this, this.g.c, this.g.f, this.g.g, this.d, this.e, this.f, this.g.h);
    private final /* synthetic */ String b;
    private final /* synthetic */ dor c;
    private final /* synthetic */ dpb d;
    private final /* synthetic */ dzo e;
    private final /* synthetic */ dna f;
    private final /* synthetic */ dqo g;

    dqq(dqo dqo, String str, dor dor, dpb dpb, dzo dzo, dna dna) {
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
                this.a.m.b(this.g.j, true, new dor());
            } else if (this.g.k) {
                dqo dqo = this.g;
                dqk dqk = this.a;
                dqo.d.add(dqk);
                dqk.m.h.n = dqo.l;
            } else {
                throw new AssertionError("Transport is not started");
            }
        }
    }
}
