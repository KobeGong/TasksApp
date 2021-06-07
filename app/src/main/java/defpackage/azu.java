package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: azu  reason: default package */
/* compiled from: PG */
public abstract class azu implements Runnable {
    private /* synthetic */ azk a;

    azu(azk azk) {
        this.a = azk;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public void run() {
        this.a.b.lock();
        try {
            if (!Thread.interrupted()) {
                a();
                this.a.b.unlock();
            }
        } catch (RuntimeException e) {
            baf baf = this.a.a;
            baf.e.sendMessage(baf.e.obtainMessage(2, e));
        } finally {
            this.a.b.unlock();
        }
    }
}
