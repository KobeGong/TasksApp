package defpackage;

/* renamed from: bah reason: default package */
/* compiled from: PG */
final class bah extends android.os.Handler {
    private /* synthetic */ defpackage.baf a;

    bah(defpackage.baf baf, android.os.Looper looper) {
        this.a = baf;
        super(looper);
    }

    public final void handleMessage(android.os.Message message) {
        switch (message.what) {
            case 1:
                defpackage.bag bag = (defpackage.bag) message.obj;
                defpackage.baf baf = this.a;
                baf.a.lock();
                try {
                    if (baf.k == bag.a) {
                        bag.a();
                        baf.a.unlock();
                        return;
                    }
                    return;
                } finally {
                    baf.a.unlock();
                }
            case 2:
                throw ((java.lang.RuntimeException) message.obj);
            default:
                android.util.Log.w("GACStateManager", "Unknown message id: " + message.what);
                return;
        }
    }
}
