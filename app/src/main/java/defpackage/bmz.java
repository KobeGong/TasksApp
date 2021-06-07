package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: bmz  reason: default package */
/* compiled from: PG */
public final class bmz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bmm[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int a = bjr.a(parcel);
        String str2 = null;
        String str3 = null;
        boolean z = false;
        boolean z2 = false;
        bmp bmp = null;
        String str4 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 3:
                    arrayList3 = bjr.c(parcel, readInt, bml.CREATOR);
                    break;
                case 4:
                default:
                    bjr.b(parcel, readInt);
                    break;
                case 5:
                    arrayList2 = bjr.c(parcel, readInt, bmn.CREATOR);
                    break;
                case 6:
                    arrayList = bjr.c(parcel, readInt, bmf.CREATOR);
                    break;
                case 7:
                    str4 = bjr.h(parcel, readInt);
                    break;
                case 8:
                    bmp = (bmp) bjr.a(parcel, readInt, bmp.CREATOR);
                    break;
                case 9:
                    z2 = bjr.c(parcel, readInt);
                    break;
                case 10:
                    z = bjr.c(parcel, readInt);
                    break;
                case 11:
                    str3 = bjr.h(parcel, readInt);
                    break;
                case 12:
                    str2 = bjr.h(parcel, readInt);
                    break;
                case 13:
                    str = bjr.h(parcel, readInt);
                    break;
                case 14:
                    i = bjr.d(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new bmm(arrayList3, arrayList2, arrayList, str4, bmp, z2, z, str3, str2, str, i);
    }
}
