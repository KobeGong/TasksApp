package defpackage;

/* renamed from: caz reason: default package */
/* compiled from: PG */
public final class caz extends defpackage.cau {
    public defpackage.bza a;
    public defpackage.buu b;

    caz() {
    }

    public final java.lang.String a() {
        return "RPC_UPDATE_THREAD_STATE";
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.ccr b(android.os.Bundle bundle) {
        java.lang.String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        int i = bundle.getInt("com.google.android.libraries.notifications.INTENT_EXTRA_THREAD_STATE_UPDATE_BITMASK", 0);
        java.util.List<defpackage.bus> a2 = this.b.a(string, i + 100);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (defpackage.bus c : a2) {
            try {
                arrayList.add((defpackage.dfj) defpackage.dih.a((defpackage.dih) defpackage.dfj.d, c.c()));
            } catch (defpackage.dir e) {
                defpackage.bty.b("UpdateThreadStateHandler", e, "Unable to parse VersionedIdentifier message", new java.lang.Object[0]);
            }
        }
        defpackage.bza bza = this.a;
        defpackage.ccq ccq = bza.a;
        defpackage.ccr a3 = ccq.a.a("/v1/updatethreadstate", string, bza.d.a(i, arrayList), defpackage.dex.a);
        if (!a3.d() || !a3.c()) {
            this.b.a(string, (java.util.List) a2);
        }
        return a3;
    }
}
