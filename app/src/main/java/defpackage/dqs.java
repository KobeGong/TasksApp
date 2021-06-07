package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* access modifiers changed from: package-private */
/* renamed from: dqs  reason: default package */
/* compiled from: PG */
public final class dqs implements dva {
    private boolean a;
    private final dzo b;
    private byte[] c;
    private final /* synthetic */ dqr d;

    public dqs(dqr dqr, dor dor, dzo dzo) {
        this.d = dqr;
        cld.a(dor, "headers");
        this.b = (dzo) cld.a(dzo, "statsTraceCtx");
    }

    @Override // defpackage.dva
    public final void a(InputStream inputStream) {
        cld.b(this.c == null, "writePayload should not be called multiple times");
        try {
            this.c = dtj.a(inputStream);
            this.b.a();
            this.b.a(0, (long) this.c.length, (long) this.c.length);
            this.b.a((long) this.c.length);
            this.b.b((long) this.c.length);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.dva
    public final void a() {
    }

    @Override // defpackage.dva
    public final boolean b() {
        return this.a;
    }

    @Override // defpackage.dva
    public final void c() {
        boolean z = true;
        this.a = true;
        if (this.c == null) {
            z = false;
        }
        cld.b(z, "Lack of request message. GET request is only supported for unary requests");
        this.d.a().a(this.c);
        this.c = null;
    }

    @Override // defpackage.dva
    public final dva a(doa doa) {
        return this;
    }

    @Override // defpackage.dva
    public final void a(int i) {
    }
}
