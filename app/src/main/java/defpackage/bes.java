package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: bes  reason: default package */
/* compiled from: PG */
public final class bes extends bkm implements bdp {
    bes(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // defpackage.bdp
    public final Account a() {
        Parcel a = a(2, c());
        Account account = (Account) bko.a(a, Account.CREATOR);
        a.recycle();
        return account;
    }
}
