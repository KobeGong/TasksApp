package defpackage;

/* renamed from: awq reason: default package */
/* compiled from: PG */
final class awq implements defpackage.avd {
    private /* synthetic */ android.accounts.Account a;
    private /* synthetic */ java.lang.String b;
    private /* synthetic */ android.os.Bundle c;

    awq(android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) {
        this.a = account;
        this.b = str;
        this.c = bundle;
    }

    public final /* synthetic */ java.lang.Object a(android.os.IBinder iBinder) {
        boolean z;
        boolean z2;
        android.os.Bundle bundle = (android.os.Bundle) defpackage.avc.a((java.lang.Object) defpackage.bkq.a(iBinder).a(this.a, this.b, this.c));
        com.google.android.gms.auth.TokenData a2 = com.google.android.gms.auth.TokenData.a(bundle, "tokenDetails");
        if (a2 != null) {
            return a2;
        }
        java.lang.String string = bundle.getString("Error");
        android.content.Intent intent = (android.content.Intent) bundle.getParcelable("userRecoveryIntent");
        defpackage.awp a3 = defpackage.awp.a(string);
        if (defpackage.awp.BAD_AUTHENTICATION.equals(a3) || defpackage.awp.CAPTCHA.equals(a3) || defpackage.awp.NEED_PERMISSION.equals(a3) || defpackage.awp.NEED_REMOTE_CONSENT.equals(a3) || defpackage.awp.NEEDS_BROWSER.equals(a3) || defpackage.awp.USER_CANCEL.equals(a3) || defpackage.awp.DEVICE_MANAGEMENT_REQUIRED.equals(a3) || defpackage.awp.DM_INTERNAL_ERROR.equals(a3) || defpackage.awp.DM_SYNC_DISABLED.equals(a3) || defpackage.awp.DM_ADMIN_BLOCKED.equals(a3) || defpackage.awp.DM_ADMIN_PENDING_APPROVAL.equals(a3) || defpackage.awp.DM_STALE_SYNC_REQUIRED.equals(a3) || defpackage.awp.DM_DEACTIVATED.equals(a3) || defpackage.awp.DM_REQUIRED.equals(a3) || defpackage.awp.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(a3) || defpackage.awp.DM_SCREENLOCK_REQUIRED.equals(a3)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            java.lang.String valueOf = java.lang.String.valueOf(a3);
            defpackage.avc.c.b("GoogleAuthUtil", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 31).append("isUserRecoverableError status: ").append(valueOf).toString());
            throw new defpackage.avf(string, intent);
        }
        if (defpackage.awp.NETWORK_ERROR.equals(a3) || defpackage.awp.SERVICE_UNAVAILABLE.equals(a3)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            throw new java.io.IOException(string);
        }
        throw new defpackage.ava(string);
    }
}
