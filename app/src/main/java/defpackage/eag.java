package defpackage;

/* renamed from: eag reason: default package */
/* compiled from: PG */
final class eag implements java.util.concurrent.Executor {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.eag.class.getName());
    public final java.util.concurrent.BlockingQueue b = new java.util.concurrent.LinkedBlockingQueue();

    eag() {
    }

    public final void execute(java.lang.Runnable runnable) {
        this.b.add(runnable);
    }
}
