package defpackage;

/* renamed from: ad reason: default package */
/* compiled from: PG */
final class ad implements java.lang.Runnable {
    private final /* synthetic */ defpackage.ac a;

    ad(defpackage.ac acVar) {
        this.a = acVar;
    }

    public final void run() {
        java.lang.Object obj;
        synchronized (this.a.a) {
            obj = this.a.e;
            this.a.e = defpackage.ac.b;
        }
        this.a.a(obj);
    }
}
