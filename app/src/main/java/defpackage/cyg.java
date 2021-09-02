package defpackage;

/* renamed from: cyg reason: default package */
/* compiled from: PG */
abstract class cyg extends java.util.concurrent.atomic.AtomicReference implements java.lang.Runnable {
    private static final java.lang.Runnable a = new defpackage.cyh();
    private static final java.lang.Runnable b = new defpackage.cyh();

    cyg() {
    }

    /* access modifiers changed from: 0000 */
    public abstract java.lang.Object a();

    /* access modifiers changed from: 0000 */
    public abstract void a(java.lang.Object obj, java.lang.Throwable th);

    /* access modifiers changed from: 0000 */
    public abstract java.lang.String b();

    /* access modifiers changed from: 0000 */
    public abstract boolean c();

    public final void run() {
        java.lang.Object obj;
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            boolean z = !c();
            if (z) {
                try {
                    obj = a();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, a)) {
                        while (get() == b) {
                            java.lang.Thread.yield();
                        }
                    }
                    if (z) {
                        a(null, null);
                    }
                    throw th;
                }
            } else {
                obj = null;
            }
            if (!compareAndSet(currentThread, a)) {
                while (get() == b) {
                    java.lang.Thread.yield();
                }
            }
            if (z) {
                a(obj, null);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        java.lang.Runnable runnable = (java.lang.Runnable) get();
        if ((runnable instanceof java.lang.Thread) && compareAndSet(runnable, b)) {
            ((java.lang.Thread) runnable).interrupt();
            set(a);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.Runnable runnable = (java.lang.Runnable) get();
        if (runnable == a) {
            str = "running=[DONE]";
        } else if (runnable == b) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof java.lang.Thread) {
            java.lang.String name = ((java.lang.Thread) runnable).getName();
            str = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 21).append("running=[RUNNING ON ").append(name).append("]").toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        java.lang.String b2 = b();
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 2 + java.lang.String.valueOf(b2).length()).append(str).append(", ").append(b2).toString();
    }
}
