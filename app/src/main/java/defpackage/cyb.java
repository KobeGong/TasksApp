package defpackage;

import java.util.concurrent.Executor;

/* renamed from: cyb  reason: default package */
/* compiled from: PG */
public abstract class cyb extends cya implements cyi {
    protected cyb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract cyi c();

    @Override // defpackage.cyi
    public final void a(Runnable runnable, Executor executor) {
        c().a(runnable, executor);
    }
}
