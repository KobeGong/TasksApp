package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* access modifiers changed from: package-private */
/* renamed from: la  reason: default package */
/* compiled from: PG */
public abstract class ComponentActivity extends kz {
    public boolean a;

    ComponentActivity() {
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.a && i != -1) {
            a(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i != -1) {
            a(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
