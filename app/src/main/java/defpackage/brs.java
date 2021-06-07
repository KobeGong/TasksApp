package defpackage;

/* renamed from: brs  reason: default package */
/* compiled from: PG */
public final class brs implements bqw {
    public ayp a;
    private brr b;

    private brs(ayp ayp, brr brr) {
        this.a = ayp;
        this.b = brr;
    }

    @Override // defpackage.bqw
    public final void a() {
        this.a.e();
    }

    @Override // defpackage.bqw
    public final void b() {
        this.a.g();
    }

    @Override // defpackage.bqw
    public final void a(bqz bqz) {
        this.a.a(this.b.a(bqz));
    }

    @Override // defpackage.bqw
    public final void a(bra bra) {
        this.a.a(this.b.a(bra));
    }

    @Override // defpackage.bqw
    public final void b(bqz bqz) {
        this.a.b(this.b.a(bqz));
        this.b.b(bqz);
    }

    @Override // defpackage.bqw
    public final void b(bra bra) {
        this.a.b(this.b.a(bra));
        this.b.b(bra);
    }

    public brs(ayp ayp, brr brr, byte b2) {
        this(ayp, brr);
    }
}
