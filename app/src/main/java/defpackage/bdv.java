package defpackage;

import android.os.Parcel;

/* renamed from: bdv  reason: default package */
/* compiled from: PG */
public abstract class bdv extends bkn implements bev {
    public bdv() {
        attachInterface(this, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                bfl a = a();
                parcel2.writeNoException();
                bko.a(parcel2, a);
                return true;
            case 2:
                int b = b();
                parcel2.writeNoException();
                parcel2.writeInt(b);
                return true;
            default:
                return false;
        }
    }
}
