package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* renamed from: dwz  reason: default package */
/* compiled from: PG */
public final class dwz extends duz {
    public static final Logger a = Logger.getLogger(dwz.class.getName());
    private static final ReferenceQueue b = new ReferenceQueue();
    private static final ConcurrentMap c = new ConcurrentHashMap();

    public dwz(dnc dnc) {
        this(dnc, b, c);
    }

    private dwz(dnc dnc, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(dnc);
        new dxa(this, dnc, referenceQueue, concurrentMap);
    }
}
