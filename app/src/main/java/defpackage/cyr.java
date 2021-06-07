package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* renamed from: cyr  reason: default package */
/* compiled from: PG */
public final class cyr implements Executor {
    public static final Logger a = Logger.getLogger(cyr.class.getName());
    public final Deque b = new ArrayDeque();
    public long c = 0;
    private final Executor d;
    private int e = bg.ag;
    private final cyt f = new cyt(this);

    public cyr(Executor executor) {
        this.d = (Executor) cld.a(executor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r6.d.execute(r6.f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r6.e != defpackage.bg.ah) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        r1 = r6.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        if (r6.c != r2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        if (r6.e != defpackage.bg.ah) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        r6.e = defpackage.bg.ai;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0055, code lost:
        monitor-enter(r6.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005a, code lost:
        if (r6.e == defpackage.bg.ag) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006a, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006d, code lost:
        if ((r0 instanceof java.util.concurrent.RejectedExecutionException) == false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0071, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0075, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void execute(java.lang.Runnable r7) {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyr.execute(java.lang.Runnable):void");
    }
}
