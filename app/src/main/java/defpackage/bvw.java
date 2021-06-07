package defpackage;

import android.content.Intent;

/* renamed from: bvw  reason: default package */
/* compiled from: PG */
public final class bvw implements bvn {
    private final cbw a;
    private final cda b;

    bvw(cbw cbw, cda cda) {
        this.a = cbw;
        this.b = cda;
    }

    @Override // defpackage.bvn
    public final boolean a(Intent intent) {
        return intent != null && "android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction());
    }

    @Override // defpackage.bvn
    public final void a(Intent intent, bvo bvo) {
        bty.a("AppUpdatedIntentHandler", "Re-surface notifications and sync registrations due to app update.", new Object[0]);
        this.b.a(bvo);
        this.a.a();
    }
}
