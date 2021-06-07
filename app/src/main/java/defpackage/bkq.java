package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bkq  reason: default package */
/* compiled from: PG */
public abstract class bkq extends bkn implements bkp {
    public static bkp a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        if (queryLocalInterface instanceof bkp) {
            return (bkp) queryLocalInterface;
        }
        return new bkr(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw new NoSuchMethodError();
    }
}
