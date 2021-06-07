package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.auth.TokenData;
import java.io.IOException;

/* access modifiers changed from: package-private */
/* renamed from: awq  reason: default package */
/* compiled from: PG */
public final class awq implements avd {
    private /* synthetic */ Account a;
    private /* synthetic */ String b;
    private /* synthetic */ Bundle c;

    awq(Account account, String str, Bundle bundle) {
        this.a = account;
        this.b = str;
        this.c = bundle;
    }

    @Override // defpackage.avd
    public final /* synthetic */ Object a(IBinder iBinder) {
        boolean z;
        boolean z2;
        Bundle bundle = (Bundle) avc.a(bkq.a(iBinder).a(this.a, this.b, this.c));
        TokenData a2 = TokenData.a(bundle, "tokenDetails");
        if (a2 != null) {
            return a2;
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        awp a3 = awp.a(string);
        if (awp.BAD_AUTHENTICATION.equals(a3) || awp.CAPTCHA.equals(a3) || awp.NEED_PERMISSION.equals(a3) || awp.NEED_REMOTE_CONSENT.equals(a3) || awp.NEEDS_BROWSER.equals(a3) || awp.USER_CANCEL.equals(a3) || awp.DEVICE_MANAGEMENT_REQUIRED.equals(a3) || awp.DM_INTERNAL_ERROR.equals(a3) || awp.DM_SYNC_DISABLED.equals(a3) || awp.DM_ADMIN_BLOCKED.equals(a3) || awp.DM_ADMIN_PENDING_APPROVAL.equals(a3) || awp.DM_STALE_SYNC_REQUIRED.equals(a3) || awp.DM_DEACTIVATED.equals(a3) || awp.DM_REQUIRED.equals(a3) || awp.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(a3) || awp.DM_SCREENLOCK_REQUIRED.equals(a3)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            bjb bjb = avc.c;
            String valueOf = String.valueOf(a3);
            bjb.b("GoogleAuthUtil", new StringBuilder(String.valueOf(valueOf).length() + 31).append("isUserRecoverableError status: ").append(valueOf).toString());
            throw new avf(string, intent);
        }
        if (awp.NETWORK_ERROR.equals(a3) || awp.SERVICE_UNAVAILABLE.equals(a3)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            throw new IOException(string);
        }
        throw new ava(string);
    }
}
