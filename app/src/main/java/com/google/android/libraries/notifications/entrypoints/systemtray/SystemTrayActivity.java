package com.google.android.libraries.notifications.entrypoints.systemtray;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import defpackage.bty;

/* compiled from: PG */
public class SystemTrayActivity extends Activity {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            intent.setFlags(0);
            bty.a("SystemTrayActivity", "Forwarding Intent from Activity to SystemTrayBroadcastReceiver", new Object[0]);
            intent.setClass(this, SystemTrayBroadcastReceiver.class);
            sendBroadcast(intent);
        }
        finish();
    }
}
