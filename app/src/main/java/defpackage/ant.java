package defpackage;

/* renamed from: ant  reason: default package */
final /* synthetic */ class ant implements Runnable {
    private final anc a;
    private final anu b;
    private final cyi c;

    ant(anc anc, anu anu, cyi cyi) {
        this.a = anc;
        this.b = anu;
        this.c = cyi;
    }

    public final void run() {
        anc anc = this.a;
        anu anu = this.b;
        cyi cyi = this.c;
        synchronized (anc) {
            if (anc.a == anu) {
                if (ajd.a(cyi)) {
                    alq a2 = alq.a();
                    a2.b.post(new alr(a2, anu.a.a));
                }
            }
        }
    }
}
