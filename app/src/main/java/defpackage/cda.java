package defpackage;

/* renamed from: cda  reason: default package */
/* compiled from: PG */
public final class cda {
    public final cbl a;
    private final bux b;
    private final bup c;

    public final void a(bvo bvo) {
        for (bul bul : this.c.a()) {
            for (buv buv : this.b.a(bul.b())) {
                this.a.a(bul, buv, true, true, bvo);
            }
        }
        for (buv buv2 : this.b.a(null)) {
            this.a.a(null, buv2, true, true, bvo);
        }
    }

    public cda(cbl cbl, bux bux, bup bup) {
        this.a = cbl;
        this.b = bux;
        this.c = bup;
    }
}
