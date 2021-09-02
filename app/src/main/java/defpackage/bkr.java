package defpackage;

/* renamed from: bkr reason: default package */
/* compiled from: PG */
public final class bkr extends defpackage.bkm implements defpackage.bkp {
    bkr(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    public final android.os.Bundle a(java.lang.String str, android.os.Bundle bundle) {
        android.os.Parcel c = c();
        c.writeString(str);
        defpackage.bko.a(c, (android.os.Parcelable) bundle);
        android.os.Parcel a = a(2, c);
        android.os.Bundle bundle2 = (android.os.Bundle) defpackage.bko.a(a, android.os.Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }

    public final android.os.Bundle a(android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) {
        android.os.Parcel c = c();
        defpackage.bko.a(c, (android.os.Parcelable) account);
        c.writeString(str);
        defpackage.bko.a(c, (android.os.Parcelable) bundle);
        android.os.Parcel a = a(5, c);
        android.os.Bundle bundle2 = (android.os.Bundle) defpackage.bko.a(a, android.os.Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }
}
