package defpackage;

/* renamed from: bec reason: default package */
/* compiled from: PG */
public final class bec implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.beb[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int a = defpackage.bjr.a(parcel);
        int i = 0;
        android.accounts.Account account = null;
        int i2 = 0;
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = defpackage.bjr.d(parcel, readInt);
                    break;
                case 2:
                    account = (android.accounts.Account) defpackage.bjr.a(parcel, readInt, android.accounts.Account.CREATOR);
                    break;
                case 3:
                    i = defpackage.bjr.d(parcel, readInt);
                    break;
                case 4:
                    googleSignInAccount = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) defpackage.bjr.a(parcel, readInt, com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new defpackage.beb(i2, account, i, googleSignInAccount);
    }
}
