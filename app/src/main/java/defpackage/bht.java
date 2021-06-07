package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: bht  reason: default package */
/* compiled from: PG */
public final class bht {
    public bht(bjr bjr) {
        azb.b(bjr, "Callbacks must not be null.");
    }

    public static boolean a(Context context, Intent intent) {
        azb.b(context, "Context must not be null.");
        azb.b(intent, "Intent must not be null.");
        return intent.hasExtra("com.google.android.gms.accounts.ACCOUNT_DATA");
    }
}
