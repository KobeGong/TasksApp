package defpackage;

/* renamed from: bes reason: default package */
/* compiled from: PG */
public final class bes extends defpackage.bkm implements defpackage.bdp {
    bes(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final android.accounts.Account a() {
        android.os.Parcel a = a(2, c());
        android.accounts.Account account = (android.accounts.Account) defpackage.bko.a(a, android.accounts.Account.CREATOR);
        a.recycle();
        return account;
    }
}
