package defpackage;

import android.content.Intent;
import android.os.Build;
import java.util.Set;

/* renamed from: bvq  reason: default package */
/* compiled from: PG */
public final class bvq implements bvn {
    private final bup a;
    private final bvs b;
    private final byd c;

    bvq(bup bup, bvs bvs, byd byd) {
        this.a = bup;
        this.b = bvs;
        this.c = byd;
    }

    @Override // defpackage.bvn
    public final boolean a(Intent intent) {
        boolean z;
        if (intent != null && "android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(intent.getAction())) {
            if (Build.VERSION.SDK_INT >= 26) {
                z = true;
            } else {
                z = false;
            }
            if (!z && this.c.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bvn
    public final void a(Intent intent, bvo bvo) {
        bty.a("AccountChangedIntentHandler", "Account changed event received.", new Object[0]);
        Set b2 = this.c.b();
        for (bul bul : this.a.a()) {
            if (!b2.contains(bul.b())) {
                this.b.a(bul);
            }
        }
    }
}
