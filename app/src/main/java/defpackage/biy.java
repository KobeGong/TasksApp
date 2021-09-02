package defpackage;

/* renamed from: biy reason: default package */
/* compiled from: PG */
public class biy extends defpackage.bkn implements android.os.IInterface {
    public biy() {
        attachInterface(this, "com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
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
