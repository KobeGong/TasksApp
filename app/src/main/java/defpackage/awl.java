package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;

/* renamed from: awl  reason: default package */
/* compiled from: PG */
public final class awl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInAccount[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = bjr.a(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = "";
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 4:
                    str = bjr.h(parcel, readInt);
                    break;
                case 5:
                case 6:
                default:
                    bjr.b(parcel, readInt);
                    break;
                case 7:
                    googleSignInAccount = (GoogleSignInAccount) bjr.a(parcel, readInt, GoogleSignInAccount.CREATOR);
                    break;
                case 8:
                    str2 = bjr.h(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new SignInAccount(str, googleSignInAccount, str2);
    }
}
