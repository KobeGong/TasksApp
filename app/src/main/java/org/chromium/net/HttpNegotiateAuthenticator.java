package org.chromium.net;

/* compiled from: PG */
public class HttpNegotiateAuthenticator {
    public android.os.Bundle a;
    private final java.lang.String b;

    private HttpNegotiateAuthenticator(java.lang.String str) {
        this.b = str;
    }

    public native void nativeSetResult(long j, int i, java.lang.String str);

    @org.chromium.base.annotations.CalledByNative
    static org.chromium.net.HttpNegotiateAuthenticator create(java.lang.String str) {
        return new org.chromium.net.HttpNegotiateAuthenticator(str);
    }

    /* access modifiers changed from: 0000 */
    @org.chromium.base.annotations.CalledByNative
    public void getNextAuthToken(long j, java.lang.String str, java.lang.String str2, boolean z) {
        android.content.Context context = defpackage.ehw.a;
        defpackage.eid eid = new defpackage.eid();
        eid.d = "SPNEGO:HOSTBASED:" + str;
        eid.b = android.accounts.AccountManager.get(context);
        eid.a = j;
        java.lang.String[] strArr = {"SPNEGO"};
        eid.c = new android.os.Bundle();
        if (str2 != null) {
            eid.c.putString("incomingAuthToken", str2);
        }
        if (this.a != null) {
            eid.c.putBundle("spnegoContext", this.a);
        }
        eid.c.putBoolean("canDelegate", z);
        org.chromium.base.ApplicationStatus.a();
        if (a(context, "android.permission.GET_ACCOUNTS", true)) {
            defpackage.dpt.c("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: GET_ACCOUNTS permission not granted. Aborting authentication.", new java.lang.Object[0]);
            nativeSetResult(eid.a, -343, null);
            return;
        }
        eid.b.getAccountsByTypeAndFeatures(this.b, strArr, new defpackage.eia(this, eid), new android.os.Handler(org.chromium.base.ThreadUtils.a().getLooper()));
    }

    public static boolean a(android.content.Context context, java.lang.String str, boolean z) {
        if (android.os.Build.VERSION.SDK_INT < 23 && context.checkPermission(str, android.os.Process.myPid(), android.os.Process.myUid()) != 0) {
            return true;
        }
        return false;
    }
}
