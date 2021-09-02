package defpackage;

@android.annotation.TargetApi(26)
/* renamed from: bvu reason: default package */
/* compiled from: PG */
public final class bvu implements defpackage.bvn {
    private final defpackage.bup a;
    private final defpackage.bvs b;

    bvu(defpackage.bup bup, defpackage.bvs bvs) {
        this.a = bup;
        this.b = bvs;
    }

    public final boolean a(android.content.Intent intent) {
        return intent != null && "android.accounts.action.ACCOUNT_REMOVED".equals(intent.getAction()) && "com.google".equals(intent.getStringExtra("accountType")) && !android.text.TextUtils.isEmpty(intent.getStringExtra("authAccount"));
    }

    public final void a(android.content.Intent intent, defpackage.bvo bvo) {
        java.lang.String stringExtra = intent.getStringExtra("authAccount");
        defpackage.bty.a("AccountRemovedIntentHandler", "Account removed event received [%s].", stringExtra);
        try {
            this.b.a(this.a.a(stringExtra));
        } catch (defpackage.buo e) {
            defpackage.bty.a("AccountRemovedIntentHandler", e, "Tried to delete account data but it wasn't found [%s].", stringExtra);
        }
    }
}
