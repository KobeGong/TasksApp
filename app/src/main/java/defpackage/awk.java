package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* renamed from: awk  reason: default package */
/* compiled from: PG */
public final class awk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        ArrayList arrayList = null;
        int a = bjr.a(parcel);
        String str = null;
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        Account account = null;
        ArrayList arrayList2 = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = bjr.d(parcel, readInt);
                    break;
                case 2:
                    arrayList2 = bjr.c(parcel, readInt, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) bjr.a(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    z3 = bjr.c(parcel, readInt);
                    break;
                case 5:
                    z2 = bjr.c(parcel, readInt);
                    break;
                case 6:
                    z = bjr.c(parcel, readInt);
                    break;
                case 7:
                    str2 = bjr.h(parcel, readInt);
                    break;
                case 8:
                    str = bjr.h(parcel, readInt);
                    break;
                case 9:
                    arrayList = bjr.c(parcel, readInt, avx.CREATOR);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new GoogleSignInOptions(i, arrayList2, account, z3, z2, z, str2, str, arrayList);
    }
}
