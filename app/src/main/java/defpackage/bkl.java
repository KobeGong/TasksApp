package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bkl  reason: default package */
/* compiled from: PG */
public final class bkl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bkk[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = bjr.a(parcel);
        axq axq = null;
        int i = 0;
        bed bed = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = bjr.d(parcel, readInt);
                    break;
                case 2:
                    axq = (axq) bjr.a(parcel, readInt, axq.CREATOR);
                    break;
                case 3:
                    bed = (bed) bjr.a(parcel, readInt, bed.CREATOR);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new bkk(i, axq, bed);
    }
}
