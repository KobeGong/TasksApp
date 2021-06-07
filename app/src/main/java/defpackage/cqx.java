package defpackage;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: cqx  reason: default package */
public final /* synthetic */ class cqx implements Callable {
    private final cqv a;

    cqx(cqv cqv) {
        this.a = cqv;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.a();
    }
}
