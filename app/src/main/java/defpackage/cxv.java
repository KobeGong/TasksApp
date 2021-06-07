package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: cxv  reason: default package */
/* compiled from: PG */
final class cxv extends cxw {
    private final Callable d;
    private final /* synthetic */ cxu e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cxv(cxu cxu, Callable callable, Executor executor) {
        super(cxu, executor);
        this.e = cxu;
        this.d = (Callable) cld.a(callable);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cyg
    public final Object a() {
        this.b = false;
        return this.d.call();
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cxw
    public final void a(Object obj) {
        this.e.a(obj);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cyg
    public final String b() {
        return this.d.toString();
    }
}
