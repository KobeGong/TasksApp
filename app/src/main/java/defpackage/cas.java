package defpackage;

import android.os.Bundle;

/* renamed from: cas  reason: default package */
/* compiled from: PG */
public final class cas extends cau {
    public bza a;

    cas() {
    }

    @Override // defpackage.bwg
    public final String a() {
        return "RPC_REMOVE_TARGET";
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cau
    public final ccr b(Bundle bundle) {
        return this.a.b(bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME"));
    }
}
