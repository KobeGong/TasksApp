package defpackage;

import android.content.Intent;

/* renamed from: bwo  reason: default package */
/* compiled from: PG */
public final class bwo implements bvn {
    public cbw a;

    bwo() {
    }

    @Override // defpackage.bvn
    public final boolean a(Intent intent) {
        return intent != null && "android.intent.action.TIMEZONE_CHANGED".equals(intent.getAction());
    }

    @Override // defpackage.bvn
    public final void a(Intent intent, bvo bvo) {
        bty.a("TimezoneChangedIntentHandler", "Syncing registration statuses due to timezone change.", new Object[0]);
        this.a.a();
    }
}
