package defpackage;

/* renamed from: qc reason: default package */
/* compiled from: PG */
final class qc implements android.os.Handler.Callback {
    private final /* synthetic */ defpackage.qb a;

    qc(defpackage.qb qbVar) {
        this.a = qbVar;
    }

    public final boolean handleMessage(android.os.Message message) {
        switch (message.what) {
            case 0:
                defpackage.qb qbVar = this.a;
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
                defpackage.qb qbVar2 = this.a;
                ((java.lang.Runnable) message.obj).run();
                synchronized (qbVar2.a) {
                    qbVar2.c.removeMessages(0);
                    qbVar2.c.sendMessageDelayed(qbVar2.c.obtainMessage(0), (long) qbVar2.d);
                }
                break;
        }
        return true;
    }
}
