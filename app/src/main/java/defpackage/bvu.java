package defpackage;

import android.annotation.TargetApi;
import android.content.Intent;
import android.text.TextUtils;

@TargetApi(26)
/* renamed from: bvu  reason: default package */
/* compiled from: PG */
public final class bvu implements bvn {
    private final bup a;
    private final bvs b;

    bvu(bup bup, bvs bvs) {
        this.a = bup;
        this.b = bvs;
    }

    @Override // defpackage.bvn
    public final boolean a(Intent intent) {
        return intent != null && "android.accounts.action.ACCOUNT_REMOVED".equals(intent.getAction()) && "com.google".equals(intent.getStringExtra("accountType")) && !TextUtils.isEmpty(intent.getStringExtra("authAccount"));
    }

    @Override // defpackage.bvn
    public final void a(Intent intent, bvo bvo) {
        String stringExtra = intent.getStringExtra("authAccount");
        bty.a("AccountRemovedIntentHandler", "Account removed event received [%s].", stringExtra);
        try {
            this.b.a(this.a.a(stringExtra));
        } catch (buo e) {
            bty.a("AccountRemovedIntentHandler", e, "Tried to delete account data but it wasn't found [%s].", stringExtra);
        }
    }
}
