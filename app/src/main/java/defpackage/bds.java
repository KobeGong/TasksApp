package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;

/* renamed from: bds  reason: default package */
/* compiled from: PG */
public final class bds extends bkn implements IInterface {
    private bcx a;
    private final int b;

    public bds() {
        attachInterface(this, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                azb.b(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
                this.a.a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) bko.a(parcel, Bundle.CREATOR), this.b);
                this.a = null;
                break;
            case 2:
                parcel.readInt();
                bko.a(parcel, Bundle.CREATOR);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public bds(bcx bcx, int i) {
        this();
        this.a = bcx;
        this.b = i;
    }
}
