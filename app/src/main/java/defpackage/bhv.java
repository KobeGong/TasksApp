package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: bhv  reason: default package */
/* compiled from: PG */
public final class bhv extends bhx {
    @Override // defpackage.bhx
    public final void handleIntent(Intent intent) {
        throw new NoSuchMethodError();
    }

    static void a(Context context, bij bij) {
        bij.a();
        Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.putExtra("CMD", "RST");
        intent.setClassName(context, "com.google.android.gms.gcm.GcmReceiver");
        context.sendBroadcast(intent);
    }
}
