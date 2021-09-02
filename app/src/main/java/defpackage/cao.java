package defpackage;

/* renamed from: cao reason: default package */
/* compiled from: PG */
public final class cao extends defpackage.cau {
    public defpackage.bza a;

    cao() {
    }

    public final java.lang.String a() {
        return "RPC_FETCH_LATEST_THREADS";
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.ccr b(android.os.Bundle bundle) {
        return this.a.a(bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME"), java.lang.Long.valueOf(bundle.getLong("com.google.android.libraries.notifications.INTENT_EXTRA_PAGE_VERSION")));
    }
}
