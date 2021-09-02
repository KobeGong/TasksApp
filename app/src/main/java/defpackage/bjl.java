package defpackage;

/* renamed from: bjl reason: default package */
/* compiled from: PG */
public abstract class bjl extends defpackage.bkn implements defpackage.bjk {
    public bjl() {
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
    }

    public static defpackage.bjk asInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        if (queryLocalInterface instanceof defpackage.bjk) {
            return (defpackage.bjk) queryLocalInterface;
        }
        return new defpackage.bjm(iBinder);
    }

    public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
        if (a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                init(defpackage.bfm.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 2:
                boolean booleanFlagValue = getBooleanFlagValue(parcel.readString(), defpackage.bko.a(parcel), parcel.readInt());
                parcel2.writeNoException();
                defpackage.bko.a(parcel2, booleanFlagValue);
                return true;
            case 3:
                int intFlagValue = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(intFlagValue);
                return true;
            case 4:
                long longFlagValue = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeLong(longFlagValue);
                return true;
            case 5:
                java.lang.String stringFlagValue = getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeString(stringFlagValue);
                return true;
            default:
                return false;
        }
    }
}
