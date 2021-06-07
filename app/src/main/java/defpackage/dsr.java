package defpackage;

/* renamed from: dsr  reason: default package */
/* compiled from: PG */
final class dsr extends dtk {
    private final /* synthetic */ dne a;
    private final /* synthetic */ String b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    dsr(dsq dsq, dne dne, String str) {
        super(dsq.d);
        this.a = dne;
        this.b = str;
    }

    @Override // defpackage.dtk
    public final void a() {
        dsq.a(this.a, dpw.h.a(String.format("Unable to find compressor by name %s", this.b)), new dor());
    }
}
