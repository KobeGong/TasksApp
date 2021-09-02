package defpackage;

/* renamed from: drz reason: default package */
/* compiled from: PG */
public final class drz {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.drz.class.getName());
    public static final double b = ((double) java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(1));
    public static final defpackage.dsc c = new defpackage.dsc();
    public final defpackage.ebm d;
    public final defpackage.eax e;
    public final defpackage.csd f;
    public final defpackage.doy g;
    public final boolean h;

    public drz(defpackage.csd csd) {
        this(defpackage.ebn.a.a(), defpackage.ebn.a.b().a(), defpackage.eav.a.a(), csd);
    }

    private drz(defpackage.ebm ebm, defpackage.ebp ebp, defpackage.eax eax, defpackage.csd csd) {
        this.d = (defpackage.ebm) defpackage.cld.a((java.lang.Object) ebm, (java.lang.Object) "tagger");
        this.e = (defpackage.eax) defpackage.cld.a((java.lang.Object) eax, (java.lang.Object) "statsRecorder");
        defpackage.cld.a((java.lang.Object) ebp, (java.lang.Object) "tagCtxSerializer");
        this.f = (defpackage.csd) defpackage.cld.a((java.lang.Object) csd, (java.lang.Object) "stopwatchSupplier");
        this.h = true;
        this.g = defpackage.doy.a("grpc-tags-bin", (defpackage.dox) new defpackage.dsa(ebp, ebm));
    }
}
