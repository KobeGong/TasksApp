package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: biy  reason: default package */
/* compiled from: PG */
public class biy extends bkn implements IInterface {
    public biy() {
        attachInterface(this, "com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (a(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        a(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }

    public biy(byte b) {
        this();
    }

    public void a(int i) {
    }
}
