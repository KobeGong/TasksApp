package defpackage;

/* renamed from: dsz reason: default package */
/* compiled from: PG */
final class dsz implements java.lang.Runnable {
    private final long a;
    private final /* synthetic */ defpackage.dsq b;

    dsz(defpackage.dsq dsq, long j) {
        this.b = dsq;
        this.a = j;
    }

    public final void run() {
        this.b.e.b(defpackage.dpw.e.b(java.lang.String.format("deadline exceeded after %dns", new java.lang.Object[]{java.lang.Long.valueOf(this.a)})));
    }
}
