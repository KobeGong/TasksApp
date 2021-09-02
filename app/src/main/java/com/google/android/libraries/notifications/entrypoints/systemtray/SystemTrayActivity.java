package com.google.android.libraries.notifications.entrypoints.systemtray;

/* compiled from: PG */
public class SystemTrayActivity extends android.app.Activity {
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        if (intent != null) {
            intent.setFlags(0);
            defpackage.bty.a("SystemTrayActivity", "Forwarding Intent from Activity to SystemTrayBroadcastReceiver", new java.lang.Object[0]);
            intent.setClass(this, com.google.android.libraries.notifications.entrypoints.systemtray.SystemTrayBroadcastReceiver.class);
            sendBroadcast(intent);
        }
        finish();
    }
}
