package defpackage;

/* renamed from: dsz  reason: default package */
/* compiled from: PG */
final class dsz implements Runnable {
    private final long a;
    private final /* synthetic */ dsq b;

    dsz(dsq dsq, long j) {
        this.b = dsq;
        this.a = j;
    }

    public final void run() {
        this.b.e.b(dpw.e.b(String.format("deadline exceeded after %dns", Long.valueOf(this.a))));
    }
}
