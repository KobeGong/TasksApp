package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: axh  reason: default package */
/* compiled from: PG */
public class axh extends bkn implements IInterface {
    public axh() {
        attachInterface(this, "com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                a((Status) bko.a(parcel, Status.CREATOR));
                return true;
            case 2:
                bko.a(parcel, Status.CREATOR);
                throw new UnsupportedOperationException();
            case 3:
                bko.a(parcel, Status.CREATOR);
                parcel.readLong();
                throw new UnsupportedOperationException();
            case 4:
                bko.a(parcel, Status.CREATOR);
                throw new UnsupportedOperationException();
            case 5:
                bko.a(parcel, Status.CREATOR);
                parcel.readLong();
                throw new UnsupportedOperationException();
            case 6:
                bko.a(parcel, Status.CREATOR);
                parcel.createTypedArray(axa.CREATOR);
                throw new UnsupportedOperationException();
            case 7:
                bko.a(parcel, DataHolder.CREATOR);
                throw new UnsupportedOperationException();
            case 8:
                bko.a(parcel, Status.CREATOR);
                bko.a(parcel, awz.CREATOR);
                throw new UnsupportedOperationException();
            case 9:
                bko.a(parcel, Status.CREATOR);
                bko.a(parcel, awz.CREATOR);
                throw new UnsupportedOperationException();
            default:
                return false;
        }
    }

    axh(byte b) {
        this();
    }

    public void a(Status status) {
        throw new UnsupportedOperationException();
    }
}
