package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: bkr  reason: default package */
/* compiled from: PG */
public final class bkr extends bkm implements bkp {
    bkr(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    @Override // defpackage.bkp
    public final Bundle a(String str, Bundle bundle) {
        Parcel c = c();
        c.writeString(str);
        bko.a(c, bundle);
        Parcel a = a(2, c);
        Bundle bundle2 = (Bundle) bko.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }

    @Override // defpackage.bkp
    public final Bundle a(Account account, String str, Bundle bundle) {
        Parcel c = c();
        bko.a(c, account);
        c.writeString(str);
        bko.a(c, bundle);
        Parcel a = a(5, c);
        Bundle bundle2 = (Bundle) bko.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }
}
