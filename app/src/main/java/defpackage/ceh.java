package defpackage;

/* renamed from: ceh  reason: default package */
/* compiled from: PG */
public final class ceh implements ecz {
    private final cdz a;
    private final ecz b;
    private final ecz c;
    private final ecz d;
    private final ecz e;
    private final ecz f;
    private final ecz g;

    public ceh(cdz cdz, ecz ecz, ecz ecz2, ecz ecz3, ecz ecz4, ecz ecz5, ecz ecz6) {
        this.a = cdz;
        this.b = ecz;
        this.c = ecz2;
        this.d = ecz3;
        this.e = ecz4;
        this.f = ecz5;
        this.g = ecz6;
    }

    @Override // defpackage.ecz
    public final /* synthetic */ Object a() {
        cdz cdz = this.a;
        this.d.a();
        bse bse = (bse) this.e.a();
        this.f.a();
        this.g.a();
        return (cdw) dgv.a(new cdw((bqw) this.b.a(), bse, (brz) this.c.a(), cdz.b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
