package defpackage;

/* renamed from: awl reason: default package */
/* compiled from: PG */
public final class awl implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.auth.api.signin.SignInAccount[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int a = defpackage.bjr.a(parcel);
        java.lang.String str = "";
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = null;
        java.lang.String str2 = "";
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 4:
                    str = defpackage.bjr.h(parcel, readInt);
                    break;
                case 7:
                    googleSignInAccount = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) defpackage.bjr.a(parcel, readInt, com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR);
                    break;
                case 8:
                    str2 = defpackage.bjr.h(parcel, readInt);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new com.google.android.gms.auth.api.signin.SignInAccount(str, googleSignInAccount, str2);
    }
}
