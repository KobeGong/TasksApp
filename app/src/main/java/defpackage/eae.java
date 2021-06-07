package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: eae  reason: default package */
/* compiled from: PG */
public final class eae {
    private static final Logger a = Logger.getLogger(eae.class.getName());

    private eae() {
    }

    public static Object a(dnc dnc, dpb dpb, dna dna, Object obj) {
        eag eag = new eag();
        dna dna2 = new dna(dna);
        dna2.c = eag;
        dnd a2 = dnc.a(dpb, dna2);
        try {
            eaf eaf = new eaf(a2);
            a2.a(new eah(eaf), new dor());
            a2.a(2);
            try {
                a2.a(obj);
                a2.a();
                while (!eaf.isDone()) {
                    try {
                        for (Runnable runnable = (Runnable) eag.b.take(); runnable != null; runnable = (Runnable) eag.b.poll()) {
                            try {
                                runnable.run();
                            } catch (Throwable th) {
                                eag.a.logp(Level.WARNING, "io.grpc.stub.ClientCalls$ThreadlessExecutor", "waitAndDrain", "Runnable threw exception", th);
                            }
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw dpw.c.a("Call was interrupted").b(e).b();
                    }
                }
                return a(eaf);
            } catch (RuntimeException e2) {
                throw a(a2, e2);
            } catch (Error e3) {
                throw a(a2, e3);
            }
        } catch (RuntimeException e4) {
            throw a(a2, e4);
        } catch (Error e5) {
            throw a(a2, e5);
        }
    }

    private static Object a(Future future) {
        try {
            return future.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw dpw.c.a("Call was interrupted").b(e).b();
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            for (Throwable th = (Throwable) cld.a(cause, "t"); th != null; th = th.getCause()) {
                if (th instanceof dqa) {
                    throw new dqb(((dqa) th).a, null);
                } else if (th instanceof dqb) {
                    dqb dqb = (dqb) th;
                    throw new dqb(dqb.a, dqb.b);
                }
            }
            throw dpw.d.a("unexpected exception").b(cause).b();
        }
    }

    private static RuntimeException a(dnd dnd, Throwable th) {
        try {
            dnd.a((String) null, th);
        } catch (Throwable th2) {
            a.logp(Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", th2);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        } else {
            throw new AssertionError(th);
        }
    }
}
