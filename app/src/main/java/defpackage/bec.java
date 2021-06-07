package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: bec  reason: default package */
/* compiled from: PG */
public final class bec implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new beb[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = bjr.a(parcel);
        int i = 0;
        Account account = null;
        int i2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = bjr.d(parcel, readInt);
                    break;
                case 2:
                    account = (Account) bjr.a(parcel, readInt, Account.CREATOR);
                    break;
                case 3:
                    i = bjr.d(parcel, readInt);
                    break;
                case 4:
                    googleSignInAccount = (GoogleSignInAccount) bjr.a(parcel, readInt, GoogleSignInAccount.CREATOR);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new beb(i2, account, i, googleSignInAccount);
    }
}
