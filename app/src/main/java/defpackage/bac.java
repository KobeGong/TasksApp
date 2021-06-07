package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* access modifiers changed from: package-private */
/* renamed from: bac  reason: default package */
/* compiled from: PG */
public final class bac extends Handler {
    private /* synthetic */ azx a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    bac(azx azx, Looper looper) {
        super(looper);
        this.a = azx;
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                azx.b(this.a);
                return;
            case 2:
                azx.a(this.a);
                return;
            default:
                Log.w("GoogleApiClientImpl", new StringBuilder(31).append("Unknown message id: ").append(message.what).toString());
                return;
        }
    }
}
