package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* access modifiers changed from: package-private */
/* renamed from: bhj  reason: default package */
/* compiled from: PG */
public final class bhj extends Handler {
    private /* synthetic */ bhh a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    bhj(bhh bhh, Looper looper) {
        super(looper);
        this.a = bhh;
    }

    public final void handleMessage(Message message) {
        if (message == null || !(message.obj instanceof Intent)) {
            Log.w("GCM", "Dropping invalid message");
        }
        Intent intent = (Intent) message.obj;
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(intent.getAction())) {
            this.a.d.add(intent);
        } else if (!bhh.a(this.a, intent)) {
            intent.setPackage(this.a.b.getPackageName());
            this.a.b.sendBroadcast(intent);
        }
    }
}
