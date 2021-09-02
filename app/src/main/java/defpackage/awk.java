package defpackage;

/* renamed from: awk reason: default package */
/* compiled from: PG */
public final class awk implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.auth.api.signin.GoogleSignInOptions[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        boolean z = false;
        java.util.ArrayList arrayList = null;
        int a = defpackage.bjr.a(parcel);
        java.lang.String str = null;
        java.lang.String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        android.accounts.Account account = null;
        java.util.ArrayList arrayList2 = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = defpackage.bjr.d(parcel, readInt);
                    break;
                case 2:
                    arrayList2 = defpackage.bjr.c(parcel, readInt, com.google.android.gms.common.api.Scope.CREATOR);
                    break;
                case 3:
                    account = (android.accounts.Account) defpackage.bjr.a(parcel, readInt, android.accounts.Account.CREATOR);
                    break;
                case 4:
                    z3 = defpackage.bjr.c(parcel, readInt);
                    break;
                case 5:
                    z2 = defpackage.bjr.c(parcel, readInt);
                    break;
                case 6:
                    z = defpackage.bjr.c(parcel, readInt);
                    break;
                case 7:
                    str2 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 8:
                    str = defpackage.bjr.h(parcel, readInt);
                    break;
                case 9:
                    arrayList = defpackage.bjr.c(parcel, readInt, defpackage.avx.CREATOR);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new com.google.android.gms.auth.api.signin.GoogleSignInOptions(i, arrayList2, account, z3, z2, z, str2, str, arrayList);
    }
}
