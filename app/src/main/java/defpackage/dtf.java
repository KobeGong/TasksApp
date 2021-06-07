package defpackage;

/* renamed from: dtf  reason: default package */
/* compiled from: PG */
final class dtf extends dtg {
    private int c = this.d;
    private final /* synthetic */ int d;
    private final /* synthetic */ byte[] e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    dtf(int i, byte[] bArr) {
        super((byte) 0);
        this.d = i;
        this.e = bArr;
    }

    @Override // defpackage.dtg
    public final int a(dxv dxv, int i) {
        dxv.a(this.e, this.c, i);
        this.c += i;
        return 0;
    }
}
