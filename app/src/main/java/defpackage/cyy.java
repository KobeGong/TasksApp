package defpackage;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: cyy  reason: default package */
/* compiled from: PG */
public final class cyy extends cyg {
    private final Callable a;
    private final /* synthetic */ cyx b;

    cyy(cyx cyx, Callable callable) {
        this.b = cyx;
        this.a = (Callable) cld.a(callable);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cyg
    public final boolean c() {
        return this.b.isDone();
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cyg
    public final Object a() {
        return this.a.call();
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cyg
    public final void a(Object obj, Throwable th) {
        if (th == null) {
            this.b.a(obj);
        } else {
            this.b.a(th);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cyg
    public final String b() {
        return this.a.toString();
    }
}
