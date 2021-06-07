package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* renamed from: bdm  reason: default package */
/* compiled from: PG */
public final class bdm extends biq {
    public static final Parcelable.Creator CREATOR = new bek();
    public String a;
    public IBinder b;
    public Scope[] c;
    public Bundle d;
    public Account e;
    public axs[] f;
    private int g;
    private int h;
    private int i;

    public bdm(int i2) {
        this.g = 3;
        this.i = axv.b;
        this.h = i2;
    }

    bdm(int i2, int i3, int i4, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, axs[] axsArr) {
        Account account2 = null;
        bdp bes = null;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        if ("com.google.android.gms".equals(str)) {
            this.a = "com.google.android.gms";
        } else {
            this.a = str;
        }
        if (i2 < 2) {
            if (iBinder != null) {
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                    if (queryLocalInterface instanceof bdp) {
                        bes = (bdp) queryLocalInterface;
                    } else {
                        bes = new bes(iBinder);
                    }
                }
                account2 = bdu.a(bes);
            }
            this.e = account2;
        } else {
            this.b = iBinder;
            this.e = account;
        }
        this.c = scopeArr;
        this.d = bundle;
        this.f = axsArr;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int q = bjr.q(parcel, 20293);
        bjr.c(parcel, 1, this.g);
        bjr.c(parcel, 2, this.h);
        bjr.c(parcel, 3, this.i);
        bjr.a(parcel, 4, this.a);
        bjr.a(parcel, 5, this.b);
        bjr.a(parcel, 6, this.c, i2);
        bjr.a(parcel, 7, this.d);
        bjr.a(parcel, 8, this.e, i2);
        bjr.a(parcel, 10, this.f, i2);
        bjr.r(parcel, q);
    }
}
