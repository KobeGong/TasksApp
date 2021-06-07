package defpackage;

import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.concurrent.Executor;

/* renamed from: dqk  reason: default package */
/* compiled from: PG */
public final class dqk extends dqr {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0);
    public final String b;
    public final String c;
    public final Executor d;
    public final dor e;
    public final dqo f;
    public final Runnable g;
    public final boolean h;
    public ehp i;
    public final boolean j;
    public final Object k;
    public final Collection l;
    public final dqn m;
    public dqj n;
    private final dqt p = new dqt(this);

    dqk(String str, String str2, Executor executor, dor dor, dqo dqo, Runnable runnable, Object obj, int i2, boolean z, dpb dpb, dzo dzo, dna dna, dzt dzt) {
        super(new dzy(), dzo, dzt, dor, dpb.g);
        this.b = (String) cld.a(str, "url");
        this.c = (String) cld.a(str2, "userAgent");
        this.d = (Executor) cld.a(executor, "executor");
        this.e = (dor) cld.a(dor, "headers");
        this.f = (dqo) cld.a(dqo, "transport");
        this.g = (Runnable) cld.a(runnable, "startCallback");
        this.h = dpb.f || z;
        this.j = dpb.a == dpe.UNARY;
        this.k = dna.a(dqg.a);
        this.l = (Collection) dna.a(dqg.b);
        this.m = new dqn(this, i2, dzo, obj, dzt);
    }

    @Override // defpackage.dta
    public final void a(String str) {
        throw new UnsupportedOperationException("Cronet does not support overriding authority");
    }

    /* access modifiers changed from: package-private */
    public final void a(dpw dpw) {
        this.f.a(this, dpw);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dqr
    public final /* synthetic */ dqt a() {
        return this.p;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dqr
    public final /* synthetic */ dri b() {
        return this.m;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dqr, defpackage.dqy
    public final /* synthetic */ dri c() {
        return this.m;
    }
}
