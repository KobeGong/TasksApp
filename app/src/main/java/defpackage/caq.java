package defpackage;

/* renamed from: caq reason: default package */
/* compiled from: PG */
public final class caq extends defpackage.cau {
    public defpackage.bza a;
    public defpackage.bux b;

    caq() {
    }

    public final java.lang.String a() {
        return "RPC_FETCH_UPDATED_THREADS";
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.ccr b(android.os.Bundle bundle) {
        java.lang.String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        long j = bundle.getLong("com.google.android.libraries.notifications.INTENT_EXTRA_SYNC_VERSION");
        return this.a.a(string, j, defpackage.buv.a(this.b.a(string, "last_updated__version>?", new java.lang.String[]{java.lang.Long.toString(j)})));
    }
}
