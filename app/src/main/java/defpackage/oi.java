package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* access modifiers changed from: package-private */
/* renamed from: oi  reason: default package */
/* compiled from: PG */
public final class oi extends Handler {
    oi() {
        super(Looper.getMainLooper());
    }

    public final void handleMessage(Message message) {
        oh ohVar = (oh) message.obj;
        switch (message.what) {
            case 1:
                oe oeVar = ohVar.a;
                Object obj = ohVar.b[0];
                if (oeVar.f.get()) {
                    oeVar.a();
                } else {
                    oeVar.a(obj);
                }
                oeVar.e = bg.C;
                return;
            case 2:
                oe.c();
                return;
            default:
                return;
        }
    }
}
