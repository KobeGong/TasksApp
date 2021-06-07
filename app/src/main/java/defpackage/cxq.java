package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
/* renamed from: cxq  reason: default package */
/* compiled from: PG */
public abstract class cxq {
    private static final Logger a = Logger.getLogger(cxq.class.getName());
    public static final cxr d;
    public volatile int remaining;
    public volatile Set seenExceptions = null;

    cxq(int i) {
        this.remaining = i;
    }

    /* access modifiers changed from: package-private */
    public abstract void a(Set set);

    static {
        cxr cxt;
        Throwable th = null;
        try {
            cxt = new cxs(AtomicReferenceFieldUpdater.newUpdater(cxq.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(cxq.class, "remaining"));
        } catch (Throwable th2) {
            th = th2;
            cxt = new cxt();
        }
        d = cxt;
        if (th != null) {
            a.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }
}
