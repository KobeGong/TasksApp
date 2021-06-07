package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: cye  reason: default package */
/* compiled from: PG */
public final class cye {
    private final boolean a = false;
    private final csp b;

    public cye(csp csp) {
        this.b = csp;
    }

    public final cyi a(Callable callable, Executor executor) {
        return new cxu(this.b, false, executor, callable);
    }
}
