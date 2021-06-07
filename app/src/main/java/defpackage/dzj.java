package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: dzj  reason: default package */
/* compiled from: PG */
public final class dzj implements Runnable {
    private final /* synthetic */ dzk a;
    private final /* synthetic */ dzl b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ dzi d;

    dzj(dzi dzi, dzk dzk, dzl dzl, Object obj) {
        this.d = dzi;
        this.a = dzk;
        this.b = dzl;
        this.c = obj;
    }

    public final void run() {
        synchronized (this.d) {
            if (this.a.b == 0) {
                this.b.a(this.c);
                this.d.b.remove(this.b);
                if (this.d.b.isEmpty()) {
                    this.d.c.shutdown();
                    this.d.c = null;
                }
            }
        }
    }
}
