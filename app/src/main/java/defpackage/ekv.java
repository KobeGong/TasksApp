package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ekv  reason: default package */
/* compiled from: PG */
public final class ekv extends ejc {
    private final ejc a;

    public ekv(ejc ejc) {
        super(ejc.a());
        this.a = ejc;
    }

    @Override // defpackage.ejc
    public final void a(ejb ejb) {
        this.a.a(ejb);
    }

    @Override // defpackage.ejc
    public final Executor a() {
        return this.a.a();
    }
}
