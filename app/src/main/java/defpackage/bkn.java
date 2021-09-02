package defpackage;

/* renamed from: bkn reason: default package */
/* compiled from: PG */
public class bkn extends android.os.Binder implements android.os.IInterface {
    public android.os.IBinder asBinder() {
        return this;
    }

    public final boolean a(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
        if (i > 16777215) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface(getInterfaceDescriptor());
        return false;
    }
}
