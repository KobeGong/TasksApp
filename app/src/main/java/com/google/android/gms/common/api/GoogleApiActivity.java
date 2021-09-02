package com.google.android.gms.common.api;

/* compiled from: PG */
public class GoogleApiActivity extends android.app.Activity implements android.content.DialogInterface.OnCancelListener {
    private int a = 0;

    public static android.content.Intent a(android.content.Context context, android.app.PendingIntent pendingIntent, int i, boolean z) {
        android.content.Intent intent = new android.content.Intent(context, com.google.android.gms.common.api.GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    /* access modifiers changed from: protected */
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = bundle.getInt("resolution");
        }
        if (this.a != 1) {
            android.os.Bundle extras = getIntent().getExtras();
            if (extras == null) {
                android.util.Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            android.app.PendingIntent pendingIntent = (android.app.PendingIntent) extras.get("pending_intent");
            java.lang.Integer num = (java.lang.Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                android.util.Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
            } else if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                    this.a = 1;
                } catch (android.content.IntentSender.SendIntentException e) {
                    android.util.Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                    finish();
                }
            } else {
                android.app.Dialog a2 = defpackage.axt.a((android.app.Activity) this, num.intValue(), 2, (android.content.DialogInterface.OnCancelListener) this);
                if (a2 != null) {
                    defpackage.axt.a((android.app.Activity) this, a2, "GooglePlayServicesErrorDialog", (android.content.DialogInterface.OnCancelListener) this);
                }
                this.a = 1;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.a = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                defpackage.baj a2 = defpackage.baj.a((android.content.Context) this);
                switch (i2) {
                    case -1:
                        a2.a();
                        break;
                    case 0:
                        defpackage.axq axq = new defpackage.axq(13, null);
                        int intExtra = getIntent().getIntExtra("failing_client_id", -1);
                        if (!a2.a(axq, intExtra)) {
                            a2.g.sendMessage(a2.g.obtainMessage(5, intExtra, 0, axq));
                            break;
                        }
                        break;
                }
            }
        } else if (i == 2) {
            this.a = 0;
            setResult(i2, intent);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(android.os.Bundle bundle) {
        bundle.putInt("resolution", this.a);
        super.onSaveInstanceState(bundle);
    }

    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.a = 0;
        setResult(0);
        finish();
    }
}
