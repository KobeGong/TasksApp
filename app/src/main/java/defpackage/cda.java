package defpackage;

/* renamed from: cda reason: default package */
/* compiled from: PG */
public final class cda {
    public final defpackage.cbl a;
    private final defpackage.bux b;
    private final defpackage.bup c;

    public final void a(defpackage.bvo bvo) {
        for (defpackage.bul bul : this.c.a()) {
            for (defpackage.buv a2 : this.b.a(bul.b())) {
                this.a.a(bul, a2, true, true, bvo);
            }
        }
        for (defpackage.buv a3 : this.b.a(null)) {
            this.a.a(null, a3, true, true, bvo);
        }
    }

    public cda(defpackage.cbl cbl, defpackage.bux bux, defpackage.bup bup) {
        this.a = cbl;
        this.b = bux;
        this.c = bup;
    }
}
