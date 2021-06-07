package defpackage;

import android.os.Handler;
import android.os.Message;

/* access modifiers changed from: package-private */
/* renamed from: rx  reason: default package */
/* compiled from: PG */
public final class rx extends Handler {
    private final /* synthetic */ rw a;

    rx(rw rwVar) {
        this.a = rwVar;
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.a.b.onShowPress(this.a.g);
                return;
            case 2:
                rw rwVar = this.a;
                rwVar.a.removeMessages(3);
                rwVar.e = false;
                rwVar.f = true;
                rwVar.b.onLongPress(rwVar.g);
                return;
            case 3:
                if (this.a.c == null) {
                    return;
                }
                if (!this.a.d) {
                    this.a.c.onSingleTapConfirmed(this.a.g);
                    return;
                } else {
                    this.a.e = true;
                    return;
                }
            default:
                throw new RuntimeException("Unknown message " + message);
        }
    }
}
