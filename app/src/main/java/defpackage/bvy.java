package defpackage;

import android.content.Intent;

/* renamed from: bvy  reason: default package */
/* compiled from: PG */
public final class bvy implements bvn {
    private final cda a;

    bvy(cda cda) {
        this.a = cda;
    }

    @Override // defpackage.bvn
    public final boolean a(Intent intent) {
        return intent != null && "android.intent.action.BOOT_COMPLETED".equals(intent.getAction());
    }

    @Override // defpackage.bvn
    public final void a(Intent intent, bvo bvo) {
        bty.a("BootCompletedIntentHandler", "Re-surface notifications due to boot completed event.", new Object[0]);
        this.a.a(bvo);
    }
}
