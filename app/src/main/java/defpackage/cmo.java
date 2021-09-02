package defpackage;

/* renamed from: cmo reason: default package */
/* compiled from: PG */
public final class cmo extends android.content.BroadcastReceiver {
    public final defpackage.clr a;
    public final defpackage.clt b;
    private final defpackage.clt c;

    public cmo(defpackage.clr clr, defpackage.clt clt, defpackage.clt clt2) {
        this.a = clr;
        this.b = clt;
        this.c = clt2;
    }

    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        defpackage.cdm.a(3, "PrimesShutdown", "BroadcastReceiver: action = %s", intent.getAction());
        if (this.a.a) {
            context.unregisterReceiver(this);
        } else if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction()) && this.c != null) {
            java.util.concurrent.ScheduledExecutorService scheduledExecutorService = (java.util.concurrent.ScheduledExecutorService) this.c.a();
            if (scheduledExecutorService != null) {
                scheduledExecutorService.submit(new defpackage.cmp(this));
            }
        }
    }
}
