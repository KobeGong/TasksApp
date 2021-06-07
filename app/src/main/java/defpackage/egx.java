package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.chromium.base.PowerMonitor;

/* renamed from: egx  reason: default package */
/* compiled from: PG */
public final class egx extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        PowerMonitor.a(intent);
    }
}
