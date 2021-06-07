package defpackage;

import android.os.Bundle;

/* renamed from: cax  reason: default package */
/* compiled from: PG */
public final class cax extends cau {
    public bza a;

    cax() {
    }

    @Override // defpackage.bwg
    public final String a() {
        return "RPC_STORE_TARGET";
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cau
    public final ccr b(Bundle bundle) {
        return this.a.a(bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME"));
    }
}
