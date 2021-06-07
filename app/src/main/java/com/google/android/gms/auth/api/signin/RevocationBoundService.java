package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/* compiled from: PG */
public final class RevocationBoundService extends Service {
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) || "com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
            return new awa(this);
        }
        String valueOf = String.valueOf(intent.getAction());
        Log.w("RevocationService", valueOf.length() != 0 ? "Unknown action sent to RevocationBoundService: ".concat(valueOf) : new String("Unknown action sent to RevocationBoundService: "));
        return null;
    }
}
