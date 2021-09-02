package defpackage;

/* renamed from: ceg reason: default package */
/* compiled from: PG */
public final class ceg implements defpackage.ecz {
    private final defpackage.cdz a;
    private final defpackage.ecz b;
    private final defpackage.ecz c;

    public ceg(defpackage.cdz cdz, defpackage.ecz ecz, defpackage.ecz ecz2) {
        this.a = cdz;
        this.b = ecz;
        this.c = ecz2;
    }

    public final /* synthetic */ java.lang.Object a() {
        defpackage.cdz cdz = this.a;
        defpackage.bqx bqx = (defpackage.bqx) this.b.a();
        this.c.a();
        bqx.a.a(bqx.b.a((defpackage.bqu) new defpackage.btb()), bqx.b.a((defpackage.bqv) new defpackage.bri(cdz.a)));
        return (defpackage.bqw) defpackage.dgv.a((java.lang.Object) bqx.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
