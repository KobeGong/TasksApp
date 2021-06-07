package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bms  reason: default package */
/* compiled from: PG */
public final class bms implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bmf[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int a = bjr.a(parcel);
        boolean z2 = false;
        int i = 0;
        bmp bmp = null;
        bmj bmj = null;
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    i2 = bjr.d(parcel, readInt);
                    break;
                case 3:
                    str2 = bjr.h(parcel, readInt);
                    break;
                case 4:
                    bmj = (bmj) bjr.a(parcel, readInt, bmj.CREATOR);
                    break;
                case 5:
                    bmp = (bmp) bjr.a(parcel, readInt, bmp.CREATOR);
                    break;
                case 6:
                    i = bjr.d(parcel, readInt);
                    break;
                case 7:
                    str = bjr.h(parcel, readInt);
                    break;
                case 8:
                    z2 = bjr.c(parcel, readInt);
                    break;
                case 9:
                    z = bjr.c(parcel, readInt);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new bmf(i2, str2, bmj, bmp, i, str, z2, z);
    }
}
