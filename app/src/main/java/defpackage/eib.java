package defpackage;

/* renamed from: eib reason: default package */
/* compiled from: PG */
public final class eib implements android.accounts.AccountManagerCallback {
    public final defpackage.eid a;
    public final /* synthetic */ org.chromium.net.HttpNegotiateAuthenticator b;

    public eib(org.chromium.net.HttpNegotiateAuthenticator httpNegotiateAuthenticator, defpackage.eid eid) {
        this.b = httpNegotiateAuthenticator;
        this.a = eid;
    }

    public final void run(android.accounts.AccountManagerFuture accountManagerFuture) {
        int i = 0;
        try {
            android.os.Bundle bundle = (android.os.Bundle) accountManagerFuture.getResult();
            if (bundle.containsKey("intent")) {
                android.content.Context context = defpackage.ehw.a;
                context.registerReceiver(new defpackage.eic(this, context), new android.content.IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
                return;
            }
            org.chromium.net.HttpNegotiateAuthenticator httpNegotiateAuthenticator = this.b;
            defpackage.eid eid = this.a;
            httpNegotiateAuthenticator.a = bundle.getBundle("spnegoContext");
            switch (bundle.getInt("spnegoResult", 1)) {
                case 0:
                    break;
                case 1:
                    i = -9;
                    break;
                case 2:
                    i = -3;
                    break;
                case 3:
                    i = -342;
                    break;
                case 4:
                    i = -320;
                    break;
                case 5:
                    i = -338;
                    break;
                case 6:
                    i = -339;
                    break;
                case 7:
                    i = -341;
                    break;
                case 8:
                    i = -344;
                    break;
                case 9:
                    i = -329;
                    break;
                default:
                    i = -9;
                    break;
            }
            httpNegotiateAuthenticator.nativeSetResult(eid.a, i, bundle.getString("authtoken"));
        } catch (android.accounts.AuthenticatorException | android.accounts.OperationCanceledException | java.io.IOException e) {
            defpackage.dpt.b("net_auth", "ERR_UNEXPECTED: Error while attempting to obtain a token.", e);
            this.b.nativeSetResult(this.a.a, -9, null);
        }
    }
}
