package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* renamed from: drz  reason: default package */
/* compiled from: PG */
public final class drz {
    public static final Logger a = Logger.getLogger(drz.class.getName());
    public static final double b = ((double) TimeUnit.MILLISECONDS.toNanos(1));
    public static final dsc c = new dsc();
    public final ebm d;
    public final eax e;
    public final csd f;
    public final doy g;
    public final boolean h;

    public drz(csd csd) {
        this(ebn.a.a(), ebn.a.b().a(), eav.a.a(), csd);
    }

    private drz(ebm ebm, ebp ebp, eax eax, csd csd) {
        this.d = (ebm) cld.a(ebm, "tagger");
        this.e = (eax) cld.a(eax, "statsRecorder");
        cld.a(ebp, "tagCtxSerializer");
        this.f = (csd) cld.a(csd, "stopwatchSupplier");
        this.h = true;
        this.g = doy.a("grpc-tags-bin", new dsa(ebp, ebm));
    }
}
