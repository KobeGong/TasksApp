package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: dww  reason: default package */
/* compiled from: PG */
public final class dww extends dop {
    public dvq a;
    private final Object b = new Object();
    private boolean c;
    private ScheduledFuture d;
    private final /* synthetic */ dwf e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    dww(dwf dwf, dmv dmv) {
        super((byte) 0);
        this.e = dwf;
        cld.a(dmv, "attrs");
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.dop
    public final dtb c() {
        return this.a.a();
    }

    @Override // defpackage.dop
    public final void a() {
        synchronized (this.b) {
            if (!this.c) {
                this.c = true;
            } else if (this.e.B && this.d != null) {
                this.d.cancel(false);
                this.d = null;
            } else {
                return;
            }
            if (!this.e.B) {
                this.d = this.e.h.a().schedule(new dwc(new dwx(this)), 5, TimeUnit.SECONDS);
            } else {
                this.a.a(dwf.b);
            }
        }
    }

    @Override // defpackage.dop
    public final void b() {
        this.a.a();
    }

    public final String toString() {
        return this.a.b.toString();
    }
}
