package defpackage;

/* renamed from: beb reason: default package */
/* compiled from: PG */
public final class beb extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bec();
    private int a;
    private final android.accounts.Account b;
    private final int c;
    private final com.google.android.gms.auth.api.signin.GoogleSignInAccount d;

    beb(int i, android.accounts.Account account, int i2, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    public beb(android.accounts.Account account, int i, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.c(parcel, 1, this.a);
        defpackage.bjr.a(parcel, 2, (android.os.Parcelable) this.b, i);
        defpackage.bjr.c(parcel, 3, this.c);
        defpackage.bjr.a(parcel, 4, (android.os.Parcelable) this.d, i);
        defpackage.bjr.r(parcel, q);
    }
}
