package defpackage;

/* renamed from: dqk reason: default package */
/* compiled from: PG */
public final class dqk extends defpackage.dqr {
    public static final java.nio.ByteBuffer a = java.nio.ByteBuffer.allocateDirect(0);
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.util.concurrent.Executor d;
    public final defpackage.dor e;
    public final defpackage.dqo f;
    public final java.lang.Runnable g;
    public final boolean h;
    public defpackage.ehp i;
    public final boolean j;
    public final java.lang.Object k;
    public final java.util.Collection l;
    public final defpackage.dqn m;
    public defpackage.dqj n;
    private final defpackage.dqt p = new defpackage.dqt(this);

    dqk(java.lang.String str, java.lang.String str2, java.util.concurrent.Executor executor, defpackage.dor dor, defpackage.dqo dqo, java.lang.Runnable runnable, java.lang.Object obj, int i2, boolean z, defpackage.dpb dpb, defpackage.dzo dzo, defpackage.dna dna, defpackage.dzt dzt) {
        super(new defpackage.dzy(), dzo, dzt, dor, dpb.g);
        this.b = (java.lang.String) defpackage.cld.a((java.lang.Object) str, (java.lang.Object) "url");
        this.c = (java.lang.String) defpackage.cld.a((java.lang.Object) str2, (java.lang.Object) "userAgent");
        this.d = (java.util.concurrent.Executor) defpackage.cld.a((java.lang.Object) executor, (java.lang.Object) "executor");
        this.e = (defpackage.dor) defpackage.cld.a((java.lang.Object) dor, (java.lang.Object) "headers");
        this.f = (defpackage.dqo) defpackage.cld.a((java.lang.Object) dqo, (java.lang.Object) "transport");
        this.g = (java.lang.Runnable) defpackage.cld.a((java.lang.Object) runnable, (java.lang.Object) "startCallback");
        this.h = dpb.f || z;
        this.j = dpb.a == defpackage.dpe.UNARY;
        this.k = dna.a(defpackage.dqg.a);
        this.l = (java.util.Collection) dna.a(defpackage.dqg.b);
        this.m = new defpackage.dqn(this, i2, dzo, obj, dzt);
    }

    public final void a(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("Cronet does not support overriding authority");
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.dpw dpw) {
        this.f.a(this, dpw);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ defpackage.dqt a() {
        return this.p;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ defpackage.dri b() {
        return this.m;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ defpackage.dri c() {
        return this.m;
    }
}
