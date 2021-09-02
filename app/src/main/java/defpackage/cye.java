package defpackage;

/* renamed from: cye reason: default package */
/* compiled from: PG */
public final class cye {
    private final boolean a = false;
    private final defpackage.csp b;

    public cye(defpackage.csp csp) {
        this.b = csp;
    }

    public final defpackage.cyi a(java.util.concurrent.Callable callable, java.util.concurrent.Executor executor) {
        return new defpackage.cxu(this.b, false, executor, callable);
    }
}
