package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: axm  reason: default package */
/* compiled from: PG */
public final class axm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new axb[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int i = 0;
        int a = bjr.a(parcel);
        boolean z = true;
        boolean z2 = false;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        int i3 = 0;
        String str4 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str4 = bjr.h(parcel, readInt);
                    break;
                case 3:
                    i3 = bjr.d(parcel, readInt);
                    break;
                case 4:
                    i2 = bjr.d(parcel, readInt);
                    break;
                case 5:
                    str3 = bjr.h(parcel, readInt);
                    break;
                case 6:
                    str2 = bjr.h(parcel, readInt);
                    break;
                case 7:
                    z = bjr.c(parcel, readInt);
                    break;
                case 8:
                    str = bjr.h(parcel, readInt);
                    break;
                case 9:
                    z2 = bjr.c(parcel, readInt);
                    break;
                case 10:
                    i = bjr.d(parcel, readInt);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new axb(str4, i3, i2, str3, str2, z, str, z2, i);
    }
}
