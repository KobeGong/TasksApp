package defpackage;

import android.os.Bundle;

/* renamed from: caq  reason: default package */
/* compiled from: PG */
public final class caq extends cau {
    public bza a;
    public bux b;

    caq() {
    }

    @Override // defpackage.bwg
    public final String a() {
        return "RPC_FETCH_UPDATED_THREADS";
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cau
    public final ccr b(Bundle bundle) {
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        long j = bundle.getLong("com.google.android.libraries.notifications.INTENT_EXTRA_SYNC_VERSION");
        return this.a.a(string, j, buv.a(this.b.a(string, "last_updated__version>?", new String[]{Long.toString(j)})));
    }
}
