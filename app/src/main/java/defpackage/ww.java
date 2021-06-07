package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: ww  reason: default package */
/* compiled from: PG */
final class ww extends BroadcastReceiver {
    private final /* synthetic */ xl a;

    ww(xl xlVar) {
        this.a = xlVar;
    }

    public final void onReceive(Context context, Intent intent) {
        xl xlVar = this.a;
        boolean a2 = xlVar.a.a();
        if (a2 != xlVar.b) {
            xlVar.b = a2;
            xlVar.e.k();
        }
    }
}
