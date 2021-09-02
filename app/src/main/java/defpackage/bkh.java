package defpackage;

/* renamed from: bkh reason: default package */
/* compiled from: PG */
public final class bkh extends defpackage.bel implements defpackage.bps {
    private final boolean a;
    private final defpackage.bdj h;
    private final android.os.Bundle i;
    private java.lang.Integer j;

    private bkh(android.content.Context context, android.os.Looper looper, defpackage.bdj bdj, android.os.Bundle bundle, defpackage.ayr ayr, defpackage.ays ays) {
        super(context, looper, 44, bdj, ayr, ays);
        this.a = true;
        this.h = bdj;
        this.i = bundle;
        this.j = bdj.h;
    }

    public bkh(android.content.Context context, android.os.Looper looper, defpackage.bdj bdj, defpackage.ayr ayr, defpackage.ays ays) {
        defpackage.bpn bpn = bdj.g;
        java.lang.Integer num = bdj.h;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", bdj.a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        if (bpn != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        }
        this(context, looper, bdj, bundle, ayr, ays);
    }

    public final boolean h() {
        return this.a;
    }

    public final void a(defpackage.bdp bdp, boolean z) {
        try {
            ((defpackage.bkf) o()).a(bdp, this.j.intValue(), z);
        } catch (android.os.RemoteException e) {
            android.util.Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public final void q() {
        try {
            ((defpackage.bkf) o()).a(this.j.intValue());
        } catch (android.os.RemoteException e) {
            android.util.Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    public final void a(defpackage.bkd bkd) {
        android.accounts.Account account;
        defpackage.azb.b((java.lang.Object) bkd, (java.lang.Object) "Expecting a valid ISignInCallbacks");
        try {
            defpackage.bdj bdj = this.h;
            if (bdj.a != null) {
                account = bdj.a;
            } else {
                account = new android.accounts.Account("<<default account>>", "com.google");
            }
            com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = defpackage.awg.a(this.d).a();
            }
            ((defpackage.bkf) o()).a(new defpackage.bki(new defpackage.beb(account, this.j.intValue(), googleSignInAccount)), bkd);
        } catch (android.os.RemoteException e) {
            android.util.Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                bkd.a(new defpackage.bkk());
            } catch (android.os.RemoteException e2) {
                android.util.Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final java.lang.String f_() {
        return "com.google.android.gms.signin.service.START";
    }

    /* access modifiers changed from: protected */
    public final java.lang.String b() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    public final android.os.Bundle m() {
        if (!this.d.getPackageName().equals(this.h.e)) {
            this.i.putString("com.google.android.gms.signin.internal.realClientPackageName", this.h.e);
        }
        return this.i;
    }

    public final void r() {
        a((defpackage.bda) new defpackage.bdg(this));
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ android.os.IInterface a(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof defpackage.bkf) {
            return (defpackage.bkf) queryLocalInterface;
        }
        return new defpackage.bkg(iBinder);
    }
}
