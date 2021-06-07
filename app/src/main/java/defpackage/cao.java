package defpackage;

import android.os.Bundle;

/* renamed from: cao  reason: default package */
/* compiled from: PG */
public final class cao extends cau {
    public bza a;

    cao() {
    }

    @Override // defpackage.bwg
    public final String a() {
        return "RPC_FETCH_LATEST_THREADS";
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cau
    public final ccr b(Bundle bundle) {
        return this.a.a(bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME"), Long.valueOf(bundle.getLong("com.google.android.libraries.notifications.INTENT_EXTRA_PAGE_VERSION")));
    }
}
