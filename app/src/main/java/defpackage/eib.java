package defpackage;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import java.io.IOException;
import org.chromium.net.HttpNegotiateAuthenticator;

/* renamed from: eib  reason: default package */
/* compiled from: PG */
public final class eib implements AccountManagerCallback {
    public final eid a;
    public final /* synthetic */ HttpNegotiateAuthenticator b;

    public eib(HttpNegotiateAuthenticator httpNegotiateAuthenticator, eid eid) {
        this.b = httpNegotiateAuthenticator;
        this.a = eid;
    }

    @Override // android.accounts.AccountManagerCallback
    public final void run(AccountManagerFuture accountManagerFuture) {
        int i = 0;
        try {
            Bundle bundle = (Bundle) accountManagerFuture.getResult();
            if (bundle.containsKey("intent")) {
                Context context = ehw.a;
                context.registerReceiver(new eic(this, context), new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
                return;
            }
            HttpNegotiateAuthenticator httpNegotiateAuthenticator = this.b;
            eid eid = this.a;
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
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            dpt.b("net_auth", "ERR_UNEXPECTED: Error while attempting to obtain a token.", e);
            this.b.nativeSetResult(this.a.a, -9, null);
        }
    }
}
