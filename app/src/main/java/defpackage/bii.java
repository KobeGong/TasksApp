package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* access modifiers changed from: package-private */
/* renamed from: bii  reason: default package */
/* compiled from: PG */
public final class bii extends BroadcastReceiver {
    private /* synthetic */ bhw a;

    bii(bhw bhw) {
        this.a = bhw;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.a(intent);
    }
}
