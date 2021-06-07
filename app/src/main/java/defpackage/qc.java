package defpackage;

import android.os.Handler;
import android.os.Message;

/* access modifiers changed from: package-private */
/* renamed from: qc  reason: default package */
/* compiled from: PG */
public final class qc implements Handler.Callback {
    private final /* synthetic */ qb a;

    qc(qb qbVar) {
        this.a = qbVar;
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                qb qbVar = this.a;
                synchronized (qbVar.a) {
                    if (!qbVar.c.hasMessages(1)) {
                        qbVar.b.quit();
                        qbVar.b = null;
                        qbVar.c = null;
                        break;
                    } else {
                        break;
                    }
                }
            case 1:
                qb qbVar2 = this.a;
                ((Runnable) message.obj).run();
                synchronized (qbVar2.a) {
                    qbVar2.c.removeMessages(0);
                    qbVar2.c.sendMessageDelayed(qbVar2.c.obtainMessage(0), (long) qbVar2.d);
                }
                break;
        }
        return true;
    }
}
