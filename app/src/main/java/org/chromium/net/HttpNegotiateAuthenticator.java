package org.chromium.net;

import android.accounts.AccountManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ThreadUtils;
import org.chromium.base.annotations.CalledByNative;

/* compiled from: PG */
public class HttpNegotiateAuthenticator {
    public Bundle a;
    private final String b;

    private HttpNegotiateAuthenticator(String str) {
        this.b = str;
    }

    public native void nativeSetResult(long j, int i, String str);

    @CalledByNative
    static HttpNegotiateAuthenticator create(String str) {
        return new HttpNegotiateAuthenticator(str);
    }

    /* access modifiers changed from: package-private */
    @CalledByNative
    public void getNextAuthToken(long j, String str, String str2, boolean z) {
        Context context = ehw.a;
        eid eid = new eid();
        eid.d = "SPNEGO:HOSTBASED:" + str;
        eid.b = AccountManager.get(context);
        eid.a = j;
        String[] strArr = {"SPNEGO"};
        eid.c = new Bundle();
        if (str2 != null) {
            eid.c.putString("incomingAuthToken", str2);
        }
        if (this.a != null) {
            eid.c.putBundle("spnegoContext", this.a);
        }
        eid.c.putBoolean("canDelegate", z);
        ApplicationStatus.a();
        if (a(context, "android.permission.GET_ACCOUNTS", true)) {
            dpt.c("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: GET_ACCOUNTS permission not granted. Aborting authentication.", new Object[0]);
            nativeSetResult(eid.a, -343, null);
            return;
        }
        eid.b.getAccountsByTypeAndFeatures(this.b, strArr, new eia(this, eid), new Handler(ThreadUtils.a().getLooper()));
    }

    public static boolean a(Context context, String str, boolean z) {
        if (Build.VERSION.SDK_INT < 23 && context.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
            return true;
        }
        return false;
    }
}
