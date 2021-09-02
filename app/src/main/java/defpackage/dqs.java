package defpackage;

/* renamed from: dqs reason: default package */
/* compiled from: PG */
final class dqs implements defpackage.dva {
    private boolean a;
    private final defpackage.dzo b;
    private byte[] c;
    private final /* synthetic */ defpackage.dqr d;

    public dqs(defpackage.dqr dqr, defpackage.dor dor, defpackage.dzo dzo) {
        this.d = dqr;
        defpackage.cld.a((java.lang.Object) dor, (java.lang.Object) "headers");
        this.b = (defpackage.dzo) defpackage.cld.a((java.lang.Object) dzo, (java.lang.Object) "statsTraceCtx");
    }

    public final void a(java.io.InputStream inputStream) {
        defpackage.cld.b(this.c == null, (java.lang.Object) "writePayload should not be called multiple times");
        try {
            this.c = defpackage.dtj.a(inputStream);
            this.b.a();
            this.b.a(0, (long) this.c.length, (long) this.c.length);
            this.b.a((long) this.c.length);
            this.b.b((long) this.c.length);
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public final void a() {
    }

    public final boolean b() {
        return this.a;
    }

    public final void c() {
        boolean z = true;
        this.a = true;
        if (this.c == null) {
            z = false;
        }
        defpackage.cld.b(z, (java.lang.Object) "Lack of request message. GET request is only supported for unary requests");
        this.d.a().a(this.c);
        this.c = null;
    }

    public final defpackage.dva a(defpackage.doa doa) {
        return this;
    }

    public final void a(int i) {
    }
}
