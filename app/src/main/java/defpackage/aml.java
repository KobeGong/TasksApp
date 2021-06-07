package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* access modifiers changed from: package-private */
/* renamed from: aml  reason: default package */
/* compiled from: PG */
public final class aml extends BroadcastReceiver {
    private final /* synthetic */ amj a;

    aml(amj amj) {
        this.a = amj;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.b();
    }
}
