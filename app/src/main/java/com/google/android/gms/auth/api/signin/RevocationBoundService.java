package com.google.android.gms.auth.api.signin;

/* compiled from: PG */
public final class RevocationBoundService extends android.app.Service {
    public final android.os.IBinder onBind(android.content.Intent intent) {
        if ("com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) || "com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
            return new defpackage.awa(this);
        }
        java.lang.String str = "RevocationService";
        java.lang.String str2 = "Unknown action sent to RevocationBoundService: ";
        java.lang.String valueOf = java.lang.String.valueOf(intent.getAction());
        android.util.Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2));
        return null;
    }
}
