package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: beb  reason: default package */
/* compiled from: PG */
public final class beb extends biq {
    public static final Parcelable.Creator CREATOR = new bec();
    private int a;
    private final Account b;
    private final int c;
    private final GoogleSignInAccount d;

    beb(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    public beb(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.c(parcel, 1, this.a);
        bjr.a(parcel, 2, this.b, i);
        bjr.c(parcel, 3, this.c);
        bjr.a(parcel, 4, this.d, i);
        bjr.r(parcel, q);
    }
}
