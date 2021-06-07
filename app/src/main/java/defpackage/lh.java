package defpackage;

import android.os.Handler;
import android.os.Message;

/* access modifiers changed from: package-private */
/* renamed from: lh  reason: default package */
/* compiled from: PG */
public final class lh extends Handler {
    private final /* synthetic */ lg a;

    lh(lg lgVar) {
        this.a = lgVar;
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                if (this.a.d) {
                    this.a.a(false);
                    return;
                }
                return;
            case 2:
                this.a.c.a.d.q();
                this.a.c.b();
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }
}
