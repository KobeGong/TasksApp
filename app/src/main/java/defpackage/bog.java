package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bog  reason: default package */
/* compiled from: PG */
public final class bog implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new boh[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int a = bjr.a(parcel);
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        bol bol = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    bol = (bol) bjr.a(parcel, readInt, bol.CREATOR);
                    break;
                case 3:
                    str5 = bjr.h(parcel, readInt);
                    break;
                case 4:
                    str4 = bjr.h(parcel, readInt);
                    break;
                case 5:
                    str3 = bjr.h(parcel, readInt);
                    break;
                case 6:
                    str2 = bjr.h(parcel, readInt);
                    break;
                case 7:
                    str = bjr.h(parcel, readInt);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new boh(bol, str5, str4, str3, str2, str);
    }
}
