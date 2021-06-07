package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: bnw  reason: default package */
/* compiled from: PG */
public final class bnw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bnx[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Long l = null;
        int a = bjr.a(parcel);
        Long l2 = null;
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str2 = bjr.h(parcel, readInt);
                    break;
                case 3:
                    arrayList = bjr.c(parcel, readInt, bot.CREATOR);
                    break;
                case 4:
                    str = bjr.h(parcel, readInt);
                    break;
                case 5:
                    l2 = bjr.g(parcel, readInt);
                    break;
                case 6:
                    l = bjr.g(parcel, readInt);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new bnx(str2, arrayList, str, l2, l);
    }
}
