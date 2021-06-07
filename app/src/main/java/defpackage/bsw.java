package defpackage;

/* renamed from: bsw  reason: default package */
/* compiled from: PG */
final class bsw extends bro implements bsd {
    private final blq a;

    public bsw(blq blq) {
        super(blq);
        this.a = blq;
    }

    @Override // defpackage.bsd
    public final bsk b() {
        bcr c = this.a.c();
        if (c == null) {
            return null;
        }
        return new bsj(c, (byte) 0);
    }
}
