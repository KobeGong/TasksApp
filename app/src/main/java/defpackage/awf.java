package defpackage;

/* renamed from: awf reason: default package */
/* compiled from: PG */
public final class awf implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.auth.api.signin.internal.SignInConfiguration[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions = null;
        int a = defpackage.bjr.a(parcel);
        java.lang.String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = defpackage.bjr.h(parcel, readInt);
                    break;
                case 5:
                    googleSignInOptions = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) defpackage.bjr.a(parcel, readInt, com.google.android.gms.auth.api.signin.GoogleSignInOptions.CREATOR);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new com.google.android.gms.auth.api.signin.internal.SignInConfiguration(str, googleSignInOptions);
    }
}
