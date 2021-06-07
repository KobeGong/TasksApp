package defpackage;

/* renamed from: bzo  reason: default package */
/* compiled from: PG */
public final class bzo implements ecz {
    private final ecz a;
    private final ecz b;
    private final ecz c;

    public bzo(ecz ecz, ecz ecz2, ecz ecz3) {
        this.a = ecz;
        this.b = ecz2;
        this.c = ecz3;
    }

    @Override // defpackage.ecz
    public final /* synthetic */ Object a() {
        bzn bzn = new bzn();
        bzn.a = (buc) this.a.a();
        bzn.b = (bzb) this.b.a();
        bzn.c = (bzc) this.c.a();
        return bzn;
    }
}
