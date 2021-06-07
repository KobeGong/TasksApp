package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;

/* renamed from: awf  reason: default package */
/* compiled from: PG */
public final class awf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInConfiguration[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        GoogleSignInOptions googleSignInOptions = null;
        int a = bjr.a(parcel);
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = bjr.h(parcel, readInt);
                    break;
                case 3:
                case 4:
                default:
                    bjr.b(parcel, readInt);
                    break;
                case 5:
                    googleSignInOptions = (GoogleSignInOptions) bjr.a(parcel, readInt, GoogleSignInOptions.CREATOR);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new SignInConfiguration(str, googleSignInOptions);
    }
}
