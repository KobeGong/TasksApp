package defpackage;

/* renamed from: bjc reason: default package */
/* compiled from: PG */
public final class bjc implements java.util.concurrent.Executor {
    private final android.os.Handler a = new android.os.Handler(null);

    public bjc(android.os.Looper looper) {
    }

    public final void execute(java.lang.Runnable runnable) {
        this.a.post(runnable);
    }
}
