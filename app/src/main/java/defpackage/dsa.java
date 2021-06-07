package defpackage;

import java.util.logging.Level;

/* access modifiers changed from: package-private */
/* renamed from: dsa  reason: default package */
/* compiled from: PG */
public final class dsa implements dox {
    private final /* synthetic */ ebp a;
    private final /* synthetic */ ebm b;

    dsa(ebp ebp, ebm ebm) {
        this.a = ebp;
        this.b = ebm;
    }

    /* access modifiers changed from: private */
    public final byte[] a(ebi ebi) {
        try {
            return this.a.a(ebi);
        } catch (ebq e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final ebi a(byte[] bArr) {
        try {
            return this.a.a(bArr);
        } catch (Exception e) {
            drz.a.logp(Level.FINE, "io.grpc.internal.CensusStatsModule$1", "parseBytes", "Failed to parse stats header", (Throwable) e);
            return this.b.a();
        }
    }
}
