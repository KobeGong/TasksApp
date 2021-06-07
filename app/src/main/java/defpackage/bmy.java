package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bmy  reason: default package */
/* compiled from: PG */
public final class bmy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bml[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int a = bjr.a(parcel);
        bmj bmj = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str4 = bjr.h(parcel, readInt);
                    break;
                case 3:
                    str3 = bjr.h(parcel, readInt);
                    break;
                case 4:
                    str2 = bjr.h(parcel, readInt);
                    break;
                case 5:
                    bmj = (bmj) bjr.a(parcel, readInt, bmj.CREATOR);
                    break;
                case 6:
                    str = bjr.h(parcel, readInt);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new bml(str4, str3, str2, bmj, str);
    }
}
