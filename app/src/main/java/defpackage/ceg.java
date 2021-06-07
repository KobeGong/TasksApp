package defpackage;

/* renamed from: ceg  reason: default package */
/* compiled from: PG */
public final class ceg implements ecz {
    private final cdz a;
    private final ecz b;
    private final ecz c;

    public ceg(cdz cdz, ecz ecz, ecz ecz2) {
        this.a = cdz;
        this.b = ecz;
        this.c = ecz2;
    }

    @Override // defpackage.ecz
    public final /* synthetic */ Object a() {
        cdz cdz = this.a;
        bqx bqx = (bqx) this.b.a();
        this.c.a();
        bqx.a.a(bqx.b.a(new btb()), bqx.b.a(new bri(cdz.a)));
        return (bqw) dgv.a(bqx.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
