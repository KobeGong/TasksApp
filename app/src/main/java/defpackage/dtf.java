package defpackage;

/* renamed from: dtf reason: default package */
/* compiled from: PG */
final class dtf extends defpackage.dtg {
    private int c = this.d;
    private final /* synthetic */ int d;
    private final /* synthetic */ byte[] e;

    dtf(int i, byte[] bArr) {
        this.d = i;
        this.e = bArr;
        super(0);
    }

    public final int a(defpackage.dxv dxv, int i) {
        dxv.a(this.e, this.c, i);
        this.c += i;
        return 0;
    }
}
