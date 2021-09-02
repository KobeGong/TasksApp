package defpackage;

/* renamed from: cwz reason: default package */
/* compiled from: PG */
public class cwz extends defpackage.cyf {
    public static final boolean a = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final java.util.logging.Logger b = java.util.logging.Logger.getLogger(defpackage.cwz.class.getName());
    public static final defpackage.cxa c;
    public static final java.lang.Object d = new java.lang.Object();
    public volatile defpackage.cxe listeners;
    public volatile java.lang.Object value;
    public volatile defpackage.cxl waiters;

    private final void a(defpackage.cxl cxl) {
        cxl.thread = null;
        while (true) {
            defpackage.cxl cxl2 = this.waiters;
            if (cxl2 != defpackage.cxl.a) {
                defpackage.cxl cxl3 = null;
                while (cxl2 != null) {
                    defpackage.cxl cxl4 = cxl2.next;
                    if (cxl2.thread == null) {
                        if (cxl3 != null) {
                            cxl3.next = cxl4;
                            if (cxl3.thread == null) {
                            }
                        } else if (!c.a(this, cxl2, cxl4)) {
                        }
                        cxl2 = cxl3;
                    }
                    cxl3 = cxl2;
                    cxl2 = cxl4;
                }
                return;
            }
            return;
        }
    }

    public cwz() {
        super(0);
    }

