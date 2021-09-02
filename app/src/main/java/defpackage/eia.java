package defpackage;

/* renamed from: eia reason: default package */
/* compiled from: PG */
public final class eia implements android.accounts.AccountManagerCallback {
    private final defpackage.eid a;
    private final /* synthetic */ org.chromium.net.HttpNegotiateAuthenticator b;

    public eia(org.chromium.net.HttpNegotiateAuthenticator httpNegotiateAuthenticator, defpackage.eid eid) {
        this.b = httpNegotiateAuthenticator;
        this.a = eid;
    }

    public final void run(android.accounts.AccountManagerFuture accountManagerFuture) {
        try {
            android.accounts.Account[] accountArr = (android.accounts.Account[]) accountManagerFuture.getResult();
            if (accountArr.length == 0) {
                defpackage.dpt.b("net_auth", "ERR_MISSING_AUTH_CREDENTIALS: No account provided for the kerberos authentication. Please verify the configuration policies and that the CONTACTS runtime permission is granted. ", new java.lang.Object[0]);
                this.b.nativeSetResult(this.a.a, -341, null);
            } else if (accountArr.length > 1) {
                defpackage.dpt.b("net_auth", "ERR_MISSING_AUTH_CREDENTIALS: Found %d accounts eligible for the kerberos authentication. Please fix the configuration by providing a single account.", java.lang.Integer.valueOf(accountArr.length));
                this.b.nativeSetResult(this.a.a, -341, null);
            } else if (org.chromium.net.HttpNegotiateAuthenticator.a(defpackage.ehw.a, "android.permission.USE_CREDENTIALS", true)) {
                defpackage.dpt.c("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: USE_CREDENTIALS permission not granted. Aborting authentication.", new java.lang.Object[0]);
                this.b.nativeSetResult(this.a.a, -343, null);
            } else {
                this.a.e = accountArr[0];
                this.a.b.getAuthToken(this.a.e, this.a.d, this.a.c, true, new defpackage.eib(this.b, this.a), new android.os.Handler(org.chromium.base.ThreadUtils.a().getLooper()));
            }
        } catch (android.accounts.AuthenticatorException | android.accounts.OperationCanceledException | java.io.IOException e) {
            defpackage.dpt.b("net_auth", "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e);
            this.b.nativeSetResult(this.a.a, -9, null);
        }
    }
}
