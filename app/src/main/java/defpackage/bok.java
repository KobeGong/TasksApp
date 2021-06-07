package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bok  reason: default package */
/* compiled from: PG */
public final class bok implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bol[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = bjr.a(parcel);
        Integer num = 3;
        Boolean bool = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 3:
                    num = bjr.e(parcel, readInt);
                    break;
                case 4:
                    int a2 = bjr.a(parcel, readInt);
                    if (a2 != 0) {
                        bjr.a(parcel, a2, 4);
                        bool = Boolean.valueOf(parcel.readInt() != 0);
                        break;
                    } else {
                        bool = null;
                        break;
                    }
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new bol(num, bool);
    }
}
