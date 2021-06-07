package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: bnm  reason: default package */
/* compiled from: PG */
public class bnm extends bkn implements bnl {
    public bnm() {
        attachInterface(this, "com.google.android.gms.people.internal.IPeopleCallbacks");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                int readInt = parcel.readInt();
                bko.a(parcel, Bundle.CREATOR);
                a(readInt, (Bundle) bko.a(parcel, Bundle.CREATOR));
                break;
            case 2:
                a(parcel.readInt(), (Bundle) bko.a(parcel, Bundle.CREATOR), (DataHolder) bko.a(parcel, DataHolder.CREATOR));
                break;
            case 3:
                parcel.readInt();
                bko.a(parcel, Bundle.CREATOR);
                bko.a(parcel, ParcelFileDescriptor.CREATOR);
                throw new RuntimeException("Shouldn't be called");
            case 4:
                parcel.readInt();
                bko.a(parcel, Bundle.CREATOR);
                parcel.createTypedArray(DataHolder.CREATOR);
                break;
            case 5:
                a(parcel.readInt(), (Bundle) bko.a(parcel, Bundle.CREATOR), (ParcelFileDescriptor) bko.a(parcel, ParcelFileDescriptor.CREATOR), (Bundle) bko.a(parcel, Bundle.CREATOR));
                break;
            case 6:
                parcel.readInt();
                bko.a(parcel, bnx.CREATOR);
                break;
            case 7:
                parcel.readInt();
                bko.a(parcel, boj.CREATOR);
                break;
            case 8:
                parcel.readInt();
                break;
            case 9:
                parcel.readInt();
                parcel.createTypedArrayList(bme.CREATOR);
                bko.a(parcel, bmg.CREATOR);
                break;
            case 10:
                parcel.readInt();
                parcel.createTypedArrayList(bmi.CREATOR);
                bko.a(parcel, bmg.CREATOR);
                break;
            case 11:
                parcel.readInt();
                bko.a(parcel);
                break;
            case 12:
                parcel.readInt();
                bko.a(parcel, bnd.CREATOR);
                break;
            case 13:
                parcel.readInt();
                bko.a(parcel, bmh.CREATOR);
                bko.a(parcel, bmg.CREATOR);
                break;
            case 14:
                parcel.readInt();
                bko.a(parcel, bmo.CREATOR);
                break;
            default:
                return false;
        }
        return true;
    }

    public bnm(byte b) {
        this();
    }

    public void a(int i, Bundle bundle) {
    }

    public void a(int i, Bundle bundle, DataHolder dataHolder) {
    }

    public void a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
    }
}
