package defpackage;

/* renamed from: bkq reason: default package */
/* compiled from: PG */
public abstract class bkq extends defpackage.bkn implements defpackage.bkp {
    public static defpackage.bkp a(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        if (queryLocalInterface instanceof defpackage.bkp) {
            return (defpackage.bkp) queryLocalInterface;
        }
        return new defpackage.bkr(iBinder);
    }

    public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
        throw new java.lang.NoSuchMethodError();
    }
}
