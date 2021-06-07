package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: caz  reason: default package */
/* compiled from: PG */
public final class caz extends cau {
    public bza a;
    public buu b;

    caz() {
    }

    @Override // defpackage.bwg
    public final String a() {
        return "RPC_UPDATE_THREAD_STATE";
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cau
    public final ccr b(Bundle bundle) {
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        int i = bundle.getInt("com.google.android.libraries.notifications.INTENT_EXTRA_THREAD_STATE_UPDATE_BITMASK", 0);
        List<bus> a2 = this.b.a(string, i + 100);
        ArrayList arrayList = new ArrayList();
        for (bus bus : a2) {
            try {
                arrayList.add((dfj) dih.a(dfj.d, bus.c()));
            } catch (dir e) {
                bty.b("UpdateThreadStateHandler", e, "Unable to parse VersionedIdentifier message", new Object[0]);
            }
        }
        bza bza = this.a;
        ccq ccq = bza.a;
        ccr a3 = ccq.a.a("/v1/updatethreadstate", string, bza.d.a(i, arrayList), dex.a);
        if (!a3.d() || !a3.c()) {
            this.b.a(string, a2);
        }
        return a3;
    }
}
