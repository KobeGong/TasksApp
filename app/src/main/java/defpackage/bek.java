package defpackage;

/* renamed from: bek reason: default package */
/* compiled from: PG */
public final class bek implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.bdm[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int i = 0;
        defpackage.axs[] axsArr = null;
        int a = defpackage.bjr.a(parcel);
        android.accounts.Account account = null;
        android.os.Bundle bundle = null;
        com.google.android.gms.common.api.Scope[] scopeArr = null;
        android.os.IBinder iBinder = null;
        java.lang.String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i3 = defpackage.bjr.d(parcel, readInt);
                    break;
                case 2:
                    i2 = defpackage.bjr.d(parcel, readInt);
                    break;
                case 3:
                    i = defpackage.bjr.d(parcel, readInt);
                    break;
                case 4:
                    str = defpackage.bjr.h(parcel, readInt);
                    break;
                case 5:
                    iBinder = defpackage.bjr.i(parcel, readInt);
                    break;
                case 6:
                    scopeArr = (com.google.android.gms.common.api.Scope[]) defpackage.bjr.b(parcel, readInt, com.google.android.gms.common.api.Scope.CREATOR);
                    break;
                case 7:
                    bundle = defpackage.bjr.j(parcel, readInt);
                    break;
                case 8:
                    account = (android.accounts.Account) defpackage.bjr.a(parcel, readInt, android.accounts.Account.CREATOR);
                    break;
                case 10:
                    axsArr = (defpackage.axs[]) defpackage.bjr.b(parcel, readInt, defpackage.axs.CREATOR);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new defpackage.bdm(i3, i2, i, str, iBinder, scopeArr, bundle, account, axsArr);
    }
}
