package defpackage;

/* renamed from: ayy reason: default package */
/* compiled from: PG */
public final class ayy extends android.os.Handler {
    public ayy() {
        this(android.os.Looper.getMainLooper());
    }

    public ayy(android.os.Looper looper) {
        super(looper);
    }

    public final void a(defpackage.ayx ayx, defpackage.ayw ayw) {
        sendMessage(obtainMessage(1, new android.util.Pair(ayx, ayw)));
    }

    public final void handleMessage(android.os.Message message) {
        switch (message.what) {
            case 1:
                android.util.Pair pair = (android.util.Pair) message.obj;
                defpackage.ayx ayx = (defpackage.ayx) pair.first;
                defpackage.ayw ayw = (defpackage.ayw) pair.second;
                try {
                    ayx.a(ayw);
                    return;
                } catch (java.lang.RuntimeException e) {
                    com.google.android.gms.common.api.internal.BasePendingResult.b(ayw);
                    throw e;
                }
            case 2:
                ((com.google.android.gms.common.api.internal.BasePendingResult) message.obj).b(com.google.android.gms.common.api.Status.d);
                return;
            default:
                android.util.Log.wtf("BasePendingResult", "Don't know how to handle message: " + message.what, new java.lang.Exception());
                return;
        }
    }
}
