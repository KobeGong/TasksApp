package defpackage;

import java.util.logging.Level;

/* access modifiers changed from: package-private */
/* renamed from: dsh  reason: default package */
/* compiled from: PG */
public final class dsh implements dox {
    private final /* synthetic */ ecv a;

    dsh(ecv ecv) {
        this.a = ecv;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final ecf a(byte[] bArr) {
        try {
            return this.a.a(bArr);
        } catch (Exception e) {
            dsg.a.logp(Level.FINE, "io.grpc.internal.CensusTracingModule$1", "parseBytes", "Failed to parse tracing header", (Throwable) e);
            return ecf.c;
        }
    }

    @Override // defpackage.dox
    public final /* synthetic */ byte[] a(Object obj) {
        return this.a.a((ecf) obj);
    }
}
