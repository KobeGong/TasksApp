package defpackage;

/* renamed from: dyr reason: default package */
/* compiled from: PG */
final class dyr {
    private final java.util.concurrent.atomic.AtomicLong a = new java.util.concurrent.atomic.AtomicLong();

    dyr() {
    }

    /* access modifiers changed from: 0000 */
    public final long a(long j) {
        return this.a.addAndGet(j);
    }
}
