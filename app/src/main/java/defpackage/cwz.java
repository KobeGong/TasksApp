package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: cwz  reason: default package */
/* compiled from: PG */
public class cwz extends cyf {
    public static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger b = Logger.getLogger(cwz.class.getName());
    public static final cxa c;
    public static final Object d = new Object();
    public volatile cxe listeners;
    public volatile Object value;
    public volatile cxl waiters;

    private final void a(cxl cxl) {
        cxl.thread = null;
        while (true) {
            cxl cxl2 = this.waiters;
            if (cxl2 != cxl.a) {
                cxl cxl3 = null;
                while (cxl2 != null) {
                    cxl cxl4 = cxl2.next;
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
        super((byte) 0);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        long j2;
        long j3;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) && (!(obj instanceof cxg))) {
            return b(obj);
        }
        if (nanos > 0) {
            j2 = System.nanoTime() + nanos;
        } else {
            j2 = 0;
        }
        if (nanos >= 1000) {
            cxl cxl = this.waiters;
            if (cxl != cxl.a) {
                cxl cxl2 = new cxl((byte) 0);
                do {
                    cxl2.a(cxl);
                    if (c.a(this, cxl, cxl2)) {
                        j3 = nanos;
                        do {
                            LockSupport.parkNanos(this, j3);
                            if (Thread.interrupted()) {
                                a(cxl2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof cxg))) {
                                return b(obj2);
                            }
                            j3 = j2 - System.nanoTime();
                        } while (j3 >= 1000);
                        a(cxl2);
                    } else {
                        cxl = this.waiters;
                    }
                } while (cxl != cxl.a);
            }
            return b(this.value);
        }
        j3 = nanos;
        while (j3 > 0) {
            Object obj3 = this.value;
            if ((obj3 != null) && (!(obj3 instanceof cxg))) {
                return b(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            j3 = j2 - System.nanoTime();
        }
        String cwz = toString();
        if (isDone()) {
            String b2 = cky.b(timeUnit.toString());
            throw new TimeoutException(new StringBuilder(String.valueOf(b2).length() + 68).append("Waited ").append(j).append(" ").append(b2).append(" but future completed as timeout expired").toString());
        }
        String b3 = cky.b(timeUnit.toString());
        throw new TimeoutException(new StringBuilder(String.valueOf(b3).length() + 33 + String.valueOf(cwz).length()).append("Waited ").append(j).append(" ").append(b3).append(" for ").append(cwz).toString());
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        boolean z;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof cxg))) {
            return b(obj2);
        }
        cxl cxl = this.waiters;
        if (cxl != cxl.a) {
            cxl cxl2 = new cxl((byte) 0);
            do {
                cxl2.a(cxl);
                if (c.a(this, cxl, cxl2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            a(cxl2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                        if (obj != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } while (!(z & (!(obj instanceof cxg))));
                    return b(obj);
                }
                cxl = this.waiters;
            } while (cxl != cxl.a);
        }
        return b(this.value);
    }

    private static Object b(Object obj) {
        if (obj instanceof cxb) {
            Throwable th = ((cxb) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof cxc) {
            throw new ExecutionException(((cxc) obj).b);
        } else if (obj == d) {
            return null;
        } else {
            return obj;
        }
    }

    public boolean isDone() {
        boolean z = true;
        Object obj = this.value;
        boolean z2 = obj != null;
        if (obj instanceof cxg) {
            z = false;
        }
        return z2 & z;
    }

    public boolean isCancelled() {
        return this.value instanceof cxb;
    }

    public boolean cancel(boolean z) {
        cxb cxb;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof cxg)) {
            return false;
        }
        if (a) {
            cxb = new cxb(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            cxb = cxb.a;
        } else {
            cxb = cxb.b;
        }
        Object obj2 = obj;
        boolean z2 = false;
        while (true) {
            if (c.a(this, obj2, cxb)) {
                if (z) {
                    this.a();
                }
                a(this);
                if (!(obj2 instanceof cxg)) {
                    return true;
                }
                cyi cyi = ((cxg) obj2).b;
                if (cyi instanceof cxi) {
                    cwz cwz = (cwz) cyi;
                    Object obj3 = cwz.value;
                    if (!(obj3 == null) && !(obj3 instanceof cxg)) {
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
                if (!(obj2 instanceof cxg)) {
                    return z2;
                }
            }
        }
    }

    public void a() {
    }

    /* access modifiers changed from: protected */
    public final boolean b() {
        Object obj = this.value;
        return (obj instanceof cxb) && ((cxb) obj).c;
    }

    @Override // defpackage.cyi
    public final void a(Runnable runnable, Executor executor) {
        cld.a(runnable, "Runnable was null.");
        cld.a(executor, "Executor was null.");
        cxe cxe = this.listeners;
        if (cxe != cxe.a) {
            cxe cxe2 = new cxe(runnable, executor);
            do {
                cxe2.next = cxe;
                if (!c.a(this, cxe, cxe2)) {
                    cxe = this.listeners;
                } else {
                    return;
                }
            } while (cxe != cxe.a);
        }
        b(runnable, executor);
    }

    public boolean a(Object obj) {
        if (obj == null) {
            obj = d;
        }
        if (!c.a(this, (Object) null, obj)) {
            return false;
        }
        a(this);
        return true;
    }

    public boolean a(Throwable th) {
        if (!c.a(this, (Object) null, new cxc((Throwable) cld.a((Object) th)))) {
            return false;
        }
        a(this);
        return true;
    }

    private static Object a(cyi cyi) {
        Object cxc;
        cxb cxb;
        if (cyi instanceof cxi) {
            Object obj = ((cwz) cyi).value;
            if (!(obj instanceof cxb)) {
                return obj;
            }
            cxb cxb2 = (cxb) obj;
            if (!cxb2.c) {
                return obj;
            }
            if (cxb2.d != null) {
                cxb = new cxb(false, cxb2.d);
            } else {
                cxb = cxb.b;
            }
            return cxb;
        }
        try {
            cxc = cyd.b(cyi);
            if (cxc == null) {
                cxc = d;
            }
        } catch (ExecutionException e) {
            cxc = new cxc(e.getCause());
        } catch (CancellationException e2) {
            cxc = new cxb(false, e2);
        } catch (Throwable th) {
            cxc = new cxc(th);
        }
        return cxc;
    }

    private static void a(cwz cwz) {
        cxe cxe;
        cxe cxe2 = null;
        while (true) {
            cxl cxl = cwz.waiters;
            if (c.a(cwz, cxl, cxl.a)) {
                while (cxl != null) {
                    Thread thread = cxl.thread;
                    if (thread != null) {
                        cxl.thread = null;
                        LockSupport.unpark(thread);
                    }
                    cxl = cxl.next;
                }
                cwz.c();
                do {
                    cxe = cwz.listeners;
                } while (!c.a(cwz, cxe, cxe.a));
                cxe cxe3 = cxe;
                cxe cxe4 = cxe2;
                while (cxe3 != null) {
                    cxe cxe5 = cxe3.next;
                    cxe3.next = cxe4;
                    cxe4 = cxe3;
                    cxe3 = cxe5;
                }
                cxe cxe6 = cxe4;
                while (cxe6 != null) {
                    cxe cxe7 = cxe6.next;
                    Runnable runnable = cxe6.b;
                    if (runnable instanceof cxg) {
                        cxg cxg = (cxg) runnable;
                        cwz = cxg.a;
                        if (cwz.value == cxg) {
                            if (c.a(cwz, cxg, a(cxg.b))) {
                                cxe2 = cxe7;
                            }
                        }
                        cxe6 = cxe7;
                    } else {
                        b(runnable, cxe6.c);
                        cxe6 = cxe7;
                    }
                }
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    public String toString() {
        String sb;
        StringBuilder append = new StringBuilder().append(super.toString()).append("[status=");
        if (isCancelled()) {
            append.append("CANCELLED");
        } else if (isDone()) {
            a(append);
        } else {
            try {
                sb = d();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(e.getClass());
                sb = new StringBuilder(String.valueOf(valueOf).length() + 38).append("Exception thrown from implementation: ").append(valueOf).toString();
            }
            if (!crx.a(sb)) {
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
    public String d() {
        Object obj = this.value;
        if (obj instanceof cxg) {
            String c2 = c(((cxg) obj).b);
            return new StringBuilder(String.valueOf(c2).length() + 12).append("setFuture=[").append(c2).append("]").toString();
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return new StringBuilder(41).append("remaining delay=[").append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS)).append(" ms]").toString();
        }
    }

    private final void a(StringBuilder sb) {
        try {
            sb.append("SUCCESS, result=[").append(c(cyd.b(this))).append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[").append(e.getCause()).append("]");
        } catch (CancellationException e2) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[").append(e3.getClass()).append(" thrown from get()]");
        }
    }

    private final String c(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    private static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = b;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length()).append("RuntimeException while executing runnable ").append(valueOf).append(" with executor ").append(valueOf2).toString(), (Throwable) e);
        }
    }

    static {
        Throwable th;
        cxa cxh;
        Throwable th2 = null;
        try {
            cxh = new cxj();
            th = null;
        } catch (Throwable th3) {
            th2 = th3;
            th = th;
            cxh = new cxh();
        }
        c = cxh;
        if (th2 != null) {
            b.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            b.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }
}
