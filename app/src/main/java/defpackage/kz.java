package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: kz  reason: default package */
/* compiled from: PG */
abstract class kz extends nv {
    kz() {
    }

    /* access modifiers changed from: package-private */
    public abstract View a(View view, String str, Context context, AttributeSet attributeSet);

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = a(view, str, context, attributeSet);
        if (a == null) {
            return super.onCreateView(view, str, context, attributeSet);
        }
        return a;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a = a(null, str, context, attributeSet);
        if (a == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return a;
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (i != -1) {
            a(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    static void a(int i) {
        if ((-65536 & i) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }
}
