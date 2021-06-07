package defpackage;

import android.content.Intent;
import android.util.Log;

/* renamed from: bia  reason: default package */
/* compiled from: PG */
final class bia implements Runnable {
    private /* synthetic */ Intent a;
    private /* synthetic */ bhz b;

    bia(bhz bhz, Intent intent) {
        this.b = bhz;
        this.a = intent;
    }

    public final void run() {
        String action = this.a.getAction();
        Log.w("EnhancedIntentService", new StringBuilder(String.valueOf(action).length() + 61).append("Service took too long to process intent: ").append(action).append(" App may get closed.").toString());
        this.b.a();
    }
}
