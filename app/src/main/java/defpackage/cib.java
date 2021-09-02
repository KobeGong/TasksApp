package defpackage;

/* renamed from: cib reason: default package */
/* compiled from: PG */
public final class cib extends android.content.BroadcastReceiver {
    public final /* synthetic */ defpackage.chz a;

    public cib(defpackage.chz chz) {
        this.a = chz;
    }

    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (!"android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            this.a.e();
            this.a.k = ((java.util.concurrent.ScheduledExecutorService) this.a.b.a()).schedule(new defpackage.cic(this, context), 5, java.util.concurrent.TimeUnit.SECONDS);
        } else if (this.a.j.get()) {
            this.a.e();
        }
    }
}
