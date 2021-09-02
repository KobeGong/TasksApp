package defpackage;

/* renamed from: bvq reason: default package */
/* compiled from: PG */
public final class bvq implements defpackage.bvn {
    private final defpackage.bup a;
    private final defpackage.bvs b;
    private final defpackage.byd c;

    bvq(defpackage.bup bup, defpackage.bvs bvs, defpackage.byd byd) {
        this.a = bup;
        this.b = bvs;
        this.c = byd;
    }

    public final boolean a(android.content.Intent intent) {
        boolean z;
        if (intent != null && "android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(intent.getAction())) {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
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

    public final void a(android.content.Intent intent, defpackage.bvo bvo) {
        defpackage.bty.a("AccountChangedIntentHandler", "Account changed event received.", new java.lang.Object[0]);
        java.util.Set b2 = this.c.b();
        for (defpackage.bul bul : this.a.a()) {
            if (!b2.contains(bul.b())) {
                this.b.a(bul);
            }
        }
    }
}
