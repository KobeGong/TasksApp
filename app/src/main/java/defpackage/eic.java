package defpackage;

import android.accounts.AccountManagerCallback;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/* renamed from: eic  reason: default package */
/* compiled from: PG */
final class eic extends BroadcastReceiver {
    private final /* synthetic */ Context a;
    private final /* synthetic */ eib b;

    eic(eib eib, Context context) {
        this.b = eib;
        this.a = context;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.unregisterReceiver(this);
        this.b.a.b.getAuthToken(this.b.a.e, this.b.a.d, this.b.a.c, true, (AccountManagerCallback<Bundle>) new eib(this.b.b, this.b.a), (Handler) null);
    }
}
