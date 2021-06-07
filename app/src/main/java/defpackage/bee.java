package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bee  reason: default package */
/* compiled from: PG */
public final class bee implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bed[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        axq axq = null;
        boolean z = false;
        int a = bjr.a(parcel);
        boolean z2 = false;
        IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = bjr.d(parcel, readInt);
                    break;
                case 2:
                    iBinder = bjr.i(parcel, readInt);
                    break;
                case 3:
                    axq = (axq) bjr.a(parcel, readInt, axq.CREATOR);
                    break;
                case 4:
                    z2 = bjr.c(parcel, readInt);
                    break;
                case 5:
                    z = bjr.c(parcel, readInt);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new bed(i, iBinder, axq, z2, z);
    }
}
