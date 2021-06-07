package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* renamed from: awi  reason: default package */
/* compiled from: PG */
public final class awi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = bjr.a(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        long j = 0;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = bjr.d(parcel, readInt);
                    break;
                case 2:
                    str = bjr.h(parcel, readInt);
                    break;
                case 3:
                    str2 = bjr.h(parcel, readInt);
                    break;
                case 4:
                    str3 = bjr.h(parcel, readInt);
                    break;
                case 5:
                    str4 = bjr.h(parcel, readInt);
                    break;
                case 6:
                    uri = (Uri) bjr.a(parcel, readInt, Uri.CREATOR);
                    break;
                case 7:
                    str5 = bjr.h(parcel, readInt);
                    break;
                case 8:
                    j = bjr.f(parcel, readInt);
                    break;
                case 9:
                    str6 = bjr.h(parcel, readInt);
                    break;
                case 10:
                    arrayList = bjr.c(parcel, readInt, Scope.CREATOR);
                    break;
                case 11:
                    str7 = bjr.h(parcel, readInt);
                    break;
                case 12:
                    str8 = bjr.h(parcel, readInt);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }
}
