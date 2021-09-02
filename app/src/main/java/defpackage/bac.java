package defpackage;

/* renamed from: bac reason: default package */
/* compiled from: PG */
final class bac extends android.os.Handler {
    private /* synthetic */ defpackage.azx a;

    bac(defpackage.azx azx, android.os.Looper looper) {
        this.a = azx;
        super(looper);
    }

    public final void handleMessage(android.os.Message message) {
        switch (message.what) {
            case 1:
                defpackage.azx.b(this.a);
                return;
            case 2:
                defpackage.azx.a(this.a);
                return;
            default:
                android.util.Log.w("GoogleApiClientImpl", "Unknown message id: " + message.what);
                return;
        }
    }
}
