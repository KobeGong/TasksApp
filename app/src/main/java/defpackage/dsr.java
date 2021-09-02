package defpackage;

/* renamed from: dsr reason: default package */
/* compiled from: PG */
final class dsr extends defpackage.dtk {
    private final /* synthetic */ defpackage.dne a;
    private final /* synthetic */ java.lang.String b;

    dsr(defpackage.dsq dsq, defpackage.dne dne, java.lang.String str) {
        this.a = dne;
        this.b = str;
        super(dsq.d);
    }

    public final void a() {
        defpackage.dsq.a(this.a, defpackage.dpw.h.a(java.lang.String.format("Unable to find compressor by name %s", new java.lang.Object[]{this.b})), new defpackage.dor());
    }
}
