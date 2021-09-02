package defpackage;

/* renamed from: azu reason: default package */
/* compiled from: PG */
abstract class azu implements java.lang.Runnable {
    private /* synthetic */ defpackage.azk a;

    azu(defpackage.azk azk) {
        this.a = azk;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public void run() {
        this.a.b.lock();
        try {
            if (!java.lang.Thread.interrupted()) {
                a();
                this.a.b.unlock();
            }
        } catch (java.lang.RuntimeException e) {
            defpackage.baf baf = this.a.a;
            baf.e.sendMessage(baf.e.obtainMessage(2, e));
        } finally {
            this.a.b.unlock();
        }
    }
}
