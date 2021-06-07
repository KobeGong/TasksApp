package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: bdu  reason: default package */
/* compiled from: PG */
public final class bdu extends bdq {
    public static Account a(bdp bdp) {
        Account account = null;
        if (bdp != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = bdp.a();
            } catch (RemoteException e) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }

    @Override // defpackage.bdp
    public final Account a() {
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        throw new NoSuchMethodError();
    }
}
