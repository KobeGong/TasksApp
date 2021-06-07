package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: cmo  reason: default package */
/* compiled from: PG */
public final class cmo extends BroadcastReceiver {
    public final clr a;
    public final clt b;
    private final clt c;

    public cmo(clr clr, clt clt, clt clt2) {
        this.a = clr;
        this.b = clt;
        this.c = clt2;
    }

    public final void onReceive(Context context, Intent intent) {
        ScheduledExecutorService scheduledExecutorService;
        cdm.a(3, "PrimesShutdown", "BroadcastReceiver: action = %s", intent.getAction());
        if (this.a.a) {
            context.unregisterReceiver(this);
        } else if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction()) && this.c != null && (scheduledExecutorService = (ScheduledExecutorService) this.c.a()) != null) {
            scheduledExecutorService.submit(new cmp(this));
        }
    }
}
