package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: bar  reason: default package */
/* compiled from: PG */
public final class bar extends BroadcastReceiver {
    public Context a;
    private final bas b;

    public bar(bas bas) {
        this.b = bas;
    }

    public final synchronized void a() {
        if (this.a != null) {
            this.a.unregisterReceiver(this);
        }
        this.a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        String str = null;
        if (data != null) {
            str = data.getSchemeSpecificPart();
        }
        if ("com.google.android.gms".equals(str)) {
            this.b.a();
            a();
        }
    }
}
