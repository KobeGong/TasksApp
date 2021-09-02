package defpackage;

/* renamed from: bdu reason: default package */
/* compiled from: PG */
public final class bdu extends defpackage.bdq {
    public static android.accounts.Account a(defpackage.bdp bdp) {
        android.accounts.Account account = null;
        if (bdp != null) {
            long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                account = bdp.a();
            } catch (android.os.RemoteException e) {
                android.util.Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }

    public final android.accounts.Account a() {
        throw new java.lang.NoSuchMethodError();
    }

    public final boolean equals(java.lang.Object obj) {
        throw new java.lang.NoSuchMethodError();
    }
}
