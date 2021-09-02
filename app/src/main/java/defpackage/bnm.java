package defpackage;

/* renamed from: bnm reason: default package */
/* compiled from: PG */
public class bnm extends defpackage.bkn implements defpackage.bnl {
    public bnm() {
        attachInterface(this, "com.google.android.gms.people.internal.IPeopleCallbacks");
    }

    public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
        if (a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                int readInt = parcel.readInt();
                defpackage.bko.a(parcel, android.os.Bundle.CREATOR);
                a(readInt, (android.os.Bundle) defpackage.bko.a(parcel, android.os.Bundle.CREATOR));
                break;
            case 2:
                a(parcel.readInt(), (android.os.Bundle) defpackage.bko.a(parcel, android.os.Bundle.CREATOR), (com.google.android.gms.common.data.DataHolder) defpackage.bko.a(parcel, com.google.android.gms.common.data.DataHolder.CREATOR));
                break;
            case 3:
                parcel.readInt();
                defpackage.bko.a(parcel, android.os.Bundle.CREATOR);
                defpackage.bko.a(parcel, android.os.ParcelFileDescriptor.CREATOR);
                throw new java.lang.RuntimeException("Shouldn't be called");
            case 4:
                parcel.readInt();
                defpackage.bko.a(parcel, android.os.Bundle.CREATOR);
                parcel.createTypedArray(com.google.android.gms.common.data.DataHolder.CREATOR);
                break;
            case 5:
                a(parcel.readInt(), (android.os.Bundle) defpackage.bko.a(parcel, android.os.Bundle.CREATOR), (android.os.ParcelFileDescriptor) defpackage.bko.a(parcel, android.os.ParcelFileDescriptor.CREATOR), (android.os.Bundle) defpackage.bko.a(parcel, android.os.Bundle.CREATOR));
                break;
            case 6:
                parcel.readInt();
                defpackage.bko.a(parcel, defpackage.bnx.CREATOR);
                break;
            case 7:
                parcel.readInt();
                defpackage.bko.a(parcel, defpackage.boj.CREATOR);
                break;
            case 8:
                parcel.readInt();
                break;
            case 9:
                parcel.readInt();
                parcel.createTypedArrayList(defpackage.bme.CREATOR);
                defpackage.bko.a(parcel, defpackage.bmg.CREATOR);
                break;
            case 10:
                parcel.readInt();
                parcel.createTypedArrayList(defpackage.bmi.CREATOR);
                defpackage.bko.a(parcel, defpackage.bmg.CREATOR);
                break;
            case 11:
                parcel.readInt();
                defpackage.bko.a(parcel);
                break;
            case 12:
                parcel.readInt();
                defpackage.bko.a(parcel, defpackage.bnd.CREATOR);
                break;
            case 13:
                parcel.readInt();
                defpackage.bko.a(parcel, defpackage.bmh.CREATOR);
                defpackage.bko.a(parcel, defpackage.bmg.CREATOR);
                break;
            case 14:
                parcel.readInt();
                defpackage.bko.a(parcel, defpackage.bmo.CREATOR);
                break;
            default:
                return false;
        }
        return true;
    }

    public bnm(byte b) {
        this();
    }

    public void a(int i, android.os.Bundle bundle) {
    }

    public void a(int i, android.os.Bundle bundle, com.google.android.gms.common.data.DataHolder dataHolder) {
    }

    public void a(int i, android.os.Bundle bundle, android.os.ParcelFileDescriptor parcelFileDescriptor, android.os.Bundle bundle2) {
    }
}
