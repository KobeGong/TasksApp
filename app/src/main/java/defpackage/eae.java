package defpackage;

/* renamed from: eae reason: default package */
/* compiled from: PG */
public final class eae {
    private static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.eae.class.getName());

    private eae() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032 A[SYNTHETIC, Splitter:B:8:0x0032] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object a(defpackage.dnc r9, defpackage.dpb r10, defpackage.dna r11, java.lang.Object r12) {
        /*
            eag r6 = new eag
            r6.<init>()
            dna r0 = new dna
            r0.<init>(r11)
            r0.c = r6
            dnd r7 = r9.a(r10, r0)
            eaf r8 = new eaf     // Catch:{ RuntimeException -> 0x004e, Error -> 0x005a }
            r8.<init>(r7)     // Catch:{ RuntimeException -> 0x004e, Error -> 0x005a }
            eah r0 = new eah     // Catch:{ RuntimeException -> 0x004e, Error -> 0x005a }
            r0.<init>(r8)     // Catch:{ RuntimeException -> 0x004e, Error -> 0x005a }
            dor r1 = new dor     // Catch:{ RuntimeException -> 0x004e, Error -> 0x005a }
            r1.<init>()     // Catch:{ RuntimeException -> 0x004e, Error -> 0x005a }
            r7.a(r0, r1)     // Catch:{ RuntimeException -> 0x004e, Error -> 0x005a }
            r0 = 2
            r7.a(r0)     // Catch:{ RuntimeException -> 0x004e, Error -> 0x005a }
            r7.a(r12)     // Catch:{ RuntimeException -> 0x0048, Error -> 0x0054 }
            r7.a()     // Catch:{ RuntimeException -> 0x0048, Error -> 0x0054 }
        L_0x002c:
            boolean r0 = r8.isDone()     // Catch:{ RuntimeException -> 0x004e, Error -> 0x005a }
            if (r0 != 0) goto L_0x0088
            java.util.concurrent.BlockingQueue r0 = r6.b     // Catch:{ InterruptedException -> 0x006f }
            java.lang.Object r0 = r0.take()     // Catch:{ InterruptedException -> 0x006f }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ InterruptedException -> 0x006f }
        L_0x003a:
            if (r0 == 0) goto L_0x002c
            r0.run()     // Catch:{ Throwable -> 0x0060 }
        L_0x003f:
            java.util.concurrent.BlockingQueue r0 = r6.b     // Catch:{ InterruptedException -> 0x006f }
            java.lang.Object r0 = r0.poll()     // Catch:{ InterruptedException -> 0x006f }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ InterruptedException -> 0x006f }
            goto L_0x003a
        L_0x0048:
            r0 = move-exception
            java.lang.RuntimeException r0 = a(r7, r0)     // Catch:{ RuntimeException -> 0x004e, Error -> 0x005a }
            throw r0     // Catch:{ RuntimeException -> 0x004e, Error -> 0x005a }
        L_0x004e:
            r0 = move-exception
            java.lang.RuntimeException r0 = a(r7, r0)
            throw r0
        L_0x0054:
            r0 = move-exception
            java.lang.RuntimeException r0 = a(r7, r0)     // Catch:{ RuntimeException -> 0x004e, Error -> 0x005a }
            throw r0     // Catch:{ RuntimeException -> 0x004e, Error -> 0x005a }
        L_0x005a:
            r0 = move-exception
            java.lang.RuntimeException r0 = a(r7, r0)
            throw r0
        L_0x0060:
            r5 = move-exception
            java.util.logging.Logger r0 = defpackage.eag.a     // Catch:{ InterruptedException -> 0x006f }
            java.util.logging.Level r1 = java.util.logging.Level.WARNING     // Catch:{ InterruptedException -> 0x006f }
            java.lang.String r2 = "io.grpc.stub.ClientCalls$ThreadlessExecutor"
            java.lang.String r3 = "waitAndDrain"
            java.lang.String r4 = "Runnable threw exception"
            r0.logp(r1, r2, r3, r4, r5)     // Catch:{ InterruptedException -> 0x006f }
            goto L_0x003f
        L_0x006f:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ RuntimeException -> 0x004e, Error -> 0x005a }
            r1.interrupt()     // Catch:{ RuntimeException -> 0x004e, Error -> 0x005a }
            dpw r1 = defpackage.dpw.c     // Catch:{ RuntimeException -> 0x004e, Error -> 0x005a }
            java.lang.String r2 = "Call was interrupted"
            dpw r1 = r1.a(r2)     // Catch:{ RuntimeException -> 0x004e, Error -> 0x005a }
            dpw r0 = r1.b(r0)     // Catch:{ RuntimeException -> 0x004e, Error -> 0x005a }
            dqb r0 = r0.b()     // Catch:{ RuntimeException -> 0x004e, Error -> 0x005a }
            throw r0     // Catch:{ RuntimeException -> 0x004e, Error -> 0x005a }
        L_0x0088:
            java.lang.Object r0 = a(r8)     // Catch:{ RuntimeException -> 0x004e, Error -> 0x005a }
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eae.a(dnc, dpb, dna, java.lang.Object):java.lang.Object");
    }

    private static java.lang.Object a(java.util.concurrent.Future future) {
        defpackage.dqb b;
        try {
            return future.get();
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            throw defpackage.dpw.c.a("Call was interrupted").b((java.lang.Throwable) e).b();
        } catch (java.util.concurrent.ExecutionException e2) {
            java.lang.Throwable cause = e2.getCause();
            java.lang.Throwable th = (java.lang.Throwable) defpackage.cld.a((java.lang.Object) cause, (java.lang.Object) "t");
            while (true) {
                if (th == null) {
                    b = defpackage.dpw.d.a("unexpected exception").b(cause).b();
                    break;
                } else if (th instanceof defpackage.dqa) {
                    b = new defpackage.dqb(((defpackage.dqa) th).a, null);
                    break;
                } else if (th instanceof defpackage.dqb) {
                    defpackage.dqb dqb = (defpackage.dqb) th;
                    b = new defpackage.dqb(dqb.a, dqb.b);
                    break;
                } else {
                    th = th.getCause();
                }
            }
            throw b;
        }
    }

    private static java.lang.RuntimeException a(defpackage.dnd dnd, java.lang.Throwable th) {
        try {
            dnd.a((java.lang.String) null, th);
        } catch (Throwable th2) {
            a.logp(java.util.logging.Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", th2);
        }
        if (th instanceof java.lang.RuntimeException) {
            throw ((java.lang.RuntimeException) th);
        } else if (th instanceof java.lang.Error) {
            throw ((java.lang.Error) th);
        } else {
            throw new java.lang.AssertionError(th);
        }
    }
}
