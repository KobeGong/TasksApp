package defpackage;

import android.content.Intent;

/* renamed from: bwe  reason: default package */
/* compiled from: PG */
public final class bwe implements bvn {
    public cbw a;

    bwe() {
    }

    @Override // defpackage.bvn
    public final boolean a(Intent intent) {
        return intent != null && "android.intent.action.LOCALE_CHANGED".equals(intent.getAction());
    }

    @Override // defpackage.bvn
    public final void a(Intent intent, bvo bvo) {
        bty.a("LocaleChangedIntentHandler", "Syncing registration statuses due to Locale change.", new Object[0]);
        this.a.a();
    }
}
