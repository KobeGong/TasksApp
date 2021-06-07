package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: bkh  reason: default package */
/* compiled from: PG */
public final class bkh extends bel implements bps {
    private final boolean a;
    private final bdj h;
    private final Bundle i;
    private Integer j;

    private bkh(Context context, Looper looper, bdj bdj, Bundle bundle, ayr ayr, ays ays) {
        super(context, looper, 44, bdj, ayr, ays);
        this.a = true;
        this.h = bdj;
        this.i = bundle;
        this.j = bdj.h;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bkh(android.content.Context r8, android.os.Looper r9, defpackage.bdj r10, defpackage.ayr r11, defpackage.ays r12) {
        /*
            r7 = this;
            r6 = 0
            r5 = 0
            bpn r0 = r10.g
            java.lang.Integer r1 = r10.h
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r2 = "com.google.android.gms.signin.internal.clientRequestedAccount"
            android.accounts.Account r3 = r10.a
            r4.putParcelable(r2, r3)
            if (r1 == 0) goto L_0x001d
            java.lang.String r2 = "com.google.android.gms.common.internal.ClientSettings.sessionId"
            int r1 = r1.intValue()
            r4.putInt(r2, r1)
        L_0x001d:
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = "com.google.android.gms.signin.internal.offlineAccessRequested"
            r4.putBoolean(r0, r5)
            java.lang.String r0 = "com.google.android.gms.signin.internal.idTokenRequested"
            r4.putBoolean(r0, r5)
            java.lang.String r0 = "com.google.android.gms.signin.internal.serverClientId"
            r4.putString(r0, r6)
            java.lang.String r0 = "com.google.android.gms.signin.internal.usePromptModeForAuthCode"
            r1 = 1
            r4.putBoolean(r0, r1)
            java.lang.String r0 = "com.google.android.gms.signin.internal.forceCodeForRefreshToken"
            r4.putBoolean(r0, r5)
            java.lang.String r0 = "com.google.android.gms.signin.internal.hostedDomain"
            r4.putString(r0, r6)
            java.lang.String r0 = "com.google.android.gms.signin.internal.waitForAccessTokenRefresh"
            r4.putBoolean(r0, r5)
        L_0x0043:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkh.<init>(android.content.Context, android.os.Looper, bdj, ayr, ays):void");
    }

    @Override // defpackage.ayj, defpackage.bcx
    public final boolean h() {
        return this.a;
    }

    @Override // defpackage.bps
    public final void a(bdp bdp, boolean z) {
        try {
            ((bkf) o()).a(bdp, this.j.intValue(), z);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // defpackage.bps
    public final void q() {
        try {
            ((bkf) o()).a(this.j.intValue());
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // defpackage.bps
    public final void a(bkd bkd) {
        Account account;
        azb.b(bkd, "Expecting a valid ISignInCallbacks");
        try {
            bdj bdj = this.h;
            if (bdj.a != null) {
                account = bdj.a;
            } else {
                account = new Account("<<default account>>", "com.google");
            }
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = awg.a(this.d).a();
            }
            ((bkf) o()).a(new bki(new beb(account, this.j.intValue(), googleSignInAccount)), bkd);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                bkd.a(new bkk());
            } catch (RemoteException e2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final String f_() {
        return "com.google.android.gms.signin.service.START";
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final String b() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final Bundle m() {
        if (!this.d.getPackageName().equals(this.h.e)) {
            this.i.putString("com.google.android.gms.signin.internal.realClientPackageName", this.h.e);
        }
        return this.i;
    }

    @Override // defpackage.bps
    public final void r() {
        a(new bdg(this));
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof bkf) {
            return (bkf) queryLocalInterface;
        }
        return new bkg(iBinder);
    }
}
