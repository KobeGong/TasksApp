package defpackage;

/* renamed from: bdv reason: default package */
/* compiled from: PG */
public abstract class bdv extends defpackage.bkn implements defpackage.bev {
    public bdv() {
        attachInterface(this, "com.google.android.gms.common.internal.ICertData");
    }

    public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
        if (a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                defpackage.bfl a = a();
                parcel2.writeNoException();
                defpackage.bko.a(parcel2, (android.os.IInterface) a);
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
