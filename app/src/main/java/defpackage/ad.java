package defpackage;

/* renamed from: ad  reason: default package */
/* compiled from: PG */
final class ad implements Runnable {
    private final /* synthetic */ ac a;

    ad(ac acVar) {
        this.a = acVar;
    }

    public final void run() {
        Object obj;
        synchronized (this.a.a) {
            obj = this.a.e;
            this.a.e = ac.b;
        }
        this.a.a(obj);
    }
}
