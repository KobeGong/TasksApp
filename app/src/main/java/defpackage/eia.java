package defpackage;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Bundle;
import android.os.Handler;
import java.io.IOException;
import org.chromium.base.ThreadUtils;
import org.chromium.net.HttpNegotiateAuthenticator;

/* renamed from: eia  reason: default package */
/* compiled from: PG */
public final class eia implements AccountManagerCallback {
    private final eid a;
    private final /* synthetic */ HttpNegotiateAuthenticator b;

    public eia(HttpNegotiateAuthenticator httpNegotiateAuthenticator, eid eid) {
        this.b = httpNegotiateAuthenticator;
        this.a = eid;
    }

    @Override // android.accounts.AccountManagerCallback
    public final void run(AccountManagerFuture accountManagerFuture) {
        try {
            Account[] accountArr = (Account[]) accountManagerFuture.getResult();
            if (accountArr.length == 0) {
                dpt.b("net_auth", "ERR_MISSING_AUTH_CREDENTIALS: No account provided for the kerberos authentication. Please verify the configuration policies and that the CONTACTS runtime permission is granted. ", new Object[0]);
                this.b.nativeSetResult(this.a.a, -341, null);
            } else if (accountArr.length > 1) {
                dpt.b("net_auth", "ERR_MISSING_AUTH_CREDENTIALS: Found %d accounts eligible for the kerberos authentication. Please fix the configuration by providing a single account.", Integer.valueOf(accountArr.length));
                this.b.nativeSetResult(this.a.a, -341, null);
            } else if (HttpNegotiateAuthenticator.a(ehw.a, "android.permission.USE_CREDENTIALS", true)) {
                dpt.c("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: USE_CREDENTIALS permission not granted. Aborting authentication.", new Object[0]);
                this.b.nativeSetResult(this.a.a, -343, null);
            } else {
                this.a.e = accountArr[0];
                this.a.b.getAuthToken(this.a.e, this.a.d, this.a.c, true, (AccountManagerCallback<Bundle>) new eib(this.b, this.a), new Handler(ThreadUtils.a().getLooper()));
            }
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            dpt.b("net_auth", "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e);
            this.b.nativeSetResult(this.a.a, -9, null);
        }
    }
}
