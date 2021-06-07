package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: boi  reason: default package */
/* compiled from: PG */
public final class boi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new boj[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList arrayList = null;
        int a = bjr.a(parcel);
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = bjr.h(parcel, readInt);
                    break;
                case 3:
                case 6:
                case 7:
                case 8:
                case 10:
                case 12:
                default:
                    bjr.b(parcel, readInt);
                    break;
                case 4:
                    arrayList5 = bjr.c(parcel, readInt, boh.CREATOR);
                    break;
                case 5:
                    arrayList4 = bjr.c(parcel, readInt, bor.CREATOR);
                    break;
                case 9:
                    arrayList3 = bjr.c(parcel, readInt, boa.CREATOR);
                    break;
                case 11:
                    arrayList2 = bjr.c(parcel, readInt, bod.CREATOR);
                    break;
                case 13:
                    arrayList = bjr.c(parcel, readInt, boo.CREATOR);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new boj(str, arrayList5, arrayList4, arrayList3, arrayList2, arrayList);
    }
}
