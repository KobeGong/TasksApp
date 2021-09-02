package defpackage;

/* renamed from: dzj reason: default package */
/* compiled from: PG */
final class dzj implements java.lang.Runnable {
    private final /* synthetic */ defpackage.dzk a;
    private final /* synthetic */ defpackage.dzl b;
    private final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ defpackage.dzi d;

    dzj(defpackage.dzi dzi, defpackage.dzk dzk, defpackage.dzl dzl, java.lang.Object obj) {
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
