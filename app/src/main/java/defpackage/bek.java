package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* renamed from: bek  reason: default package */
/* compiled from: PG */
public final class bek implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bdm[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        axs[] axsArr = null;
        int a = bjr.a(parcel);
        Account account = null;
        Bundle bundle = null;
        Scope[] scopeArr = null;
        IBinder iBinder = null;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i3 = bjr.d(parcel, readInt);
                    break;
                case 2:
                    i2 = bjr.d(parcel, readInt);
                    break;
                case 3:
                    i = bjr.d(parcel, readInt);
                    break;
                case 4:
                    str = bjr.h(parcel, readInt);
                    break;
                case 5:
                    iBinder = bjr.i(parcel, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) bjr.b(parcel, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = bjr.j(parcel, readInt);
                    break;
                case 8:
                    account = (Account) bjr.a(parcel, readInt, Account.CREATOR);
                    break;
                case 9:
                default:
                    bjr.b(parcel, readInt);
                    break;
                case 10:
                    axsArr = (axs[]) bjr.b(parcel, readInt, axs.CREATOR);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new bdm(i3, i2, i, str, iBinder, scopeArr, bundle, account, axsArr);
    }
}
