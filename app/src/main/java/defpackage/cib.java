package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: cib  reason: default package */
/* compiled from: PG */
public final class cib extends BroadcastReceiver {
    public final /* synthetic */ chz a;

    public cib(chz chz) {
        this.a = chz;
    }

    public final void onReceive(Context context, Intent intent) {
        if (!"android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            this.a.e();
            this.a.k = ((ScheduledExecutorService) this.a.b.a()).schedule(new cic(this, context), 5, TimeUnit.SECONDS);
        } else if (this.a.j.get()) {
            this.a.e();
        }
    }
}
