package defpackage;

/* renamed from: dsa reason: default package */
/* compiled from: PG */
final class dsa implements defpackage.dox {
    private final /* synthetic */ defpackage.ebp a;
    private final /* synthetic */ defpackage.ebm b;

    dsa(defpackage.ebp ebp, defpackage.ebm ebm) {
        this.a = ebp;
        this.b = ebm;
    }

    /* access modifiers changed from: private */
    public final byte[] a(defpackage.ebi ebi) {
        try {
            return this.a.a(ebi);
        } catch (defpackage.ebq e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final defpackage.ebi a(byte[] bArr) {
        try {
            return this.a.a(bArr);
        } catch (java.lang.Exception e) {
            defpackage.drz.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.CensusStatsModule$1", "parseBytes", "Failed to parse stats header", e);
            return this.b.a();
        }
    }
}
