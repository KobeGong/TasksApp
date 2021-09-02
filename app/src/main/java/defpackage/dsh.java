package defpackage;

/* renamed from: dsh reason: default package */
/* compiled from: PG */
final class dsh implements defpackage.dox {
    private final /* synthetic */ defpackage.ecv a;

    dsh(defpackage.ecv ecv) {
        this.a = ecv;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final defpackage.ecf a(byte[] bArr) {
        try {
            return this.a.a(bArr);
        } catch (java.lang.Exception e) {
            defpackage.dsg.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.CensusTracingModule$1", "parseBytes", "Failed to parse tracing header", e);
            return defpackage.ecf.c;
        }
    }

    public final /* synthetic */ byte[] a(java.lang.Object obj) {
        return this.a.a((defpackage.ecf) obj);
    }
}
