package defpackage;

/* renamed from: awi reason: default package */
/* compiled from: PG */
public final class awi implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.auth.api.signin.GoogleSignInAccount[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int a = defpackage.bjr.a(parcel);
        int i = 0;
        java.lang.String str = null;
        java.lang.String str2 = null;
        java.lang.String str3 = null;
        java.lang.String str4 = null;
        android.net.Uri uri = null;
        java.lang.String str5 = null;
        long j = 0;
        java.lang.String str6 = null;
        java.util.ArrayList arrayList = null;
        java.lang.String str7 = null;
        java.lang.String str8 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = defpackage.bjr.d(parcel, readInt);
                    break;
                case 2:
                    str = defpackage.bjr.h(parcel, readInt);
                    break;
                case 3:
                    str2 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 4:
                    str3 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 5:
                    str4 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 6:
                    uri = (android.net.Uri) defpackage.bjr.a(parcel, readInt, android.net.Uri.CREATOR);
                    break;
                case 7:
                    str5 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 8:
                    j = defpackage.bjr.f(parcel, readInt);
                    break;
                case 9:
                    str6 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 10:
                    arrayList = defpackage.bjr.c(parcel, readInt, com.google.android.gms.common.api.Scope.CREATOR);
                    break;
                case 11:
                    str7 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 12:
                    str8 = defpackage.bjr.h(parcel, readInt);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new com.google.android.gms.auth.api.signin.GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }
}
