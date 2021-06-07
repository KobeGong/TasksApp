package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* access modifiers changed from: package-private */
/* renamed from: dyr  reason: default package */
/* compiled from: PG */
public final class dyr {
    private final AtomicLong a = new AtomicLong();

    dyr() {
    }

    /* access modifiers changed from: package-private */
    public final long a(long j) {
        return this.a.addAndGet(j);
    }
}
