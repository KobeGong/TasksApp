package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bgu  reason: default package */
/* compiled from: PG */
public final class bgu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bgn[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int a = bjr.a(parcel);
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    i2 = bjr.d(parcel, readInt);
                    break;
                case 3:
                    i = bjr.d(parcel, readInt);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new bgn(i2, i);
    }
}
