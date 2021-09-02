package defpackage;

/* renamed from: bds reason: default package */
/* compiled from: PG */
public final class bds extends defpackage.bkn implements android.os.IInterface {
    private defpackage.bcx a;
    private final int b;

    public bds() {
        attachInterface(this, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public final boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
        if (a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                int readInt = parcel.readInt();
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                android.os.Bundle bundle = (android.os.Bundle) defpackage.bko.a(parcel, android.os.Bundle.CREATOR);
                defpackage.azb.b((java.lang.Object) this.a, (java.lang.Object) "onPostInitComplete can be called only once per call to getRemoteService");
                this.a.a(readInt, readStrongBinder, bundle, this.b);
                this.a = null;
                break;
            case 2:
                parcel.readInt();
                defpackage.bko.a(parcel, android.os.Bundle.CREATOR);
                android.util.Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new java.lang.Exception());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public bds(defpackage.bcx bcx, int i) {
        this();
        this.a = bcx;
        this.b = i;
    }
}