    public java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) {
        long j2;
        long j3;
        long nanos = timeUnit.toNanos(j);
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj = this.value;
        if ((obj != null) && (!(obj instanceof defpackage.cxg))) {
            return b(obj);
        }
        if (nanos > 0) {
            j2 = java.lang.System.nanoTime() + nanos;
        } else {
            j2 = 0;
        }
        if (nanos >= 1000) {
            defpackage.cxl cxl = this.waiters;
            if (cxl != defpackage.cxl.a) {
                defpackage.cxl cxl2 = new defpackage.cxl(0);
                do {
                    cxl2.a(cxl);
                    if (c.a(this, cxl, cxl2)) {
                        j3 = nanos;
                        do {
                            java.util.concurrent.locks.LockSupport.parkNanos(this, j3);
                            if (java.lang.Thread.interrupted()) {
                                a(cxl2);
                                throw new java.lang.InterruptedException();
                            }
                            java.lang.Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof defpackage.cxg))) {
                                return b(obj2);
                            }
                            j3 = j2 - java.lang.System.nanoTime();
                        } while (j3 >= 1000);
                        a(cxl2);
                    } else {
                        cxl = this.waiters;
                    }
                } while (cxl != defpackage.cxl.a);
            }
            return b(this.value);
        }
        j3 = nanos;
        while (j3 > 0) {
            java.lang.Object obj3 = this.value;
            if ((obj3 != null) && (!(obj3 instanceof defpackage.cxg))) {
                return b(obj3);
            }
            if (java.lang.Thread.interrupted()) {
                throw new java.lang.InterruptedException();
            }
            j3 = j2 - java.lang.System.nanoTime();
        }
        java.lang.String cwz = toString();
        if (isDone()) {
            java.lang.String b2 = defpackage.cky.b(timeUnit.toString());
            throw new java.util.concurrent.TimeoutException(new java.lang.StringBuilder(java.lang.String.valueOf(b2).length() + 68).append("Waited ").append(j).append(" ").append(b2).append(" but future completed as timeout expired").toString());
        }
        java.lang.String b3 = defpackage.cky.b(timeUnit.toString());
        throw new java.util.concurrent.TimeoutException(new java.lang.StringBuilder(java.lang.String.valueOf(b3).length() + 33 + java.lang.String.valueOf(cwz).length()).append("Waited ").append(j).append(" ").append(b3).append(" for ").append(cwz).toString());
    }

    public java.lang.Object get() {
        java.lang.Object obj;
        boolean z;
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof defpackage.cxg))) {
            return b(obj2);
        }
        defpackage.cxl cxl = this.waiters;
        if (cxl != defpackage.cxl.a) {
            defpackage.cxl cxl2 = new defpackage.cxl(0);
            do {
                cxl2.a(cxl);
                if (c.a(this, cxl, cxl2)) {
                    do {
                        java.util.concurrent.locks.LockSupport.park(this);
                        if (java.lang.Thread.interrupted()) {
                            a(cxl2);
                            throw new java.lang.InterruptedException();
                        }
                        obj = this.value;
                        if (obj != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } while (!(z & (!(obj instanceof defpackage.cxg))));
                    return b(obj);
                }
                cxl = this.waiters;
            } while (cxl != defpackage.cxl.a);
        }
        return b(this.value);
    }

    private static java.lang.Object b(java.lang.Object obj) {
        if (obj instanceof defpackage.cxb) {
            java.lang.Throwable th = ((defpackage.cxb) obj).d;
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof defpackage.cxc) {
            throw new java.util.concurrent.ExecutionException(((defpackage.cxc) obj).b);
        } else if (obj == d) {
            return null;
        } else {
            return obj;
        }
    }

    public boolean isDone() {
        boolean z = true;
        java.lang.Object obj = this.value;
        boolean z2 = obj != null;
        if (obj instanceof defpackage.cxg) {
            z = false;
        }
        return z2 & z;
    }

    public boolean isCancelled() {
        return this.value instanceof defpackage.cxb;
    }

    public boolean cancel(boolean z) {
        defpackage.cxb cxb;
        java.lang.Object obj = this.value;
        if (!(obj == null) && !(obj instanceof defpackage.cxg)) {
            return false;
        }
        if (a) {
            cxb = new defpackage.cxb(z, new java.util.concurrent.CancellationException("Future.cancel() was called."));
        } else if (z) {
            cxb = defpackage.cxb.a;
        } else {
            cxb = defpackage.cxb.b;
        }
        java.lang.Object obj2 = obj;
        boolean z2 = false;
        while (true) {
            if (c.a(this, obj2, (java.lang.Object) cxb)) {
                if (z) {
                    this.a();
                }
                a(this);
                if (!(obj2 instanceof defpackage.cxg)) {
                    return true;
                }
                defpackage.cyi cyi = ((defpackage.cxg) obj2).b;
                if (cyi instanceof defpackage.cxi) {
                    defpackage.cwz cwz = (defpackage.cwz) cyi;
                    java.lang.Object obj3 = cwz.value;
                    if (!(obj3 == null) && !(obj3 instanceof defpackage.cxg)) {
                        return true;
                    }
                    this = cwz;
                    obj2 = obj3;
                    z2 = true;
                } else {
                    cyi.cancel(z);
                    return true;
                }
            } else {
                obj2 = this.value;
                if (!(obj2 instanceof defpackage.cxg)) {
                    return z2;
                }
            }
        }
    }

    public void a() {
    }

    /* access modifiers changed from: protected */
    public final boolean b() {
        java.lang.Object obj = this.value;
        return (obj instanceof defpackage.cxb) && ((defpackage.cxb) obj).c;
    }

    public final void a(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        defpackage.cld.a((java.lang.Object) runnable, (java.lang.Object) "Runnable was null.");
        defpackage.cld.a((java.lang.Object) executor, (java.lang.Object) "Executor was null.");
        defpackage.cxe cxe = this.listeners;
        if (cxe != defpackage.cxe.a) {
            defpackage.cxe cxe2 = new defpackage.cxe(runnable, executor);
            do {
                cxe2.next = cxe;
                if (!c.a(this, cxe, cxe2)) {
                    cxe = this.listeners;
                } else {
                    return;
                }
            } while (cxe != defpackage.cxe.a);
        }
        b(runnable, executor);
    }

    public boolean a(java.lang.Object obj) {
        if (obj == null) {
            obj = d;
        }
        if (!c.a(this, (java.lang.Object) null, obj)) {
            return false;
        }
        a(this);
        return true;
    }

    public boolean a(java.lang.Throwable th) {
        if (!c.a(this, (java.lang.Object) null, (java.lang.Object) new defpackage.cxc((java.lang.Throwable) defpackage.cld.a((java.lang.Object) th)))) {
            return false;
        }
        a(this);
        return true;
    }

    private static java.lang.Object a(defpackage.cyi cyi) {
        java.lang.Object cxc;
        defpackage.cxb cxb;
        if (cyi instanceof defpackage.cxi) {
            java.lang.Object obj = ((defpackage.cwz) cyi).value;
            if (!(obj instanceof defpackage.cxb)) {
                return obj;
            }
            defpackage.cxb cxb2 = (defpackage.cxb) obj;
            if (!cxb2.c) {
                return obj;
            }
            if (cxb2.d != null) {
                cxb = new defpackage.cxb(false, cxb2.d);
            } else {
                cxb = defpackage.cxb.b;
            }
            return cxb;
        }
        try {
            cxc = defpackage.cyd.b(cyi);
            if (cxc == null) {
                cxc = d;
            }
        } catch (java.util.concurrent.ExecutionException e) {
            cxc = new defpackage.cxc(e.getCause());
        } catch (java.util.concurrent.CancellationException e2) {
            cxc = new defpackage.cxb(false, e2);
        } catch (Throwable th) {
            cxc = new defpackage.cxc(th);
        }
        return cxc;
    }

    private static void a(defpackage.cwz cwz) {
        defpackage.cxe cxe;
        defpackage.cxe cxe2 = null;
        while (true) {
            defpackage.cxl cxl = cwz.waiters;
            if (c.a(cwz, cxl, defpackage.cxl.a)) {
                while (cxl != null) {
                    java.lang.Thread thread = cxl.thread;
                    if (thread != null) {
                        cxl.thread = null;
                        java.util.concurrent.locks.LockSupport.unpark(thread);
                    }
                    cxl = cxl.next;
                }
                cwz.c();
                do {
                    cxe = cwz.listeners;
                } while (!c.a(cwz, cxe, defpackage.cxe.a));
                defpackage.cxe cxe3 = cxe2;
                defpackage.cxe cxe4 = cxe;
                defpackage.cxe cxe5 = cxe3;
                while (cxe4 != null) {
                    defpackage.cxe cxe6 = cxe4.next;
                    cxe4.next = cxe5;
                    cxe5 = cxe4;
                    cxe4 = cxe6;
                }
                defpackage.cxe cxe7 = cxe5;
                while (cxe7 != null) {
                    defpackage.cxe cxe8 = cxe7.next;
                    java.lang.Runnable runnable = cxe7.b;
                    if (runnable instanceof defpackage.cxg) {
                        defpackage.cxg cxg = (defpackage.cxg) runnable;
                        cwz = cxg.a;
                        if (cwz.value == cxg) {
                            if (c.a(cwz, (java.lang.Object) cxg, a(cxg.b))) {
                                cxe2 = cxe8;
                            }
                        }
                        cxe7 = cxe8;
                    } else {
                        b(runnable, cxe7.c);
                        cxe7 = cxe8;
                    }
                }
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    public java.lang.String toString() {
        java.lang.String sb;
        java.lang.StringBuilder append = new java.lang.StringBuilder().append(super.toString()).append("[status=");
        if (isCancelled()) {
            append.append("CANCELLED");
        } else if (isDone()) {
            a(append);
        } else {
            try {
                sb = d();
            } catch (java.lang.RuntimeException e) {
                java.lang.String valueOf = java.lang.String.valueOf(e.getClass());
                sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 38).append("Exception thrown from implementation: ").append(valueOf).toString();
            }
            if (!defpackage.crx.a(sb)) {
                append.append("PENDING, info=[").append(sb).append("]");
            } else if (isDone()) {
                a(append);
            } else {
                append.append("PENDING");
            }
        }
        return append.append("]").toString();
    }

    /* access modifiers changed from: protected */
    public java.lang.String d() {
        java.lang.Object obj = this.value;
        if (obj instanceof defpackage.cxg) {
            java.lang.String c2 = c(((defpackage.cxg) obj).b);
            return new java.lang.StringBuilder(java.lang.String.valueOf(c2).length() + 12).append("setFuture=[").append(c2).append("]").toString();
        } else if (!(this instanceof java.util.concurrent.ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    private final void a(java.lang.StringBuilder sb) {
        try {
            sb.append("SUCCESS, result=[").append(c(defpackage.cyd.b(this))).append("]");
        } catch (java.util.concurrent.ExecutionException e) {
            sb.append("FAILURE, cause=[").append(e.getCause()).append("]");
        } catch (java.util.concurrent.CancellationException e2) {
            sb.append("CANCELLED");
        } catch (java.lang.RuntimeException e3) {
            sb.append("UNKNOWN, cause=[").append(e3.getClass()).append(" thrown from get()]");
        }
    }

    private final java.lang.String c(java.lang.Object obj) {
        if (obj == this) {
            return "this future";
        }
        return java.lang.String.valueOf(obj);
    }

    private static void b(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.RuntimeException e) {
            java.lang.String valueOf = java.lang.String.valueOf(runnable);
            java.lang.String valueOf2 = java.lang.String.valueOf(executor);
            b.logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 57 + java.lang.String.valueOf(valueOf2).length()).append("RuntimeException while executing runnable ").append(valueOf).append(" with executor ").append(valueOf2).toString(), e);
        }
    }

    static {
        java.lang.Throwable th;
        defpackage.cxa cxh;
        java.lang.Throwable th2 = null;
        try {
            cxh = new defpackage.cxj();
            th = null;
        } catch (Throwable th3) {
            th2 = th3;
            th = th;
            cxh = new defpackage.cxh();
        }
        c = cxh;
        if (th2 != null) {
            b.logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            b.logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }
}
